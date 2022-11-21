package exercicio_solid_1.Service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import exercicio_solid_1.DAO.Database;
import exercicio_solid_1.Model.*;

import java.util.Map;

public class CaixaService implements ICaixaService {
    AlbumMusicaService albumService;
    BrinquedoService brinquedoService;
    FilmeService filmeService;
    JogoService jogoService;
    LivroService livroService;

    public CaixaService() {
        this.albumService = new AlbumMusicaService();
        this.brinquedoService = new BrinquedoService();
        this.filmeService = new FilmeService();
        this.jogoService = new JogoService();
        this.livroService = new LivroService();
    }

    @Override
    public void ComprarProduto(Produto produto, Integer quantidade) {

        Double valorCompra = produto.getPreco() * quantidade;

        Database.Tables.setCaixa(valorCompra);

        if (produto instanceof AlbumMusica) {
            this.albumService.RetirarEstoque(produto.getId(), quantidade);
        } else if (produto instanceof Brinquedo) {
            this.brinquedoService.RetirarEstoque(produto.getId(), quantidade);
        } else if (produto instanceof Filme) {
            this.filmeService.RetirarEstoque(produto.getId(), quantidade);
        } else if (produto instanceof Jogo) {
            this.jogoService.RetirarEstoque(produto.getId(), quantidade);
        } else if (produto instanceof Livro) {
            this.livroService.RetirarEstoque(produto.getId(), quantidade);
        }
    }

    @Override
    public Boolean ComprarListaProdutos(Map<Produto, Integer> produtos) {

        if (produtos != null) {
            for (Map.Entry<Produto, Integer> entry: produtos.entrySet()) {
                Produto produto = entry.getKey();
                Integer quantidade = entry.getValue();

                if (validaCompra(produtos, false)) {
                    ComprarProduto(produto, quantidade);
                } else {
                    System.out.println("Compra não efetuada. Produto adulto informado. Favor informar os dados do comprador.");
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public Boolean ComprarListaProdutosAdultos(Map<Produto, Integer> produtos, Comprador comprador) {

        if (produtos != null) {
            for (Map.Entry<Produto, Integer> entry: produtos.entrySet()) {
                Produto produto = entry.getKey();
                Integer quantidade = entry.getValue();

                if (validaCompra(produtos, comprador != null) ) {
                    CompradorService compradorService = new CompradorService();

                    compradorService.salvar(comprador);

                    ComprarProduto(produto, quantidade);
                } else {
                    System.out.println("Compra não efetuada. Produto adulto informado. Favor informar os dados do comprador.");
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public Double ValorCaixa() {
        return Database.Tables.getCaixa();
    }

    private Boolean validaCompra(Map<Produto, Integer> produtos, Boolean informouComprador) {
        Boolean retorno = true;
        for (Map.Entry<Produto, Integer> entry: produtos.entrySet()) {
            Produto produto = entry.getKey();

            if ((produto.getAdulto() != null && produto.getAdulto()) && !informouComprador) {
                retorno = false;
            }
        }

        return retorno;
    }
}

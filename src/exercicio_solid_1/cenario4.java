package exercicio_solid_1;

import exercicio_solid_1.DAO.Database;
import exercicio_solid_1.Model.AlbumMusica;
import exercicio_solid_1.Model.Brinquedo;
import exercicio_solid_1.Model.Livro;
import exercicio_solid_1.Model.Produto;
import exercicio_solid_1.Service.*;
import exercicio_solid_1.Util.Utils;

import java.text.Format;
import java.util.List;
import java.util.stream.Collectors;

public class cenario4 {

    public static void main(String[] args) {
        Database.FillTables();

        AlbumMusicaService albumMusicaService = new AlbumMusicaService();
        BrinquedoService brinquedoService = new BrinquedoService();
        FilmeService filmeService = new FilmeService();
        JogoService jogoService = new JogoService();
        LivroService livroService = new LivroService();

        RetirarProdutoEstoque();

        List<Produto> albums = albumMusicaService.buscarTodos()
                .stream()
                .filter(produto -> produto.getEstoque() > 0)
                .collect(Collectors.toList());

        ImprimeEstoque("Album de Música", albums);

        List<Produto> brinquedos = brinquedoService.buscarTodos()
                .stream()
                .filter(produto -> produto.getEstoque() > 0)
                .collect(Collectors.toList());

        ImprimeEstoque("Brinquedos", brinquedos);

        List<Produto> filmes = filmeService.buscarTodos()
                .stream()
                .filter(produto -> produto.getEstoque() > 0)
                .collect(Collectors.toList());

        ImprimeEstoque("Filmes", filmes);

        List<Produto> jogos = jogoService.buscarTodos()
                .stream()
                .filter(produto -> produto.getEstoque() > 0)
                .collect(Collectors.toList());

        ImprimeEstoque("Jogos", jogos);

        List<Produto> livros = livroService.buscarTodos()
                .stream()
                .filter(produto -> produto.getEstoque() > 0)
                .collect(Collectors.toList());

        ImprimeEstoque("Livros", livros);
    }

    private static void RetirarProdutoEstoque() {

        BrinquedoService brinquedoService = new BrinquedoService();

        Brinquedo brinquedo = brinquedoService.buscarPorId(3);

        brinquedo.setEstoque(0);

        brinquedoService.alterar(brinquedo);

        LivroService livroService = new LivroService();

        Livro livro = livroService.buscarPorId(1);

        livro.setEstoque(0);

        livroService.alterar(livro);

    }

    private static void ImprimeEstoque(String titulo, List<Produto> produtos) {
        System.out.println(titulo);
        System.out.println();

        System.out.println(Utils.Format("Nome", " ", 60) +
                Utils.Format("Estoque", " ", 9) + "  ");
        System.out.println(Utils.Format("", "-", 71));

        for (Produto produto: produtos) {
            System.out.println(Utils.Format(produto.getNome(), " ", 60) +
                    Utils.Format(produto.getEstoque().toString(), " ", 9));
        }
        System.out.println(Utils.Format("", "-", 71));
        System.out.println();
    }
}

package exercicio_solid_1;

import exercicio_solid_1.DAO.Database;
import exercicio_solid_1.Model.*;
import exercicio_solid_1.Service.*;
import exercicio_solid_1.Util.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cenario3 {

    public static void main(String[] args) {
        Database.FillTables();

        ExibeDatabase();

        ComprarPedido1();

        ComprarPedido2();

        System.out.println();
        System.out.println();
        ExibeDatabase();

    }

    private static void ComprarPedido1() {
        /**
         * 1 FIFA - 299,90
         * 1 Call of Duty - 579,90
         * 1 O instituto - 42,99
         * 3 Quebra-cabeça Evolution - 141,00
         *
         * Total do pedido 1063,79
         */

        Utils.ImprimeCabecalho("Comprar Pedido 1");

        CaixaService caixaService = new CaixaService();
        JogoService jogoService = new JogoService();
        LivroService livroService = new LivroService();
        BrinquedoService brinquedoService = new BrinquedoService();

        Jogo jogo1 = jogoService.buscarPorId(1);
        Jogo jogo2 = jogoService.buscarPorId(2);

        Livro livro1 = livroService.buscarPorId(3);

        Brinquedo brinquedo1 = brinquedoService.buscarPorId(1);

        Map<Produto, Integer> produtos = new HashMap<>();
        produtos.put(jogo1, 1);
        produtos.put(jogo2, 1);
        produtos.put(livro1, 1);
        produtos.put(brinquedo1, 3);

        Double valorTotal = 0D;

        for (Map.Entry<Produto, Integer> entry: produtos.entrySet()) {
            Produto produto = entry.getKey();
            Integer quantidade = entry.getValue();
            String className = produto.getClass().getSimpleName();

            valorTotal += (produto.getPreco() * quantidade);

            System.out.println("Comprando " + className + " " + produto.getNome() + " - Quantidade " + quantidade +
                    " - Valor " + Utils.getCurrencyFormatter().format(produto.getPreco()));
        }

        caixaService.ComprarListaProdutos(produtos);

        System.out.println();
        System.out.println("Valor total do pedido: " + Utils.getCurrencyFormatter().format(valorTotal));

        System.out.println();
        System.out.println("Valor no caixa: " + Utils.getCurrencyFormatter().format(caixaService.ValorCaixa()));

        Utils.ImprimeRodape();

    }

    private static void ComprarPedido2() {
        /**
         * 5 Bola de Futebol - 448,65
         * 1 Use Your Illusion I - 155,90
         * 1 Use Your Illusion II - 149,90
         * 1 Esquadrão Suicida - 7,90
         * 1 Mulher-Maravilha - 7,90
         *
         * Total do pedido 770,25
         */

        Utils.ImprimeCabecalho("Comprar Pedido 2");

        CaixaService caixaService = new CaixaService();
        BrinquedoService brinquedoService = new BrinquedoService();
        AlbumMusicaService albumMusicaService = new AlbumMusicaService();
        FilmeService filmeService = new FilmeService();

        Brinquedo brinquedo1 = brinquedoService.buscarPorId(3);
        AlbumMusica albumMusica1 = albumMusicaService.buscarPorId(1);
        AlbumMusica albumMusica2 = albumMusicaService.buscarPorId(2);
        Filme filme1 = filmeService.buscarPorId(1);
        Filme filme2 = filmeService.buscarPorId(3);

        Map<Produto, Integer> produtos = new HashMap<>();
        produtos.put(brinquedo1, 5);
        produtos.put(albumMusica1, 1);
        produtos.put(albumMusica2, 1);
        produtos.put(filme1, 1);
        produtos.put(filme2, 1);

        Double valorTotal = 0D;

        for (Map.Entry<Produto, Integer> entry: produtos.entrySet()) {
            Produto produto = entry.getKey();
            Integer quantidade = entry.getValue();
            String className = produto.getClass().getSimpleName();

            valorTotal += (produto.getPreco() * quantidade);

            System.out.println("Comprando " + className + " " + produto.getNome() + " - Quantidade " + quantidade +
                    " - Valor " + Utils.getCurrencyFormatter().format(produto.getPreco()));
        }

        caixaService.ComprarListaProdutos(produtos);

        System.out.println();
        System.out.println("Valor total do pedido: " + Utils.getCurrencyFormatter().format(valorTotal));

        System.out.println();
        System.out.println("Valor no caixa: " + Utils.getCurrencyFormatter().format(caixaService.ValorCaixa()));

        Utils.ImprimeRodape();

    }

    private static void ExibeDatabase() {
        ExibeAlbumsDeMusica();

        System.out.println();
        ExibeBrinquedos();

        System.out.println();
        ExibeFilmes();

        System.out.println();
        ExibeJogos();

        System.out.println();
        ExibeLivros();
    }

    private static void ExibeAlbumsDeMusica() {
        AlbumMusicaService albumMusicaService = new AlbumMusicaService();

        List<AlbumMusica> albums;

        albums = albumMusicaService.buscarTodos();

        System.out.println(Utils.Format("", "-", 117));
        System.out.println("|" + Utils.Format("", " ", 50) + "Albums de Música" + Utils.Format("", " ", 49) + "|");
        System.out.println(Utils.Format("", "-", 117));
        System.out.println(Utils.Format("| ID", " ", 7) +
                Utils.Format("| Nome", " ", 32) +
                Utils.Format("| Preço", " ", 12) +
                Utils.Format("| Gênero", " ", 22) +
                Utils.Format("| Banda", " ", 22) +
                Utils.Format("| Selo", " ", 10) +
                Utils.Format("| Estoque", " ", 10) + " |");
        System.out.println(Utils.Format("", "-", 117));

        for (AlbumMusica albumMusica: albums) {
            System.out.println("| " + Utils.Format(albumMusica.getId().toString(), " ", 5) +
                    "| " + Utils.Format(albumMusica.getNome(), " ", 30) +
                    "| " + Utils.Format(Utils.getCurrencyFormatter().format(albumMusica.getPreco()), " ", 10) +
                    "| " + Utils.Format(albumMusica.getGenero(), " ", 20) +
                    "| " + Utils.Format(albumMusica.getBanda(), " ", 20) +
                    "| " + Utils.Format(albumMusica.getSelo(), " ", 8) +
                    "| " + Utils.Format(albumMusica.getEstoque().toString(), " ", 9) +
                    "|");
        }

        System.out.println(Utils.Format("", "-", 117));
    }

    private static void ExibeBrinquedos() {
        BrinquedoService brinquedoService = new BrinquedoService();

        List<Brinquedo> brinquedos;

        brinquedos = brinquedoService.buscarTodos();

        System.out.println(Utils.Format("", "-", 85));
        System.out.println("|" + Utils.Format("", " ", 37) + "Brinquedos" + Utils.Format("", " ", 36) + "|");
        System.out.println(Utils.Format("", "-", 85));
        System.out.println(Utils.Format("| ID", " ", 7) +
                Utils.Format("| Nome", " ", 32) +
                Utils.Format("| Preço", " ", 12) +
                Utils.Format("| Tipo", " ", 22) +
                Utils.Format("| Estoque", " ", 10) + " |");
        System.out.println(Utils.Format("", "-", 85));

        for (Brinquedo brinquedo: brinquedos) {
            System.out.println("| " + Utils.Format(brinquedo.getId().toString(), " ", 5) +
                    "| " + Utils.Format(brinquedo.getNome(), " ", 30) +
                    "| " + Utils.Format(Utils.getCurrencyFormatter().format(brinquedo.getPreco()), " ", 10) +
                    "| " + Utils.Format(brinquedo.getTipo(), " ", 20) +
                    "| " + Utils.Format(brinquedo.getEstoque().toString(), " ", 9) +
                    "|");
        }

        System.out.println(Utils.Format("", "-", 85));
    }

    private static void ExibeFilmes() {
        FilmeService filmeService = new FilmeService();

        List<Filme> filmes;

        filmes = filmeService.buscarTodos();

        System.out.println(Utils.Format("", "-", 151));
        System.out.println("|" + Utils.Format("", " ", 72) + "Filmes" + Utils.Format("", " ", 71) + "|");
        System.out.println(Utils.Format("", "-", 151));
        System.out.println(Utils.Format("| ID", " ", 7) +
                Utils.Format("| Nome", " ", 32) +
                Utils.Format("| Preço", " ", 12) +
                Utils.Format("| Gênero", " ", 22) +
                Utils.Format("| Estúdio", " ", 22) +
                Utils.Format("| Diretor", " ", 22) +
                Utils.Format("| Produtor", " ", 22) +
                Utils.Format("| Estoque", " ", 10) + " |");
        System.out.println(Utils.Format("", "-", 151));

        for (Filme filme: filmes) {
            System.out.println("| " + Utils.Format(filme.getId().toString(), " ", 5) +
                    "| " + Utils.Format(filme.getNome(), " ", 30) +
                    "| " + Utils.Format(Utils.getCurrencyFormatter().format(filme.getPreco()), " ", 10) +
                    "| " + Utils.Format(filme.getGenero(), " ", 20) +
                    "| " + Utils.Format(filme.getEstudio(), " ", 20) +
                    "| " + Utils.Format(filme.getDiretor(), " ", 20) +
                    "| " + Utils.Format(filme.getProdutor(), " ", 20) +
                    "| " + Utils.Format(filme.getEstoque().toString(), " ", 9) +
                    "|");
        }

        System.out.println(Utils.Format("", "-", 151));
    }

    private static void ExibeJogos() {
        JogoService jogoService = new JogoService();

        List<Jogo> jogos;

        jogos = jogoService.buscarTodos();

        System.out.println(Utils.Format("", "-", 159));
        System.out.println("|" + Utils.Format("", " ", 77) + "Jogos" + Utils.Format("", " ", 75) + "|");
        System.out.println(Utils.Format("", "-", 159));
        System.out.println(Utils.Format("| ID", " ", 7) +
                Utils.Format("| Nome", " ", 52) +
                Utils.Format("| Preço", " ", 12) +
                Utils.Format("| Gênero", " ", 32) +
                Utils.Format("| Distribuidora", " ", 22) +
                Utils.Format("| Estúdio", " ", 22) +
                Utils.Format("| Estoque", " ", 10) + " |");
        System.out.println(Utils.Format("", "-", 159));

        for (Jogo jogo: jogos) {
            System.out.println("| " + Utils.Format(jogo.getId().toString(), " ", 5) +
                    "| " + Utils.Format(jogo.getNome(), " ", 50) +
                    "| " + Utils.Format(Utils.getCurrencyFormatter().format(jogo.getPreco()), " ", 10) +
                    "| " + Utils.Format(jogo.getGenero(), " ", 30) +
                    "| " + Utils.Format(jogo.getDistribuidora(), " ", 20) +
                    "| " + Utils.Format(jogo.getEstudio(), " ", 20) +
                    "| " + Utils.Format(jogo.getEstoque().toString(), " ", 9) +
                    "|");
        }

        System.out.println(Utils.Format("", "-", 159));
    }

    private static void ExibeLivros() {
        LivroService livroService = new LivroService();

        List<Livro> livros;

        livros = livroService.buscarTodos();

        System.out.println(Utils.Format("", "-", 164));
        System.out.println("|" + Utils.Format("", " ", 79) + "Livros" + Utils.Format("", " ", 77) + "|");
        System.out.println(Utils.Format("", "-", 164));
        System.out.println(Utils.Format("| ID", " ", 7) +
                Utils.Format("| Nome", " ", 62) +
                Utils.Format("| Preço", " ", 12) +
                Utils.Format("| Gênero", " ", 22) +
                Utils.Format("| Escritor", " ", 22) +
                Utils.Format("| Editora", " ", 27) +
                Utils.Format("| Estoque", " ", 10) + " |");
        System.out.println(Utils.Format("", "-", 164));

        for (Livro livro: livros) {
            System.out.println("| " + Utils.Format(livro.getId().toString(), " ", 5) +
                    "| " + Utils.Format(livro.getNome(), " ", 60) +
                    "| " + Utils.Format(Utils.getCurrencyFormatter().format(livro.getPreco()), " ", 10) +
                    "| " + Utils.Format(livro.getGenero(), " ", 20) +
                    "| " + Utils.Format(livro.getEscritor(), " ", 20) +
                    "| " + Utils.Format(livro.getEditora(), " ", 25) +
                    "| " + Utils.Format(livro.getEstoque().toString(), " ", 9) +
                    "|");
        }

        System.out.println(Utils.Format("", "-", 164));
    }
}

package exercicio_solid_1;

import exercicio_solid_1.DAO.Database;
import exercicio_solid_1.Model.*;
import exercicio_solid_1.Service.*;
import exercicio_solid_1.Util.Utils;

import java.util.List;

public class cenario1 {

    public static void main(String[] args) {
        Database.FillTables();

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

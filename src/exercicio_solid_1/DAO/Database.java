package exercicio_solid_1.DAO;

import exercicio_solid_1.Model.*;

import javax.xml.crypto.Data;
import java.util.*;

public class Database {
    public static class Tables {
        private static List<AlbumMusica> albumsDeMusica = new ArrayList<>();
        private static List<Brinquedo> brinquedo = new ArrayList<>();
        private static List<Filme> filme = new ArrayList<>();
        private static List<Jogo> jogo = new ArrayList<>();
        private static List<Livro> livro = new ArrayList<>();

        private static  List<Comprador> comprador = new ArrayList<>();
        private static Double caixa = 0D;

        public static List<AlbumMusica> getAlbumsDeMusica() {
            return albumsDeMusica;
        }

        public static List<Brinquedo> getBrinquedos() {
            return brinquedo;
        }

        public static List<Filme> getFilmes() {
            return filme;
        }

        public static List<Jogo> getJogos() {
            return jogo;
        }

        public static List<Livro> getLivros() {
            return livro;
        }

        public static Double getCaixa() {return caixa;}

        public static void setCaixa(Double valor) {
            caixa += valor;
        }

        public static List<Comprador> getCompradores() { return comprador; }
    }

    public static void FillTables() {
        List<AlbumMusica> albums = new ArrayList<>();

        albums.add(new AlbumMusica(1, "Use Your Illusion I", 155.90D, "Hard Rock", "Guns N' Roses", "", 37));
        albums.add(new AlbumMusica(2, "Use Your Illusion II", 149.90D, "Hard Rock", "Guns N' Roses", "", 37));

        Database.Tables.getAlbumsDeMusica().addAll(albums);

        List<Brinquedo> brinquedos = new ArrayList<>();

        brinquedos.add(new Brinquedo(1,"Quebra-cabeça Evolution",47D,"Quebra-Cabeça",30));
        brinquedos.add(new Brinquedo(2, "Boneca Barbie", 26.4D, "Boneca", 54));
        brinquedos.add(new Brinquedo(3, "Bola de Futebol", 89.73D, "Bola", 100));

        Database.Tables.getBrinquedos().addAll(brinquedos);

        List<Filme> filmes = new ArrayList<>();

        filmes.add(new Filme(1, "Esquadrão Suicida", 7.9D, "Ação", "DC Comics", "David Ayer", "Charles Roven", 890));
        filmes.add(new Filme(2, "Esquadrão Suicida 2", 19.9D, "Ação", "DC Comics", "James Gunn", "Zack Snyder", 725));
        filmes.add(new Filme(3, "Mulher-Maravilha", 7.9D, "Ação", "DC Comics", "Patty Jenkins", "Ivan Reitman", 403));
        Database.Tables.getFilmes().addAll(filmes);

        List<Jogo> jogos = new ArrayList<>();

        jogos.add(new Jogo(1, "FIFA 23", 299.90D, "Sports", "EA Sports", "Electronic Arts", 123));
        jogos.add(new Jogo(2, "Call of Duty: Modern Warfare II", 579.9D, "Tiro em primeira pessoa", "Activision", "Infinity Ward", 340));

        Database.Tables.getJogos().addAll(jogos);

        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro(1, "STAR WARS: DARK EDITION: Edição épica para uma saga eterna!", 50.90D, "Ficção Científica", "George Lucas", "Darkside", 567));
        livros.add(new Livro(2, "Coleção Especial Sherlock Holmes - Box com 6 livros", 67.32D, "Ficção Científica", "Arthur Conan Doyle", "Principis", 99 ));
        livros.add(new Livro(3, "O instituto", 42.99D, "Suspense", "Stephen King", "Suma", 712));
        livros.add(new Livro(4, "Histórias encantadas: Branca de Neve", 17.90D, "Infantil", "Emma Fucci", "Vergara & Ribas Editoras", 15));

        Database.Tables.getLivros().addAll(livros);
    }
}

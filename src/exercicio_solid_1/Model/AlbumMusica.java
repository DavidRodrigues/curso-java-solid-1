package exercicio_solid_1.Model;

public class AlbumMusica extends ProdutoGenero {

    private String banda;
    private String selo;

    public AlbumMusica(Integer id, String nome, Double preco, String genero, String banda, String selo, Integer estoque) {
        super(id, nome, preco, "Albúm Musical", genero, estoque);
        this.banda = banda;
        this.selo = selo;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }
}

package exercicio_solid_1.Model;

public class Jogo extends ProdutoGenero {
    private String distribuidora;
    private String estudio;

    public Jogo(Integer id, String nome, Double preco, String genero, String distribuidora, String estudio, Integer estoque) {
        super(id, nome, preco, "Jogo", genero, estoque);
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}

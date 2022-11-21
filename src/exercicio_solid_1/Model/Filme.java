package exercicio_solid_1.Model;

public class Filme extends ProdutoGenero {
    private String estudio;
    private String diretor;
    private String produtor;

    public Filme(Integer id, String nome, Double preco, String genero, String estudio, String diretor, String produtor, Integer estoque) {
        super(id, nome, preco, "Filme", genero, estoque);
        this.estudio = estudio;
        this.diretor = diretor;
        this.produtor = produtor;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }
}

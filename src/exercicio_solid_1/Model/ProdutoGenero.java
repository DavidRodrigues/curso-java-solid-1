package exercicio_solid_1.Model;

public abstract class ProdutoGenero extends Produto {

    private String genero;

    public ProdutoGenero(Integer id, String nome, Double preco, String categoria, String genero, Integer estoque) {
        super(id, nome, preco, categoria, estoque);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

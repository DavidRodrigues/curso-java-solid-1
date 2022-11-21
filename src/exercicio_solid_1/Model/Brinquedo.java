package exercicio_solid_1.Model;

public class Brinquedo extends Produto{
    private String tipo;

    public Brinquedo(String nome, Double preco, String tipo, Integer estoque) {
        super(0, nome, preco, "Brinquedo", estoque);
        this.tipo = tipo;
    }

    public Brinquedo(Integer id, String nome, Double preco, String tipo, Integer estoque) {
        super(id, nome, preco, "Brinquedo", estoque);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

package exercicio_solid_1.Model;

public class Livro extends ProdutoGenero {
    private String escritor;
    private String editora;

    public Livro(Integer id, String nome, Double preco, String genero, String escritor, String editora, Integer estoque) {
        super(id, nome, preco, "Livro", genero, estoque);
        this.escritor = escritor;
        this.editora = editora;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}

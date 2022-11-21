package exercicio_solid_1.Model;

public abstract class Produto implements IProdutoModel {

    private Integer id;
    private String nome;
    private Double preco;
    private String categoria;
    private Integer estoque;
    private Boolean adulto;

    public Produto(Integer id, String nome, Double preco, String categoria, Integer estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;
        this.adulto = adulto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Boolean getAdulto() {
        return adulto;
    }

    public void setAdulto(Boolean adulto) {
        this.adulto = adulto;
    }
}

package exercicio_solid_1.Model;

import java.util.Date;

public class Comprador {

    private String nome;
    private String rg;
    private String cpf;
    private Date dataNascimento;

    public Comprador(String nome, String rg, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}

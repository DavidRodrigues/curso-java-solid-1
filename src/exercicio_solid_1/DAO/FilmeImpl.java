package exercicio_solid_1.DAO;

import exercicio_solid_1.Model.Filme;

public class FilmeImpl extends DaoGenericoImpl<Filme> {
    public FilmeImpl() {
        super(Database.Tables.getFilmes());
    }
}

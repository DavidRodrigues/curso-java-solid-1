package exercicio_solid_1.DAO;

import exercicio_solid_1.Model.Livro;

public class LivroImpl extends DaoGenericoImpl<Livro> {
    public LivroImpl() {
        super(Database.Tables.getLivros());
    }
}

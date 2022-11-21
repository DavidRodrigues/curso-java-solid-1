package exercicio_solid_1.DAO;

import exercicio_solid_1.Model.Jogo;

public class JogoImpl extends DaoGenericoImpl<Jogo> {
    public JogoImpl() {
        super(Database.Tables.getJogos());
    }
}

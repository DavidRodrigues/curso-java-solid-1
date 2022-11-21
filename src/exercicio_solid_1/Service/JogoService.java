package exercicio_solid_1.Service;

import exercicio_solid_1.DAO.JogoImpl;
import exercicio_solid_1.Model.Jogo;

public class JogoService extends CrudService<Jogo> {
    public JogoService() {
        super(new JogoImpl());
    }
}

package exercicio_solid_1.Service;

import exercicio_solid_1.DAO.LivroImpl;
import exercicio_solid_1.Model.Livro;

public class LivroService extends CrudService<Livro> {

    public LivroService() {
        super(new LivroImpl());
    }
}

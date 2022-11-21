package exercicio_solid_1.Service;

import exercicio_solid_1.DAO.FilmeImpl;
import exercicio_solid_1.Model.Filme;

public class FilmeService extends CrudService<Filme> {
    public FilmeService() {
        super(new FilmeImpl());
    }
}

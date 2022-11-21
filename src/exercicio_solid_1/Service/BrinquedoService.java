package exercicio_solid_1.Service;

import exercicio_solid_1.DAO.BrinquedoImpl;
import exercicio_solid_1.Model.Brinquedo;

public class BrinquedoService  extends CrudService<Brinquedo> {
    public BrinquedoService() {
        super(new BrinquedoImpl());
    }
}

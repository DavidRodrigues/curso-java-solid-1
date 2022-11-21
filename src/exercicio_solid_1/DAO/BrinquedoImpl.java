package exercicio_solid_1.DAO;

import exercicio_solid_1.Model.Brinquedo;

public class BrinquedoImpl extends DaoGenericoImpl<Brinquedo> {
    public BrinquedoImpl() {
        super(Database.Tables.getBrinquedos());
    }
}

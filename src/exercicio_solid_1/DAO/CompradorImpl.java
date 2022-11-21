package exercicio_solid_1.DAO;

import exercicio_solid_1.Model.Comprador;
import exercicio_solid_1.Model.Produto;
import exercicio_solid_1.Service.CompradorService;

import java.util.List;

public class CompradorImpl implements IDaoGenerico<Comprador> {

    @Override
    public void salvar(Comprador entity) {
        if (entity != null) {
            Database.Tables.getCompradores().add(entity);
        } else {
            throw new NullPointerException("Entidade não informada.");
        }
    }

    @Override
    public void alterar(Comprador entity) {
    }

    @Override
    public Comprador buscarPorId(Integer id) {
        return null;
    }

    public List<Comprador> buscarTodos() {
        return Database.Tables.getCompradores();
    }

    @Override
    public void excluir(Integer id) {    }
}
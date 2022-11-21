package exercicio_solid_1.Service;

import exercicio_solid_1.DAO.IDaoGenerico;
import exercicio_solid_1.Model.Produto;

import java.util.List;

public abstract class CrudService<T extends Produto> extends AbstractEstoqueService<T> implements ICrudService<T> {

    private IDaoGenerico<T> dao;

    public CrudService(IDaoGenerico<T> dao) {
        this.dao = dao;
    }

    @Override
    public void salvar(T entity) {
        this.dao.salvar(entity);
    }

    @Override
    public void alterar(T entity) {
        this.dao.alterar(entity);
    }

    @Override
    public T buscarPorId(Integer id) {
        return this.dao.buscarPorId(id);
    }

    @Override
    public List<T> buscarTodos() {
        return this.dao.buscarTodos();
    }

    @Override
    public void excluir(Integer id) {
        this.dao.excluir(id);
    }
}

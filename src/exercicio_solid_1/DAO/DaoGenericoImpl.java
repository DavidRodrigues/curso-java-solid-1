package exercicio_solid_1.DAO;

import exercicio_solid_1.Model.Produto;

import java.util.List;

public abstract class DaoGenericoImpl<T> implements IDaoGenerico<T> {

    private List<T> table;

    public DaoGenericoImpl(List<T> table) {
        this.table = table;
    }

    @Override
    public void salvar(T entity) {
        if (entity != null) {
            if (((Produto)entity).getId() == 0) {
                ((Produto)entity).setId(((int)this.table.stream().count()+1));
            }
            this.table.add(entity);
        } else {
            throw new NullPointerException("Entidade não informada.");
        }
    }

    @Override
    public void alterar(T entity) {
        int idx = this.table.indexOf(buscarPorId(((Produto)entity).getId()));

        this.table.set(idx, entity);
    }

    @Override
    public T buscarPorId(Integer id) {
        if (id > 0) {
            return this.table.stream().filter(entity -> ((Produto)entity).getId() == id).findFirst().orElse(null);
        } else {
            throw new NumberFormatException("ID da entidade não informado.");
        }
    }

    public List<T> buscarTodos() {
        return this.table;
    }

    @Override
    public void excluir(Integer id) {
        if (id > 0) {
            T obj = buscarPorId(id);

            if (obj != null) {
                this.table.remove(obj);
            }
        }
    }
}

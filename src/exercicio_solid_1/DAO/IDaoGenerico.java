package exercicio_solid_1.DAO;

import java.util.List;

public interface IDaoGenerico<T> {

    void salvar(T entity);
    void alterar(T entity);
    T buscarPorId(Integer id);
    List<T> buscarTodos();
    void excluir(Integer id);

}

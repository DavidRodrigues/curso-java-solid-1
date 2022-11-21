package exercicio_solid_1.Service;

import exercicio_solid_1.Model.Produto;

import java.util.List;

public interface ICrudService<T extends Produto> {

    void salvar(T entity);
    void alterar(T entity);
    T buscarPorId(Integer id);
    List<T> buscarTodos();
    void excluir(Integer id);

}

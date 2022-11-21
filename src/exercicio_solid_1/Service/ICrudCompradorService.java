package exercicio_solid_1.Service;

import exercicio_solid_1.Model.Produto;

import java.util.List;

public interface ICrudCompradorService<Comprador> {

    void salvar(Comprador entity);
    void alterar(Comprador entity);
    Comprador buscarPorId(Integer id);
    List<Comprador> buscarTodos();
    void excluir(Integer id);

}

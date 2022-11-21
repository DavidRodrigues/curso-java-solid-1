package exercicio_solid_1.Service;

import exercicio_solid_1.Model.*;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class AbstractEstoqueService<T extends Produto> implements ICrudService<T>, IEstoqueService {

  @Override
    public Map<String, String> BuscarEstoque() {
        List<T> estoque;
        Map<String, String> retorno = new HashMap<>();

        estoque = this.buscarTodos()
                .stream()
                .filter(produto -> produto.getEstoque() > 0)
                .sorted((a, b) -> a.getNome().compareTo(b.getNome()))
                .collect(Collectors.toList());

        String className = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();//.getTypeName();
        for (T produto: estoque) {
            retorno.put(className + " [" + produto.getId().toString() + "]", produto.getNome());
        }

        return retorno;

    }

    public void RetirarEstoque(Integer id, Integer quantidade) {
        T entity = this.buscarPorId(id);

        if (entity != null) {
            entity.setEstoque(entity.getEstoque() - quantidade);

            this.alterar(entity);
        }
    }


}

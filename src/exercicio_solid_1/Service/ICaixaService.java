package exercicio_solid_1.Service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import exercicio_solid_1.Model.Comprador;
import exercicio_solid_1.Model.Produto;
import java.util.Map;

public interface ICaixaService {

    void ComprarProduto(Produto produto, Integer quantidade);
    Boolean ComprarListaProdutos(Map<Produto, Integer> produtos);
    Boolean ComprarListaProdutosAdultos (Map<Produto, Integer> produtos, Comprador comprador);


    Double ValorCaixa();
}

package exercicio_solid_1;

import exercicio_solid_1.DAO.Database;
import exercicio_solid_1.Service.EstoqueService;

import java.util.Map;

public class cenario5 {

    public static void main(String[] args) {
        Database.FillTables();

        System.out.println("Estoque");
        System.out.println();

        EstoqueService estoqueService = new EstoqueService();
        Map<String, String> estoque = estoqueService.ListarEstoque();

        for (Map.Entry<String, String> entry : estoque.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(String.format("Objeto %s  Nome: %s", key, value));
        }

    }

}

package exercicio_solid_1;

import exercicio_solid_1.DAO.Database;
import exercicio_solid_1.Model.*;
import exercicio_solid_1.Service.*;
import exercicio_solid_1.Util.Utils;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class cenario2 {

    private static Locale locale = new Locale("pt", "BR");
    private static NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    public static void main(String[] args) {
        Database.FillTables();

        ExibeJogos();

        AdicionandoNovoJogo();
        ExibeJogos();


        AlterandoNovoJogo();
        ExibeJogos();

        ComprarPedido();

        System.out.println();
        System.out.println();
        ExibeJogos();

        ExcluindoNovoJogo();
        ExibeJogos();
    }

    private static void AdicionandoNovoJogo() {

        System.out.println();
        System.out.println();
        System.out.println("Adicionando novo jogo");
        System.out.println("");

        JogoService jogoService = new JogoService();

        Jogo jogo = new Jogo(3, "Grand Theft Auto", 149.99D, "Ação", "Rockstar Games", "Rockstar North", 703);

        jogoService.salvar(jogo);

    }

    private static void AlterandoNovoJogo() {

        System.out.println();
        System.out.println();
        System.out.println("Alterando o jogo criado");
        System.out.println("");

        JogoService jogoService = new JogoService();

        Jogo jogo = jogoService.buscarPorId(3);

        jogo.setNome("Grand Theft Auto V");

        jogoService.alterar(jogo);

    }

    private static void ExcluindoNovoJogo() {

        System.out.println();
        System.out.println();
        System.out.println("Excluíndo o jogo criado");
        System.out.println("");

        JogoService jogoService = new JogoService();

        jogoService.excluir(3);

    }

    private static  void ComprarPedido() {
        /**
         * 1 Grand Theft Auto V - 149,99
         *
         * Total do pedido 149,99
         */

        Utils.ImprimeCabecalho("Comprar Pedido 3");

        CaixaService caixaService = new CaixaService();
        JogoService jogoService = new JogoService();

        Jogo jogo = jogoService.buscarPorId(3);

        Integer quantidade = 3;
        Double valorTotal = jogo.getPreco() * quantidade;

        System.out.println("Comprando Jogo " + jogo.getNome() + " - Quantidade " + quantidade + " - Valor " + currencyFormatter.format(jogo.getPreco()));
        caixaService.ComprarProduto(jogo, quantidade);

        System.out.println();
        System.out.println("Valor total do pedido: " + currencyFormatter.format(valorTotal));

        System.out.println();
        System.out.println("Valor no caixa: " + currencyFormatter.format(caixaService.ValorCaixa()));

        Utils.ImprimeRodape();


    }

    private static void ExibeJogos() {
        JogoService jogoService = new JogoService();

        List<Jogo> jogos;

        jogos = jogoService.buscarTodos();

        System.out.println(Utils.Format("", "-", 159));
        System.out.println("|" + Utils.Format("", " ", 77) + "Jogos" + Utils.Format("", " ", 75) + "|");
        System.out.println(Utils.Format("", "-", 159));
        System.out.println(Utils.Format("| ID", " ", 7) +
                Utils.Format("| Nome", " ", 52) +
                Utils.Format("| Preço", " ", 12) +
                Utils.Format("| Gênero", " ", 32) +
                Utils.Format("| Distribuidora", " ", 22) +
                Utils.Format("| Estúdio", " ", 22) +
                Utils.Format("| Estoque", " ", 10) + " |");
        System.out.println(Utils.Format("", "-", 159));

        for (Jogo jogo: jogos) {
            System.out.println("| " + Utils.Format(jogo.getId().toString(), " ", 5) +
                    "| " + Utils.Format(jogo.getNome(), " ", 50) +
                    "| " + Utils.Format(currencyFormatter.format(jogo.getPreco()), " ", 10) +
                    "| " + Utils.Format(jogo.getGenero(), " ", 30) +
                    "| " + Utils.Format(jogo.getDistribuidora(), " ", 20) +
                    "| " + Utils.Format(jogo.getEstudio(), " ", 20) +
                    "| " + Utils.Format(jogo.getEstoque().toString(), " ", 9) +
                    "|");
        }

        System.out.println(Utils.Format("", "-", 159));
    }

}

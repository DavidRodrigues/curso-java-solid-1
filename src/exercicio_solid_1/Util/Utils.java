package exercicio_solid_1.Util;

import java.text.NumberFormat;
import java.util.Locale;

public class Utils {

    private static Locale locale = new Locale("pt", "BR");
    private static NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    public static NumberFormat getCurrencyFormatter() {
        return  currencyFormatter;
    }

    public static String Format(String texto, String valor, Integer tamanho) {
        if (texto.length() < tamanho) {
            return texto + new String(new char[tamanho- texto.length()]).replace("\0", valor);
        }
        return  texto;
    }

    public static void ImprimeCabecalho(String titulo) {
        System.out.println();
        System.out.println();
        System.out.println(Format("", "-", 100));
        System.out.println();
        System.out.println(titulo);
        System.out.println();
    }

    public static void ImprimeRodape() {
        System.out.println();
        System.out.println(Format("", "-", 100));
    }

}

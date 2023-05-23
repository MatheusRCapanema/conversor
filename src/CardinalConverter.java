
public class CardinalConverter implements Converter {
    private static final String[] UNIDADES = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
    private static final String[] DEZ_A_DEZENOVE = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
    private static final String[] DEZENAS = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

    public String converter(int numero) {
        return numero == 0 ? "zero" : converterParaPalavras(numero);
    }

    private String converterParaPalavras(int numero) {
        if (numero < 10) {
            return UNIDADES[numero];
        } else if (numero < 20) {
            return DEZ_A_DEZENOVE[numero - 10];
        } else if (numero < 100) {
            return DEZENAS[numero / 10] + (numero % 10 != 0 ? " e " : "") + UNIDADES[numero % 10];
        } else {
            return UNIDADES[numero / 100] + " centos" + (numero % 100 != 0 ? " e " : "") + converterParaPalavras(numero % 100);
        }
    }
}

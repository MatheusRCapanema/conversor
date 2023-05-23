
public class OrdinalNumber extends Number {
    private static final String[] UNIDADES = {"", "primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "sétimo", "oitavo", "nono"};
    private static final String[] DEZ_A_DEZENOVE = {"décimo", "décimo primeiro", "décimo segundo", "décimo terceiro", "décimo quarto", "décimo quinto", "décimo sexto", "décimo sétimo", "décimo oitavo", "décimo nono"};
    private static final String[] DEZENAS = {"", "", "vigésimo", "trigésimo", "quadragésimo", "quinquagésimo", "sexagésimo", "septuagésimo", "octogésimo", "nonagésimo"};

    public OrdinalNumber(int number) {
        super(number);
    }

    public String converter(int numero) {
        return converterParaOrdinal(numero);
    }

    private String converterParaOrdinal(int numero) {
        if (numero < 10) {
            return UNIDADES[numero];
        } else if (numero < 20) {
            return DEZ_A_DEZENOVE[numero - 10];
        } else if (numero < 100) {
            return DEZENAS[numero / 10] + (numero % 10 != 0 ? " " : "") + UNIDADES[numero % 10];
        } else {
            return UNIDADES[numero / 100] + " centésimo" + (numero % 100 != 0 ? " " : "") + converterParaOrdinal(numero % 100);
        }
    }
}

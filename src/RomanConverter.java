
public class RomanConverter implements Converter {
    private static final int[] NUMEROS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] LETRAS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String converter(int number) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < NUMEROS.length; i++) {
            while (number >= NUMEROS[i]) {
                roman.append(LETRAS[i]);
                number -= NUMEROS[i];
            }
        }
        return roman.toString();
    }
}

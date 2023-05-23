
class NumberConverter {

    public static void main(String[] args) {
        int numero = 125;
        Number numberCardinal = new CardinalNumber(numero);
        System.out.println(numberCardinal);

        Number numberOrdinal = new OrdinalNumber(numero);
        System.out.println(numberOrdinal);

        Number numberRoman = new RomanNumber(numero);
        System.out.println(numberRoman);
    }
}
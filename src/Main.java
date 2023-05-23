
class NumberConverter {
    private Converter conversor;

    // Método set para encapsulamento
    public void setConversor(Converter conversor) {
        this.conversor = conversor;
    }

    // Método converter usando polimorfismo
    public String converter(int numero) {
        return this.conversor.converter(numero);
    }

    public static void main(String[] args) {
        NumberConverter conversorNumerico = new NumberConverter();

        int numero = 123;

        conversorNumerico.setConversor(new RomanConverter());
        System.out.println("Romano: " + conversorNumerico.converter(numero));

        conversorNumerico.setConversor(new CardinalConverter());
        System.out.println("Cardinal: " + conversorNumerico.converter(numero));

        conversorNumerico.setConversor(new OrdinalConverter());
        System.out.println("Ordinal: " + conversorNumerico.converter(numero));
    }
}

public abstract class Number {

    private final Integer numbertoConvert;
    public Number(Integer numbertoConvert) {
        this.numbertoConvert = numbertoConvert;
    }

    public abstract String converter(int numero);

    public Integer getNumbertoConvert() {
        return numbertoConvert;
    }

    @Override
    public String toString() {
        return converter(this.numbertoConvert);
    }
}

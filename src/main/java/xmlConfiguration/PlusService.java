package xmlConfiguration;

public class PlusService {

    private int a;
    private int b;
    private int resultPlus;

    public PlusService(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public PlusService(int resultPlus) {
        this.resultPlus = resultPlus;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResultPlus() {
        resultPlus = a + b;
        return resultPlus;
    }
}

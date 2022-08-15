package xmlConfiguration;

public class MinusService {
    private int a;
    private int b;
    private int resultMinus;

    public MinusService(int resultMinus) {
        this.resultMinus = resultMinus;
    }

    public MinusService(int a, int b) {
        this.a = a;
        this.b = b;
            }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResultMinus() {
        resultMinus = a - b;
        return resultMinus;
    }
}

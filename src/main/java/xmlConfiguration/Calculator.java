package xmlConfiguration;

public class Calculator {
    private MinusService minusService;
    private PlusService plusService;

    public Calculator(MinusService minusService, PlusService plusService) {
        this.minusService = minusService;
        this.plusService = plusService;
    }
    public Calculator() {
        if (getPlusService().getResultPlus() > getMinusService().getResultMinus()) {
            System.out.println(getPlusService().getResultPlus());
        } else {
            System.out.println(getMinusService().getResultMinus());
        }
    }
    public MinusService getMinusService() {
        return minusService;
    }
    public void setMinusService(MinusService minusService) {
        this.minusService = minusService;
    }
    public PlusService getPlusService() {
        return plusService;
    }
    public void setPlusService(PlusService plusService) {
        this.plusService = plusService;
    }
}

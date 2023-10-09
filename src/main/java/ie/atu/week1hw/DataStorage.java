package ie.atu.week1hw;

public class DataStorage {
    private double  result;
    private String sumoperator;

    public DataStorage(double result, String sumoperator) {
        this.result = result;
        this.sumoperator = sumoperator;
    }

    public double  getResult() {
        return result;
    }

    public void setResult(double  result) {
        this.result = result;
    }

    public String getSumoperator() {
        return sumoperator;
    }

    public void setSumoperator(String sumoperator) {
        this.sumoperator = sumoperator;
    }
    @Override
    public String toString() {
        return "Result: " + result + ", Operator: " + sumoperator;
    }


}

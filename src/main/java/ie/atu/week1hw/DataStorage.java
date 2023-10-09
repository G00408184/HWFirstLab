package ie.atu.week1hw;

public class DataStorage {
    private float result;
    private String sumoperator;

    public DataStorage(float result, String sumoperator) {
        this.result = result;
        this.sumoperator = sumoperator;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public String getSumoperator() {
        return sumoperator;
    }

    public void setSumoperator(String sumoperator) {
        this.sumoperator = sumoperator;
    }
}

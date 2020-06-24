package giorgi.kusikashvili;

public class Currency {

    private String description;

    private double rate;

    public Currency(String description, double rate) {
        this.description = description;
        this.rate = rate;
    }

    public Currency() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

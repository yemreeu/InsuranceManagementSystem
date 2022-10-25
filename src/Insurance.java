import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double insurancePrice;
    private String insuranceStartDate;

    public abstract void Calculate(String insuranceType);

    public Insurance(String insuranceName, double insurancePrice, String insuranceStartDate) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceStartDate = insuranceStartDate;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public String getInsuranceStartDate() {
        return insuranceStartDate;
    }

    public void setInsuranceStartDate(Date insuranceDate) {
        this.insuranceStartDate = insuranceStartDate;
    }

    public abstract void Calculate();
}

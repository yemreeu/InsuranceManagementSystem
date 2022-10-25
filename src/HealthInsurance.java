public class HealthInsurance extends Insurance {

    public HealthInsurance(String insuranceType){
        super("Private Health Insurance",5000,"01-01-2022");
        Calculate(insuranceType);
    }

    @Override
    public void Calculate(String insuranceType){
        System.out.println("some calculations ");
    }

    @Override
    public void Calculate() {

    }
}

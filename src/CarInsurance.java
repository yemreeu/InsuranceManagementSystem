public class CarInsurance extends Insurance{
    public CarInsurance(String insuranceName){
        super("Car Insurance",20000,"2022-01-01");
        Calculate();
    }

    @Override
    public void Calculate(String insuranceType) {

    }

    @Override
    public void Calculate(){
        System.out.println("Car Insurance details is in here ! ");
    }
}

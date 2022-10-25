public class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceName){
        super("Travel Insurance",5000,"2022-01-01");
        Calculate();
    }

    @Override
    public void Calculate(String insuranceType) {

    }

    @Override
    public void Calculate(){
        System.out.println("Travel Insurance calculations here!");
    }
}

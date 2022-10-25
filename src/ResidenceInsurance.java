public class ResidenceInsurance extends Insurance{

    public ResidenceInsurance(String insuranceName){
        super("Residence Insurance", 10000,"2022-01-01");
        Calculate();
    }

    @Override
    public void Calculate(String insuranceType) {
        System.out.println("Calcuations for residence insurance here !!");
    }

    @Override
    public void Calculate() {

    }


}


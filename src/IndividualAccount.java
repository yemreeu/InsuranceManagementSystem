import java.util.Scanner;

public class IndividualAccount extends Account{
    private final String individual = "Individual";
    Scanner input = new Scanner(System.in);

    public IndividualAccount(User user1) {
        super();
    }

    @Override
    public void AddPolicy(){
        System.out.println("Insurance types: ");
        System.out.println("1- HealthInsurance \n" +
                "2- ResidenceInsurance \n" +
                "3- TravelInsurance \n" +
                "4- CarInsurance");
        System.out.print("Please select which one you prefer");
        int choosen = input.nextInt();

        switch (choosen){
            case 1:
                getUser().setInsurance(new HealthInsurance(individual));
                getUser().setInsuranceList(getUser().getInsuranceList());
                break;
            case 2:
                getUser().setInsurance(new ResidenceInsurance(individual));
                getUser().setInsuranceList(getUser().getInsuranceList());
                break;
            case 3:
                getUser().setInsurance(new CarInsurance(individual));
                getUser().setInsuranceList(getUser().getInsuranceList());
                break;
            case 4:
                getUser().setInsurance(new TravelInsurance(individual));
                getUser().setInsuranceList(getUser().getInsuranceList());
                break;
            default:
                System.out.println("Invalid value !");
                break;
        }


    }

    @Override
    public int compareTo(Account o) {
        return 0;
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class AddressManager {
    private static Scanner sc = new Scanner(System.in);

    public static void AddAddress(User user){
        IAddress newAddress;
        System.out.println("This screen is to add address:");
        System.out.println("Please enter 1 : Home Address , 2 : Business Address ");
        int addressType = sc.nextInt();

        // adding city info
        System.out.println("Please enter a city: ");
        String city = sc.next();

        // adding district info
        System.out.println("Please enter the district of the city: ");
        String district = sc.next();

        // adding street
        System.out.println("Please enter the street name: ");
        String street = sc.next();

        // adding Detailed address
        System.out.println("Please enter the detailed address information: ");
        String detailedAddress = sc.next();

        // adding addressID
        System.out.println("Please enter the address Id: ");
        int iD = sc.nextInt();

        if (addressType == 1){
            newAddress = new HomeAddress(iD,city,district,street,detailedAddress) ;
        }else{
            newAddress = new BusinessAddress(iD,city,district,street,detailedAddress);
        }

        user.setAddressList((ArrayList<IAddress>) newAddress);

    }

    public static void RemoveAddress(User user){

        user.getAddressList().remove(1);
        System.out.println("The address has been successfully deleted!");
    }
}

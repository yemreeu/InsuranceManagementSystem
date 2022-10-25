import java.util.Scanner;

public class Login {
    Scanner input = new Scanner(System.in);
    AccountManager accountManager = new AccountManager();
    public void Start(){
        System.out.println("Welcome !");
        System.out.print("Please enter your email: ");
        String email = input.next();
        System.out.print("Please enter your password: ");
        String password = input.next();

        Account loginAccount = accountManager.IsLoggedIn(email,password);
        if (loginAccount != null){
            loginAccount.showUserInfo();
        }else System.out.println("Invalid user !");
    }

    private void Run(Account account){
        while (true){
            System.out.println("Please select an option: ");
            System.out.println("1- Show details of user\n" +
                    "2- Make a new policy into user\n" +
                    "3- Add a new address into user\n" +
                    "4- Remove user's address\n" +
                    "9- Exit");
            System.out.print("Yapmak istediğiniz işlem numarasını yazın : ");

            int value = input.nextInt();
            switch (value) {
                case 1:
                    account.showUserInfo();
                    break;
                case 2:
                    account.AddPolicy();
                    break;
                case 3:
                    account.AddAddress();
                    break;
                case 4:
                    account.RemoveAddress();
                    break;
                case 9:
                default:
                    System.exit(0);
            }
        }
    }
}

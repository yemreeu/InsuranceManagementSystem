import java.util.TreeSet;

public class AccountManager {

    TreeSet<Account> accounts = new TreeSet<>();

    public void addAccounts(){
        IAddress address1 = new HomeAddress(34,"İstanbul","Ümraniye","Cuhadar","45 / 48");
        User user1 = new User("Yunus Emre","Uyanık","yeu@123.com","1233321","Engineer",25,address1);
        Account account1 = new IndividualAccount(user1);

        IAddress address2 = new HomeAddress(06,"Ankara","Merkez","Kutup","Ankara Merkez");
        User user2 = new User("Ahmet","Mehmet","asdqwe@123.com","09090909","doctor",38,address2);
        Account account2 = new EnterpriseAccount(user2);

        accounts.add(account1);
        accounts.add(account2);
    }

    public Account IsLoggedIn(String email, String password){
        addAccounts();
        try {
            for (Account a : accounts) {
                if(a.getUser().getEmail().equals(email) && a.getUser().getPassword().equals(password)){
                    a.IsLoggedIn(email,password,a);
                    return a;
                }
            }
            throw new Account.InvalidAuthenticationException("Email or password are wrong !");
        }catch (Account.InvalidAuthenticationException e){
            System.out.println(e.getMessage());
        }
        return null;

    }


}

public abstract class Account implements Comparable<Account> {
    private User user;

    public final void showUserInfo(){
        System.out.println("User's name and surname: "+user.getName()+" "+user.getLastName());
        System.out.println("E-mail : "+user.getEmail()+" Job Title : "+ user.getJobTitle());
        System.out.println("Age "+ user.getAge()+" Last Login Date : "+ user.getLastLogin());
        printInsurances();
        printAddresses();

    }
    public void printAddresses(){
        for (IAddress address: user.getAddressList()){
            address.ShowAddressInfo();
        }
    }

    public void printInsurances(){
        for(Insurance insurance: user.getInsuranceList()){
            System.out.println("Insurance Type : "+insurance.getInsuranceName()+", Price : "+ insurance.getInsurancePrice()+
                    ", Start Date : "+ insurance.getInsuranceStartDate());
        }
    }
    public static class InvalidAuthenticationException extends Exception {
        public InvalidAuthenticationException(String errorMessage) {
            super(errorMessage);
        }
    }

    enum AuthenticationStatus{
        SUCCESS,
        FAIL
    }

    public void IsLoggedIn(String email, String password, Account a) throws InvalidAuthenticationException {
        if(email == this.user.getEmail() && password == this.user.getPassword()){
            AuthenticationStatus autStats = AuthenticationStatus.SUCCESS;
            System.out.println(autStats + " - You have successfully logged in !");
        }else{
            AuthenticationStatus autStats = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException(autStats + " - Invalid email or password !");


        }
    }

    public void AddAddress(){
        AddressManager.AddAddress(this.user);
    }
    public void RemoveAddress(){
        AddressManager.RemoveAddress(this.user);
    }

    public abstract void AddPolicy();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


public class NewUser extends UserProfile  {

    NewUser(String name, String email, String currency){
        super(name, email, currency);
    }
    //this method is supose to check the email format 
    @Override
    public boolean validate(){
        return email != null && email.contains("@") && !name.trim().isEmpty();
    }
}

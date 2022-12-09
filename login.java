package RPL;

public class login {
    String emailInput, passwordInput;

    public boolean loginUser(user user, String email, String password){
        if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    public void loginAdmin(){

    }
}

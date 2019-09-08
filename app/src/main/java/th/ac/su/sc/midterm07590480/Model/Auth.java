package th.ac.su.sc.midterm07590480.Model;

public class Auth {
    private static final String USER1 = "aaa";
    private static final String PASSWORD1= "111";
    private static final String USER2 = "bbb";
    private static final String PASSWORD2= "222";

    private String muser;
    private String mPassword;


    //alt+insert

    public String getUser() {
        return muser;
    }

    public void setEmail(String user) {
        this.muser = user;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String Password) {
        this.mPassword = Password;
    }
    public int check(){
        if(muser.equals(USER1) && mPassword.equals(PASSWORD1)){
            return 1;
        }else if(muser.equals(USER2) && mPassword.equals(PASSWORD2)){

            return 2;
        }else{
            return -1;

        }
    }
}

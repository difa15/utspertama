package pengguna;

public class User {
    public String username ;
    public String password ;


    void setnama(String username){
        this.username = username;
    }
    public String getusername(){
        return this.username;
    }
    void setpassword(String password){
        this.password = password;
    }
    public String getpassword(){
        return this.password;
    }
}

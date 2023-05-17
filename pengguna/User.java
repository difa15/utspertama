package pengguna;

class User {
    private String username ;    // privte String username ; //atribut
    private String password ;   // private String password ; //
 
    public User (String arg_username, String arg_password){
     // System.out.println("Ini adalah construktor dengan argumen dari kelas user");
     this.username = arg_username;
     this.password = arg_password;
    }
 
 // public User() {
 // }
 //    public static void User (){
 //     System.out.println("Ini adalah construktor tanpa argument dr kelas User");
 //    }
     void setUsername(String username){
         this.username = username;
     }
     public String getUsername(){
         return this.username;
     }
     void setPassword(String password){
         this.password = password;
     }
     public String getPassword(){
         return this.password;
     }
 }

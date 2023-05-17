package pengguna;

public class Mhs extends User {
    //// code dibawah turunan kelas 
    public Mhs(String arg_username, String arg_password) {
        super(arg_username, arg_password);
        
    }
    String nama ;
    String nim ;
    int smt ;

    // public Mhs (String arg_nama, String arg_nim, int arg_smt){
    //     this.Nama = arg_nama;
    //     this.nim = arg_nim;
    //     this.smt = arg_smt;
    //    }
    // fungsi 
    
    public void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return this.nama;
    }

    public void setnim(String nim){
        this.nim = nim;
    }
    public String getnim(){
        return this.nim;
    }
    
    public void setsmt (int smt){
        this.smt = smt;
    }
    public int getsmt(){
        return this.smt;
    }
}

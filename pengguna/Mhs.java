package pengguna;

class Mhs {
    public String nama ;
    public String nim ;
    private int smt ;
    
    public Mhs (String arg_nama, String arg_nim, int arg_smt){
        this.nama = arg_nama;
        this.nim = arg_nim;
        this.smt = arg_smt;
       }

    void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return this.nama;
    }
    void setnim(String nim){
        this.nim = nim;
    }
    public String getnim(){
        return this.nim;
    }
    void setsmt (int smt){
        this.smt = smt;
    }
    public int getsmt(){
        return this.smt;
    }
}

class Main {
    public static void main(String[] args) {

        String username;
        String password;
        Mhs mhs = new Mhs(username: "ini_usernama", password: "ini_password");
        
        mhs.setnama(nama: "Difa Riza Fahlefi");
        mhs.setnim(nim:"G.111.19.0007");
        mhs.setsmt(smt:8);

        System.out.println("Nama Mahasiswa:"+ mhs.getnama());
        System.out.println("Nim:"+ mhs.getnim());
        System.out.println("Smt:"+ mhs.getsmt());
        System.out.println("Username:"+ mhs.getusername());
        System.out.println("Password:"+ mhs.getpassword());
    }
}
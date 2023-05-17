class Main {
    public static void main(String[] args){
        
        Mhs mhs = new Mhs("Ini Username", "Ini Password");
        // diatas panggil construktor dgn argumen

        mhs.setnama ("Difa Riza Fahlefi");
        mhs.setnim("G.111.19.0007");
        mhs.setsmt(8);
        
        // mhs.setNama();
        // mhs.setNim();
        // mhs.setSmt();
        
        System.out.println("Nama Mahasiswa:" + mhs.getnama());
        System.out.println("Nim Mahasiswa:" + mhs.getnim());
        System.out.println("Smt Maha siswa:" + mhs.getsmt());

        System.out.println("Username:" + mhs.getUsername());
        System.out.println("Password:" + mhs.getPassword());
        
    }
        
}

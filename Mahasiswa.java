public class Mahasiswa {
    private String nim;
    private String nama;
    private char kom;
    private int angkatan;

    public Mahasiswa(){}
    public Mahasiswa(String nim, String nama, 
        char kom,int angkatan){
        this.nim=nim;
        this.nama=nama;
        this.kom=kom;
        this.angkatan=angkatan;
    }

    public void setNim(String nim){
        this.nim=nim;
    }
    public String getNim(){
        return nim;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKom(char kom){
        this.kom=kom;
    }
    public char getKom(){
        return kom;
    }
    public void setAngkatan(int angkatan){
        this.angkatan=angkatan;
    }
    public int getAngkatan(){
        return angkatan;
    }

    @Override
    public String toString(){
        return this.nim + "\t"+
                this.nama+ "\t"+
                this.kom +"\t"+
                this.angkatan;
    }

}

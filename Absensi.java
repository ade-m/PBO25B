import java.util.Date;

public class Absensi {
    private Date tanggal;
    private Mahasiswa mahasiswa;
    private char status;

    public Absensi(){}
    public Absensi(Date tanggal, Mahasiswa mahasiswa,
        char status){
            this.tanggal=tanggal;
            this.mahasiswa=mahasiswa;
            this.status=status;
    }

    public Date getTanggal() {
        return this.tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public char getStatus() {
        return this.status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return tanggal.toString()+"\t"+
                mahasiswa.getNim()+"\t"+
                mahasiswa.getNama()+"\t"+
                status;
    }

}

import java.util.Date;
public class Pertemuan42 {
    public static void main(String[] args) {
        Mahasiswa budi = new Mahasiswa("251712001", 
                    "Budi Handoko", 'B',
                     2025);
        Mahasiswa susan = new Mahasiswa("251712002", 
                    "Susan Susanto", 'B',
                     2025);
        System.out.println("==========================================");
        System.out.println("NIM\t\tNama\t\tKom\tAngkatan");
        System.out.println("==========================================");
        System.out.println(budi);
        System.out.println(susan);

        Absensi absenBudi = new Absensi(new Date(), 
                        budi, 'H');
        Absensi absenSusan = new Absensi(new Date(), 
                        susan, 'H');
        System.out.println("==========================================");
        System.out.println("Tanggal\t\t\t\tNIM\t\tNama\tStatus");
        System.out.println("==========================================");
        System.out.println(absenBudi);
        System.out.println(absenSusan);        
    }
}

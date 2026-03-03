public class pertemuan41 {
    public static void main(String[] args) {
        Lingkaran bulat = new Lingkaran(20);
        System.out.println("Panjang Jari-jari :"+
                            bulat.getR());
        bulat.setR(5);
        System.out.println("Panjang Jari-jari :"+
                            bulat.getR());
        System.out.println("Luas Lingkaran :"+ 
                        bulat.hitungLuas());
        System.out.println("Keliling Lingkaran :"+ 
                        bulat.hitungKeliling());

        System.out.println("Keliling Lingkaran :"+ 
            Lingkaran.hitungKeliling(20));
    }
}

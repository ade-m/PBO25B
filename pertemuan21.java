import java.util.Scanner;
public class pertemuan21{
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        //hitung luas lingkaran phi*r*r
        Double PHI = 22.0/7.0;
        Double r =5.0;
        System.out.println("Program Menghitung Luas Lingkaran");
        System.out.print("Masukan Panjang Jari- jari (r) : ");
        r = inputan.nextDouble();
        Double luas = PHI*r*r;
        System.out.println("Luas : "+ luas);
    }
}
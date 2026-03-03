public class pertemuan25 {
    public static void main(String[] args) {
        String[] mahasiswa = {"Samson",
                                "Budi",
                                "Susan",
                                "Tono"};
        for(int i=0;i<mahasiswa.length;i++){
            if(mahasiswa[i].equals("Susan")){
                continue;
            }
            System.out.println(mahasiswa[i]);
        }
        for (String nama : mahasiswa) {
            System.out.println(nama);
            if(nama.equals("Budi")){
                break;
            }
        }
    }
}

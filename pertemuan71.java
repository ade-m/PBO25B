public class pertemuan71 {
    public static void main(String[] args) {
        Engine mesin = new Engine();
        Mobil sedan = new Mobil();
        sedan.setEngine(mesin);
        sedan.start();
        sedan.run();
        sedan.stop();
    }
}

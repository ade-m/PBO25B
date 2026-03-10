public class Mobil {
    private int status;

    public void start(Engine e){
        e.on();
        status=1;
    }
    public void stop(Engine e){
        e.off();
        status=0;
    }
    public void run(){
        if(status==1){
            System.out.println("Mobil berjalan");
        }
    }
}

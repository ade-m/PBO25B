public class Mobil {
    private int status;
    private Engine e;


    public void setEngine(Engine e){
        this.e=e;
    }
    public void start(){
        e.on();
        status=1;
    }
    public void stop(){
        e.off();
        status=0;
    }
    public void run(){
        if(status==1){
            System.out.println("Mobil berjalan");
        }
    }
}

public class Lingkaran {
    private int r;
    final double PHI = 22/7;

    public Lingkaran(){
    }
    public Lingkaran(int r){
        this.r=r;
    }

    public void setR(int r){
        this.r= r;
    }

    public int getR(){
        return r;
    }

    public double hitungKeliling(){
        return 2*PHI*r;
    }
    public double hitungLuas(){
        return PHI*r*r;
    }
    public static Double hitungKeliling(int r){
        return 2.0*(22/7)*r;
    }
}
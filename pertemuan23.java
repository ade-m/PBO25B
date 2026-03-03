import java.lang.Math;
public class pertemuan23 {
    public static void main(String[] args) {
        int n=0;
        for(int i =1;i<=n;i++){
            int x = (int) Math.pow(2, i-1);
            System.out.print(x +" ");
        }
        System.out.println("");
        int j=1;
        do{
            int x = (int) Math.pow(2, j-1);
            System.out.print(x +" ");
            j+=1;
        }while(j<=n);
        System.out.println("");
        int k =1;
        while(k<=n){
            int x = (int) Math.pow(2, k-1);
            System.out.print(x +" ");
            k+=1;
        }
    }
}

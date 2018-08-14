import java.util.concurrent.TimeUnit; 

public class suma{

    public static void main(String[] args){
        for(int x = 1; x <= 20; x++){
            int [] a = new int[x];
            for (int y = 0; y < x ; y++){
                a[y]=y;
            }
            long start= System.currentTimeMillis();
            suma(a);
            long fin = System.currentTimeMillis();
            System.out.println(suma(a));
            System.out.println();
            System.out.println("tiempo que se demora" +(fin-start));
        }

    }

    public static int suma(int[] a){
        return suma(a,0);
    }

    private static int suma(int[] a, int i){
        if(i == a.length)
            return 0;
        else 
            try{
                TimeUnit.SECONDS.sleep(1);
            }
            catch (Exception e){
            }
                return a[i] + suma(a, i+1);
            }
    }
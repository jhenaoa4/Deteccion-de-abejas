import java.util.concurrent.TimeUnit; 
public class sumaVolumenes{

    public static void main(String[] args){
        for(int x = 1; x<=30; x++){
            int [] a = new int[x];
              
            for (int y = 0; y < x ; y++){
                int z = (int)(Math.random()*(x+4));
                a[y]=z;
            }
            long start= System.currentTimeMillis();
            sumaVolumenes(0,a,11);
            long fin = System.currentTimeMillis();
            System.out.println(sumaVolumenes(0,a,11));            
            System.out.println("tiempo que se demoró " +(fin-start));
            System.out.println();
        }
    }

    public static boolean sumaVolumenes(int start, int[] a, int goal){
        if(start == a.length && goal ==0) return true;
        if(start == a.length && goal !=0) return false;
             
        return sumaVolumenes(start+1,a,goal-a[start])||sumaVolumenes(start+1,a,goal);
    }
}
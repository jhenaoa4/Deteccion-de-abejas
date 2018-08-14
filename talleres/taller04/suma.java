
/**
 * Write a description of class suma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class suma
{
    public static void main(String[] args){
        for(int i = 1; i<=20;i++){
            int[] a = new int[i];
            for(int j = 1; j<i;j++){
                a[j] = j;
            }
            suma(a,0);
        }
    }

    private static int suma(int[] a, int i){
        if(i == a.length){
            return 0;   
        } else {
            return a[i]+suma(a,i+1);
        }
    }
}

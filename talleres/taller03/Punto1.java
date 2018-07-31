
/**
 * Write a description of class Punto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto1
{
    public static void hanoi(int n, int origen, int inter, int fin){
        if(n == 1){
            System.out.println("Disk "+ n + " from "+ origen + " to "+ fin);
        } else {
            hanoi(n-1,origen, fin, inter);
            System.out.println("Disk "+ n + " from "+ origen + " to "+ fin);
            hanoi(n-1,inter,origen,fin);
        }
    }
}

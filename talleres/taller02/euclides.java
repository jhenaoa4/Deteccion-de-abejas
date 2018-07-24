package cosa;


/**
 * Write a description of class euclid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class euclides
{
    public static int mcd(int a,int b){
         return b == 0 ? a :mcd(b,a%b);
    }
}

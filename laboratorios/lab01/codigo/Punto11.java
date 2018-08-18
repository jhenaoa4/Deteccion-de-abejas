
/**
 * Write a description of class Lab01 here.
 *
 * @author Juliana Henao & Gerónimo Zuluaga
 * @version (a version number or a date)
 */
public class Punto11
{
    public static int fibonacci(int n){
        if(n == 0) {
            return 0;
        } else if (n==1){
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    
}

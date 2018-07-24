
/**
 * Write a description of class Punto3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto3
{
    public static void punto3(String base, String s){
        if(s.equals("")) {
            System.out.println(base);
        } else {
            punto3(base+s.charAt(0),s.substring(1));
            punto3(base, s.substring(1));
        }
    }
}

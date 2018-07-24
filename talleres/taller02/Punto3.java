package cosa;


/**
 * Write a description of class Punto3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Punto3
{
    public static void punto3(String base, String s){
        if(s.length() == 0){
            System.out.print("");
        } else {
            punto3(s.substring(0,1),s.substring(1));
            System.out.println(base+s);
        }
    }
}

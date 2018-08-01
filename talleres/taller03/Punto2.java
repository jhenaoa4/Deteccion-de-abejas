
/**
 * Write a description of class Punto2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto2
{
   public static void permutaciones(String base, String s){
       
       if(s.equals("")) {
           System.out.println(base);
           //AdvancedEncryptionStandard.desencriptarArchivo(base);
        } else {
            for(int i =0; i < s.length(); i++){
             permutaciones(base+s.charAt(i),s.substring(0,i)+s.substring(i+1));   
            }
        }
        
    }
}

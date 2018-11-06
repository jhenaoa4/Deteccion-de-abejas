
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
/**
 * Write a description of class DetecciónAbejas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DetecciónAbejas
{
    public static double distancia(Abeja abeja1, Abeja abeja2){
        return Math.sqrt(  Math.pow((abeja1.x - abeja2.x)*111111,2) +
            Math.pow((abeja1.y - abeja2.y)*111111,2) +
            Math.pow(abeja1.z - abeja2.z,2)
        );
    }

    public static Abeja[] leerArchivo(int numeroDeAbejas){
        final String nombreDelArchivo = "ConjuntoDeDatosCon"+numeroDeAbejas+"abejas.txt";
        Abeja[] arregloDeAbejas = new Abeja[numeroDeAbejas];
        try {            
            BufferedReader br = new BufferedReader(new FileReader(nombreDelArchivo));
            String lineaActual = br.readLine();
            lineaActual = br.readLine(); // Descarta la primera linea
            int index = 0;
            while (lineaActual != null){ // Mientras no llegue al fin del archivo
                String [] cadenaParticionada = lineaActual.split(",");
                Abeja abeja = new Abeja(Double.parseDouble(cadenaParticionada[0]),
                        Double.parseDouble(cadenaParticionada[1]),
                        Double.parseDouble(cadenaParticionada[2]));
                arregloDeAbejas[index++] = abeja;
                lineaActual = br.readLine();
            }
        }
        catch(IOException ioe) {
            System.out.println("Error leyendo el archivo de entrada");
        }
        return arregloDeAbejas;
    }

    public static Stack<Abeja> hacerPila(Abeja[] arregloDeAbejas){
        Stack <Abeja> abejas = new Stack();
        for(int i = 0; i < arregloDeAbejas.length; i++){
            abejas.push(arregloDeAbejas[i]);
        }
        return abejas;
    }

    public static void colissionDetector(Abeja[] arregloDeAbejas, Stack <Abeja> abejas){
        while(abejas.size() != 0){
            Abeja actual = abejas.pop();
            for(int i = 0; i < arregloDeAbejas.length; i++){
                if(distancia(arregloDeAbejas[i], actual) >= 100){
                    //System.out.println(arregloDeAbejas[i].x + ", " + arregloDeAbejas[i].y + ", " + arregloDeAbejas[i].z + " colisiona con: " + actual.x +", " + actual.y +", " +actual.z);
                }
            }
        }
    }
  
  public static void main(String [] args){
    		
        Abeja[] arregloDeAbejas = leerArchivo(100);
        Stack <Abeja> abejas = hacerPila(arregloDeAbejas);
        long startTime = System.currentTimeMillis();
        colissionDetector(arregloDeAbejas,abejas);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("El algoritmo tomo un tiempo de: "+estimatedTime+" ms");
        }
          
    }

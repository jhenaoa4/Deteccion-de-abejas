
import java.util.*;
/**
 * La clase Taller8 tiene la intención de
 * enfatizar en el uso de pilas y colas ya 
 * implementadas en java
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html"> Ver más acerca de colas<a/>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html"> Ver más acerca de pilas <a/> 
 * @author Mauricio Toro, Andrés Páez 
 */
public class Taller8 {

    /**
     * @param stack es una pila ya implementada que se crea en el test
     * Este método se encarga de poner la pila stack en orden inverso
     * Nota: recuerde que la funcion pop() no solo expulsa la última 
     * posición de una pila si no que tambien devuelve su valor.
     * @return una pila que haga el inverso de stack
     */
    public static Stack<Integer> inversa (Stack<Integer> stack){
        Stack<Integer> inverso = new Stack();
        while(stack.size() > 0){
            int t = stack.pop();
            inverso.push(t);
        }
        return inverso;
    }

    /**
     * @param queue es una cola ya implementada que se crea en el test
     * Este método se encarga de atender a personas.
     * Nota: Se debe imprimir en consola a quién atiende y sacarlo de la cola
     * existe una función "poll" que hace el trabajo más fácil
     * 
     */
    public static void cola (Queue<String> queue){
        while(queue.size()>0){
            System.out.println("Atendiendo a: "+queue.poll());
        }
    }

     public static int polaca  (String s){
        Stack <String> polaca = new Stack();
        String [] nuevo = s.split(" ");
        for(int i = nuevo.length-1; i >= 0; i--){
            polaca.push(nuevo[i]);
        }

        int total = 0;
        int num = 0;
        int size = polaca.size();

        for (int j = 0; j < size; j++){
            String temp = polaca.pop();
            if( !temp.equals("*")  && !temp.equals("+") && !temp.equals("-") && !temp.equals("/")){
                num = Integer.valueOf(temp);
                if(j == 0) total = num;
            }else{
                if(temp.equals("*")){
                    total = num*total;
                }
                if(temp.equals("+")){
                    total = num+total;
                }
                if(temp.equals("-")){
                    total = total-num;
                }
                if(temp.equals("/")){
                    total = total/num;
                }
            }
            
        }
        return total;
    }
}



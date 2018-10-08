/**
 * Laboratorio 1 de Estructuras de Datos 1
 * 
 * @author Juliana Henao y Gerónimo Zuluaga 
 * @version 1
 */

import java.util.Arrays;
import java.util.*;

public class Laboratory1
{
    //Punto 1.1 con linked list
    public static void SmartInsert(Lista A, int n){
        if(!A.contains(n)){
            A.insert(n,A.size());
        }
    }
    //Punto 1.1 con ArrayList
    public static void SmartInsert(ArrayList<Integer> A, int n){
        if(!A.contains(n)){
            A.add(n);
        }
    }

    /**
     * TRABAJO REFERENCIADO DE: Isabel Urrego Y Juliana Lalinde. 
     * Punto 1.2
     */
    public static int pivot (List<Integer> lista) {
        Iterator<Integer> t = lista.iterator();
        Iterator<Integer> p = lista.iterator();
        int pivote=1;
        int si=p.next();
        int actual = p.next();
        int siguiente = p.next();
        int sd=t.next()+t.next()+t.next();
        sd -= si + actual;
        while (t.hasNext()) {         
            sd+=t.next();
            int dif1 = sd - si;
            int dif2 = sd - siguiente - si - actual;
            if (Math.abs(dif1) > Math.abs(dif2)) {
                si += actual;
                sd -= siguiente;
                pivote++;
                actual = siguiente;
                siguiente = p.next();
            }
        }
        System.out.println("The pivot should be located in position "+pivote);
        return pivote;
    }

    public static void cola (Queue<Solicitud> queue){
        while(queue.size()>0){
            System.out.println("Se atiende a: "+queue.poll());
        }
    }

    public static void ejercicio4( Stack <Nevera> n, Queue<Solicitud> s){
        Stack <Nevera> ayuda = new Stack();
        while(n.size() > 0){
            Nevera t = n.pop();
            ayuda.push(t);
        }
        while(s.size()>0){
            System.out.println("Se atiende a: "+s.poll()+"y le toca la nevera "+ayuda.pop());
        }
    }
}
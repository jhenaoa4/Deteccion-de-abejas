import java.util.*;
public class UnaTablaDeHash{
    private int [] tabla;
    private int size;
    public UnaTablaDeHash(int size){
        tabla = new int[size];

    }

    /**
     * @param k es la llave del elemento que servirá como referencia al buscar
     * Este método se utiliza para darle una posicion dentro de la tabla, donde el %10 asegura que solo
     * se utilicen digitos de 0 a 10.
     */
    private int funcionHash(String k){
        //return ((int) k.charAt(0)) % size;
        int suma = 0;
        for(int i = 0; i < k.length(); i++)
            suma += ((int) k.charAt(i)) * i * (int) Math.pow(2,31-i);
        return suma % size;
    }

    /**
     * @param k es la llave del elemento que servirá como referencia al buscar
     * Este método se utiliza para obtener el elmento con la clave k, se enlaza con funcionHash
     */
    public int get(String k){
        int laFuncionHashDeK =  funcionHash(k);
        return tabla[laFuncionHashDeK];
    }
}
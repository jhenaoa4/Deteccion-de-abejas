import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class ListaDoblementeEnlazada {
    private NodeD first;
    private int size;
    public ListaDoblementeEnlazada()
    {
        size = 0;
        first = null;   
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private NodeD getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            NodeD temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    public int get(int index) throws IndexOutOfBoundsException {
        NodeD temp = getNode(index);
        return temp.data;
    }

    // Retorna el tamaño actual de la lista
    public int size()
    {
        return size;
    }

    // Inserta un dato en la posición index
    public void insert(int data, int index)
    {
        if(size == 0){
            NodeD nue = new NodeD(data);
            first = nue;
        }else{
            NodeD temp = getNode(index-1);
            NodeD nuevo = new NodeD(data);
            nuevo.next = temp.next;
            temp.next = nuevo;
            size++; 
        }
    }

    // Borra el dato en la posición index
    public void remove(int index)
    {
        if(size != 0){        
            if(index == 0){
                NodeD temp = first.next;
                first = temp;
            } else if(index == size-1){
                NodeD temp = getNode(index-1);
                temp.next= null;
            } else {
                NodeD temp = getNode(index-1);
                temp.next = getNode(index+1);
                size--;
            }
        }
    }

    // Verifica si está un dato en la lista
    public boolean contains(int data)
    {
        NodeD actual = first;
        while(actual.next != null){
            if(data == actual.data) return true;
            actual = actual.next;
        }
        return false;
    }

}

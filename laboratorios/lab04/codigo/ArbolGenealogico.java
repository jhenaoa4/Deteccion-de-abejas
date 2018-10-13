
/**
 * Write a description of class ArbolFilogenetico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArbolGenealogico
{
    public static void main(String [] args){
        Node yo = new Node("Juliana");
        
        Node mama = new Node("Elizabeth");
        yo.right = mama;
        Node papa = new Node("Gustavo");
        yo.left = papa;
        
        Node abla = new Node("Martha");
        mama.right = abla;
        Node ablo = new Node("Otoniel");
        mama.left = ablo;
        Node ablap = new Node("Carolina");
        papa.right = ablap;
        Node ablop = new Node("Luis");
        papa.left = ablop;
        
        Node babla = new Node("Martha");
        abla.right = babla;
        Node bablo = new Node("Antonio");
        abla.left = bablo;
        Node bablap = new Node("Bernarda");
        ablo.right = bablap;
        Node bablop = new Node("Adolfo");
        ablo.left = bablop;
        Node bablapp = new Node("Gloria");
        ablap.right = bablap;
        Node bablopp = new Node("Adolfo");
        ablop.left = bablopp;
    }
}

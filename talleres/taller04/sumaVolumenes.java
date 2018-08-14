
/**
 * Write a description of class sumaVolumenes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sumaVolumenes
{
    public boolean sumaVolumenes(int start, int[] a, int goal){
        if(start == a.length && goal ==0) return true;
        if(start == a.length && goal !=0) return false;
        return sumaVolumenes(start+1,a,goal-a[start])||sumaVolumenes(start+1,a,goal);
    }
}

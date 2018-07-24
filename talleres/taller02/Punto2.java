package cosa;


/**
 * Write a description of class Punto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto2
{
    public static boolean groupSum(int start, int[] nums, int target) {
        if(start == nums.length && target ==0) return true;
        if(start == nums.length && target !=0) return false;
        return groupSum(start+1,nums,target-nums[start])||groupSum(start+1,nums,target);
    }
}

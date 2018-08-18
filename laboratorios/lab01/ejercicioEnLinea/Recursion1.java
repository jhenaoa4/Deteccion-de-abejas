
/**
 * Write a description of class Recursion1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion1
{
    public int triangle(int rows) {
        if(rows<=1){
            return rows;
        } else {
            return rows+triangle(rows-1);
        }
    }

    public int sumDigits(int n) {
        if(n<10){
            return n;
        } else {
            return n%10+ sumDigits(n/10);
        }
    }

    public int count7(int n) {
        int count = 0;
        if(n%10==7)count++;
        if(n/10 == 0)return count;

        return count+count7(n/10);
    }

    public int countX(String str) {
        if (str.length() == 0) return 0;
        if (str.charAt(0) == 'x') return 1 + countX(str.substring(1));
        return countX(str.substring(1));
    }

    public int count8(int n) {
        int count =0;
        if (n%10==8 && n%100==88)count += 2;
        if(n%10 == 8 && n%100 != 88)count++;
        if(n/10 == 0) return count;
        return count + count8(n/10);

    }
}

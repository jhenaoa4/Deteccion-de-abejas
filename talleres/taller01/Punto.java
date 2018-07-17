import java.lang.Math;
public class Punto {
    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    // http://mathworld.wolfram.com/PolarCoordinates.html
    public double radioPolar() {
        double radioX = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return radioX;
    }

    // http://mathworld.wolfram.com/PolarCoordinates.html
    public double anguloPolar() {
        double aP = Math.atan2(x,y);
        return aP;
    }

    // http://mathworld.wolfram.com/Distance.html
    public double distanciaEuclidiana(Punto otro) {
        double d = Math.sqrt(Math.pow((otro.x()-x),2)+Math.pow((otro.y()-y),2));
        return d;
    }
}
import java.io.Serializable;

public class Serializzazione implements Serializable {
    private static final long serialVersionUID = 1;

    private int X1;
    private int Y1;
    private int X2;
    private int Y2;

    public Serializzazione(int x,int y, int xx, int yy){
        this.X1 =x;
        this.Y1 =y;
        this.X2 =xx;
        this.Y2 =yy;
    }
    public String toString(){
        return "Il punto ha coordinate: " + X1 + " e " + Y1;
    }

    public String String(){
        return "Il punto ha coordinate: " + X2 + " e " + Y2;
    }

    public String Risultato(){
        int somma;
        double radice;

        somma = (((X1 - X2) * (X1 - X2)) + (((Y1 - Y2) * (Y1 - Y2))));
        radice = Math.sqrt(somma);

        return "la distanza dei due punti e: " + radice;
    }

    public String DistOrigP1() {
        int somma1;
        double radice1 = 0;

        somma1 = ((X1 * X1) + (Y1 * Y1));
        radice1 = Math.sqrt(radice1);

        return "la distanza dall'origine del primo punto e': " + radice1;
    }

    public String DistOrigP2() {
        int somma1;
        double radice1 = 0;

        somma1 = ((X2 * X2) + (Y2 * Y2));
        radice1 = Math.sqrt(radice1);

        return "la distanza dall'origine del primo punto e': " + radice1;
    }
}

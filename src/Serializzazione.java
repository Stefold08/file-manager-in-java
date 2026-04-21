import java.io.Serializable;

public class Serializzazione implements Serializable {
    private static final long serialVersionUID = 1;

    private int x;
    private int y;

    public Serializzazione(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "Il punto ha coordinate "+x+" e "+y;
    }

}

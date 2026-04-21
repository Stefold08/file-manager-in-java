import java.io.*;
public class DeSerializzaPunto {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("/home/daniele/IdeaProjects/lettura_file/src/dati.dat"));
        } catch (FileNotFoundException e) {
            System.out.println("errore nel file");
        } catch (IOException e) {
            System.out.println("errore nell'imput");
        }

        Serializzazione p = null;

        try {
            p = (Serializzazione) ois.readObject();
        } catch (IOException e1) {
            System.out.println("errore");
        } catch (ClassNotFoundException e1) {
            System.out.println("Errore");
        }
        System.out.println(p.toString());
        System.out.println(p.String());
        System.out.println(p.Risultato());
        System.out.println("la distanza del primo punto dall'origine e: " + p.DistOrigP1() + "," + "la distanza del secondo punto dall'origine: " + p.DistOrigP2());
    }
}

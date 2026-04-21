import java.io.*;

public class SerializzaPunto {
    public static void main(String[] args) {
        Serializzazione p=new Serializzazione(2,3, 7, 5);
        ObjectOutputStream output=null;
        try{
            output=new ObjectOutputStream(new FileOutputStream("/home/daniele/IdeaProjects/lettura_file/src/dati.dat"));
        }
        catch (FileNotFoundException e) {
            System.out.println("nessun file con questo nome trovato!");
        }
        catch(IOException ioe){
            System.out.println(" IOException  "+ioe);
        }
        try {
            output.writeObject(p);
        } catch (IOException e1) {
            System.out.println("errore");
        }
        try {
            output.close();
        } catch (IOException e2) {
            System.out.println("Errore");
        }
        System.out.println("Serializzazione completata.");
    }
}
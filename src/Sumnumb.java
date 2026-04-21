import java.io.*;

public class Sumnumb {
    public static void main(String[] args) throws Exception {
        String inputFileName = "/home/daniele/IdeaProjects/lettura_file/src/Somma.txt";
        String line = null;

        try{
            BufferedReader in = new BufferedReader(new FileReader(inputFileName));
            BufferedReader leggi = new BufferedReader(new FileReader("/home/daniele/IdeaProjects/lettura_file/src/Somma.txt"));
            PrintWriter scrivi = new PrintWriter(new BufferedWriter(new FileWriter("/home/daniele/IdeaProjects/lettura_file/src/sommalizzazione.txt")));
            line = in.readLine();
            int somma = 0;

            while (line != null){
                int numero = Integer.parseInt(line);

                somma += numero;
                line = in.readLine();
            }
            in.close();
            System.out.println("la somma e': " + somma);

            scrivi.println(somma);

            leggi.close();
            scrivi.close();
        } catch (FileNotFoundException e){
            System.out.println(inputFileName+" FileNotFound");
        }catch(NumberFormatException e) {
            System.out.println(" linea non corretta: -> "+line+" <-");
        } catch(IOException e) {
            System.out.println(" IOException  "+e);
        }
        System.out.println("fine esecuzione");

    }
}

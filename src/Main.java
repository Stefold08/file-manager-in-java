import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leggi = new BufferedReader(new FileReader("/home/daniele/IdeaProjects/lettura_file/src/file.txt"));

        PrintWriter scrivi = new PrintWriter(new BufferedWriter(new FileWriter("/home/daniele/IdeaProjects/lettura_file/src/b.txt")));

        String s;
        s = leggi.readLine();
        while ( s != null){
            scrivi.println(s);
            s = leggi.readLine();
        }
        leggi.close();
        scrivi.close();
    }
}
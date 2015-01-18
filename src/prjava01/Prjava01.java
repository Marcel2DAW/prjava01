package prjava01;

/**
 *
 * @author daw2_m08uf4
 */

import java.io.*;
public class Prjava01 {
    /**
     * @param args the command line arguments
     *hola/
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer00.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Nova pagina web");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    <h1>DAW2 M09 UF4 PR3</h1>");bw.newLine();
            bw.write("    Nova pagina web");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
        }
    }   
}

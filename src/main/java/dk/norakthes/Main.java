package dk.norakthes;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("DNA.txt");
        // Creates new input file if file doesn't exist
        if (!file.exists()) {
            new FileWriter("DNA.txt");
            System.out.println("Laver ny fil 'DNA.txt'");
            System.exit(2);
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        if (br.readLine() == null) {
            System.out.println("filen er tom");
            System.exit(3);
        }

        String DNA = br.readLine();
        br.close();

        String RNA = DNA
                .replace('A','U')
                .replace('T','A')
                .replace('C','Æ') // Replaces with unused character to prohibit exchanging wanted character
                .replace('G','Ø') //
                .replace('Æ','G') //
                .replace('Ø','C');//

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write(RNA + "\r\n");
        bw.write(Translate.translate(RNA)); // Writes the translated proteins to file 'output.txt'
        bw.close();
    }
}

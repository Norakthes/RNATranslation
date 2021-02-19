package dk.norakthes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long timer = System.nanoTime();
        String DNA = "TACGCCTAAGGGUCGAATTTATCGUUCTGATAGATTACTTTACGCGGCTAT";

        String RNA = DNA
                .replace('A','U')
                .replace('T','A')
                .replace('C','Æ')
                .replace('G','Ø')
                .replace('Æ','G')
                .replace('Ø','C');
        //String RNA2 = RNA.replace('G', 'C');


        System.out.println(RNA);
        System.out.println("It took " + (System.nanoTime() - timer) + "NS");
        System.out.println(translate(RNA));
    }

    private static String translate(String mRNA) {
        String proteiner = "";

        proteiner = mRNA
                .replace("UUU","Fenylalanin")
                .replace("UUC","Fenylalanin")
                .replace("UUA","Leucin")
                .replace("UUG","Leucin")

                .replace("UCU","Serin")
                .replace("UCC","Serin")
                .replace("UCA","Serin")
                .replace("UCG","Serin")

                .replace("UAU","Tyrosin")
                .replace("UAC","Tyrosin")
                .replace("UAA","Stopcodon")
                .replace("UAG","Stopcodon")

                .replace("UGU","Cystein")
                .replace("UGC","Cystein")
                .replace("UGA","Stopcodon")
                .replace("UGG","Tryptofan")

                .replace("CUU","Leucin")
                .replace("CUC","Leucin")
                .replace("CUA","Leucin")
                .replace("CUG","Leucin")

                .replace("CCU","Prolin")
                .replace("CCC","Prolin")
                .replace("CCA","Prolin")
                .replace("CCG","Prolin")

                .replace("CAU","Histidin")
                .replace("CAC","Histidin")
                .replace("CAA","Glutamin")
                .replace("CAG","Glutamin")

                .replace("CGU","Arginin")
                .replace("CGC","Arginin")
                .replace("CGA","Arginin")
                .replace("CGG","Arginin")

                .replace("AUU","Isoleucin")
                .replace("AUC","Isoleucin")
                .replace("AUA","Isoleucin")
                .replace("AUG","Methiodin/Starcodon")

                .replace("ACU","Threonin")
                .replace("ACC","Threonin")
                .replace("ACA","Threonin")
                .replace("ACG","Threonin")

                .replace("AAU","Asparagin")
                .replace("AAC","Asparagin")
                .replace("AAA","Lysin")
                .replace("AAG","Lysin")

                .replace("AGU","Serin")
                .replace("AGC","Serin")
                .replace("AGA","Arginin")
                .replace("AGG","Arginin")

                .replace("GUU","Valin")
                .replace("GUC","Valin")
                .replace("GUA","Valin")
                .replace("GUG","Valin")

                .replace("GCU","Alanin")
                .replace("GCC","Alanin")
                .replace("GCA","Alanin")
                .replace("GCG","Alanin")

                .replace("GAU","Aspartat")
                .replace("GAC","Aspartat")
                .replace("GAA","Glutama")
                .replace("GAG","Glutamat")

                .replace("GGU","Glycin")
                .replace("GGC","Glycin")
                .replace("GGA","Glycin")
                .replace("GGG","Glycin");




        return proteiner;
    }
}

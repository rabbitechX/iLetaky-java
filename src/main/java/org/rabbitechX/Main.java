package org.rabbitechX;

/**
 * Generování odkazů na iLetáky
 */

public class Main {

    private static String slozString(String zacatek, Integer cislo){
        return zacatek + String.format("%02d", cislo) + ".jpg";
    }

    private static String pridejTag(String vstup){
        return "<img src=\"" + vstup + "\" width=\"50%\"><br><br>";
    }

    private static String hlavicka(){
        return "<html>\n<center>";
    }

    private static String paticka(){
        return "</center>\n</html>";
    }

    public static void main(String[] args) {

        String cesta = "https://cz5.staticac.cz/foto/letaky/142042/b142042";
        int pocet = 18;

        System.out.println(hlavicka());
        for (int i = 1; i <= pocet; i++) {
            System.out.println(pridejTag(slozString(cesta, i)));
        }
        System.out.println(paticka());

    }
}
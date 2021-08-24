
public class cifratestecharset {

  public static void cripto(String entrada) {

    // char[] arrayC = new char[entrada.length()];
    char letra;
    int ascii = 0;
    char letraconvertida;

    for (int i = 0; i < entrada.length(); i++) {

      letra = entrada.charAt(i);

      ascii = letra + 3;

      letraconvertida = (char) ascii;

      System.out.print(letraconvertida);

    }

    /*
     * MyIO.setCharset("iso8859-1");
     * 
     * for (int j = 0; j < entrada.length(); j++) {
     * 
     * System.out.print(arrayC[j]);
     * 
     * }
     */

  }

  public static void main(String[] args) {
    MyIO.setCharset("UTF-8");

    String entrada = MyIO.readLine();

    cripto(entrada);

  }

}

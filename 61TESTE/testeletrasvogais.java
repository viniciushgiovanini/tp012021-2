
public class testeletrasvogais {

  public static void main(String[] args) {

    String entrada = MyIO.readLine();

    // Scanner scs = new Scanner(System.in);
    // String entrada = scs.nextLine();

    for (int i = 0; i < entrada.length(); i++) {

      char letra = entrada.charAt(i);

      if (letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' || letra == 'I' || letra == 'i' || letra == 'O'
          || letra == 'o' || letra == 'U' || letra == 'u') {

        System.out.println("LETRA VOGAL");

      }

      if (letra != 'A' && letra != 'a' && letra != 'E' && letra != 'e' && letra != 'I' && letra != 'i' && letra != 'O'
          && letra != 'o' && letra != 'U' && letra != 'u') {

        System.out.println("LETRA CONSOANTE");

      }

    }
  }
}

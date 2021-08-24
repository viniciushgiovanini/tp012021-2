//Aluno: Vinícius Henrique Giovanini
//Matricula: 692225

public class isjava {

  public static boolean real(String entrada5) {

    char letra4;
    boolean real = false;
    boolean marcador = false;
    boolean marcador2 = false;
    int contador3000 = 0;

    for (int i = 0; i < entrada5.length(); i++) {// Pega a string analisa caracter por caracter, porém essa tem 2
                                                 // boolean, o primeiro se for um numero de 0 a 9 e o segundo se tiver .
                                                 // ou , no caracter analisado, se tiver uma vez o numero na string é
                                                 // numero real, porem só é considerado string se houver . uma vez e ,
                                                 // uma vez

      letra4 = entrada5.charAt(i);

      if ((letra4 == '1' || letra4 == '2' || letra4 == '3' || letra4 == '4' || letra4 == '5' || letra4 == '6'
          || letra4 == '7' || letra4 == '8' || letra4 == '9' || letra4 == '0')) {

        marcador = true;

      }

      if (letra4 == '.' || letra4 == ',') {

        marcador2 = true;
        contador3000++;

      }

    }

    if (marcador == marcador2) {

      if (contador3000 == 1) {
        real = true;
      }

    }

    return real;

  }

  public static boolean natural(String entrada4) {// pega o numero na string e analisa caracter por caracter, se o
                                                  // numero for de 0 a 9 adiciona 1 no contador, se a quantidade do
                                                  // contador for igual a quantidade de carecteres presentes na string
                                                  // retorna o boolean positivo

    char letra3;
    boolean natural = false;
    int contador4 = 0;

    for (int i = 0; i < entrada4.length(); i++) {

      letra3 = entrada4.charAt(i);

      if (letra3 == '1' || letra3 == '2' || letra3 == '3' || letra3 == '4' || letra3 == '5' || letra3 == '6'
          || letra3 == '7' || letra3 == '8' || letra3 == '9' || letra3 == '0') {

        contador4++;

      }

    }

    if (contador4 == entrada4.length()) {

      natural = true;

    }

    return natural;

  }

  public static boolean consoante(String entrada3) {// Pega a entrada e manda para uma variavel char e analisa letra por
                                                    // letra
                                                    // para ser comparado com as letras consoante e se a letra for
                                                    // consoante o
                                                    // contador adiciona mais um. Caso a quantidade de letra testada for
                                                    // igual a quantidade de letra presente na frase a variavel boolean
                                                    // fica true e retornada

    char letra2;
    boolean consoante = false;
    int contador2 = 0;

    for (int i = 0; i < entrada3.length(); i++) {

      letra2 = entrada3.charAt(i);

      if ((letra2 == 'B' || letra2 == 'b' || letra2 == 'C' || letra2 == 'c' || letra2 == 'D' || letra2 == 'd'
          || letra2 == 'F' || letra2 == 'f' || letra2 == 'G' || letra2 == 'g' || letra2 == 'H' || letra2 == 'h'
          || letra2 == 'J' || letra2 == 'j' || letra2 == 'K' || letra2 == 'k' || letra2 == 'L' || letra2 == 'l'
          || letra2 == 'M' || letra2 == 'm' || letra2 == 'N' || letra2 == 'n' || letra2 == 'P' || letra2 == 'p'
          || letra2 == 'Q' || letra2 == 'q' || letra2 == 'R' || letra2 == 'r' || letra2 == 'S' || letra2 == 's'
          || letra2 == 'T' || letra2 == 't' || letra2 == 'V' || letra2 == 'v' || letra2 == 'W' || letra2 == 'w'
          || letra2 == 'X' || letra2 == 'x' || letra2 == 'Y' || letra2 == 'y' || letra2 == 'Z' || letra2 == 'z')) {
        contador2++;
      }

      if (contador2 == entrada3.length()) {

        consoante = true;

      }

    }

    return consoante;

  }

  public static boolean vogal(String entrada2) { // Pega a entrada e manda para uma variavel char letra por letra para
                                                 // ser comparado com as letras vogais e se a letra for vogal o contador
                                                 // adiciona mais um. Caso a quantidade de letra testada for igual a
                                                 // quantidade de letra presente na frase a variavel boolean fica true e
                                                 // é retornada

    char letra;
    boolean vogal = false;
    int contador = 0;

    for (int i = 0; i < entrada2.length(); i++) {

      letra = entrada2.charAt(i);

      if ((letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' || letra == 'I' || letra == 'i' || letra == 'O'
          || letra == 'o' || letra == 'U' || letra == 'u')) {

        contador++;

      }

    }

    if (contador == entrada2.length()) {
      vogal = true;
    }

    return vogal;

  }

  public static void printtt(boolean recebervogal1, boolean receberconsoante1, boolean recebernatural1,
      boolean receberreal1) {

    if (recebervogal1 == true) {

      System.out.printf("SIM ");

    } else {

      System.out.printf("NAO ");

    }

    if (receberconsoante1 == true) {

      System.out.printf("SIM");

    } else {

      System.out.printf("NAO");

    }

    if (recebernatural1 == true) {

      System.out.printf(" SIM");

    } else {

      System.out.printf(" NAO");

    }

    if (receberreal1 == true || recebernatural1 == true) {// numero real tbm é natural então se for natural é real

      System.out.println(" SIM");

    } else {

      System.out.println(" NAO");

    }

  }

  public static void main(String[] args) {

    String entrada = MyIO.readLine();

    while (!entrada.equals("FIM")) {

      boolean recebervogal = vogal(entrada);
      boolean receberconsoante = consoante(entrada);
      boolean recebernatural = natural(entrada);
      boolean receberreal = real(entrada);

      printtt(recebervogal, receberconsoante, recebernatural, receberreal); // pega o resultado de cada função e manda
                                                                            // para esse função print para imprimir na
                                                                            // tela os resultados obtidos

      entrada = MyIO.readLine();

    }

  }
}

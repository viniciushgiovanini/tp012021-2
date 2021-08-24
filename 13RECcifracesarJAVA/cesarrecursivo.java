//Aluno: Vinícius Henrique Giovanini
//Matricula: 692225

//import java.io.*;

public class cesarrecursivo {

  public static String[] cripto(String entrada2) {// Essa função tem como objetivo entrar com a string e retornar para a
                                                  // função principal a entrada invertida.

    String[] frase = new String[entrada2.length()];
    String letraconvertidaS;

    for (int i = 0; i < entrada2.length(); i++) {

      char letra = entrada2.charAt(i);

      int ascI = (int) letra;

      ascI += 3;

      char converterC = (char) ascI;

      letraconvertidaS = Character.toString(converterC);

      frase[i] = letraconvertidaS;

    }

    return frase;

  }

  public static String transformaremstring(String[] receberarray, int contadorrec, String frase, int tamanhoentrada) {// Essa
                                                                                                                      // função
                                                                                                                      // é
                                                                                                                      // a
                                                                                                                      // função
                                                                                                                      // RECURSIVA,
                                                                                                                      // tem
                                                                                                                      // como
                                                                                                                      // objetivo
                                                                                                                      // pegar
                                                                                                                      // a
                                                                                                                      // string
                                                                                                                      // invertida
                                                                                                                      // que
                                                                                                                      // está
                                                                                                                      // dentro
                                                                                                                      // de
                                                                                                                      // um
                                                                                                                      // array
                                                                                                                      // e
                                                                                                                      // transformala
                                                                                                                      // em
                                                                                                                      // uma
                                                                                                                      // string
                                                                                                                      // normal,
                                                                                                                      // e
                                                                                                                      // retonrala
                                                                                                                      // quando
                                                                                                                      // acabar
                                                                                                                      // o
                                                                                                                      // array

    if (contadorrec == tamanhoentrada) {

      return frase;

    }

    frase += receberarray[contadorrec];

    return transformaremstring(receberarray, contadorrec = contadorrec + 1, frase, tamanhoentrada);

  }

  public static void main(String[] args) {

    MyIO.setCharset("UTF-8");

    // BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

    String entrada = MyIO.readLine();

    String respostaof;

    while (!(entrada.equals("FIM"))) {

      int contadorrec = 0;
      String frase = "";

      int tamanhoentrada = entrada.length();

      String[] receber = new String[tamanhoentrada];

      receber = cripto(entrada);

      respostaof = transformaremstring(receber, contadorrec, frase, tamanhoentrada);

      System.out.println(respostaof);

      entrada = MyIO.readLine();
    }

  }

}

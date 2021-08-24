//Aluno: Vinícius Henrique Giovanini - 602225
//OBS: Utilizei a classe scanner pois quando uso a MyIO ele nao converte corretamente para o ASCII

import java.util.Scanner;

public class cesar {

  public static String cripto(String entrada2) { // Esse Método recebe a entrada converte a string de entrada em char
                                                 // converte para inteiro ASCII adiciona 3 casas e converte de novo para
                                                 // char e depois converte a letra tratada para uma string e coloca
                                                 // dentro de um array de string.

    String[] frase = new String[400];
    String letraconvertidaS;
    String resposta = "";

    for (int i = 0; i < entrada2.length(); i++) {

      char letra = entrada2.charAt(i);

      int ascI = (int) letra;

      ascI += 3;

      char converterC = (char) ascI;

      letraconvertidaS = Character.toString(converterC);

      frase[i] = letraconvertidaS;

    }

    for (int j = 0; j < entrada2.length(); j++) { // Depois de todas as letras tiverem dentro do array de string, ele
                                                  // coloca tudo em uma String para ser retornado ao Main

      resposta += frase[j];

    }

    return resposta;

  }

  public static void main(String[] args) {

    Scanner sca = new Scanner(System.in);

    String receber;

    String entrada = sca.nextLine();

    while (!(entrada.equals("FIM"))) {

      receber = cripto(entrada);

      System.out.println(receber);

      entrada = sca.nextLine();
    }

    sca.close();

  }
}

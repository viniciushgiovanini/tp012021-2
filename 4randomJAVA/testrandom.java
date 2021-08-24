//Aluno: Vinícius Henrique Giovanini
//Matricula: 692225

import java.util.Random;

public class testrandom {

  public static String randomicostr(String entrada2, Random gerador) { // funcao que recebe a entrada e o random
                                                                       // gerador, pega a entrada e coloca em um array
                                                                       // de char depois seta a resposta que retonar
                                                                       // para a entrada, gera as 2 letras aleatorias,
                                                                       // entra em um for onde se a primeira letra
                                                                       // aleatoria for encontrada na entrada ela troca
                                                                       // pela segunda letra sorteada, se não for
                                                                       // encontrada ela retorna a entrada que foi
                                                                       // mandada para a função

    char[] ch = new char[400];
    String resposta1;
    char letra;

    char letraAC1 = ' ';
    char letraAC2 = ' ';

    for (int i = 0; i < entrada2.length(); i++) {

      letra = entrada2.charAt(i);
      ch[i] = letra;

    }

    resposta1 = entrada2;

    letraAC1 = ((char) ('a' + (Math.abs(gerador.nextInt()) % 26)));
    letraAC2 = ((char) ('a' + (Math.abs(gerador.nextInt()) % 26)));

    for (int j = 0; j < entrada2.length(); j++) {

      if (letraAC1 == ch[j]) {

        resposta1 = entrada2.replace(letraAC1, letraAC2);

      }

    }

    return resposta1;

  }

  public static void main(String[] args) {

    MyIO.setCharset("UTF-8");
    Random gerador = new Random(); // cria o random
    gerador.setSeed(4);// seta seed
    String entrada = MyIO.readLine();

    // Scanner scn = new Scanner(System.in);
    // String entrada = scn.nextLine();

    String receber;

    while (!entrada.equals("FIM")) {

      receber = randomicostr(entrada, gerador);

      System.out.println(receber);

      // entrada = scn.nextLine();
      entrada = MyIO.readLine();

    }

    // scn.close();

  }
}

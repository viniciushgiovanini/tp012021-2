import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Aluno: Vinícius Henrique Giovanini
//Matricula: 692225

public class cesarcharset {

  public static String cripto(String entrada2) { // Essa função pega a String, e pega letra por letra e vai mandando pro
                                                 // char Letra, que a cada loop pega 1 letra da frase, logo em seguida
                                                 // manda a letra para ser convertida em INT e conseguir seu número
                                                 // ANSII, depois acrescenta nesse numero ANSII mais 3 (+3), e converte
                                                 // esse número ansii em char novamente com a nova letra, logo em
                                                 // seguida converte o char em string e logo em seguida manda a string
                                                 // para um array de string

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

    for (int j = 0; j < entrada2.length(); j++) { // esse for está encarregado de transformar o array de string em uma
                                                  // string para fazer seu return

      resposta += frase[j];

    }

    return resposta;

  }

  public static void main(String[] args) throws IOException {

    // BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

    String receber;

    // String entrada = leitor.readLine();

    String entrada = MyIO.readLine();

    while (!(entrada.equals("FIM"))) { // Esse While faz o loop até se deparar com a palavra fim, e em quanto ele faz o
                                       // loop fica mandando a entrada para a função cripto e recebendo o resultado
                                       // imprimindo o resultado e pedindo uma nova entrada

      receber = cripto(entrada);

      System.out.println(receber);

      entrada = MyIO.readLine();
    }

  }
}

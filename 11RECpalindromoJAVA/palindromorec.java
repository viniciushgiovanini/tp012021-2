//Aluno: Vinícius Henrique Giovanini
//Matricula: 692225

public class palindromorec {

  public static String[] isPalindromo(String entrada2, int i, int j, int contador1, int receberletra,
      String[] entradaletra, int looprec) {
    // Método
    // que
    // transforma
    // a
    // string
    // em
    // char
    // pega
    // o
    // primeiro char
    // transforma em string e coloca na posição do array de string
    // Faz a mesma coisa, mas colocando o primeiro char da string na
    // ultima posição da frase, e fazendo assim até colocar a string
    // inteira invertida dentro do array

    if (looprec == entrada2.length()) {

      return entradaletra;

    }

    char letra;

    receberletra = entrada2.length() - 1;

    letra = entrada2.charAt(i);

    String letraconvertida = Character.toString(letra);// converte a primeira letra (char) em string

    entradaletra[i] = letraconvertida;// pega a primeira letra convertida em string e coloca na primeira posição do
    // array

    return isPalindromo(entrada2, i = i + 1, j = j + 1, contador1, receberletra, entradaletra, looprec = looprec + 1);

  }

  public static boolean inverter(String[] arrayletra, int tamanhoarray, int tamanhoarray2) { // Essa função recebe a
                                                                                             // palavra presente na
                                                                                             // entrada na forma de
                                                                                             // array, tendo a função de
                                                                                             // invertela e fazer logo
                                                                                             // em seguida a comparação
                                                                                             // letra por letra se ela é
                                                                                             // palindroma

    String[] entradaletrainvertida = new String[tamanhoarray];
    boolean ultresposta = false;
    int contador1 = 0;

    for (int i = 0; i < tamanhoarray2; i++) {

      entradaletrainvertida[--tamanhoarray] = arrayletra[i];

    }

    for (int j = 0; j < tamanhoarray2; j++) {

      if (entradaletrainvertida[j].equals(arrayletra[j])) {

        contador1++;

      }

    }

    if (contador1 == tamanhoarray2) {

      ultresposta = true;

    }

    return ultresposta;

  }

  public static void main(String[] args) {

    // MyIO.setCharset("UTF-8");

    String entrada = MyIO.readLine();

    boolean receber = false;

    while (!entrada.equals("FIM")) {

      int tamanhoarray = entrada.length();

      int tamanhoarray2 = tamanhoarray;

      String[] entradaletra = new String[tamanhoarray];

      String[] receberarray = new String[tamanhoarray];

      receberarray = isPalindromo(entrada, 0, 0, 0, 0, entradaletra, 0);

      receber = inverter(receberarray, tamanhoarray, tamanhoarray2);

      if (receber == true) {

        System.out.println("SIM");

      } else {
        System.out.println("NAO");
      }

      entrada = MyIO.readLine();
    }

  }
}

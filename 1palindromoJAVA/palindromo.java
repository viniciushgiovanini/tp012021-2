//package palindromoJAVA;

//Aluno: Vinícius Henrique Giovanini
//QUESTÃO 1 - Palindromo em JAVA

public class palindromo {

  public static boolean isPalindromo(String entrada2) {// Método que transforma a string em char pega o primeiro char
                                                       // transforma em string e coloca na posição do array de string
                                                       // Faz a mesma coisa, mas colocando o primeiro char da string na
                                                       // ultima posição da frase, e fazendo assim até colocar a string
                                                       // inteira invertida dentro do array

    char letra;
    String[] entradaletra = new String[500];
    String[] entradaletrainvertida = new String[500];
    boolean resposta = false;
    int receberletra = 0;
    int contador1 = 0;

    receberletra = entrada2.length() - 1;

    for (int i = 0; i < entrada2.length(); i++) {
      letra = entrada2.charAt(i);

      String letraconvertida = Character.toString(letra);// converte a primeira letra (char) em string

      entradaletra[i] = letraconvertida;// pega a primeira letra convertida em string e coloca na primeira posição do
                                        // array

      entradaletrainvertida[receberletra--] = letraconvertida;// pega a primeira letra convertida e coloca na ultima
                                                              // posição da frase
    }

    for (int j = 0; j < entrada2.length(); j++) {

      if (entradaletra[j].equals(entradaletrainvertida[j])) { // vai comparar se tiver letra igual na mesma posição
                                                              // adiciona 1 ao contador
        contador1++;
      }

    }

    if (contador1 == entrada2.length()) { // se a quantidade de letras iguais na mesma posição for igual a quantidade de
                                          // letra presente na frase a palavra é palindroma
      resposta = true;
    }

    return resposta;

  }

  public static void main(String[] args) {

    MyIO.setCharset("UTF8");
    String entrada = MyIO.readLine();
    boolean receber;

    while (!entrada.equals("FIM")) {

      receber = isPalindromo(entrada);

      if (receber == true) {

        System.out.println("SIM");

      } else {
        System.out.println("NAO");
      }

      entrada = MyIO.readLine();
    }

  }
}

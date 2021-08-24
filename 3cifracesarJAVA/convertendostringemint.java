//CIFRAMENTO DE CESAR FUNCIONANDO PERFEITAMENTE

public class convertendostringemint {
  public static void main(String[] args) {

    char[] c = new char[10];

    c[0] = 'ç';

    int teste = (int) c[0];

    teste = teste + 3;

    char convertechar = (char) teste;

    System.out.println(convertechar);

    System.out.println(teste);

  }
}

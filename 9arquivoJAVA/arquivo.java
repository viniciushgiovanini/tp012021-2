//Aluno Vinícius Henrique Giovanini
//Matricula: 692225

import java.io.*;

public class arquivo {

  public static long Escrever(Double entrada, long posicao2) throws Exception {// Toda vez que essa função é chamada ele
                                                                               // atualiza a posicao do vetor no arquivo
                                                                               // que é o SEEK e logo em seguida escreve
                                                                               // o numero double no arquivo, e retorna
                                                                               // a posição atual do vetor

    RandomAccessFile raf = new RandomAccessFile("exemplo.txt", "rw");

    raf.seek(posicao2);

    raf.writeDouble(entrada);

    raf.close();

    return posicao2;

  }

  public static void ler(long posicao22) throws Exception {// Toda vez que essa função é chamada ela atualiza o seek,
                                                           // que é posição, porém aqui tem um detalhe, para ser escrito
                                                           // ao contrario, a primeira posição que chega na funcao ler,
                                                           // é a ultima que foi setada na função Escrever, dessa
                                                           // maneira vai lendo o arquivo ao contrario, e para fazer
                                                           // isso é só decrementar posicao - 8 da posição pois o numero
                                                           // double tem 8 bytes

    RandomAccessFile raf2 = new RandomAccessFile("exemplo.txt", "rw");

    raf2.seek(posicao22);

    double leitura = raf2.readDouble();

    System.out.println(leitura);

    raf2.close();

  }

  public static void main(String args[]) throws Exception {// Na função principal ele recebe uma entrada inteiro
                                                           // contendo a quantidade de vezes que vai ser escrito e lido
                                                           // o programa, logo em seguida ele le um numero double e seta
                                                           // a posição para alterar posicao+8 toda vez que o loop for
                                                           // executado, isso consiste na posicao em bytes do
                                                           // deslocamento do numero double no arquivo, e logo em
                                                           // seguida manda para a função escrever a entrada double e a
                                                           // posicao e recebe a posicao final.

    int entradaI = MyIO.readInt();
    long posicao1 = 0;
    long receberposicao1 = 0;

    for (int i = 0; i < entradaI; i++) {// Ja foi explicado na funcao escrever

      double entrada2 = MyIO.readDouble();

      posicao1 += 8;

      receberposicao1 = Escrever(entrada2, posicao1);

    }

    long posicao22 = receberposicao1;

    for (int j = 0; j < entradaI; j++) {// Ja foi explicado na funcao ler

      ler(posicao22);

      posicao22 -= 8;

    }

  }

}

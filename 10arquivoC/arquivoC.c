//Aluno: Vinícius Henrique Giovanini
//Matricula: 692225

#include <stdio.h>
#include <string.h>

long Escrever(double entrada, int quantidade, long posi) //Essa função pega o arquivo abre ele para escrita, dessa forma o ponteiro está na primeira posicao, e ja que é um
                                                         //numero double, que tem 8 bytes ele vai pulando de 8 em 8 casas, como foi colocado no fseek, e retorna a posicao final que
                                                         //o vetor do arquivo vai terminar
{

  FILE *p;
  p = fopen("teste.txt", "w");

  for (int i = 0; i < quantidade; i++)
  {
    scanf("%lf", &entrada);

    //int revelaposi = ftell(p);
    //printf("O ponteiro antes do seek está em: %d\n", revelaposi);

    fwrite(&entrada, sizeof(double), 1, p);

    fseek(p, posi = posi + 8, SEEK_SET);
  }

  //fclose(p);

  return posi;
}

void ler(double entrada, int quantidade, long posi) //Função ler, abre o arquivo novamente, porém só para leitura, ele pega primeira mente e decrementa -8 posicões, pois o vetor
                                                    //do arquivo escrever termina 1 posicao acima de onde foi escrito o ultima algarismos. Assim ele recebe posição com uma posição acima de
                                                    //onde foi escrito o ultimo algarismo, depois do primeiro decrecimo ele vai diminuindo de 8 em 8 a quantidade de vezes que foi setado no main
                                                    //para escrita, dessa forma imprimindo os numeros de cabeça para baixo(Ordem decrescente).
{

  //printf("TA LENDOOOOOOOOOOOOOOOOOOO\n");

  FILE *p;
  p = fopen("teste.txt", "r");

  for (int i = 0; i < quantidade; i++)
  {
    posi -= 8;
    fseek(p, posi, SEEK_SET);
    //int revelaposi2 = ftell(p);
    //printf("O ponteiro antes do seek está em: %d\n", revelaposi2);
    fread(&entrada, sizeof(double), 1, p);
    printf("%.3lf\n", entrada);
  }
}

int main()
{
  FILE *p;
  p = fopen("teste.txt", "wb+");

  int quantidade = 0;
  int contador = 0;
  double entrada = 0;
  long posi = 0;

  scanf("%d", &quantidade);

  long receberposi = Escrever(entrada, quantidade, posi);

  ler(entrada, quantidade, receberposi);

  return 0;
}
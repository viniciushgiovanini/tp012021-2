#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <locale.h>

bool inv(char *entrada, int receberinteiro, int receberinteiro2)
{

  char receber[50];
  char inverter[50];
  bool resp = false;

  strcpy(receber, entrada);

  for (int j = 0; j < receberinteiro2; j++)
  {
    printf("%c", receber[j]);
  }

  inverter[receberinteiro] = '\0';
  receberinteiro -= 1;

  printf("\n");

  for (int i = 0; i < receberinteiro2; i++)
  {
    inverter[i] = receber[receberinteiro--];
  }

  for (int j = 0; j < receberinteiro2; j++)
  {
    printf("%c", inverter[j]);
  }
}

int main(int argc, char const *argv[])
{
  //setlocale(LC_ALL, "UTF-8");
  char entrada[50];
  scanf("%s", &entrada);
  int receber = strlen(entrada);
  int receberinteiro2 = receber;
  bool resposta = false;

  resposta = inv(entrada, receber, receberinteiro2);

  return 0;
}
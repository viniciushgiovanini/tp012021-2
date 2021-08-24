#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool ispalindroma(char *entrada, int length)
{

  char inverter[41];
  int receberentrada = length;
  int contador1 = 0;
  bool resposta = false;
  char rec[length];

  strcpy(rec, entrada);

  for (int i = 0; i < receberentrada; i++)
  {
    inverter[i] = rec[--length];
  }

  for (int j = 0; j < receberentrada; j++)
  {
    if (inverter[j] == rec[j])
    {
      contador1++;
    }
  }

  if (contador1 == receberentrada)
  {
    resposta = true;
  }

  for (int k = 0; k < receberentrada; k++)
  {

    printf("%c\n", inverter[k]);
  }

  return resposta;
}

int main()
{

  //entrada da string
  char entrada[41];
  scanf("%s", &entrada);

  int length = strlen(entrada);

  bool receber = false;

  while (!(entrada[0] == 'F' && entrada[1] == 'I' && entrada[2] == 'M'))
  {
    entrada[41] = "";
    receber = ispalindroma(entrada, length);

    if (receber == true)
    {
      printf("SIM \n");
    }
    else
    {
      printf("NAO \n");
    }

    scanf("%s", &entrada);
  }

  return 0;
}
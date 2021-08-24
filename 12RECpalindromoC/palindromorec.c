#include <stdio.h>
#include <string.h>
#include <locale.h>

int inverte(char *n, int y, int aux) //função recursiva
{
  if (y <= aux)
    return 1;
  else
  {
    if (n[y] != n[aux])
      return 0;

    return inverte(n, y - 1, aux + 1);
  }
}

int palindromo(char *n, int *erro)
{
  int aux1, x = 0;

  aux1 = inverte(n, strlen(n) - 1, x);

  if (aux1 == 1)
  {
    erro = 1;
  }

  else
  {
    erro = 0;
  }
}

int main()
{

  char string[200] = " ";

  for (int cont = 0; cont <= 670; cont++)
  {
    scanf("%s", string);
    int *recebererro = 0;

    if (!!strcmp(string, "FIM"))
    {
      palindromo(string, recebererro);
      if (recebererro == 1)
      {
        printf("NAO\n");
      }
      else
      {
        printf("SIM\n");
      }
    }
    else
    {
      return 0;
    }
  }
}

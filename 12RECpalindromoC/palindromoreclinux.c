#include <stdio.h>
#include <string.h>

int inverte(char *n, int y, int aux)
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

int palindromo(char *n)
{
  int aux1, x = 0;
  int erro = 0;

  aux1 = inverte(n, strlen(n) - 1, x);

  if (aux1 == 1)
  {
    erro = 1;
  }
  else
  {
    erro = 0;
  }

  return erro;
}

int main()
{
  char string[200];

  scanf("%s", string);

  while (!!strcmp(string, "FIM"))
  {
    int recebererro = 0;

    recebererro = palindromo(string);

    if (recebererro == 1)
    {
      printf("NAO\n");
    }
    else
    {
      printf("SIM\n");
    }

    scanf("%s", string);
  }

  return 0;
}

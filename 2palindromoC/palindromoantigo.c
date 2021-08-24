#include <stdio.h>
#include <string.h>

int main()
{
  char string[200], contrario[200];
  int total = 0, i, j, erro = 0;

  for (int cont = 1; cont <= 670; cont++)
  {

    scanf("%s", string);

    if (!!strcmp(string, "FIM"))
    {

      total = strlen(string);
      j = total;
      total++;
      j--;

      for (i = 0; i < total; i++)
      {
        contrario[i] = string[j];
        j--;
      }

      total--;

      for (i = 0; i < total; i++)
      {
        if (string[i] != contrario[i])
        {
          erro = 1;
        }

        else
        {
          erro = 0;
        }
      }

      if (erro == 1)
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

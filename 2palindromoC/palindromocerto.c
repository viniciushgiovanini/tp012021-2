//Aluno: Vinícius Henrique Giovanini
//Matricula: 692225

#include <stdio.h>
#include <string.h>

void main()
{
  char string[200], contrario[200];
  int total = 0, i, j, erro = 0;
  int flag = 0;
  scanf("%s", &string);
  while (flag == 0)
  {
    flag = strcmp(string, "FIM") == 0;

    if (flag == 0)
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

      scanf("%s", &string);
    }
  }

  return 0;
}
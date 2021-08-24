#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{

  for (int contador = 0; contador <= 654; contador++)
  {
    /* code */

    //entrada de dados
    char entrada[200];
    char receber;
    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0;
    int cont4 = 0;
    int cont5 = 0;
    //gets(entrada);
    scanf("%s", &entrada);

    if (!!strcmp(entrada, "FIM"))
    {

      for (int i = 0; i < strlen(entrada); i++)
      {

        receber = entrada[i];

        cont1++;

        if (receber == 'A' || receber == 'a' || receber == 'e' || receber == 'E' || receber == 'i' || receber == 'I' || receber == 'o' || receber == 'O' || receber == 'u' || receber == 'U')
        {
          cont2++;
        }

        if (receber == 'b' || receber == 'B' || receber == 'c' || receber == 'C' || receber == 'D' || receber == 'd' || receber == 'F' || receber == 'f' || receber == 'g' || receber == 'G' || receber == 'h' || receber == 'H' || receber == 'J' || receber == 'j' || receber == 'K' || receber == 'k' || receber == 'l' || receber == 'L' || receber == 'M' || receber == 'm' || receber == 'n' || receber == 'N' || receber == 'P' || receber == 'p' || receber == 'Q' || receber == 'q' || receber == 'R' || receber == 'r' || receber == 's' || receber == 'S' || receber == 'T' || receber == 't' || receber == 'V' || receber == 'v' || receber == 'w' || receber == 'W' || receber == 'X' || receber == 'x' || receber == 'Y' || receber == 'y' || receber == 'z' || receber == 'Z')
        {
          cont3++;
        }

        if (receber >= 48 && receber <= 57)
        {
          cont4++;
        }

        if (receber == 46 || receber == 44)
        {
          cont5++;
        }
      }

      //LOCAL DAS COMPARACOES
      //printf("%d\n", cont1);
      //printf("%d\n", cont2);
      //printf("%d\n", cont3);
      //printf("%d\n", cont5);
      //printf("%d\n", cont4);

      if (cont1 == cont2)
      {
        printf("SIM");
        printf(" ");
      }
      else
      {

        printf("NAO");
        printf(" ");
      }

      if (cont1 == cont3)
      {
        printf("SIM");
        printf(" ");
      }
      else
      {
        printf("NAO");
        printf(" ");
      }

      if (cont4 == cont1)
      {

        printf("SIM");
        printf(" ");
      }
      else
      {
        printf("NAO");
        printf(" ");
      }

      if (cont5 > 0)
      {
        printf("SIM");
        printf(" ");
      }
      else
      {
        printf("NAO");
        printf(" ");
      }

      printf("\n");
    }
    else
    {
      return 0;
    }
  }
}

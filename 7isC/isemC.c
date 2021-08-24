//Aluno: Vinícius Henrique Giovanini
//Matricula: 692225

#include <stdio.h>
#include <string.h>
#include <stdbool.h>

void real(char *string, int receberlength, int i, int recebernaturais) //Essa função recebe a string por referencia e trabalha ela dentro dos if, se ela for uma string
                                                                       //que contém numeros + ponto ou virgula, e se tiver somente um ponto ou uma virgula imprime true,
                                                                       //essa função ela recebe o resultado da função naturais pois todo numero natual é real, então se
                                                                       //recebernaturais for true vai dar true aqui tbm.
{

  int contador3 = 0;
  bool marcador4 = false;
  bool marcador5 = false;
  bool resposta = false;

  while (i < receberlength)
  {
    if ((string[i] == '1' || string[i] == '2' || string[i] == '3' || string[i] == '4' || string[i] == '5' || string[i] == '6' ||
         string[i] == '7' || string[i] == '8' || string[i] == '9' || string[i] == '0'))
    {
      marcador4 = true;
    }

    if (string[i] == '.' || string[i] == ',')
    {
      marcador5 = true;
      contador3++;
    }

    i++;
  }

  if (marcador4 == marcador5)
  {
    if (contador3 == 1)
    {
      resposta = true;
    }
  }

  if (resposta == true || recebernaturais == 1)
  {
    printf("SIM\n");
  }
  else
  {
    printf("NAO\n");
  }
}

int naturais(char *string, int receberlength, int i) //Recebe a string por referência e se a string tiver contido somente numeros imprime true, caso contrario imprime false.
{

  int contador2 = 0;
  int irprareal = 0;

  while (i < receberlength)
  {
    if (string[i] == '1' || string[i] == '2' || string[i] == '3' || string[i] == '4' || string[i] == '5' || string[i] == '6' || string[i] == '7' ||
        string[i] == '8' || string[i] == '9' || string[i] == '0')
    {
      contador2++;
    }

    i++;
  }

  if (contador2 == receberlength)
  {
    printf("SIM ");
    irprareal = 1;
  }
  else
  {
    printf("NAO ");
  }

  return irprareal;
}

void consoantes(char *string, int receberlength, int i) //A string imprime true se conter somente consoantes, caso contrario imprime false
{
  int contador = 0;
  bool recebervogais = false;
  while (i < receberlength)
  {

    if ((string[i] == 'B' || string[i] == 'b' || string[i] == 'C' || string[i] == 'c' || string[i] == 'D' || string[i] == 'd' ||
         string[i] == 'F' || string[i] == 'f' || string[i] == 'G' || string[i] == 'g' || string[i] == 'H' || string[i] == 'h' ||
         string[i] == 'J' || string[i] == 'j' || string[i] == 'K' || string[i] == 'k' || string[i] == 'L' || string[i] == 'l' ||
         string[i] == 'M' || string[i] == 'm' || string[i] == 'N' || string[i] == 'n' || string[i] == 'P' || string[i] == 'p' ||
         string[i] == 'Q' || string[i] == 'q' || string[i] == 'R' || string[i] == 'r' || string[i] == 'S' || string[i] == 's' ||
         string[i] == 'T' || string[i] == 't' || string[i] == 'V' || string[i] == 'v' || string[i] == 'W' || string[i] == 'w' ||
         string[i] == 'X' || string[i] == 'x' || string[i] == 'Y' || string[i] == 'y' || string[i] == 'Z' || string[i] == 'z' ||
         string[i] == ' '))
    {
      contador++;
    }

    i++;
  }

  if (contador == receberlength)
  {
    printf("SIM ");
  }
  else
  {
    printf("NAO ");
  }
}

void vogal(char *string, int receberlength, int i) //Recebe a entrada por referência, se a string conter somente vogais imprime SIM, caso contrario imprime false (NÃO)
{

  bool recebervogais = false;
  int cont = 0;

  while (i < receberlength)
  {

    if ((string[i] == 'A' || string[i] == 'a' || string[i] == 'E' || string[i] == 'e' || string[i] == 'I' || string[i] == 'i' ||
         string[i] == 'O' || string[i] == 'o' || string[i] == 'U' || string[i] == 'u' || string[i] == ' '))
    {
      cont++;
    }

    i++;
  }

  if (cont == receberlength)
  {
    printf("SIM ");
  }
  else
  {
    printf("NAO ");
  }
}

int main()
{

  char string[200];

  while (fgets(string, 199, stdin) != NULL)
  {
    int receberlength = strlen(string) - 1;
    int irparareall = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    vogal(string, receberlength, i);
    consoantes(string, receberlength, j);
    irparareall = naturais(string, receberlength, k);
    real(string, receberlength, l, irparareall);

    if (strcmp(string, "FIM") == 0)
    {
      return 0;
    }
  }
}
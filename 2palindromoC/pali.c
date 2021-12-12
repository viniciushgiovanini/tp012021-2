#include <stdio.h>
#include <string.h>
#include <stdbool.h>

// PROFESSOR NAO SEI PQ MEU PALINDROMO N TAVA COM 100%

void limparString(char *entrada)
{
  for (int i = 0; i < 100; i++)
  {
    if (!(entrada[i] >= 65 && entrada[i] <= 122))
    {
      entrada[i] = '\0';
    }
  }
}

void iniciarString(char *entrada)
{
  for (int i = 0; i < 100; i++)
  {

    entrada[i] = '\0';
  }
}

int qtddeCarac(char *entrada)
{

  int contador = 0;

  for (int i = 0; i < 100; i++)
  {
    if (entrada[i] != '\0')
    {
      contador++;
    }
  }
  contador--;
  return contador;
}

bool testarPali(char *entrada)
{
  int tamanhoentrada = qtddeCarac(entrada);
  char entrada2[100];
  iniciarString(entrada2);
  int contador = 0;
  bool resposta = false;

  for (int i = tamanhoentrada; i >= 0; i--)
  {
    entrada2[i] = entrada[contador];
    contador++;
  }

  int resp = strcmp(entrada, entrada2);

  if (resp == 0)
  {
    resposta = true;
  }

  return resposta;
}

int main(int argc, char const *argv[])
{

  char entrada[100];
  iniciarString(entrada);
  fgets(entrada, 100, stdin);
  limparString(entrada);

  while (!(entrada[0] == 'F' && entrada[1] == 'I' && entrada[2] == 'M'))
  {

    bool resp = testarPali(entrada);

    if (resp == true)
    {
      printf("SIM\n");
    }
    else
    {
      printf("NAO\n");
    }

    iniciarString(entrada);
    fgets(entrada, 100, stdin);
    limparString(entrada);
  }

  return 0;
}

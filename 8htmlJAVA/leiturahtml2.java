//Aluno: Vinícius Henrique Giovanini
//Matricula: 692225

import java.io.*;
import java.net.URL;

public class leiturahtml2 {

  public static void main(String[] args) throws IOException {
    URL url = new URL("http://maratona.crc.pucminas.br/series/Black_Mirror.html");
    BufferedReader leitura = new BufferedReader((new InputStreamReader(url.openStream(), "UTF-8")));
    String receberleitura = leitura.readLine();

    System.out.println(receberleitura);
  }
}

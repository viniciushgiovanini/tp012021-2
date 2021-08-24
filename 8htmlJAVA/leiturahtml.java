//Aluno: Vin√≠cius Henrique Giovanini
//Matricula: 692225

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class leiturahtml {

  public int elementobr(String entrada, int contarbr) {

    if (entrada.contains("<br>")) {

      contarbr++;

    }

    return contarbr;

  }

  public int elementotable(String entrada2, int contadortable) {

    if (entrada2.contains("<table>")) {

      contadortable++;

    }

    return contadortable;

  }

  public int contarconsoante(String entrada, int contarconso) {

    char letra;

    for (int i = 0; i < entrada.length(); i++) {

      letra = entrada.charAt(i);

      if ((letra == 'b' || letra == 'c' || letra == 'd' || letra == 'f' || letra == 'g' || letra == 'h' || letra == 'j'
          || letra == 'k' || letra == 'l' || letra == 'm' || letra == 'n' || letra == 'p' || letra == 'q'
          || letra == 'r' || letra == 's' || letra == 't' | letra == 'v' || letra == 'w' || letra == 'x' || letra == 'y'
          || letra == 'z')) {
        contarconso++;
      }

    }

    return contarconso;

  }

  public void getPage(URL url, String entrada) throws IOException {

    BufferedReader in = (new BufferedReader(new InputStreamReader(url.openStream())));

    String inputLine;
    char letra;
    int contara = 0;
    int contare = 0;
    int contarii = 0;
    int contaro = 0;
    int contaru = 0;
    int contara2 = 0;
    int contare2 = 0;
    int contari2 = 0;
    int contaro2 = 0;
    int contaru2 = 0;
    int contara3 = 0;
    int contare3 = 0;
    int contari3 = 0;
    int contaro3 = 0;
    int contaru3 = 0;
    int contara4 = 0;
    int contaro4 = 0;
    int contara5 = 0;
    int contare5 = 0;
    int contari5 = 0;
    int contaro5 = 0;
    int contaru5 = 0;
    int consoante = 0;
    int contarconso = 0;
    int receberconsoante = 0;
    int elementobr = 0;
    int receberelementobr = 0;
    int contarelementobr = 0;
    int elementotable = 0;
    int contartable = 0;
    int receberelementotable = 0;

    while ((inputLine = in.readLine()) != null) {

      // System.out.println(inputLine);

      for (int i = 0; i < inputLine.length(); i++) {

        letra = inputLine.charAt(i);

        if (letra == 97) {

          contara++;

        }

        if (letra == 101) {
          contare++;
        }

        if (letra == 105) {
          contarii++;
        }

        if (letra == 111) {
          contaro++;
        }

        if (letra == 117) {
          contaru++;
        }

        if (letra == 225) {
          contara2++;
        }

        if (letra == 233) {
          contare2++;
        }

        if (letra == 237) {
          contari2++;
        }

        if (letra == 243) {
          contaro2++;
        }

        if (letra == 250) {
          contaru2++;
        }

        if (letra == 224) {
          contara3++;
        }

        if (letra == 232) {
          contare3++;
        }

        if (letra == 236) {
          contari3++;
        }

        if (letra == 242) {
          contaro3++;
        }

        if (letra == 249) {
          contaru3++;
        }

        if (letra == 227) {
          contara4++;
        }

        if (letra == 245) {
          contaro4++;
        }

        if (letra == 226) {
          contara5++;
        }

        if (letra == 234) {
          contare5++;
        }

        if (letra == 238) {
          contari5++;
        }

        if (letra == 244) {
          contaro5++;
        }

        if (letra == 251) {
          contaru5++;
        }

      }

      consoante = contarconsoante(inputLine, contarconso);
      receberconsoante = receberconsoante + consoante;

      elementotable = elementotable(inputLine, contartable);
      receberelementotable = receberelementotable + elementotable;

      elementobr = elementobr(inputLine, contarelementobr);
      receberelementobr = receberelementobr + elementobr;

    }

    System.out.printf(
        "a(%d) e(%d) i(%d) o(%d) u(%d) ·(%d) È(%d) Ì≠(%d) Û(%d) ˙(%d) ‡(%d) Ë(%d) Ï(%d) Ú(%d) ˘(%d) „(%d) ı(%d) ‚(%d) Í(%d) Ó(%d) Ù(%d) ˚(%d) consoante(%d) <br>(%d) <table>(%d) %s\n",
        contara, contare, contarii, contaro, contaru, contara2, contare2, contari2, contaro2, contaru2, contara3,
        contare3, contari3, contaro3, contaru3, contara4, contaro4, contara5, contare5, contari5, contaro5, contaru5,
        receberconsoante, elementobr, receberelementotable, entrada);

  }

  public static void main(String[] args) {

    // System.out.println(System.getProperty("file.encoding"));

    // MyIO.setCharset("UTF-8");
    MyIO.setCharset("ISO8859-1");
    URL url = null;
    String entrada = MyIO.readLine();

    while (!(entrada.equals("FIM"))) {

      String entradaurl = MyIO.readLine();

      try {
        url = new URL(entradaurl);
        new leiturahtml().getPage(url, entrada);
      } catch (MalformedURLException e) {
        e.printStackTrace();
      } catch (Exception e) {
        e.printStackTrace();
      }

      entrada = MyIO.readLine();

    }
  }
}

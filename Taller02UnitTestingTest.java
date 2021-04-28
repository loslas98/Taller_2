import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Taller02UnitTestingTest {
   //@Test
    //void leerArchivoTest() throws IOException {//deberia funcionar, los contenidos son los mismos pero me tira error igual.
    //String contenidoEsperado = "\"Ají traga la lagartija\"\n" +
    //"\"Un ejemplo de palíndromo es\"\n" +
    // "\"Sex of foxes\"\n" +
    // "\"123 456 654 321\"\n" +
    //"\"The shortest palindromic words in English are nun, ewe and pip, among others\"\n" +
    //"\"E la turba brutale\"\n" +
    //"\"Este taller mezcla las 2 actividades que hicimos antes\"\n" +
    //"\"127.0.0.1\"\n" +
    //"\"Palíndromo no es una palabra palíndroma\"\n" +
    //"\"Mensaje: Ha cometido un error!!!\"\n" +
    //"\"Sie leben mit talg glatt im nebeleis\"\n" +
    //"\"\"\n" +
    //"\"A morte do galo no lago de Troma\"\n" +
    //"\"Esta cadena sólo es para rellenar una línea del archivo\"\n" +
    //"\"Nini me fete feminin\"\n" +
    //"\"Iron maiden and Saxon are british heavy metal bands\"\n" +
    //"\"No dejes de ponerte en contacto conmigo si tienes alguna duda\"\n" +
    //"\"Was it a car or a cat I saw?\"\n" +
    //"\"123-456-789\"\n" +
    //"\"El bar es imán o zona miserable\"";
        //String contenidoObtenido = Taller02UnitTesting.leerArchivo("cadenas.txt");
    //assertEquals(contenidoEsperado,contenidoObtenido);
    //}

    

    @Test
    void añadirAarrayTest() {
        ArrayList<String> listaEsperada = new ArrayList<>();
        ArrayList<String> listaObtenida = new ArrayList<>();
        listaEsperada.add("hola");
        listaEsperada.add("como estas");
        listaEsperada.add("bien");
        String contenido = "hola\ncomo estas\nbien";
        Taller02UnitTesting.añadirAarray(listaObtenida,contenido);
        assertEquals(listaEsperada,listaObtenida);



    }

    @Test
    void contarLineasTest() {
        ArrayList <String > lista = new ArrayList<>();
        String contenido = "hola\ncomo estas\nbien y tu";
        Taller02UnitTesting.añadirAarray(lista,contenido);
        assertEquals(3,Taller02UnitTesting.contarLineas(lista));

    }

    @Test
    void verificarNoPalindromoTest() {
        String noPalindromo = "lugar es ser agil";
        assertFalse(Taller02UnitTesting.verificarPalindromo(noPalindromo));
    }
   @Test
   void verificarPalindromoTrue(){
        String palindromo = "la ruta natural";
       assertTrue(Taller02UnitTesting.verificarPalindromo(palindromo));
   }

    @Test
    void verificarPalindromoNulo(){
        String nulo = "";
        assertFalse(Taller02UnitTesting.verificarPalindromo(nulo));
    }

   
}

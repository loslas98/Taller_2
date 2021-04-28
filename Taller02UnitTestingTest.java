import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Taller02UnitTestingTest {

   @Test
    void leerArchivoTest() {
    }

    @Test
    void validarContenidoTest() {
    }

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

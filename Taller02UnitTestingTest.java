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
    }

    @Test
    void contarLineasTest() {

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

    @Test
    void verificarPalindromoArrayTest() {
    }
}
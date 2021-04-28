import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Taller02UnitTesting {
   public static void main(String[] args) throws IOException {
        ArrayList<String> lista = new ArrayList<>();
        String contenido = leerArchivo("cadenas.txt");
        añadirAarray(lista,contenido);
        System.out.println("numero de lineas del archivo: "+contarLineas(lista));
        verificarPalindromoArray(lista);

    }



    public static String leerArchivo(String ruta) throws IOException {
            Path archivo = Paths.get(ruta);
            String contenido = "";
            boolean validarCont = validarContenido(archivo);
            if (validarCont){
                contenido = new String(Files.readAllBytes(archivo));
                return contenido;

            }



        return "";


    }


    public static boolean validarContenido(Path archivo){
        try {
            String contenido = new String(Files.readAllBytes(archivo));

        } catch (IOException e) {
            System.out.println("error lectura archivo");
            return false;
        }
        return true;


    }

    public static ArrayList<String> añadirAarray(ArrayList<String>lista, String contenido){
        Object[] lines = contenido.lines().toArray();

        for (Object line:lines){
            lista.add(line.toString());


        }
        return lista;



    }

    public static int contarLineas(ArrayList<String> datos){
        int cont = 0;
        for (String dato:datos){
            cont++;



        }
        return cont;

    }

    public static boolean verificarPalindromo(String texto) {
        if (texto == "") {
            System.out.println("texto vacio");
            return false;

        }
        String clean = texto.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
    public static void verificarPalindromoArray(ArrayList<String> datos){
        for (String dato:datos){
            System.out.println(verificarPalindromo(dato));


        }

    }
   
    


}

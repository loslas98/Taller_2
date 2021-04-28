import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Taller02UnitTesting {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lista = new ArrayList<>();
        String ruta = leerRuta();
        String contenido = leerArchivo(ruta);
        añadirAarray(lista,contenido);
        System.out.println("numero de lineas del archivo: "+contarLineas(lista));

    }



    public static String leerArchivo(String ruta) throws IOException {
        if(validarRuta(ruta)){
            Path archivo = Paths.get(ruta);
            String contenido = "";
            boolean validarCont = validarContenido(contenido,archivo);
            if (validarCont){
                contenido = new String(Files.readAllBytes(archivo));
                return contenido;

            }


        }
        return "";


    }
    public static String leerRuta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ruta del archivo");
        String ruta = sc.nextLine();
        return ruta;
    }

    public static boolean validarRuta(String ruta){
        if(ruta.contains(".txt")){
            System.out.println("ruta correcta");
            return true;
        }else{
            System.out.println("ruta incorrecta");
            return false;
        }

    }

    public static boolean validarContenido(String contenido,Path archivo){
        try {
            contenido = new String(Files.readAllBytes(archivo));

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
    


}

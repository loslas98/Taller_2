import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Taller02UnitTesting {
    public static void main(String[] args){

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


}

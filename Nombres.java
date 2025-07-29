import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String rutaArchivo = "nombres.txt";

        System.out.println("Escribe el nombre que deseas guardar.Escribe '0' para terminar.");

        try (FileWriter writer = new FileWriter(rutaArchivo, true)) {
            while (true) {
                System.out.print("Ingresa un nombre: ");
                nombre = scanner.nextLine();

                if (nombre.equals("0")) {
                    System.out.println("Programa finalizado.");
                    break;
                }

                writer.write(nombre + System.lineSeparator());
                writer.flush(); 
                System.out.println("Nombre guardado con éxito.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");

        System.out.print("Dime el anio de nacimiento: ");

        Scanner reader = new Scanner(System.in);

        int anio = reader.nextInt();
        
        // Esto es de develop (proveniente de feature)
        
        System.out.println("Adios");
        
        // Esto es de feature_2
       
        System.out.print("Tienes " + (2022 - anio) + " anios" );
    }
}

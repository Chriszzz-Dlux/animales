package Herencia;
import java.util.Scanner;

public class App { 
  
   public static void main(String[] args) { 
      int opcion;
      String animales;
      String categoria;
      String ruido;
      String movimiento;
      Scanner Scan = new Scanner(System.in);

 System.out.println("menu de opciones");
 System.out.println("1. datos del delphine");
 System.out.println("2. datos de los patos"); 
 System.out.println("3. datos de los perros"); 
 System.out.println("4. salir");;
 opcion = Scan.nextInt();
 switch(opcion){
        case 1:
        System.out.println("soy un delphine");
        animales = Scan.nextLine();
        System.out.println("¿a que categoria pertenesco el animal? (acuatico, terrestre, aereo)");
        categoria = Scan.nextLine();
        System.out.println("hago ruido");
        ruido = Scan.nextLine();
        System.out.println("me muevo");
        movimiento= Scan.nextLine();

        System.out.println("El animal es un delphine");
        System.out.println("categoria del animal: " + categoria);
        System.out.println("hace ruido: " + ruido);
        System.out.println("se mueve: " + movimiento);
        break;
        case 2:
        System.out.println("soy un pato");
        animales = Scan.nextLine();
        System.out.println("¿a que categoria pertenece el animal? (acuatico, terrestre, aereo) ");
        categoria = Scan.nextLine();
        System.out.println("hago ruido");
        ruido = Scan.nextLine();
        System.out.println("me muevo");
        movimiento= Scan.nextLine();

        System.out.println("El animal es un pato");
        System.out.println("categoria del animal: " + categoria);
        System.out.println("hace ruido: " + ruido);
        System.out.println("se mueve: " + movimiento);
        break;
        case 3:
        System.out.println("soy un perro");
        animales = Scan.nextLine();
        System.out.println("¿a que categoria pertenece el animal? (acuatico, terrestre, aereo)");
        categoria = Scan.nextLine();
        System.out.println("hago ruido");
        ruido = Scan.nextLine();
        System.out.println("me muevo");
        movimiento= Scan.nextLine();

        System.out.println("El animal es un perro");
        System.out.println("categria del animal: " + categoria);
        System.out.println("hace ruido: " + ruido);
        System.out.println("se mueve: " + movimiento);
        break;
        case 4:
        System.out.println("adios");
        System.exit(0);;
}
   }
}


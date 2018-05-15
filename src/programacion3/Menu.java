
package programacion3;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        PersonaRepository perso = new PersonaRepository();
     
        do {
            System.out.println(" ");
            System.out.println("========== Universidad de Guayaquil=======");
            System.out.println("===========================================");
            System.out.println("==================***Menu***===============");
            System.out.println("    1.-Agregar Persona");
            System.out.println("    2.-Busqueda por ID");
            System.out.println("    3.-Busqueda por Nombre");
            System.out.println("    4.-Busqueda por rango de edad");
            System.out.println("    5.-Mostrar Lista");
            System.out.println("    6.-Salir");
            System.out.print("    Ingrese opcion: ");
            System.out.print("  ");   op = sc.nextInt();
            switch (op) {
                case 1:
                    Persona persona= new Persona();
                    System.out.println("Ingrese Id:");
                    int id = sc.nextInt();
                    persona.setId(id);
                    System.out.println("Ingrese Nombre:");
                    String nombre = sc.next();
                    persona.setNombre(nombre);
                    System.out.println("Ingrese localizacion:");
                    String localizacion = sc.next();
                    persona.setLocalizacion(localizacion);
                    System.out.println("Ingrese edad:");
                    int edad = sc.nextInt();
                    persona.setEdad(edad);
                    perso.Agregar(persona);
                    break;
                case 2:
                    System.out.println("Ingrese el Id:");
                    int i = sc.nextInt();
                    Persona result = perso.getPersona(i);
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("Ingrese la Letra del filtro:");
                    String nomb = sc.next();
                    // para mostrar los resultados de busqueda
                    List<Persona> ListFilter = perso.getPorNombre(nomb);
                    System.out.println("Resultados de la busqueda de " +nomb);
                    for (Persona per : ListFilter){
                    System.out.println(per);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el Rango de edad:");
                    System.out.print("Inicial:");
                    int x = sc.nextInt();
                    System.out.print("Final:");
                    int y = sc.nextInt();
                    List<Persona> ListFiltro = perso.getPorRangoEdad(x, y);
                    System.out.println(ListFiltro);
                    break;
                case 5:
                    perso.getBusqueda();

                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        } while (op < 6);

    }
}


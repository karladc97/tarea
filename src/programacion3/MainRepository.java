
package programacion3;


import java.util.List;


public class MainRepository {

    public static void main(String[] args) {
        PersonaRepository repository = new PersonaRepository();
        Persona pr4 = new Persona(1004, "lorena", "Guayaquil", 30);
        repository.Agregar(pr4);

        List<Persona> List = repository.getPersonas();

        for (Persona persona : List) {
            System.out.println(persona);
        }
        Persona result = repository.getPersona(1009);
        System.out.println(result);

        String filtro = "lor";
        System.out.println("busqueda " + filtro);

        List<Persona> ListFilter = repository.getPorNombre(filtro);
        System.out.println(ListFilter);

        int inicio = 1;
        int fin = 30;

        System.out.println("busqueda de rango " + inicio + "-" + fin);
        List<Persona> ListFiltro = repository.getPorRangoEdad(inicio, fin);
        System.out.println(ListFiltro);

    }
}

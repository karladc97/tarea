
package programacion3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaRepository {
    
        private List<Persona> personas = new ArrayList<>();
        public PersonaRepository(){
            
       
        Persona pr1=new Persona (1001);
        pr1.setNombre("Cesar");
        pr1.setLocalizacion("Guayaquil");
        pr1.setEdad(34);
        
        Persona pr2 = new Persona (1002, "Galo", "Manta" , 2 );
        Persona pr3 = new Persona (1003,"Victoria","Quito", 45);
        
      
        personas.add(pr1);
        personas.add(pr2);
        personas.add(pr3);
        
        }
        public void Agregar(Persona persona){
            personas.add(persona);
          
        }
        
        public List<Persona>getPersonas(){
            return personas;
        }
        
        public void getBusqueda(){
         List<Persona> List = getPersonas();

        for (Persona persona : List) {
            System.out.println(persona);
        }
        
          }
        
        public Persona getPersona(int id){
            for (Persona persona:personas){
                if (persona.getId()==id)
                    return persona;
            }
            return null;
        }
        
        public List<Persona> getPorRangoEdad(int inicio, int fin) { 
            List<Persona> result = new ArrayList<>();
            for (Persona persona:personas){
                if (persona.getEdad()>=inicio && persona.getEdad()<=fin)
                     result.add(persona);         
            
        } return result;
  }
          public List<Persona> getPorNombre(String filtro) { 
            List<Persona> result = new ArrayList<>();
            for (Persona persona:personas){
                if (persona.getNombre().contains(filtro))
                   result.add(persona);            
            
        }
            return result;
   }
}
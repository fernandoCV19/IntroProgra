import java.util.ArrayList;

public class Ejemplo
{
    public void array(){
        ArrayList<Cubo> cubos = new ArrayList<>();

        ArrayList<Integer> lados = new ArrayList<>();

        for(int i = 0; i < cubos.size(); i++){
            int aux = cubos.get(i).getLado();
            lados.add(aux);
        }

        Integer aux2 = lados.remove(5);

        //miOtraLista.add(aux2);
    }

    public void eliminar(){
        ArrayList<Integer> lados = new ArrayList<>();
        
        Integer aux = lados.get(5);
        
        lados.remove(aux);
    }
    
    /*
       
       Array 1 [] []
       
       Array 2 [] []
        
       Array 3 [] []
       
       */
      
    /*
        
    String nombre;
    
    ciclo{
        Iteras en todos los elementos de la lista
        
        En cada elemento le pides el nombre
        
        Compara el nombre que has pedido con el nombre que estas buscando
        
        Si son iguales terminas ciclo
        
        Si son diferentes pasas al siguiente
        
        
    }
     
        */
    public void consulta(Libro l){
        Libro libro = new Libro();
        
        Libro nuevo = l; 
        
        
    }
    
    /*
       
       
       Objeto o = new Objeto(etc);
       
       o = direccion de memoria del objeto
       
       Objeto o2 = o
       
       o2 = direccion de memoria del mismo objeto
       
       Obejto o3 = new Objeto(copias todos los valores de o);
       */
}

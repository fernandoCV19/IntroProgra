
public class Padre
{
    protected int dinero;
    protected int ID;
    
    public Padre(int dinero){
        this.dinero = dinero;
        ID = 0;
        
        if(true){
            int aux;
            dinero = dinero + 5;
            ID = ID + 5;
        }
        
        //aux = aux + 5;
    }
    
    public int sumar(int a){
        return a + 5;
    }
}

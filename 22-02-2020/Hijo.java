
public class Hijo extends Padre
{
    
    
    public Hijo(int din){
        super(din);
    }
    
    public void modificarDineroPadre(){
        dinero = dinero + 1000;
        
        ID = ID + 100;
    }
    
    public int sumar(int num){
        return num + 6;
    }
}

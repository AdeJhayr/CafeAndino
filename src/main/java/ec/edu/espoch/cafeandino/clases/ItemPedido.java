package ec.edu.espoch.cafeandino.clases;
import ec.edu.espoch.cafeandino.numeraciones.Talla;
public class ItemPedido 
{
    //atributos
    public int identificador ;
    public String nombreBebida;
    public Talla talla ;
   public String[] extra;
    public double precio ; 
    public double descuentoPromocion ;
    
    //contructor

    public ItemPedido(int identificador, String nombreBebida, Talla talla) 
    {
        this.identificador = identificador;
        this.nombreBebida = nombreBebida;
        this.talla = talla;
        extra = new String[3];
    }
    
    //metodos
    
    public boolean agregarExtra(String nombre)
    {
        boolean respuesta = false;
        for (int i = 0; i < extra.length; i++) 
        {
            if (extra[i] != null) 
            {
                extra[i] = nombre;
                respuesta = true;
            }
            
        }
        return respuesta;
    }
    public boolean cambiarTalla(Talla talla)
    {
        return true;
    }
    public boolean eliminarExtra()
    {
        return true;
    }
    public double aplicarPromocion(Promocion promocion, Cliente cliente)
    {
        return 0.0;
    }
    
}

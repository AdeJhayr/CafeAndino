package ec.edu.espoch.cafeandino.clases;
import ec.edu.espoch.cafeandino.numeraciones.Talla;
public class Promocion 
{
    //atributos
    public int identificador;
    public String descripcion;
    public String nombreBebida;
    public Talla talla;
    public boolean soloUnCliente;
    public double descuento;
    public String fecha;
    
    //contructor

    public Promocion(int identificador, String descripcion, String nombreBebida, Talla talla, boolean soloUnCliente, double descuento, String fecha) 
    {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.nombreBebida = nombreBebida;
        this.talla = talla;
        this.soloUnCliente = soloUnCliente;
        this.descuento = descuento;
        this.fecha = fecha;
    }
    
    
    
}

package ec.edu.espoch.cafeandino.clases;
import ec.edu.espoch.cafeandino.numeraciones.TipoPago;
public class Factura 
{
    //atributos
    public int id;
    public TipoPago tipoPago;
    public double monto;
    public String RUC;
    public int idPedido;
    
    //constructor

    public Factura(int id, TipoPago tipoPago) 
    {
        this.id = id;
        this.tipoPago = tipoPago;
    }
    
    
}

package ec.edu.espoch.cafeandino.clases;
import ec.edu.espoch.cafeandino.numeraciones.EstadoPedido;
public class Pedido 
{
    public int identificador;
    public EstadoPedido estadoPedido;
    public double descuento;
    public String motivoCancelado;
    public double total;
    public String fecha;
    public ItemPedido[] items;
    
}

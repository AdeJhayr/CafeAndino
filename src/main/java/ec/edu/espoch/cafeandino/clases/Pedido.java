package ec.edu.espoch.cafeandino.clases;
import ec.edu.espoch.cafeandino.numeraciones.EstadoPedido;
public class Pedido 
{
    //atributos
    public int identificador;
    public EstadoPedido estadoPedido;
    public double descuento;
    public String motivoCancelado;
    public double total;
    public String fecha;
    public ItemPedido[] items;
    
    //constructor

    public Pedido(EstadoPedido estadoPedido) 
    {
        this.estadoPedido = estadoPedido;
    }
    
    public boolean agregarObservacion(String observacion)
    {
        return true;
    }
    
    public boolean cambiarEstado(EstadoPedido estado)
    {
        return true;
    }
    
    public boolean cancelarPedido(String motivo)
    {
        return true;
    }
    
    public double calcularDescuento(double porcentaje)
    {
        return 0;
    }
    
    public double calcularTotal()
    {
        return 0;
    }
    
    public boolean agregarItems(ItemPedido item)
    {
        return true;
    }
    
    public boolean eliminarItems(ItemPedido item)
    {
        return true;
    }
}

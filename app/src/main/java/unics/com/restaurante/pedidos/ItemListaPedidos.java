package unics.com.restaurante.pedidos;

/**
 * Created by jeniffer on 03/03/2016.
 */
public class ItemListaPedidos
{
    String nombreProducto;
    String notaProducto;
    String cantidadProducto;
    String precioProducto;
    int eliminar;

    public ItemListaPedidos(String nombreProducto, String notaProducto, String cantidadProducto, String precioProducto, int eliminar) {
        this.nombreProducto = nombreProducto;
        this.notaProducto = notaProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.eliminar = eliminar;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNotaProducto() {
        return notaProducto;
    }

    public void setNotaProducto(String notaProducto) {
        this.notaProducto = notaProducto;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getEliminar() {
        return eliminar;
    }

    public void setEliminar(int eliminar) {
        this.eliminar = eliminar;
    }
}

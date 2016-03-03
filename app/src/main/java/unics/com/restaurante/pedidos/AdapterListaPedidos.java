package unics.com.restaurante.pedidos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import unics.com.restaurante.R;

/**
 * Created by jeniffer on 03/03/2016.
 */
public class AdapterListaPedidos extends ArrayAdapter
{

    public AdapterListaPedidos(Context context, List objects)
    {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null )
        {
            LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.itemlista_mispedidos,null);
        }

        ItemListaPedidos itemListaPedidos = (ItemListaPedidos)getItem(position);

        TextView nombreProducto = (TextView)convertView.findViewById(R.id.textNombreProducto_ListaPedidos);
        TextView notaProducto = (TextView)convertView.findViewById(R.id.textNotaProducto_ListaPedidos);
        TextView cantidadProducto = (TextView)convertView.findViewById(R.id.textCantidadProducto_ListaPedidos);
        TextView precioProducto = (TextView)convertView.findViewById(R.id.textPrecio_ListaPedidos);
        ImageView eliminar = (ImageView)convertView.findViewById(R.id.imageElimniarPedidos_ListaPedidos);

        nombreProducto.setText(itemListaPedidos.getNombreProducto());
        notaProducto.setText(itemListaPedidos.getNotaProducto());
        cantidadProducto.setText(itemListaPedidos.getCantidadProducto());
        precioProducto.setText(itemListaPedidos.getPrecioProducto());
        eliminar.setImageResource(itemListaPedidos.getEliminar());

        return convertView;
    }
}

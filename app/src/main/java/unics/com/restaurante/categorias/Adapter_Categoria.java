package unics.com.restaurante.categorias;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import unics.com.restaurante.R;

/**
 * Created by jeniffer on 29/02/2016.
 */
public class Adapter_Categoria extends BaseAdapter
{
    private Context context;

    public Adapter_Categoria(Context context)
    {
        this.context = context;
    }

    @Override
    public int getCount()
    {
        return Items_Categorias.ITEMS.length;
    }

    @Override
    public Items_Categorias getItem(int position)
    {
        return Items_Categorias.ITEMS[position];
    }

    @Override
    public long getItemId(int position)
    {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        if (view == null)
        {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.items_categoria,null);
        }

        ImageView imagenCategoria = (ImageView) view.findViewById(R.id.imagen_categoria);
        TextView nombreCategoria = (TextView) view.findViewById(R.id.nombre_categoria);

        Items_Categorias item = (Items_Categorias) getItem(position);

        imagenCategoria.setImageResource(item.getImagenCategoria());
        nombreCategoria.setText(item.getNomCategoria());

        return view;
    }
}

package unics.com.restaurante.menu_principal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import unics.com.restaurante.R;

/**
 * Created by jeniffer on 26/02/2016.
 */
public class Adapter_MenuPrincipal extends BaseAdapter
{
    private Context context;

    public Adapter_MenuPrincipal(Context context) {
        this.context = context;
    }

    @Override
    public int getCount()
    {
        return Items_MenuPrincipal.ITEMS.length;
    }

    @Override
    public Items_MenuPrincipal getItem(int position)
    {
        return Items_MenuPrincipal.ITEMS[position];
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
            view = inflater.inflate(R.layout.items_menuprincipal,null);
        }

        ImageView imagenMesa = (ImageView) view.findViewById(R.id.imagen_mesa);
        TextView nombreMesa = (TextView) view.findViewById(R.id.nombre_mesa);

        Items_MenuPrincipal item = (Items_MenuPrincipal) getItem(position);
        imagenMesa.setImageResource(item.getImagenMesa());

        nombreMesa.setText(item.getNumMesa());

        return view;
    }
}

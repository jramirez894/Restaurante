package unics.com.restaurante.menu_principal;

import unics.com.restaurante.R;

/**
 * Created by jeniffer on 26/02/2016.
 */
public class Items_MenuPrincipal
{
    private int imagenMesa;
    private String numMesa;

    public Items_MenuPrincipal(int imagenMesa, String numMesa)
    {
        this.imagenMesa = imagenMesa;
        this.numMesa = numMesa;
    }

    public int getImagenMesa() {
        return imagenMesa;
    }

    public void setImagenMesa(int imagenMesa) {
        this.imagenMesa = imagenMesa;
    }

    public String getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(String numMesa) {
        this.numMesa = numMesa;
    }

    public int getId()
    {
        return numMesa.hashCode();
    }

    public static Items_MenuPrincipal[] ITEMS =
            {
            new Items_MenuPrincipal(R.drawable.photo, "1"),
            new Items_MenuPrincipal(R.drawable.photo, "2"),
            new Items_MenuPrincipal(R.drawable.photo, "3"),
            new Items_MenuPrincipal(R.drawable.photo, "4"),
            new Items_MenuPrincipal(R.drawable.photo, "5"),
            new Items_MenuPrincipal(R.drawable.photo, "6"),
            new Items_MenuPrincipal(R.drawable.photo, "7"),
            new Items_MenuPrincipal(R.drawable.photo, "8"),
            new Items_MenuPrincipal(R.drawable.photo, "9"),
            new Items_MenuPrincipal(R.drawable.photo, "10"),
            new Items_MenuPrincipal(R.drawable.photo, "11"),
            new Items_MenuPrincipal(R.drawable.photo, "12"),
            new Items_MenuPrincipal(R.drawable.photo, "13"),
            new Items_MenuPrincipal(R.drawable.photo, "14"),
            new Items_MenuPrincipal(R.drawable.photo, "15"),
            new Items_MenuPrincipal(R.drawable.photo, "16"),
            new Items_MenuPrincipal(R.drawable.photo, "17"),
            new Items_MenuPrincipal(R.drawable.photo, "18")
    };

    public static Items_MenuPrincipal getItem(int id)
    {
        for (Items_MenuPrincipal item : ITEMS)
        {
            if (item.getId() == id)
            {
                return item;
            }
        }
        return null;
    }

}


package unics.com.restaurante;

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


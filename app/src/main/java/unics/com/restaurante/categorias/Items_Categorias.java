package unics.com.restaurante.categorias;

import unics.com.restaurante.R;

/**
 * Created by jeniffer on 29/02/2016.
 */
public class Items_Categorias
{
    private int imagenCategoria;
    private String nomCategoria;

    public Items_Categorias(int imagenCategoria, String nomCategoria)
    {
        this.imagenCategoria = imagenCategoria;
        this.nomCategoria = nomCategoria;
    }

    public int getImagenCategoria() {
        return imagenCategoria;
    }

    public void setImagenCategoria(int imagenCategoria) {
        this.imagenCategoria = imagenCategoria;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public int getId()
    {
        return nomCategoria.hashCode();
    }

    public static Items_Categorias[] ITEMS =
            {
                    new Items_Categorias(R.drawable.photo, "Bebidas Calientes"),
                    new Items_Categorias(R.drawable.photo, "Postres"),
                    new Items_Categorias(R.drawable.photo, "Comida"),
                    new Items_Categorias(R.drawable.photo, "Adicionales"),
                    new Items_Categorias(R.drawable.photo, "Prod. Casa"),
                    new Items_Categorias(R.drawable.photo, "Preparacion")
            };

    public static Items_Categorias getItem(int id)
    {
        for (Items_Categorias item : ITEMS)
        {
            if (item.getId() == id)
            {
                return item;
            }
        }
        return null;
    }
}

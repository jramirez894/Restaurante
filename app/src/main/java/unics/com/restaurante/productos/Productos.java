package unics.com.restaurante.productos;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import unics.com.restaurante.R;

public class Productos extends AppCompatActivity
{
    TextView nombreProducto;
    TextView tiempo;
    ImageView agregar;
    TextView precio;
    TextView descrpcion;

    ImageView imagenSeleccionada;
    Gallery gallery;

    ArrayList<ItemsDatosProductos> arrayList = new ArrayList<ItemsDatosProductos>();

    int contador = 1;
    int posicionProducto = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        imagenSeleccionada = (ImageView) findViewById(R.id.image_producto_seleccionada);

        nombreProducto = (TextView) findViewById(R.id.txt_nombreproducto_seleccionada);
        tiempo = (TextView) findViewById(R.id.txtTiempoSeleccionado);
        agregar = (ImageView)findViewById(R.id.imageAgregarProductoSeleccionado);
        precio = (TextView) findViewById(R.id.txtPrecioSeleccionado);
        descrpcion = (TextView) findViewById(R.id.txtDescripcionSeleccionada);

        arrayList.clear();
        arrayList.add(new ItemsDatosProductos( R.drawable.a, "Cafe Expres", "30 minutos","$20.000","Un menú es la lista de las comidas y bebidas que se sirven en un restaurante."));
        arrayList.add(new ItemsDatosProductos( R.drawable.b, "Cafe Colombiano", "10 minutos","$30.000","Un menú es la lista de las comidas y bebidas que se sirven en un restaurante."));
        arrayList.add(new ItemsDatosProductos( R.drawable.c, "Chorizo", "25 minutos","$40.000","Un menú es la lista de las comidas y bebidas que se sirven en un restaurante."));
        arrayList.add(new ItemsDatosProductos( R.drawable.d, "Churrasco", "15 minutos","$50.000","Un menú es la lista de las comidas y bebidas que se sirven en un restaurante."));
        arrayList.add(new ItemsDatosProductos( R.drawable.e, "Empanada", "5 minutos","$60.000","Un menú es la lista de las comidas y bebidas que se sirven en un restaurante."));
        arrayList.add(new ItemsDatosProductos( R.drawable.f, "Helado", "4 minutos","$70.000","Un menú es la lista de las comidas y bebidas que se sirven en un restaurante."));
        arrayList.add(new ItemsDatosProductos( R.drawable.g, "Te", "1 minutos","$80.000","Un menú es la lista de las comidas y bebidas que se sirven en un restaurante."));

        gallery = (Gallery) findViewById(R.id.galleryProducto);
        gallery.setAdapter(new GalleryAdapter(this, arrayList));
        //al seleccionar una imagen, la mostramos en el centro de la pantalla a mayor tamaño

        Bitmap bitmap = BitmapFactory.decodeResource(Productos.this.getResources(), arrayList.get(0).getImagen());
        imagenSeleccionada.setImageBitmap(bitmap);

        nombreProducto.setText(arrayList.get(0).getNombreP());
        tiempo.setText(arrayList.get(0).getTiempo());
        precio.setText(arrayList.get(0).getPrecio());
        descrpcion.setText(arrayList.get(0).getDescripcion());
        //con este listener, sólo se mostrarían las imágenes sobre las que se pulsa
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView parent, View v, int position, long id)
            {
                Bitmap bitmap = BitmapFactory.decodeResource(Productos.this.getResources(),arrayList.get(position).getImagen());
                imagenSeleccionada.setImageBitmap(bitmap);

                posicionProducto = position;

                nombreProducto.setText(arrayList.get(position).getNombreP());
                tiempo.setText(arrayList.get(position).getTiempo());
                precio.setText(arrayList.get(position).getPrecio());
                descrpcion.setText(arrayList.get(position).getDescripcion());
                //imagenSeleccionada.setImageBitmap(BitmapUtils.decodeSampledBitmapFromResource(getResources(), imagenes[position], 300, 0));
            }

        });

        agregar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AlertaDeAgregarProducto();
            }
        });
    }

    public void AlertaDeAgregarProducto()
    {

        LayoutInflater inflaterAlert = (LayoutInflater) Productos.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View dialoglayout = inflaterAlert.inflate(R.layout.items_alerta_addproduct, null);

        ImageView imagenProducto = (ImageView)dialoglayout.findViewById(R.id.image_producto_Alerta);
        TextView nombreProducto = (TextView)dialoglayout.findViewById(R.id.textNombreProducto_Alerta);
        TextView descripcionProducto = (TextView)dialoglayout.findViewById(R.id.textDescripcionProducto_Alerta);
        final TextView cantidadProducto = (TextView)dialoglayout.findViewById(R.id.textCantidad_Alerta);
        ImageView menosProducto = (ImageView)dialoglayout.findViewById(R.id.imageMenos_Alerta);
        ImageView masProducto = (ImageView)dialoglayout.findViewById(R.id.imageMas_Alerta);
        EditText notaProducto = (EditText)dialoglayout.findViewById(R.id.editTextNotas_Alerta);

        //Bitmap bitmap = BitmapFactory.decodeResource(Productos.this.getResources(),arrayList.get(posicionProducto).getImagen());
        imagenProducto.setImageBitmap(BitmapUtils.decodeSampledBitmapFromResource(getResources(), arrayList.get(posicionProducto).getImagen(), 200, 200));

        nombreProducto.setText(arrayList.get(posicionProducto).getNombreP());
        descripcionProducto.setText(arrayList.get(posicionProducto).getDescripcion());

        menosProducto.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String can = cantidadProducto.getText().toString();

                if (can.equalsIgnoreCase("1"))
                {

                }
                else
                {
                    contador = contador - 1 ;
                    cantidadProducto.setText(String.valueOf(contador));
                }
            }
        });

        masProducto.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                contador = contador + 1 ;
                cantidadProducto.setText(String.valueOf(contador));
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialoglayout);
        builder.setPositiveButton("Agregar", null);
        builder.setNegativeButton("Cancelar", null);
        builder.setCancelable(false);
        builder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_productos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}

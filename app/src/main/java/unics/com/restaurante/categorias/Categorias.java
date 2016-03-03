package unics.com.restaurante.categorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import unics.com.restaurante.menu_principal.Adapter_MenuPrincipal;
import unics.com.restaurante.R;
import unics.com.restaurante.menu_principal.Items_MenuPrincipal;
import unics.com.restaurante.pedidos.Pedidos;
import unics.com.restaurante.productos.Productos;

public class Categorias extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    GridView gridView;
    private Adapter_Categoria adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        gridView = (GridView) findViewById(R.id.gridCategoria);

        adaptador = new Adapter_Categoria(this);
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_categorias, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId())
        {
            case R.id.botonmisPedidos:
                Intent intent = new Intent(Categorias.this, Pedidos.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l)
    {
        Items_Categorias item = (Items_Categorias) parent.getItemAtPosition(position);

        Intent intent = new Intent(Categorias.this, Productos.class);
        startActivity(intent);
    }
}

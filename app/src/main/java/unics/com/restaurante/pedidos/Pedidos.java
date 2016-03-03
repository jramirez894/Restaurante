package unics.com.restaurante.pedidos;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import unics.com.restaurante.R;

public class Pedidos extends AppCompatActivity
{
    ArrayList<ItemListaPedidos> arrayListlistaPedidos = new ArrayList<ItemListaPedidos>();
    ListView listaPedidos;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Volver");

        listaPedidos = (ListView)findViewById(R.id.listaMisPedidos);
        ActualizarLista();
    }

    public void ActualizarLista ()
    {
        arrayListlistaPedidos.clear();

        arrayListlistaPedidos.add(new ItemListaPedidos("Cafe Express", "Bien bueno", "x3", "20.000", android.R.drawable.ic_delete));

        listaPedidos.setAdapter(new AdapterListaPedidos(this, arrayListlistaPedidos));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pedidos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }
}

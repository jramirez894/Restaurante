package unics.com.restaurante.menu_principal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import unics.com.restaurante.R;
import unics.com.restaurante.categorias.Categorias;

public class MenuPrincipal extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    GridView gridView;
    private Adapter_MenuPrincipal adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        gridView = (GridView) findViewById(R.id.gridMesas);
        adaptador = new Adapter_MenuPrincipal(this);
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);

    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_principal, menu);
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
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Items_MenuPrincipal item = (Items_MenuPrincipal) parent.getItemAtPosition(position);

        //
        Intent intent = new Intent(MenuPrincipal.this, Categorias.class);
        startActivity(intent);
        //Toast.makeText(MenuPrincipal.this, item.getNumMesa(), Toast.LENGTH_SHORT).show();

    }
}

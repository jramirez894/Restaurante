package unics.com.restaurante.main_restaurante;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import unics.com.restaurante.R;
import unics.com.restaurante.menu_principal.MenuPrincipal;

public class Login extends AppCompatActivity
{
    EditText identificacion;
    EditText password;

    Button iniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        identificacion = (EditText)findViewById(R.id.editTextIdentificacion_Login);
        password = (EditText)findViewById(R.id.editTextContrasena_Login);

        iniciarSesion = (Button)findViewById(R.id.buttonIniciar_Login);

        iniciarSesion.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String id = identificacion.getText().toString();
                String pass = password.getText().toString();

                /*if (id.equalsIgnoreCase("")||
                        pass.equalsIgnoreCase(""))
                {
                    Toast.makeText(Login.this, "Faltan datos por llenar",Toast.LENGTH_SHORT).show();
                }
                else
                {*/
                    Intent intent = new Intent(Login.this, MenuPrincipal.class);
                    startActivity(intent);
                //}
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}

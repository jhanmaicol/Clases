package pe.edu.cibertec.inventory;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ProductActivity extends AppCompatActivity {

    TextInputEditText etNombre, etDescripcion, etCantidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);


        etNombre = findViewById(R.id.etNombre);
        etDescripcion = findViewById(R.id.etDescripcion);
        etCantidad = findViewById(R.id.etCantidad);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.add_boton,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String nombre =etNombre.getText().toString();
        String descripcion = etDescripcion.getText().toString();
        int cantidad = Integer.parseInt(etCantidad.getText().toString());

       // Product product = new Product(nombre,descripcion,cantidad);

        Intent intent = getIntent();
        intent.putExtra("product_nombre",nombre);
        intent.putExtra("product_descripcion", descripcion);
        intent.putExtra("product_cantidad", cantidad);

        // Tarea: En lugar de pasar 3 parametros pasar todo la clase
        // Tip: Google pass clase intent
        //Gson combierte una clase u objeto a un String
        //String combierte a un Objeto y solo decirle de que clase es:
        //Extra como eliminar los Productos

        setResult(RESULT_OK,intent);

        finish();
       return true;
    }
}

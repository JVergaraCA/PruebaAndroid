package cl.wower.testandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static cl.wower.testandroid.R.id.quote;

public class QuoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);


        Button button = (Button) findViewById(R.id.testBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuoteActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(QuoteActivity.this, "Cotizacion enviada correctamente, tu mensaje sera respondido a la brevedad.", Toast.LENGTH_LONG).show();
            }
        });
    }
}

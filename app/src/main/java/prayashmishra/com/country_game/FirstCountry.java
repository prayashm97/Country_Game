package prayashmishra.com.country_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FirstCountry extends AppCompatActivity {
    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //Lists the country in the Layout file
        setContentView(R.layout.activity_first_country);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button yes = (Button) findViewById(R.id.yesButton);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                    If the user finds their country, add 1 to the "key"
                    when going to the next Activity attach the "key" value with the intent
                    go to next activity
                 */
                value = value + 1;
                Intent intent = new Intent(getApplicationContext(), SecondCountry.class);
                intent.putExtra("key", value);
                startActivity(intent);
                finish();
            }
        });
        Button no = (Button) findViewById(R.id.noButton);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondCountry.class);
                intent.putExtra("key", value);
                startActivity(intent);
                finish();
            }
        });
    }

}

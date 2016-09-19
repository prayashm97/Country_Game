package prayashmishra.com.country_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FourthCountry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Lists the country in the Layout file
        setContentView(R.layout.activity_fourth_country);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent mIntent = getIntent();
        final int[] intValue = {mIntent.getIntExtra("key", 0)};

        Button yes = (Button) findViewById(R.id.yesButton);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                    If the user finds their country, add 8 to the "key"
                    when going to the next Activity attach the "key" value with the intent
                    go to next activity
                 */
                intValue[0] = intValue[0] + 8;
                //Snackbar.make(v, "value of value " + intValue[0], Snackbar.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), FinalActivity.class);
                intent.putExtra("key", intValue[0]);
                startActivity(intent);
                finish();

            }
        });
        Button no = (Button) findViewById(R.id.noButton);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(v, "value of value " + intValue[0], Snackbar.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), FinalActivity.class);
                intent.putExtra("key", intValue[0]);
                startActivity(intent);
                finish();

            }
        });

    }

}

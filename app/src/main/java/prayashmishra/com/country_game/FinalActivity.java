package prayashmishra.com.country_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class FinalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent mIntent = getIntent();
        final int[] intValue = {mIntent.getIntExtra("key", 0)};
        ImageView flagImage = (ImageView) findViewById(R.id.imageView);
        String country;

        /*
            Calculate the user's key value and output their result.
            Binary Search
         */
        switch (intValue[0]) {
            case 1:
                country = "Spain";
                flagImage.setImageResource(R.drawable.spain);
                break;
            case 2:
                country = "Poland";
                flagImage.setImageResource(R.drawable.poland);

                break;
            case 3:
                country = "USA";
                flagImage.setImageResource(R.drawable.us);
                break;
            case 4:
                country = "Sweden";
                flagImage.setImageResource(R.drawable.sweden);
                break;
            case 5:
                country = "Nepal";
                flagImage.setImageResource(R.drawable.nepal);
                break;
            case 6:
                country = "China";
                flagImage.setImageResource(R.drawable.china);
                break;
            case 7:
                country = "India";
                flagImage.setImageResource(R.drawable.india);
                break;
            case 8:
                country = "South Korea";
                flagImage.setImageResource(R.drawable.skorea);
                break;
            case 9:
                country = "Australia";
                flagImage.setImageResource(R.drawable.australia);
                break;
            case 10:
                country = "Italy";
                flagImage.setImageResource(R.drawable.italy);
                break;
            case 11:
                country = "Egypt";
                flagImage.setImageResource(R.drawable.egypt);
                break;
            case 12:
                country = "Greece";
                flagImage.setImageResource(R.drawable.greece);
                break;
            case 13:
                country = "Canada";
                flagImage.setImageResource(R.drawable.canada);
                break;
            case 14:
                country = "Greenland";
                flagImage.setImageResource(R.drawable.greenland);
                break;
            case 15:
                country = "Iceland";
                flagImage.setImageResource(R.drawable.iceland);
                break;
            default:
                country = "ERROR";
                /*
                    Fail case:
                        If user couldn't find the country in all 5 lists
                            aka user spammed "NO!" on every Activity
                 */
                flagImage.setImageResource(R.drawable.sad);

                break;
        }

        /*
            If user clicks on Retry, new intent to the MainActivity
         */
        Button retry = (Button) findViewById(R.id.retryBtn);
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

        TextView Country = (TextView) findViewById(R.id.CountryName);
        Country.setText(country + "!");
    }

}

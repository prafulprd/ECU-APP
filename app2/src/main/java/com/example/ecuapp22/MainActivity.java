package com.example.ecuapp22;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button appButtons;
    private ImageButton imageButtons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Set up the toolbar's navigation icon and behavior
        //This must be added to every Java class file to override default toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        appButtons = (Button) findViewById(R.id.button1);
        appButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivityOne();
            }
        });``````` ```````

        appButtons = (Button) findViewById(R.id.button2);
        appButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivityTwo();
            }
        });

        appButtons = (Button) findViewById(R.id.button3);
        appButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivityThree();
            }
        });

        appButtons = (Button) findViewById(R.id.button4);
        appButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivityFour();
            }
        });

        appButtons = (Button) findViewById(R.id.button5);
        appButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivityFive();
            }
        });

        appButtons = (Button) findViewById(R.id.button6);
        appButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivitySix();
            }
        });

        appButtons = (Button) findViewById(R.id.button7);
        appButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivitySeven();
            }
        });

        appButtons = (Button) findViewById(R.id.button8);
        appButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivityEight();
            }
        });

        appButtons = (Button) findViewById(R.id.buttonApply);
        appButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://myecu.ecok.edu/ICS/Admissions/Candidate_Page.jnz?portlet=JX_Apply_Online"));
                startActivity(browserIntent);
            }
        });

        imageButtons = (ImageButton) findViewById(R.id.buttonFacebook);
        imageButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent browserIntent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://www.facebook.com/ECUTigerUpdate"));
                    startActivity(browserIntent);
            }
        });

        imageButtons = (ImageButton) findViewById(R.id.buttonTitter);
        imageButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com/ECUTigerUpdates"));
                startActivity(browserIntent);
            }
        });

        imageButtons = (ImageButton) findViewById(R.id.buttonYoutube);
        imageButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/user/ECUvideos"));
                startActivity(browserIntent);
            }
        });

        imageButtons = (ImageButton) findViewById(R.id.buttonInstagram);
        imageButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/ecutigers/"));
                startActivity(browserIntent);
            }
        });

    }



    //Takes button1 to blank new activity
    private void moveToActivityOne() {
        Intent intent = new Intent(MainActivity.this, FirstActivity.class);
        startActivity(intent);
    }

    //Takes button2 to blank new activity
    private void moveToActivityTwo() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    //Takes button3 to blank new activity
    private void moveToActivityThree() {
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);
    }

    //Takes button4 to blank new activity
    private void moveToActivityFour() {
        Intent intent = new Intent(MainActivity.this, FourthActivity.class);
        startActivity(intent);
    }

    //Takes button5 to blank new activity
    private void moveToActivityFive() {
        Intent intent = new Intent(MainActivity.this, FifthActivity.class);
        startActivity(intent);
    }

    //Takes button6 to blank new activity
    private void moveToActivitySix() {
        Intent intent = new Intent(MainActivity.this, SixthActivity.class);
        startActivity(intent);
    }

    //Takes button7 to blank new activity
    private void moveToActivitySeven() {
        Intent intent = new Intent(MainActivity.this, SeventhActivity.class);
        startActivity(intent);
    }

    //Takes button8 to blank new activity
    private void moveToActivityEight() {
        Intent intent = new Intent(MainActivity.this, EighthActivity.class);
        startActivity(intent);
    }

}
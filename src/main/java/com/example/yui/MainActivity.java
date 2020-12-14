package com.example.yui;

import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowMetrics;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button welcomeButton;

    HomePage homePage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);


        //get buttons
        //welcome page
        welcomeButton = (Button) findViewById(R.id.connect_button);



        welcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.home_page);
                createHomePage();
            }
        });

    }

    public void createHomePage() {
        //get buttons
        //home page
        Button edt = (Button) findViewById(R.id.edt_button);
        Button mail = (Button) findViewById(R.id.mail_button);
        Button map = (Button) findViewById(R.id.map_button);
        Button moodle = (Button) findViewById(R.id.moodle_button);

        homePage = new HomePage(edt, mail);





        edt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
               Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://edt.insa-strasbourg.fr/"));
                startActivity(viewIntent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://partage.insa-strasbourg.fr/"));
                startActivity(viewIntent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                setContentView(R.layout.plan_page);
                createPlanPage();
            }
        });

        moodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://moodle.insa-strasbourg.fr/"));
                startActivity(viewIntent);
            }
        });

    }

    public void createPlanPage() {
        //get buttons
        Button back = (Button) findViewById(R.id.back_button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                setContentView(R.layout.home_page);
            }
        });

    }

}
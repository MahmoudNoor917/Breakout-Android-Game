package com.kazaky.breakout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu_layout);

        Button start = (Button) findViewById(R.id.start);
        Button about = (Button) findViewById(R.id.about);
        Button exit = (Button) findViewById(R.id.exit);
        start.setOnClickListener(this);
        about.setOnClickListener(this);
        exit.setOnClickListener(this);

    }

    //implement the onClick method here
    public void onClick(View v) {
        Intent intent;
        // Perform action on click
        switch (v.getId()) {
            case R.id.start:

                intent = new Intent(this, GameActivity.class);
                startActivity(intent);
                break;
            case R.id.about:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);

                break;
            case R.id.exit:
                finish();
                break;

        }
    }

}


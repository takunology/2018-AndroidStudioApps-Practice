package com.takunology.takun.mapver2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by takun on 2017/12/19.
 */

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button MapBtn = (Button)findViewById(R.id.mapbtn);
        MapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Mapの起動
                Intent intent = new Intent();
                intent.setClassName("com.takunology.takun.mapver2","com.takunology.takun.mapver2.MapsActivity");
                startActivity(intent);
            }
        });
    }
}

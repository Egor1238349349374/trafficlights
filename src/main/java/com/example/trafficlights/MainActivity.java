package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.content.res.Resources;




public class MainActivity extends AppCompatActivity {
    LinearLayout LinearLayout;
    Resources resources = getResources();
    int background1 = resources.getColor(R.color.r);
    int background2 = resources.getColor(R.color.y);
    int background3 = resources.getColor(R.color.g);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout = findViewById(R.id.linearlayout);

    }

    public void onClickR(View view) {
        LinearLayout.setBackgroundColor(background1);
    }

    public void onClickY(View view) {
        LinearLayout.setBackgroundColor(background2);
    }

    public void onClickG(View view) {
        LinearLayout.setBackgroundColor(background3);
    }
}

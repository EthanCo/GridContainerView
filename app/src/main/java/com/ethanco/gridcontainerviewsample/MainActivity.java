package com.ethanco.gridcontainerviewsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.ethanco.gridcontainerview.GridContainerView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GridContainerView gridContainerView = (GridContainerView) findViewById(R.id.grid_container_view);
        attachNewSpan(gridContainerView);
        Button btnAddNewSpan = (Button) findViewById(R.id.btn_add_new_span);
        btnAddNewSpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attachNewSpan(gridContainerView);
            }
        });
    }

    private void attachNewSpan(GridContainerView gridContainerView) {
        View spanView = LayoutInflater.from(MainActivity.this).inflate(R.layout.test_span, null);
        spanView.setBackgroundColor(Color.argb(255, new Random().nextInt(200), new Random().nextInt(200), new Random().nextInt(200)));
        gridContainerView.attachNewSpan(spanView);
    }
}

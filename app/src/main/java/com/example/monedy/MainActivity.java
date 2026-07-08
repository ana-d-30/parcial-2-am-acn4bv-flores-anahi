package com.example.monedy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;
import android.view.ViewGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private LinearLayout containerMovements;
    private int movementCounter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnAdd = findViewById(R.id.btnAdd);
        containerMovements = findViewById(R.id.containerMovements);

        btnAdd.setOnClickListener(v -> addMovement());
    }

    private void addMovement() {
        TextView movement = new TextView(this);

        movementCounter++;

        movement.setText("Transferencia recibida " + movementCounter + "    + $25000");
        movement.setTextSize(16);
        movement.setTextColor(Color.rgb(0, 150, 136));

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        params.setMargins(0, 24, 0, 0);
        movement.setLayoutParams(params);

        containerMovements.addView(movement);
    }
}
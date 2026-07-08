package com.example.monedy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_detail);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        TextView tvDetailName = findViewById(R.id.tvDetailName);
        TextView tvDetailAmount = findViewById(R.id.tvDetailAmount);
        Button btnBackHome = findViewById(R.id.btnBackHome);


        String movementName = getIntent().getStringExtra("movement_name");
        String movementAmount = getIntent().getStringExtra("movement_amount");


        if (movementName != null) {
            tvDetailName.setText(movementName);
        }

        if (movementAmount != null) {
            tvDetailAmount.setText(movementAmount);
        }


        btnBackHome.setOnClickListener(v -> finish());
    }
}
package com.dcht69.lesson5uik10;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M002DetailsAct extends AppCompatActivity {
    private Button btBack;
    private TextView tvResult;
    private TextView tvTitle;
    private Bitmap bitmap;
    private ImageView ivResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m002_act_details);
        initViews();
        reciveData();


    }

    private void reciveData() {
        Intent intent = getIntent();

        byte[] byteArray = intent.getByteArrayExtra("info1");
        bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        ivResult.setImageBitmap(bitmap);

        tvTitle.setText(intent.getStringExtra("info2"));
        tvResult.setText(intent.getStringExtra("info3"));
    }

    private void initViews() {
        btBack = findViewById(R.id.bt_back);
        ivResult = findViewById(R.id.iv_result);
        tvTitle = findViewById(R.id.tv_title);
        tvResult = findViewById(R.id.tv_result);

        btBack.setOnClickListener(view -> {

            if (view.getId() == R.id.bt_back) {
                Intent intent = new Intent(M002DetailsAct.this, M001MenuAct.class);
                startActivity(intent);

            }

        });
    }
}

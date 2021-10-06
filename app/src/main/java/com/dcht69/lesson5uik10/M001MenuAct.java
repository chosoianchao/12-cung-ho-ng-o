package com.dcht69.lesson5uik10;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;

public class M001MenuAct extends AppCompatActivity {
    private Button btDetails;
    private Bitmap bitmap;
    private ImageView ivBachDuong, ivBaoBinh, ivBoCap, ivCuGiai, ivKimNguu, ivMaKet, ivNhanMa, ivSongNgu, ivSongTu, ivSuTu, ivThienBinh, ivXuNu;
    private ImageView ivInfo;
    private TextView tvInfo, tvDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_menu);
        initViews();
    }

    private void initViews() {
        ivBachDuong = findViewById(R.id.iv_bach_duong);
        ivBaoBinh = findViewById(R.id.iv_bao_binh);
        ivBoCap = findViewById(R.id.iv_bo_cap);
        ivCuGiai = findViewById(R.id.iv_cu_giai);
        ivKimNguu = findViewById(R.id.iv_kim_nguu);
        ivMaKet = findViewById(R.id.iv_ma_ket);
        ivNhanMa = findViewById(R.id.iv_nhan_ma);
        ivSongNgu = findViewById(R.id.iv_song_ngu);
        ivSuTu = findViewById(R.id.iv_su_tu);
        ivThienBinh = findViewById(R.id.iv_thien_binh);
        ivXuNu = findViewById(R.id.iv_xu_nu);
        ivSongNgu = findViewById(R.id.iv_song_tu);

        ivInfo = findViewById(R.id.iv_info);
        tvInfo = findViewById(R.id.tv_info);
        tvDetails = findViewById(R.id.tv_details);


        btDetails = findViewById(R.id.bt_details);


    }

    public void More(View view) {
        ivInfo.buildDrawingCache();
        bitmap = ivInfo.getDrawingCache();
        if (view.getId() == R.id.bt_details) {
            Intent intent = new Intent(M001MenuAct.this, M002DetailsAct.class);
            ByteArrayOutputStream bs = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bs);
            byte[] byteArray = bs.toByteArray();

            intent.putExtra("info1", byteArray);


            intent.putExtra("info2", tvInfo.getText().toString());
            intent.putExtra("info3", tvDetails.getText().toString());

            startActivity(intent);
        }
    }

    public void ThienBinh(View view) {
        if (view.getId() == R.id.iv_thien_binh) {
            ivInfo.setImageResource(R.drawable.ic_thien_binh);
            tvInfo.setText(R.string.thien_binh_title2);
            tvDetails.setText(R.string.thien_binh_text);
        }
    }

    public void SongNgu(View view) {
        if (view.getId() == R.id.iv_song_ngu) {
            ivInfo.setImageResource(R.drawable.ic_song_ngu);
            tvInfo.setText(R.string.song_ngu_title2);
            tvDetails.setText(R.string.song_ngu_text);
        }
    }

    public void BachDuong(View view) {
        if (view.getId() == R.id.iv_bach_duong) {
            ivInfo.setImageResource(R.drawable.ic_bach_duong);
            tvInfo.setText(R.string.bach_duong_title2);
            tvDetails.setText(R.string.bach_duong_text);

        }
    }

    public void BaoBinh(View view) {
        if (view.getId() == R.id.iv_bao_binh) {
            ivInfo.setImageResource(R.drawable.ic_bao_binh);
            tvInfo.setText(R.string.bao_binh_title2);
            tvDetails.setText(R.string.bao_binh_text);
        }
    }

    public void BoCap(View view) {
        if (view.getId() == R.id.iv_bo_cap) {
            ivInfo.setImageResource(R.drawable.ic_bocap);
            tvInfo.setText(R.string.bo_cap_title2);
            tvDetails.setText(R.string.bo_cap_text);
        }
    }

    public void CuGiai(View view) {
        if (view.getId() == R.id.iv_cu_giai) {
            ivInfo.setImageResource(R.drawable.ic_cu_giai);
            tvInfo.setText(R.string.cu_giai_title2);
            tvDetails.setText(R.string.cu_giai_text);
        }
    }

    public void KimNguu(View view) {
        if (view.getId() == R.id.iv_kim_nguu) {
            ivInfo.setImageResource(R.drawable.ic_kim_nguu);
            tvInfo.setText(R.string.kim_nguu_title2);
            tvDetails.setText(R.string.kim_nguu_text);
        }
    }

    public void MaKet(View view) {
        if (view.getId() == R.id.iv_ma_ket) {
            ivInfo.setImageResource(R.drawable.ic_ma_ket);
            tvInfo.setText(R.string.ma_ket_title2);
            tvDetails.setText(R.string.ma_ket_text);
        }
    }

    public void NhanMa(View view) {
        if (view.getId() == R.id.iv_nhan_ma) {
            ivInfo.setImageResource(R.drawable.ic_nhan_ma);
            tvInfo.setText(R.string.nhan_ma_title2);
            tvDetails.setText(R.string.nhan_ma_text);
        }
    }

    public void SongTu(View view) {
        if (view.getId() == R.id.iv_song_tu) {
            ivInfo.setImageResource(R.drawable.ic_song_tu);
            tvInfo.setText(R.string.song_tu_title2);
            tvDetails.setText(R.string.song_tu_text);
        }
    }

    public void SuTu(View view) {
        if (view.getId() == R.id.iv_su_tu) {
            ivInfo.setImageResource(R.drawable.ic_su_tu);
            tvInfo.setText(R.string.su_tu_title2);
            tvDetails.setText(R.string.su_tu_text);
        }
    }

    public void XuNu(View view) {
        if (view.getId() == R.id.iv_xu_nu) {
            ivInfo.setImageResource(R.drawable.ic_xu_nu);
            tvInfo.setText(R.string.xu_nu_title2);
            tvDetails.setText(R.string.xu_nu_text);
        }
    }


}


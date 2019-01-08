package com.example.irfan.contoh.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.irfan.contoh.R;
import com.example.irfan.contoh.model.Halaman;
import com.example.irfan.contoh.model.Vokal;
import com.google.android.gms.common.api.GoogleApiClient;

public class HalamanAwalActivity extends AppCompatActivity {

    public static final String TAG = HalamanAwalActivity.class.getSimpleName();
    private Vokal mVokal = new Vokal();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mPilihan1, mPilihan2;
    private String mNama;
    private Halaman mHalamanSekarang;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);
        getSupportActionBar().setTitle("Belajar Huruf Vokal ");

        Intent intent = getIntent();
        mNama = intent.getStringExtra(getString(R.string.key_name));

        if (mNama == null) {
            mNama = "Tanpa nama";
        }

        Log.d(TAG, mNama);
        mImageView = (ImageView) findViewById(R.id.image);
        mTextView = (TextView) findViewById(R.id.hurufa);
        mPilihan1 = (Button) findViewById(R.id.pilihanbtn1);
        mPilihan2 = (Button) findViewById(R.id.pilihanbtn2);
        loadHalaman(0);




    }

    private void loadHalaman(int pilihan) {
        mHalamanSekarang = mVokal.getHalaman(pilihan);

        Drawable drawable = getResources().getDrawable(mHalamanSekarang.getGambarId());
        mImageView.setImageDrawable(drawable);

        String halamanText = mHalamanSekarang.getmText();
        halamanText = String.format(halamanText, mNama);

        if (mHalamanSekarang.ismApakahSelesai()) {
            mPilihan1.setVisibility(View.INVISIBLE);
            mPilihan2.setText("main lagi");
            mPilihan2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        } else {
            mTextView.setText(halamanText);
            mPilihan1.setText(mHalamanSekarang.getmChoice1().getmText());
            mPilihan2.setText(mHalamanSekarang.getmChoice2().getmText());

            mPilihan1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextHalaman = mHalamanSekarang.getmChoice1().getPilihanSelanjutnya();
                    loadHalaman(nextHalaman);
                }
            });

            mPilihan2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextHalaman = mHalamanSekarang.getmChoice2().getPilihanSelanjutnya();
                    loadHalaman(nextHalaman);
                }
            });
        }

    }
}

package kr.hs.emirim.s2019s19.mirimframetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearRj, linearJm, linearDh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearRj = findViewById(R.id.linear_rj);
        linearJm = findViewById(R.id.linear_jm);
        linearDh = findViewById(R.id.linear_dh);

        Button btnRj = findViewById(R.id.btn_rj);
        Button btnJm = findViewById(R.id.btn_jm);
        Button btnDh = findViewById(R.id.btn_dh);

        btnRj.setOnClickListener(btnListener);
        btnJm.setOnClickListener(btnListener);
        btnDh.setOnClickListener(btnListener);

        View.OnClickListener btnListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearRj.setVisibility(View.INVISIBLE);
                linearJm.setVisibility(View.INVISIBLE);
                linearDh.setVisibility(View.INVISIBLE);

                switch(v.getId()) {
                    case R.id.btn_rj:
                        linearRj.setVisibility(View.VISIBLE);
                    case R.id.btn_jm:
                        linearJm.setVisibility(View.VISIBLE);
                    case R.id.btn_dh:
                        linearDh.setVisibility(View.VISIBLE);
                }
            }
        };
    }
}
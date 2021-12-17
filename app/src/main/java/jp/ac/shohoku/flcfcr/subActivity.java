package jp.ac.shohoku.flcfcr;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class subActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //activity_subレイアウトをセット
        setContentView(R.layout.subactivi);

        //MAINからの値を取得
        Intent intent = getIntent();
        String getdata = intent.getStringExtra("SEND_DATA");

        //値をセット

        Button returnButton = findViewById(R.id.return_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();


            }
        });
    }

}


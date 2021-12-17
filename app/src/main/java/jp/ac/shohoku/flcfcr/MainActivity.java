package jp.ac.shohoku.flcfcr;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_DATA
            = "com.example.testactivitytrasdata.DATA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeButton= findViewById(R.id.change_btn);

        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), subActivity.class);
                EditText editText = findViewById(R.id.editText);
                int requestCode = 1000;
                intent.putExtra("SEND_DATA", editText.getText().toString());

                startActivity(intent);


            }
        });
    }

}
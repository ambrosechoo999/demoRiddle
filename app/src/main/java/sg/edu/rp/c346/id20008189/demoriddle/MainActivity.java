package sg.edu.rp.c346.id20008189.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvQ1;
    Button btnRevealQ1;
    Button btnRevealQ2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvQ1=findViewById(R.id.tvQ1);
        btnRevealQ1=findViewById(R.id.btnRevealQ1);
        btnRevealQ2=findViewById(R.id.btnRevealQ2);
        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);


            }
        });
        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,AnswerActivity2.class);
                intent2.putExtra("Question", "Q2");
                startActivity(intent2);
            }
        });
    }
}
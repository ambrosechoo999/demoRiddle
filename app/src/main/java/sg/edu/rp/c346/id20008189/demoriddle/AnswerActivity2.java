package sg.edu.rp.c346.id20008189.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
 TextView tvAnswerQ2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        tvAnswerQ2=findViewById(R.id.tvAnswer2);
        Intent i =getIntent();
        String value = i.getStringExtra("Question");

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        tvAnswerQ2.setText(questionsSelected + " answer is: Gone");
    }
}
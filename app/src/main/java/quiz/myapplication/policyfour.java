package quiz.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class policyfour extends AppCompatActivity {
    TextView policyone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policyfour);
        policyone=findViewById(R.id.policyfive);
        policyone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(policyfour.this,quiz.class);
                startActivity(i);

            }
        });
    }
}
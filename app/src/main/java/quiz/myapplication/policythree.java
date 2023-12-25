package quiz.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class policythree extends AppCompatActivity {
    TextView policyone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policythree);
        policyone=findViewById(R.id.policyfour);
        policyone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(policythree.this,policyfour.class);
                startActivity(i);

            }
        });
    }
}
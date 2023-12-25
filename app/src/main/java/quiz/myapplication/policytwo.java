package quiz.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class policytwo extends AppCompatActivity {
    TextView policyone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policytwo);
        policyone=findViewById(R.id.policythree);
        policyone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(policytwo.this,policythree.class);
                startActivity(i);

            }
        });
    }
}
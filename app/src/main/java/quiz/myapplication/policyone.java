package quiz.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class policyone extends AppCompatActivity {
    TextView policyone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policyone);
        policyone=findViewById(R.id.policytoo);
        policyone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(policyone.this,policytwo.class);
                startActivity(i);

            }
        });
    }
}

package quiz.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {
    Button details,one,two,three,four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        details=findViewById(R.id.enter);
        one=findViewById(R.id.tab1);
        two=findViewById(R.id.tab2);
        three=findViewById(R.id.tab3);
        four=findViewById(R.id.tab4);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i= new Intent(dashboard.this,quiz.class);
               startActivity(i);


            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(dashboard.this,policyone.class);
                startActivity(i);


            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(dashboard.this,policytwo.class);
                startActivity(i);

            }

        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(dashboard.this,policythree.class);
                startActivity(i);

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(dashboard.this,policyfour.class);
                startActivity(i);

            }
        });

    }
}
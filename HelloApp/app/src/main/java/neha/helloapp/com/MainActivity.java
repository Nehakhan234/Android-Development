package neha.helloapp.com;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    int cnt=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new Button.OnClickListener() {

                    public void onClick(View v) {
                        TextView txt = (TextView) findViewById(R.id.txt);
                        cnt++;
                        txt.setText(" "+ cnt);

                    }
                });



        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new Button.OnClickListener() {

                    public void onClick(View v) {
                        TextView txt = (TextView) findViewById(R.id.txt);
                        cnt--;
                        txt.setText(" "+ cnt);

             }
         });


    }
}

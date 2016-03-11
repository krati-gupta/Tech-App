package jitendra.tech_hunt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;
import android.widget.ImageButton;

/**
 * Created by Jitendra on 26-02-2016.
 */
public class front extends Activity {
    ImageButton img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);
        img =(ImageButton)findViewById(R.id.img);
        CountDownTimer t=new CountDownTimer(2000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                Intent in= new Intent(front.this,Main.class);
                front.this.startActivity(in);

            }
        };
        t.start();

    img.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            front.this.startActivity(new Intent(front.this,Main.class));
        }}
        );
    }
}

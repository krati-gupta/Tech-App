package jitendra.tech_hunt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jitendra on 08-08-2015.
 */
public class Main extends Activity {
    private EditText grpno;
    private Button start;
    private Spinner sp;
   private String[] num={" Select Team no","1","2","3","4","5","6","7","8","9","10"};
    String srt;

    @Override
 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.main);
        start =(Button)findViewById(R.id.strt);
        sp =(Spinner)findViewById(R.id.spn);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this,R.layout.spit,num);
        ad.setDropDownViewResource(R.layout.spit);
        sp.setAdapter(ad);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 srt =parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Context context = getApplicationContext();
                CharSequence text = "Select Team Number!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });



        start.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                int qn=1;
                if(srt.equals(" Select Team no"))
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Select Team Number!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else {
                    Intent myIntent = new Intent(Main.this, instr.class);
                    myIntent.putExtra("key", srt);
                    myIntent.putExtra("key1", qn);//Optional parameters
                    Main.this.startActivity(myIntent);
                }

                }


        });
    }
}




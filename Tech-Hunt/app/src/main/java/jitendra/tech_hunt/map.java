package jitendra.tech_hunt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Jitendra on 08-08-2015.
 */
public class map extends Activity {
    private EditText code;
    private Button chkcode;
    String grp;
    int qn;
    int ncd;
    @Override
    public void onBackPressed(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        grp = intent.getStringExtra("key");
        qn= intent.getIntExtra("key1",qn);
        ncd=intent.getIntExtra("key2", ncd);

        setContentView(R.layout.map);
        code =(EditText) findViewById(R.id.code);
        chkcode =(Button)findViewById(R.id.chkcode);
        ncd=0;



        chkcode.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cd=" ";
                switch (grp)
                {
                    case "1" :cd="LIBA01Z";
                        break;
                    case "2" :cd="LIBB02Y";
                        break;
                    case "3" :cd="LIBC02X";
                        break;
                    case "4" :cd="W04DLIB";
                        break;
                    case "5" :cd="LIBE05V";
                        break;
                    case "6" :cd="U06FLIB";
                        break;
                    case "7" :cd="LIBG07T";
                        break;
                    case "8" :cd="S08HLIB";
                        break;
                    case "9" :cd="LIBI09R";
                        break;
                    case "10" :cd="Q10JLIB";
                        break;
                    case "11" :cd="LIBK11P";
                        break;
                    case "12" :cd="O12LLIB";
                        break;
                    case "13" :cd="LIBM13N";
                        break;
                    case "14" :cd="M14NLIB";
                        break;
                    case "15" :cd="LIBO15L";
                        break;
                    case "16" :cd="K16PLIB";
                        break;
                    case "17" :cd="LIBQ17J";
                        break;
                    case "18" :cd="I18RLIB";
                }

                String cod = String.valueOf(code.getText());
                if (cod.equals(cd)) {
                    qn+=1;
                    ncd+=1;
                    Context context = getApplicationContext();
                    CharSequence text = "Correct Code....Next Question!!!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    Intent myIntent = new Intent(map.this,question.class);
                    myIntent.putExtra("key", grp);
                    myIntent.putExtra("key1", qn);
                    myIntent.putExtra("key2", ncd);//Optional parameters
                    map.this.startActivity(myIntent);





                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = "Wrong Code";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }


        });

    }

}

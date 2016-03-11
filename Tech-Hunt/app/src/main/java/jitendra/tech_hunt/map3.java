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
 * Created by Jitendra on 09-08-2015.
 */
public class map3 extends Activity {
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
        qn=intent.getIntExtra("key1", qn);
        ncd=intent.getIntExtra("key2", ncd);
        setContentView(R.layout.map3);
        code =(EditText) findViewById(R.id.code);
        chkcode =(Button)findViewById(R.id.chkcode);

        chkcode.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cd=" ";
                switch (grp)
                {
                    case "1" :cd="VA01SOSV";
                        break;
                    case "2" :cd="UB02SOSV";
                        break;
                    case "3" :cd="SOSV03T";
                        break;
                    case "4" :cd="SOSV04S";
                        break;
                    case "5" :cd="C05SOSV";
                        break;
                    case "6" :cd="DO6SOSV";
                        break;
                    case "7" :cd="07SOSVM";
                        break;
                    case "8" :cd="08SOSVN";
                        break;
                    case "9" :cd="09LSOSV";
                        break;
                    case "10" :cd="SOSV10P";
                        break;
                    case "11" :cd="SOSV11O";
                        break;
                    case "12" :cd="12SOSVW";
                        break;
                    case "13" :cd="13SOSVX";
                        break;
                    case "14" :cd="K14SOSV";
                        break;
                    case "15" :cd="SOSV15R";
                        break;
                    case "16" :cd="SOSV16Q";
                        break;
                    case "17" :cd="17SOSVY";
                        break;
                    case "18" :cd="18SOSVZ";
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
                    Intent myIntent = new Intent(map3.this, question.class);
                    myIntent.putExtra("key", grp);
                    myIntent.putExtra("key1", qn);
                    myIntent.putExtra("key2", ncd);//Optional parameters
                    map3.this.startActivity(myIntent);



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

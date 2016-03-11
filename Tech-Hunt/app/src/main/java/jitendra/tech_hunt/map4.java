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
 * Created by Tuneer on 09-08-2015.
 */
public class map4 extends Activity {
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
        setContentView(R.layout.map4);
        code =(EditText) findViewById(R.id.code);
        chkcode =(Button)findViewById(R.id.chkcode);

        chkcode.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cd=" ";
                switch (grp)
                {
                    case "1" :cd="01XNCTA";
                        break;
                    case "2" :cd="02WNCTB";
                        break;
                    case "3" :cd="K03NCTP";
                        break;
                    case "4" :cd="04LNCTO";
                        break;
                    case "5" :cd="05MNCTN";
                        break;
                    case "6" :cd="N06NCTM";
                        break;
                    case "7" :cd="O07NCTL";
                        break;
                    case "8" :cd="08PNCTK";
                        break;
                    case "9" :cd="09QNCTJ";
                        break;
                    case "10" :cd="R10NCTI";
                        break;
                    case "11" :cd="S11NCTH";
                        break;
                    case "12" :cd="12TNCTG";
                        break;
                    case "13" :cd="13NCTUF";
                        break;
                    case "14" :cd="VNCTE14";
                        break;
                    case "15" :cd="WNCTD15";
                        break;
                    case "16" :cd="16CNCTX";
                        break;
                    case "17" :cd="17BNCTY";
                        break;
                    case "18" :cd="18ANCTZ";
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
                    Intent myIntent = new Intent(map4.this, question.class);
                    myIntent.putExtra("key", grp);
                    myIntent.putExtra("key1", qn);
                    myIntent.putExtra("key2", ncd);//Optional parameters
                    map4.this.startActivity(myIntent);



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

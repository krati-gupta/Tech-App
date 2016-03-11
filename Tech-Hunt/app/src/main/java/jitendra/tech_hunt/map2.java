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
public class map2 extends Activity {
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
        ncd=intent.getIntExtra("key2",ncd);
        setContentView(R.layout.map2);
        code =(EditText) findViewById(R.id.code);
        chkcode =(Button)findViewById(R.id.chkcode);

        chkcode.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cd=" ";
                switch (grp)
                {
                    case "1" :cd="AUBIZ01";
                        break;
                    case "2" :cd="02UBIYB";
                        break;
                    case "3" :cd="CUBIX03";
                        break;
                    case "4" :cd="04UBIWD";
                        break;
                    case "5" :cd="EUBIV05";
                        break;
                    case "6" :cd="06UBIUF";
                        break;
                    case "7" :cd="GUBIT07";
                        break;
                    case "8" :cd="08UBISH";
                        break;
                    case "9" :cd="IUBIR09";
                        break;
                    case "10" :cd="10UBIQJ";
                        break;
                    case "11" :cd="KUBIP11";
                        break;
                    case "12" :cd="12UBIOI";
                        break;
                    case "13" :cd="MUBIN13";
                        break;
                    case "14" :cd="14UBIMN";
                        break;
                    case "15" :cd="OUBIN15";
                        break;
                    case "16" :cd="16UBI16";
                        break;
                    case "17" :cd="QUBI17Q";
                        break;
                    case "18" :cd="18UBI18L";
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
                    Intent myIntent = new Intent(map2.this, question.class);
                    myIntent.putExtra("key", grp);
                    myIntent.putExtra("key1", qn);
                    myIntent.putExtra("key2", ncd);//Optional parameters
                    map2.this.startActivity(myIntent);



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

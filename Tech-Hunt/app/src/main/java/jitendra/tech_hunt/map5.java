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
 * Created  on 09-08-2015.
 */
public class map5 extends Activity {
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
        setContentView(R.layout.map5);
        code =(EditText) findViewById(R.id.code);
        chkcode =(Button)findViewById(R.id.chkcode);

        chkcode.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String cd=" ";
                switch (grp)
                {
                    case "1" :cd="A01WSPW";
                        break;
                    case "2" :cd="WSPB02V";
                        break;
                    case "3" :cd="C03WSPU";
                        break;
                    case "4" :cd="WSP04DT";
                        break;
                    case "5" :cd="E05WSPZ";
                        break;
                    case "6" :cd="WSP06ES";
                        break;
                    case "7" :cd="F07WSPR";
                        break;
                    case "8" :cd="WSP08FQ";
                        break;
                    case "9" :cd="G09WSPP";
                        break;
                    case "10" :cd="WSP10HO";
                        break;
                    case "11" :cd="J11WSPN";
                        break;
                    case "12" :cd="WSP12IM";
                        break;
                    case "13" :cd="H13WSPX";
                        break;
                    case "14" :cd="WSP14KL";
                        break;
                    case "15" :cd="I15WSPY";
                        break;
                    case "16" :cd="WSP16LK";
                        break;
                    case "17" :cd="M17WSPJ";
                        break;
                    case "18" :cd="WSP18NI";
                }
                String cod = String.valueOf(code.getText());
                if (cod.equals(cd)) {
                    ncd+=1;
                    Context context = getApplicationContext();
                    CharSequence text = "Correct Code!!!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                   // finish();
                    //System.exit(0);
                    Intent myIntent = new Intent(map5.this, thnku.class);
                    myIntent.putExtra("key", grp);
                    myIntent.putExtra("key2", ncd);//Optional parameters
                    map5.this.startActivity(myIntent);



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

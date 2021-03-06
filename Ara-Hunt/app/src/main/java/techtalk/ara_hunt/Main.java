package techtalk.ara_hunt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.zxing.client.android.CaptureActivity;

/**
 * Created by Jitendra on 08-08-2015.
 */
public class Main extends Activity {
    public static final int REQUEST_QR_SCAN =0;
    private TextView abtv;
    private Button start;
   // private Spinner sp;
    private Button code;
    String content ="";
  // private String[] num={"Select Team","Team Steve Jobs","Team Berners-Lee","Team Gates","Team Gosling","Team Linus","Team Stallman","Team Sergey","Team Codd","Team Larry page","Team Elon Musk"};


    public void onActivityResult(int requestCode,int resultCode,Intent intent){
        if(requestCode==REQUEST_QR_SCAN && resultCode==RESULT_OK){
            content = intent.getStringExtra("CONTENT");
            String format =intent.getStringExtra("FORMAT");
            String type =intent.getStringExtra("TYPE");
            code.setText(content);
        }
        else if(requestCode==REQUEST_QR_SCAN && resultCode==RESULT_CANCELED){
            code.setText("Rescan");
            content="";
        }
    }


    @Override
 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.main);
        start =(Button)findViewById(R.id.strt);
        code=(Button)findViewById(R.id.scend);
        abtv=(TextView)findViewById(R.id.abtv);

        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),CaptureActivity.class);
                var aks;
                aks = "Hi";
                startActivityForResult(in, REQUEST_QR_SCAN);
            }
        });

      /**  sp =(Spinner)findViewById(R.id.spn);

        ArrayAdapter<String> ad = new ArrayAdapter<String>(this,R.layout.spit,num);
        ad.setDropDownViewResource(R.layout.spit);
        sp.setAdapter(ad);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                srt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Context context = getApplicationContext();
                CharSequence text = "Select Team!!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

**/

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int qn = 1;
                if (content.equals("")) {
                    Context context = getApplicationContext();
                    CharSequence text = "Scan EndoSkeleton!!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else {
                    String grp = "";
                    switch (content) {
                        case "Team Steve Jobs":
                            grp = "1";
                            break;
                        case "Team Berners-Lee":
                            grp = "2";
                            break;
                        case "Team Gates":
                            grp = "3";
                            break;
                        case "Team Gosling":
                            grp = "4";
                            break;
                        case "Team Linus":
                            grp = "5";
                            break;
                        case "Team Stallman":
                            grp = "6";
                            break;
                        case "Team Sergey":
                            grp = "7";
                            break;
                        case "Team Codd":
                            grp = "8";
                            break;
                        case "Team Larry page":
                            grp = "9";
                            break;
                        case "Team Elon Musk":
                            grp = "10";
                            break;
                        default:Context context = getApplicationContext();
                            CharSequence text = "Invalid Team!!";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            return;
                    }
                    Intent myIntent = new Intent(Main.this, instr.class);
                    myIntent.putExtra("key", grp);
                    myIntent.putExtra("key1", qn);//Optional parameters
                    Main.this.startActivity(myIntent);
                }

            }


        });
        abtv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Main.this, about.class);
                Main.this.startActivity(myIntent);
            }

        });

    }
}




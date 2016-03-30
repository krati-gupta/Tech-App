package techtalk.ara_hunt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.zxing.client.android.CaptureActivity;


/**
 * Created by Jitendra on 08-08-2015.
 */
public class map extends Activity {
    public static final int REQUEST_QR_SCAN =0;
    private EditText code;
    private Button chkcode;
    private ImageView img;
    String grp;
    private ImageButton kb;
    int qn;
   static int ncd;
    String content ="";
  private   String cd;
    @Override
    public void onBackPressed(){

    }

    public void onActivityResult(int requestCode,int resultCode,Intent intent){
        if(requestCode==REQUEST_QR_SCAN && resultCode==RESULT_OK){
            content = intent.getStringExtra("CONTENT");
            String format =intent.getStringExtra("FORMAT");
            String type =intent.getStringExtra("TYPE");
            code.setText(content);
        }
        else if(requestCode==REQUEST_QR_SCAN && resultCode==RESULT_CANCELED){
          code.setHint("Rescan");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        grp = intent.getStringExtra("key");
        qn = intent.getIntExtra("key1", qn);
        ncd = intent.getIntExtra("key2", ncd);

        setContentView(R.layout.map);
        code = (EditText) findViewById(R.id.code);
        chkcode = (Button) findViewById(R.id.chkcode);
        kb =(ImageButton)findViewById(R.id.imageButton);
        img = (ImageView) findViewById(R.id.imageView2);

        if ((qn == 1 && grp.equals("1")) || (qn == 3 && grp.equals("2")) || (qn == 5 && grp.equals("3")) || (qn == 7 && grp.equals("4")) || (qn == 9 && grp.equals("5")) || (qn == 11 && grp.equals("6")) || (qn == 2 && grp.equals("7")) || (qn == 4 && grp.equals("8")) || (qn == 6 && grp.equals("9")) || (qn == 8 && grp.equals("10"))) {
            img.setImageResource(R.mipmap.capture1);
            cd="C13579";
        }
        if ((qn == 2 && grp.equals("1")) || (qn == 11 && grp.equals("2")) || (qn == 4 && grp.equals("3")) || (qn == 6 && grp.equals("4")) || (qn == 8 && grp.equals("5")) || (qn == 10 && grp.equals("6")) || (qn == 3 && grp.equals("7")) || (qn == 5 && grp.equals("8")) || (qn == 7 && grp.equals("9")) || (qn == 9 && grp.equals("10"))) {
            img.setImageResource(R.mipmap.capture2);
            cd="W211468";
        }
        if ((qn == 3 && grp.equals("1")) || (qn == 5 && grp.equals("2")) || (qn == 7 && grp.equals("3")) || (qn == 9 && grp.equals("4")) || (qn == 11 && grp.equals("5")) || (qn == 2 && grp.equals("6")) || (qn == 4 && grp.equals("7")) || (qn == 6 && grp.equals("8")) || (qn == 8 && grp.equals("9")) || (qn == 10 && grp.equals("10")))
        {
            img.setImageResource(R.mipmap.capture34);
            cd="S357911";
        }
        if ((qn == 4 && grp.equals("1")) || (qn == 6 && grp.equals("2")) || (qn == 8 && grp.equals("3")) || (qn == 10 && grp.equals("4")) || (qn == 1 && grp.equals("5")) || (qn == 3 && grp.equals("6")) || (qn == 5 && grp.equals("7")) || (qn == 7 && grp.equals("8")) || (qn == 9 && grp.equals("9")) || (qn == 11 && grp.equals("10")))
        {
            img.setImageResource(R.mipmap.capture45);
            cd="O468101";
        }
        if ((qn == 5 && grp.equals("1")) || (qn == 7 && grp.equals("2")) || (qn == 9 && grp.equals("3")) || (qn == 11 && grp.equals("4")) || (qn == 2 && grp.equals("5")) || (qn == 4 && grp.equals("6")) || (qn == 6 && grp.equals("7")) || (qn == 8 && grp.equals("8")) || (qn == 10 && grp.equals("9")) || (qn == 3 && grp.equals("10")))
        {
            img.setImageResource(R.mipmap.capture56);
            cd="B579112";
        }
        if ((qn == 6 && grp.equals("1")) || (qn == 8 && grp.equals("2")) || (qn == 10 && grp.equals("3")) || (qn == 3 && grp.equals("4")) || (qn == 5 && grp.equals("5")) || (qn == 7 && grp.equals("6")) || (qn == 9 && grp.equals("7")) || (qn == 11 && grp.equals("8")) || (qn == 1 && grp.equals("9")) || (qn == 2 && grp.equals("10")))
        {
            img.setImageResource(R.mipmap.capture23);
            cd="N681035";
        }
        if((qn==7 && grp.equals("1")) || (qn==9 && grp.equals("2")) || (qn==11 && grp.equals("3")) || (qn==2 && grp.equals("4")) || (qn==6 && grp.equals("5")) || (qn==8 && grp.equals("6")) || (qn==10 && grp.equals("7")) || (qn==1 && grp.equals("8")) || (qn==3 && grp.equals("9")) || (qn==5 && grp.equals("10")))
        {
            img.setImageResource(R.mipmap.capture23);
            cd="G791126";
        }
        if((qn==8 && grp.equals("1")) || (qn==10 && grp.equals("2")) || (qn==3 && grp.equals("3")) || (qn==5 && grp.equals("4")) || (qn==7 && grp.equals("5")) || (qn==9 && grp.equals("6")) || (qn==11 && grp.equals("7")) || (qn==2 && grp.equals("8")) || (qn==4 && grp.equals("9")) || (qn==6 && grp.equals("10")))
        {
            img.setImageResource(R.mipmap.capture23);
            cd="A810357";
        }
        if((qn==9 && grp.equals("1")) || (qn==2 && grp.equals("2")) || (qn==6 && grp.equals("3")) || (qn==4 && grp.equals("4")) || (qn==10 && grp.equals("5")) || (qn==5 && grp.equals("6")) || (qn==7 && grp.equals("7")) || (qn==9 && grp.equals("8")) || (qn==2 && grp.equals("9")) || (qn==1 && grp.equals("10")))
        {
            img.setImageResource(R.mipmap.capture23);
            cd="P926410";
        }
        if((qn==10 && grp.equals("1")) || (qn==1 && grp.equals("2")) || (qn==2 && grp.equals("3")) || (qn==8 && grp.equals("4")) || (qn==3 && grp.equals("5")) || (qn==1 && grp.equals("6")) || (qn==8 && grp.equals("7")) || (qn==3 && grp.equals("8")) || (qn==5 && grp.equals("9")) || (qn==4 && grp.equals("10")))
        {
            img.setImageResource(R.mipmap.capture23);
            cd="F101283";
        }
        if((qn==11 && grp.equals("1")) || (qn==4 && grp.equals("2")) || (qn==1 && grp.equals("3")) || (qn==1 && grp.equals("4")) || (qn==4 && grp.equals("5")) || (qn==6 && grp.equals("6")) || (qn==1 && grp.equals("7")) || (qn==10 && grp.equals("8")) || (qn==11 && grp.equals("9")) || (qn==7 && grp.equals("10")))
        {
            img.setImageResource(R.mipmap.capture23);
            cd="C114114";
        }


            code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),CaptureActivity.class);
                startActivityForResult(in, REQUEST_QR_SCAN);
            }
        });
        kb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
            }
        });



        chkcode.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



                if (content.equals(cd)) {
                    qn += 1;
                    ncd += 1;
                    Context context = getApplicationContext();
                    CharSequence text = "Correct Code....Next Question!!!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    Intent myIntent;
                    if(qn==12){
                         myIntent = new Intent(map.this,thnku.class);
                    }
                    else{ myIntent = new Intent(map.this, question.class);}
                    myIntent.putExtra("key", grp);
                    myIntent.putExtra("key1", qn);
                    myIntent.putExtra("key2", ncd);//Optional parameters
                    map.this.startActivity(myIntent);


                } else {
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

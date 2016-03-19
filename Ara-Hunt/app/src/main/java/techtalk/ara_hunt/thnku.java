package techtalk.ara_hunt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Jitendra on 22-08-2015.
 */
public class thnku extends Activity {
    private TextView nc;
    private TextView gr;

    String grp;
    int ncd;

    @Override
    public void onBackPressed(){
        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        grp = intent.getStringExtra("key");
        ncd = intent.getIntExtra("key2",ncd);
        setContentView(R.layout.thanku);
        nc = (TextView) findViewById(R.id.textView);
        gr = (TextView) findViewById(R.id.textView6);
        nc.setText("No Of Correct Codes Entered "+ncd);
        gr.setText("Group no- "+grp);
    }
}

package jitendra.tech_hunt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Jitendra on 08-08-2015.
 */
public class question extends Activity {
    private TextView ques;
    private RadioButton op1;
    private RadioButton op2;
    private RadioButton op3;
    private RadioButton op4;
    private Button chkans;
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
        if(qn>1)
            ncd=intent.getIntExtra("key2", ncd);
        setContentView(R.layout.question);

        ques = (TextView) findViewById(R.id.ques);
        op1 = (RadioButton) findViewById(R.id.op1);
        op2 = (RadioButton) findViewById(R.id.op2);
        op3 = (RadioButton) findViewById(R.id.op3);
        op4 = (RadioButton) findViewById(R.id.op4);
        chkans = (Button) findViewById(R.id.chkans);
        if(grp.equals("1")) {
            if(qn==1) {
                ques.setText("new question1 for group1 ");
                op1.setText("aaa");
                op2.setText("bbb");
                op3.setText("ccc");
                op4.setText("ddd");

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op1.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Wrong Answer 1 question skipped";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            qn+=1;
                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);
                        }

                    }


                });

            }
            if(qn==2) {
                ques.setText("new question2 for group1 ");
                op1.setText("aaa");
                op2.setText("bbb");
                op3.setText("ccc");
                op4.setText("ddd");

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op2.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map2.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Wrong Answer! 1 question skipped";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            qn+=1;
                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==3) {
                ques.setText("new question3 for group1 ");
                op1.setText("aaa");
                op2.setText("bbb");
                op3.setText("ccc");
                op4.setText("ddd");

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op3.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map3.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Wrong Answer! 1 question skipped";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            qn+=1;
                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==4) {
                ques.setText("new question4 for group1 ");
                op1.setText("aaa");
                op2.setText("bbb");
                op3.setText("ccc");
                op4.setText("ddd");

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op4.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map4.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Wrong Answer! 1 question skipped";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            qn+=1;
                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==5) {
                ques.setText("new question5 for group1 ");
                op1.setText("aaa");
                op2.setText("bbb");
                op3.setText("ccc");
                op4.setText("ddd");

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op1.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map5.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Wrong Answer!";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();

                            Intent myIntent = new Intent(question.this, thnku.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }





        }
        if(grp.equals("2")) {
            if(qn==1) {
                ques.setText("new question1 for qroup2 ");
                op1.setText("aaa");
                op2.setText("bbb");
                op3.setText("ccc");
                op4.setText("ddd");

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op1.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Wrong Answer 1 question skipped";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            qn+=1;
                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        }

                    }


                });
            }
            if(qn==2) {
                ques.setText("new question2 for group2 ");
                op1.setText("aaa");
                op2.setText("bbb");
                op3.setText("ccc");
                op4.setText("ddd");

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op2.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map2.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Wrong Answer! 1 question skipped";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            qn+=1;
                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==3) {
                ques.setText("new question3 for group2 ");
                op1.setText("aaa");
                op2.setText("bbb");
                op3.setText("ccc");
                op4.setText("ddd");

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op3.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map3.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Wrong Answer! 1 question skipped";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            qn+=1;
                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==4) {
                ques.setText("new question4 for group2 ");
                op1.setText("aaa");
                op2.setText("bbb");
                op3.setText("ccc");
                op4.setText("ddd");

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op4.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map4.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Wrong Answer! 1 question skipped";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            qn+=1;
                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==5) {
                ques.setText("new question5 for group2 ");
                op1.setText("aaa");
                op2.setText("bbb");
                op3.setText("ccc");
                op4.setText("ddd");

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op1.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map5.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);


                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Wrong Answer!";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();

                            Intent myIntent = new Intent(question.this, thnku.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }


        }





    }
}

package techtalk.ara_hunt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
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
       final CountDownTimer t=new CountDownTimer(40000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                setTitle("Time remaining :" + (millisUntilFinished/1000)+" secs");
            }

            @Override
            public void onFinish() {
                setTitle("TimeUp!!!");
                Context context = getApplicationContext();
                CharSequence text = "Time Up next question";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                qn += 1;
                Intent myIntent = new Intent(question.this, question.class);
                myIntent.putExtra("key", grp);
                myIntent.putExtra("key1", qn);
                myIntent.putExtra("key2", ncd);//Optional parameters
                question.this.startActivity(myIntent);

            }
        };
        t.start();


        ques = (TextView) findViewById(R.id.ques);
        op1 = (RadioButton) findViewById(R.id.op1);
        op2 = (RadioButton) findViewById(R.id.op2);
        op3 = (RadioButton) findViewById(R.id.op3);
        op4 = (RadioButton) findViewById(R.id.op4);
        chkans = (Button) findViewById(R.id.chkans);

            if((qn==1 && grp.equals("1")) || (qn==3 && grp.equals("2")) || (qn==5 && grp.equals("3")) || (qn==7 && grp.equals("4")) || (qn==9 && grp.equals("5")) || (qn==11 && grp.equals("6")) || (qn==2 && grp.equals("7")) || (qn==4 && grp.equals("8")) || (qn==6 && grp.equals("9")) || (qn==8 && grp.equals("10")))
            {

                ques.setText(getResources().getString(R.string.ques1));
                op1.setText(getResources().getString(R.string.q1op1));
                op2.setText(getResources().getString(R.string.q1op2));
                op3.setText(getResources().getString(R.string.q1op3));
                op4.setText(getResources().getString(R.string.q1op4));

                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op3.isChecked()) {
                            t.cancel();
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
                            qn += 1;
                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);
                        }

                    }


                });

            }
            if((qn==2 && grp.equals("1")) || (qn==11 && grp.equals("2")) || (qn==4 && grp.equals("3")) || (qn==6 && grp.equals("4")) || (qn==8 && grp.equals("5")) || (qn==10 && grp.equals("6")) || (qn==3 && grp.equals("7")) || (qn==5 && grp.equals("8")) || (qn==7 && grp.equals("9")) || (qn==9 && grp.equals("10"))) {
                ques.setText(getResources().getString(R.string.ques2));
                op1.setText(getResources().getString(R.string.q2op1));
                op2.setText(getResources().getString(R.string.q2op2));
                op3.setText(getResources().getString(R.string.q2op3));
                op4.setText(getResources().getString(R.string.q2op4));

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
            if((qn==3 && grp.equals("1")) || (qn==5 && grp.equals("2")) || (qn==7 && grp.equals("3")) || (qn==9 && grp.equals("4")) || (qn==11 && grp.equals("5")) || (qn==2 && grp.equals("6")) || (qn==4 && grp.equals("7")) || (qn==6 && grp.equals("8")) || (qn==8 && grp.equals("9")) || (qn==10 && grp.equals("10"))) {
                ques.setText(getResources().getString(R.string.ques3));
                op1.setText(getResources().getString(R.string.q3op1));
                op2.setText(getResources().getString(R.string.q3op2));
                op3.setText(getResources().getString(R.string.q3op3));
                op4.setText(getResources().getString(R.string.q3op4));
                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op1.isChecked()) {
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
            if((qn==4 && grp.equals("1")) || (qn==6 && grp.equals("2")) || (qn==8 && grp.equals("3")) || (qn==10 && grp.equals("4")) || (qn==1 && grp.equals("5")) || (qn==3 && grp.equals("6")) || (qn==5 && grp.equals("7")) || (qn==7 && grp.equals("8")) || (qn==9 && grp.equals("9")) || (qn==11 && grp.equals("10"))) {
                ques.setText(getResources().getString(R.string.ques4));
                op1.setText(getResources().getString(R.string.q4op1));
                op2.setText(getResources().getString(R.string.q4op2));
                op3.setText(getResources().getString(R.string.q4op3));
                op4.setText(getResources().getString(R.string.q4op4));
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
            if((qn==5 && grp.equals("1")) || (qn==7 && grp.equals("2")) || (qn==9 && grp.equals("3")) || (qn==11 && grp.equals("4")) || (qn==2 && grp.equals("5")) || (qn==4 && grp.equals("6")) || (qn==6 && grp.equals("7")) || (qn==8 && grp.equals("8")) || (qn==10 && grp.equals("9")) || (qn==3 && grp.equals("10"))) {
                ques.setText(getResources().getString(R.string.ques5));
                op1.setText(getResources().getString(R.string.q5op1));
                op2.setText(getResources().getString(R.string.q5op2));
                op3.setText(getResources().getString(R.string.q5op3));
                op4.setText(getResources().getString(R.string.q5op4));
                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op2.isChecked()) {
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

            if((qn==6 && grp.equals("1")) || (qn==8 && grp.equals("2")) || (qn==10 && grp.equals("3")) || (qn==3 && grp.equals("4")) || (qn==5 && grp.equals("5")) || (qn==7 && grp.equals("6")) || (qn==9 && grp.equals("7")) || (qn==11 && grp.equals("8")) || (qn==1 && grp.equals("9")) || (qn==2 && grp.equals("10"))) {
                ques.setText(getResources().getString(R.string.ques6));
                op1.setText(getResources().getString(R.string.q6op1));
                op2.setText(getResources().getString(R.string.q6op2));
                op3.setText(getResources().getString(R.string.q6op3));
                op4.setText(getResources().getString(R.string.q6op4));
                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op4.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map6.class);
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
            if((qn==7 && grp.equals("1")) || (qn==9 && grp.equals("2")) || (qn==11 && grp.equals("3")) || (qn==2 && grp.equals("4")) || (qn==6 && grp.equals("5")) || (qn==8 && grp.equals("6")) || (qn==10 && grp.equals("7")) || (qn==1 && grp.equals("8")) || (qn==3 && grp.equals("9")) || (qn==5 && grp.equals("10"))) {
                ques.setText(getResources().getString(R.string.ques7));
                op1.setText(getResources().getString(R.string.q7op1));
                op2.setText(getResources().getString(R.string.q7op2));
                op3.setText(getResources().getString(R.string.q7op3));
                op4.setText(getResources().getString(R.string.q7op4));
                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op3.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map7.class);
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
            if((qn==8 && grp.equals("1")) || (qn==10 && grp.equals("2")) || (qn==3 && grp.equals("3")) || (qn==5 && grp.equals("4")) || (qn==7 && grp.equals("5")) || (qn==9 && grp.equals("6")) || (qn==11 && grp.equals("7")) || (qn==2 && grp.equals("8")) || (qn==4 && grp.equals("9")) || (qn==6 && grp.equals("10"))) {
                ques.setText(getResources().getString(R.string.ques8));
                op1.setText(getResources().getString(R.string.q8op1));
                op2.setText(getResources().getString(R.string.q8op2));
                op3.setText(getResources().getString(R.string.q8op3));
                op4.setText(getResources().getString(R.string.q8op4));
                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op1.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map8.class);
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
            if((qn==9 && grp.equals("1")) || (qn==2 && grp.equals("2")) || (qn==6 && grp.equals("3")) || (qn==4 && grp.equals("4")) || (qn==10 && grp.equals("5")) || (qn==5 && grp.equals("6")) || (qn==7 && grp.equals("7")) || (qn==9 && grp.equals("8")) || (qn==2 && grp.equals("9")) || (qn==1 && grp.equals("10"))) {
                ques.setText(getResources().getString(R.string.ques9));
                op1.setText(getResources().getString(R.string.q9op1));
                op2.setText(getResources().getString(R.string.q9op2));
                op3.setText(getResources().getString(R.string.q9op3));
                op4.setText(getResources().getString(R.string.q9op4));
                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op4.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map9.class);
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
            if((qn==10 && grp.equals("1")) || (qn==1 && grp.equals("2")) || (qn==2 && grp.equals("3")) || (qn==8 && grp.equals("4")) || (qn==3 && grp.equals("5")) || (qn==1 && grp.equals("6")) || (qn==8 && grp.equals("7")) || (qn==3 && grp.equals("8")) || (qn==5 && grp.equals("9")) || (qn==4 && grp.equals("10"))) {
                ques.setText(getResources().getString(R.string.ques10));
                op1.setText(getResources().getString(R.string.q10op1));
                op2.setText(getResources().getString(R.string.q10op2));
                op3.setText(getResources().getString(R.string.q10op3));
                op4.setText(getResources().getString(R.string.q10op4));
                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op2.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map10.class);
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
            if((qn==11 && grp.equals("1")) || (qn==4 && grp.equals("2")) || (qn==1 && grp.equals("3")) || (qn==1 && grp.equals("4")) || (qn==4 && grp.equals("5")) || (qn==6 && grp.equals("6")) || (qn==1 && grp.equals("7")) || (qn==10 && grp.equals("8")) || (qn==11 && grp.equals("9")) || (qn==7 && grp.equals("10"))) {
                ques.setText(getResources().getString(R.string.ques11));
                op1.setText(getResources().getString(R.string.q11op1));
                op2.setText(getResources().getString(R.string.q11op2));
                op3.setText(getResources().getString(R.string.q11op3));
                op4.setText(getResources().getString(R.string.q11op4));
                chkans.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (op3.isChecked()) {
                            Context context = getApplicationContext();
                            CharSequence text = "Correct Answer";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                            Intent myIntent = new Intent(question.this, map11.class);
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
        /*if(grp.equals("2")) {
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==6) {
                ques.setText("new question6 for group2 ");
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
                            Intent myIntent = new Intent(question.this, map6.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==7) {
                ques.setText("new question7 for group2 ");
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
                            Intent myIntent = new Intent(question.this, map7.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==8) {
                ques.setText("new question8 for group2 ");
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
                            Intent myIntent = new Intent(question.this, map8.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==9) {
                ques.setText("new question9 for group2 ");
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
                            Intent myIntent = new Intent(question.this, map9.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==10) {
                ques.setText("new question10 for group2 ");
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
                            Intent myIntent = new Intent(question.this, map10.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==11) {
                ques.setText("new question11 for group2 ");
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
                            Intent myIntent = new Intent(question.this, map11.class);
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

        if(grp.equals("3")) {
            if(qn==1) {
                ques.setText("new question1 for qroup3 ");
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
                ques.setText("new question2 for group3 ");
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
                ques.setText("new question3 for group3 ");
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
                ques.setText("new question4 for group3 ");
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
                ques.setText("new question5 for group3 ");
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==6) {
                ques.setText("new question6 for group3 ");
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
                            Intent myIntent = new Intent(question.this, map6.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==7) {
                ques.setText("new question7 for group3 ");
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
                            Intent myIntent = new Intent(question.this, map7.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==8) {
                ques.setText("new question8 for group3 ");
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
                            Intent myIntent = new Intent(question.this, map8.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==9) {
                ques.setText("new question9 for group3 ");
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
                            Intent myIntent = new Intent(question.this, map9.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==10) {
                ques.setText("new question10 for group3 ");
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
                            Intent myIntent = new Intent(question.this, map10.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==11) {
                ques.setText("new question11 for group3 ");
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
                            Intent myIntent = new Intent(question.this, map11.class);
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

        if(grp.equals("4")) {
            if(qn==1) {
                ques.setText("new question1 for qroup4 ");
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
                ques.setText("new question2 for group4 ");
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
                ques.setText("new question3 for group4 ");
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
                ques.setText("new question4 for group4 ");
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
                ques.setText("new question5 for group4 ");
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==6) {
                ques.setText("new question6 for group4 ");
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
                            Intent myIntent = new Intent(question.this, map6.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==7) {
                ques.setText("new question5 for group4 ");
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
                            Intent myIntent = new Intent(question.this, map7.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==8) {
                ques.setText("new question8 for group4 ");
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
                            Intent myIntent = new Intent(question.this, map8.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==9) {
                ques.setText("new question9 for group4 ");
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
                            Intent myIntent = new Intent(question.this, map9.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==10) {
                ques.setText("new question10 for group4 ");
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
                            Intent myIntent = new Intent(question.this, map10.class);
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

                            Intent myIntent = new Intent(question.this, question.class);
                            myIntent.putExtra("key", grp);
                            myIntent.putExtra("key1", qn);
                            myIntent.putExtra("key2", ncd);//Optional parameters
                            question.this.startActivity(myIntent);

                        }

                    }


                });

            }
            if(qn==11) {
                ques.setText("new question11 for group4 ");
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
                            Intent myIntent = new Intent(question.this, map11.class);
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

        }*/





    }


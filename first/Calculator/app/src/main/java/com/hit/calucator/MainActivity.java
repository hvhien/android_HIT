package com.hit.calucator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bnt1,bnt2,bnt3,bnt4,bnt5,bnt6,bnt7,bnt8,bnt9,bnt0,del,am,phantram,chia,nhan,tru,cong,bang,phay;
    TextView input,result;
    String process;
    int firstnumber,lastnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnt0=findViewById(R.id.bnt0);
        bnt1=findViewById(R.id.bnt1);
        bnt2=findViewById(R.id.bnt2);
        bnt3=findViewById(R.id.bnt3);
        bnt4=findViewById(R.id.bnt4);
        bnt5=findViewById(R.id.bnt5);
        bnt6=findViewById(R.id.bnt6);
        bnt7=findViewById(R.id.bnt7);
        bnt8=findViewById(R.id.bnt8);
        bnt9=findViewById(R.id.bnt9);

        bang=findViewById(R.id.bang);

        cong=findViewById(R.id.cong);
        tru=findViewById(R.id.tru);
        nhan=findViewById(R.id.nhan);
        chia=findViewById(R.id.chia);

        del=findViewById(R.id.del);
        am=findViewById(R.id.am);
        phantram=findViewById(R.id.phantram);
        phay=findViewById(R.id.phay);
        input=findViewById(R.id.input);
        result=findViewById(R.id.result);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                result.setText("");
            }
        });

        bnt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"0");
            }
        });


        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"1");
            }
        });


        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"2");
            }
        });


        bnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"3");
            }
        });

        bnt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"4");
            }
        });

        bnt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"5");
            }
        });

        bnt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"6");
            }
        });

        bnt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"7");
            }
        });

        bnt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"8");
            }
        });

        bnt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"9");
            }
        });

        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().charAt(0)=='-'){
                    Toast toast=Toast.makeText(getApplicationContext(),"k thể nhập",Toast.LENGTH_SHORT);
                    toast.show();
                }else {
                    process=input.getText().toString();
                    input.setText("-"+process);
                }
            }
        });

        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    if (input.getText().toString().contains("+")) {
                        String[] cong1 = input.getText().toString().split("\\+");
                        result.setText(String.valueOf(Double.parseDouble(cong1[0]) + Double.parseDouble(cong1[1])));
                    }else if(input.getText().toString().contains("-")){
                        String[] cong1 = input.getText().toString().split("-");
                        result.setText(String.valueOf(Double.parseDouble(cong1[0]) - Double.parseDouble(cong1[1])));
                    }else if(input.getText().toString().contains("*")){
                        String[] cong1 = input.getText().toString().split("\\*");
                        result.setText(String.valueOf(Double.parseDouble(cong1[0]) * Double.parseDouble(cong1[1])));
                    }else if(input.getText().toString().contains("/")){
                        String[] cong1 = input.getText().toString().split("/");
                        result.setText(String.valueOf(Double.parseDouble(cong1[0]) / Double.parseDouble(cong1[1])));
                    }
            }
        });
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                process=input.getText().toString();
                input.setText(process+"+");
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"-");
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"*");
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=input.getText().toString();
                input.setText(process+"/");
            }
        });
        phay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"cái này chưa hoàn thiện",Toast.LENGTH_SHORT).show();
            }
        });
        phantram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnumber=Integer.parseInt(input.getText().toString());
                result.setText(String.valueOf((double) firstnumber/100));
            }
        });
    }
}

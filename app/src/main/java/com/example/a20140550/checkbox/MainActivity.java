package com.example.a20140550.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private CheckBox mch,sch,wch,bch;
    private Button shBtn;
    private TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mch= (CheckBox) findViewById(R.id.IDmilk);
        sch= (CheckBox) findViewById(R.id.IDsugar);
        wch= (CheckBox) findViewById(R.id.IDwater);
        bch= (CheckBox) findViewById(R.id.IDbanana);

        shBtn= (Button) findViewById(R.id.buttonshow);
        Result= (TextView) findViewById(R.id.result);
        shBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder s=new StringBuilder();
                if(mch.isChecked())
                {

                    String m=mch.getText().toString();
                   s.append( m + " is Order \n ");
                }
                if(sch.isChecked())
                {

                    String sug=sch.getText().toString();
                   s.append( sug + " is Order \n");
                } if(wch.isChecked())
                {

                    String water=wch.getText().toString();
                   s.append( water +" is Order \n");
                } if(bch.isChecked())

                {

                    String Bana=bch.getText().toString();
                   s.append( Bana + " is Order \n");
                }
                Result.setText(s);

            }
        });
    }
}

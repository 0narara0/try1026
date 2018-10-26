package com.cmy.www.try1026;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnKeyListener, View.OnClickListener {
    EditText editText1, editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        editText1 = (EditText)findViewById(R.id.edit01);
        editText2 = (EditText)findViewById(R.id.edit02);
        textView = (TextView)findViewById(R.id.result1);

    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    public void onClick(View v) {

//        if(v.getId()==R.id.btn1){
//            textView.setText(editText1.getText());
//        }
        int id = v.getId();
        switch (id){
            case R.id.btn1:
                textView.setText(editText1.getText());
                break;
            case R.id.btn2:
                textView.setText(editText2.getText());
                break;
        }

    }
}

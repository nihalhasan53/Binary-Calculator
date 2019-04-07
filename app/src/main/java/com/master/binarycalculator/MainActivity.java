package com.master.binarycalculator;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView textView;
    String answer="";
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        textView=(TextView)findViewById(R.id.text);
        textView2=(TextView)findViewById(R.id.copy);
    }
    public void add(View view)
    {
        try
        {
            int s1=Integer.parseInt(num1.getText().toString(),2);
            int s2=Integer.parseInt(num2.getText().toString(),2);
            int ans=s1+s2;
            textView.setText("+");
            answer=Integer.toBinaryString(ans);
            textView2.setText(answer);
            Toast.makeText(getApplicationContext(),""+s1+" + "+s2+" = "+ answer + " ("+ ans+ ")",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Invalid Input ",Toast.LENGTH_SHORT).show();
        }

    }
    public void mul(View view)
    {
        try
        {
            int s1=Integer.parseInt(num1.getText().toString(),2);
            int s2=Integer.parseInt(num2.getText().toString(),2);
            int ans=s1*s2;
            textView.setText("*");
            answer=Integer.toBinaryString(ans);
            textView2.setText(answer);
            Toast.makeText(getApplicationContext(),""+s1+" * "+s2+" = "+ answer + " ("+ ans+ ")",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Invalid Input ",Toast.LENGTH_SHORT).show();
        }

    }
    public void sub(View view)
    {
        try
        {
            textView.setText("-");
            int s1=Integer.parseInt(num1.getText().toString(),2);
            int s2=Integer.parseInt(num2.getText().toString(),2);
            int ans=s1-s2;
            answer=Integer.toBinaryString(ans);
            textView2.setText(answer);
            Toast.makeText(getApplicationContext(),""+s1+" - "+s2+" = "+ answer + " ("+ ans+ ")",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Invalid Input ",Toast.LENGTH_SHORT).show();
        }

    }
    public void div(View view)
    {
        try {
            textView.setText("/");
            int s1=Integer.parseInt(num1.getText().toString(),2);
            int s2=Integer.parseInt(num2.getText().toString(),2);
            int ans=s1/s2;
            answer=Integer.toBinaryString(ans);
            textView2.setText(answer);
            Toast.makeText(getApplicationContext(),""+s1+" / "+s2+" = "+ answer + " ("+ ans+ ")",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Invalid Input ",Toast.LENGTH_SHORT).show();
        }

    }
    public void and(View view)
    {
        try {
            textView.setText("&");
            int s1=Integer.parseInt(num1.getText().toString(),2);
            int s2=Integer.parseInt(num2.getText().toString(),2);
            int ans=s1&s2;
            answer=Integer.toBinaryString(ans);
            textView2.setText(answer);
            Toast.makeText(getApplicationContext(),""+s1+" and "+s2+" = "+ answer + " ("+ ans+ ")",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Invalid Input ",Toast.LENGTH_SHORT).show();
        }
    }
    public void or(View view)
    {
        try {
            textView.setText("|");
            int s1=Integer.parseInt(num1.getText().toString(),2);
            int s2=Integer.parseInt(num2.getText().toString(),2);
            int ans=s1|s2;
            answer=Integer.toBinaryString(ans);
            textView2.setText(answer);
            Toast.makeText(getApplicationContext(),""+s1+" or "+s2+" = "+ answer + " ("+ ans+ ")",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Invalid Input ",Toast.LENGTH_SHORT).show();
        }
    }
    public void xor(View view)
    {
        try {
            textView.setText("^");
            int s1=Integer.parseInt(num1.getText().toString(),2);
            int s2=Integer.parseInt(num2.getText().toString(),2);
            int ans=s1^s2;
            answer=Integer.toBinaryString(ans);
            textView2.setText(answer);
            Toast.makeText(getApplicationContext(),""+s1+" xor "+s2+" = "+ answer + " ("+ ans+ ")",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Invalid Input ",Toast.LENGTH_SHORT).show();
        }
    }

    public void copytext(View view)
    {
        ClipboardManager clipboard = (ClipboardManager)
                getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Simple text", answer);
        clipboard.setPrimaryClip(clip);
        Toast.makeText(getApplicationContext(),"Copied",Toast.LENGTH_SHORT).show();
    }

}

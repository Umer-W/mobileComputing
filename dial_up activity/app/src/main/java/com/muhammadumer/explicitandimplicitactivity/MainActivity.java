package com.muhammadumer.explicitandimplicitactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,password;
Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show();
            }
        });
    }
    public void show()
    {
        String n=name.getText().toString();
        String p=password.getText().toString();
        if(n.equals("umer")&&p.equals("sssss"))
        {
            Uri uri = Uri.parse("tel:+923001234567");
            Intent intent = new Intent(Intent.ACTION_DIAL, uri);

            startActivity(intent);
        }
        else{
            Toast.makeText(getBaseContext(), "Invalid username and password", Toast.LENGTH_SHORT).show();
        }
    }
}
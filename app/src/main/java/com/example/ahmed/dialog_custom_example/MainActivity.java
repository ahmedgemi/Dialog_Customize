package com.example.ahmed.dialog_custom_example;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.dialog_layout);

        TextView t1 = (TextView)dialog.findViewById(R.id.textView);

        t1.setText("Error message");

        Button btn  = (Button) dialog.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this ,"Hello",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        dialog.setCancelable(false);

        dialog.show();
    }
}

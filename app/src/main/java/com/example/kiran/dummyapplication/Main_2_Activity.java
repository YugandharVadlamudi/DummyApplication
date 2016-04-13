package com.example.kiran.dummyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_2_Activity extends AppCompatActivity {
    String TAG = Main_2_Activity.class.getSimpleName();
    Button bt_click;
EditText edSetHint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt_click = (Button) findViewById(R.id.bt_click);
        edSetHint=(EditText)findViewById(R.id.edSetHint);
        Intent intent=getIntent();
        Bundle data=intent.getBundleExtra("bundle_data");
        if(!data.isEmpty())
        {
            edSetHint.setText(data.getString("edHintText").toString());
        }
        Log.e(TAG, "onCreate: button id" + bt_click.getId());

        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent=new Intent();
                intent.putExtra("ActivityRsult","done");
                setResult(RESULT_OK,intent);*/
                finish();
            }
        });

        /*Intent intent=getIntent();
        Log.e(TAG, "onCreate: "+intent.getStringExtra("done") );
        Intent intent1=new Intent();
        intent1.putExtra("returnfromB","B");
        setResult(RESULT_OK,intent1);
        startActivityForResult(intent1,1);
*/

    }
}

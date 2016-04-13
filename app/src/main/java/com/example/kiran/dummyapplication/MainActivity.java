package com.example.kiran.dummyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.apptimize.Apptimize;
import com.apptimize.ApptimizeTest;
import com.apptimize.Apptimize;

public class MainActivity extends AppCompatActivity {
Button click;
    String TAG=MainActivity.class.getSimpleName();
//    if set request code to -1 we are telling explicetly no data  should be returned
    final int REQUEST_CODE=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Apptimize.setup(this,"D2wcmSgj3rnYyQVxTYLVJcHarDCbgfw");
        click=(Button)findViewById(R.id.bt_click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                it is calling for implicti intent
                /*Intent intent=new Intent("MainActivity").putExtra("done","a");
                startActivity(intent);
                here the requestcode for identifying the unique activitys
                */
            Intent intent=new Intent("MainActivity");
                Bundle bundle=new Bundle();
                bundle.putString("edHintText","enter you data");
                intent.putExtra("bundle_data",bundle);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(TAG, "onActivityResult: ");
        Log.e(TAG, "onActivityResult: requestCode::"+requestCode+" resultCode::"+resultCode+" data::"+data);
        /*if(RESULT_OK==resultCode)
        {
            String intetnt_value=data.getStringExtra("ActivityRsult");
            Toast.makeText(MainActivity.this, ""+intetnt_value, Toast.LENGTH_SHORT).show();
        }*/
    }
}

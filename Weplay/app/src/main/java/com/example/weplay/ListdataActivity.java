package com.example.weplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ListdataActivity extends AppCompatActivity {
    TextView listdata;
    ImageView detailimageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getString(R.string.app_name));
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


//        listdata= findViewById(R.id.listdata);
        detailimageView = findViewById(R.id.imageViewdetail);

        Intent intent = getIntent();
        int receivedImage = intent.getIntExtra("image",0);
        String receivedName =  intent.getStringExtra("name");


//        listdata.setText(receivedName);
        detailimageView.setImageResource(receivedImage);
        //enable back Button
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview


}


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//            onBackPressed();
//        }
//        return super.onOptionsItemSelected(item);
//
//    }
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//    }
//}

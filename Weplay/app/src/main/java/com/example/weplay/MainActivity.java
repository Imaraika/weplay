package com.example.weplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText locationEdit;
    TextView dispLocationText;
    String SpinnerValue;
    String[] SPINNERVALUES = {"BASKETBALL","VOLLEYBALL","FOOTBALL","YOGA","RUGBY","GIMY","TENNIS","CHILD"};
    Spinner spinner;
    Button GOTO;
    Intent intent;
    ViewFlipper vFlipper;
    ViewPager viewPager;
    List<model> models;
    Adapter adapter;
    Integer color []= null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int image [] ={R.drawable.bascketbal,R.drawable.allgamesandroid,R.drawable.bascketbal,R.drawable.allgames};

        models = new ArrayList<>();
        models.add(new model(R.drawable.bascketbal,"bascketball"));
        models.add(new model(R.drawable.allballs,"allballs"));
        models.add(new model(R.drawable.allgames,"allgames"));
        models.add(new model(R.drawable.football,"football"));

        adapter = new Adapter(models,this);
        viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        locationEdit = (EditText) findViewById(R.id.locationEditText);
//        dispLocationText = (TextView) findViewById(R.id.textView1_dispLocationText);
        spinner = (Spinner) findViewById(R.id.spinner2);
        GOTO = (Button) findViewById(R.id.searchbtn);
        vFlipper = (ViewFlipper) findViewById(R.id.v_flipper);

        for (int images:image){
            flipperImages(images);
        }

        // Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.select_sports, android.R.layout.simple_spinner_item,SPINNERVALUES);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SPINNERVALUES);

// Specify the layout to use when the list of choices appears
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        //Adding setOnItemSelectedListener method on spinner.

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                SpinnerValue = (String) spinner.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        GOTO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch(SpinnerValue){

                    case "BASKETBALL":
                       Intent intent = new Intent(MainActivity.this, BascketBall_Activity.class);
                        startActivity(intent);
                        break;

                    case "VOLLEYBALL":
                        intent = new Intent(MainActivity.this, VolleyBall_Activity.class);
                        startActivity(intent);
                        break;

                    case "FOOTBALL":
                        intent = new Intent(MainActivity.this, Football_Activity.class);
                        startActivity(intent);
                        break;
                    case "YOGA":
                        intent = new Intent(MainActivity.this, Yoga_Activity.class);
                        startActivity(intent);
                        break;
                    case "CHILD":
                        intent = new Intent(MainActivity.this, Child_Activity.class);
                        startActivity(intent);
                        break;
                    case "GIMY":
                        intent = new Intent(MainActivity.this, Gimy_Activity.class);
                        startActivity(intent);
                        break;
                    case "RUGBY":
                        intent = new Intent(MainActivity.this, Rugby_Activity.class);
                        startActivity(intent);
                        break;
                    case "TENNIS":
                        intent = new Intent(MainActivity.this, Tennis_Activity.class);
                        startActivity(intent);
                        break;



                }
            }
        });



//        GridView gv;
//        GridviewBaseAdapter adapter2;
//
//        gv = (GridView) findViewById(R.id.gv_test);
//        ArrayList<GridViewBean> arr_bean = new ArrayList<GridViewBean>();
//        arr_bean.add(new GridViewBean(R.drawable.backorg));
//        arr_bean.add(new GridViewBean(R.drawable.backorg));
//        arr_bean.add(new GridViewBean(R.drawable.backorg));
//        arr_bean.add(new GridViewBean(R.drawable.backorg));
//        arr_bean.add(new GridViewBean(R.drawable.allgamesandroid));
//        arr_bean.add(new GridViewBean(R.drawable.allballs));
//        adapter2 = new GridviewBaseAdapter(arr_bean, this);
//        gv.setAdapter(adapter2);
//
//
//        Intent intent = getIntent();
//        String location = intent.getStringExtra("location");
//        locationEdit.setText(location);


    }
    public void flipperImages(int images){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        vFlipper.addView(imageView);
        vFlipper.setFlipInterval(2000);//2sec
        vFlipper.setAutoStart(true);

        //animation

        vFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        vFlipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }

}


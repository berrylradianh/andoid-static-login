package com.example.kuis1_berrylradianhamesha_pemrogramanmobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {
    private Handler sliderHandler = new Handler();
    private ViewPager2 viewPager2;

//      ================== METHOD AUTOMATION SLIDER START ==================
//    private Runnable sliderRunnable = new Runnable() {
//        @Override
//        public void run() {
//            viewPager2.setCurrentItem(viewPager2.getCurrentItem()+1);
//        }
//    };
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        sliderHandler.removeCallbacks(sliderRunnable);
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        sliderHandler.postDelayed(sliderRunnable,3000);
//    }
//      ================== METHOD AUTOMATION SLIDER END ==================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.homepage);

//      ================== PHOTO PROFILE ONCLICK START ==================
        ImageView profile = (ImageView) findViewById(R.id.profilePhoto);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Your Photo Profile", Toast.LENGTH_SHORT).show();
            }
        });
//      ================== PHOTO PROFILE ONCLICK END ==================

//      ================== LOGOUT START ==================
        ImageView logout = (ImageView) findViewById(R.id.logoutButton);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Success to Logout", Toast.LENGTH_SHORT).show();
                Intent home = new Intent(HomePage.this, LandingPage.class);
                startActivity(home);
            }
        });
//      ================== LOGOUT END ==================

//      ================== ADD ICON ONCLICK START ==================
        ImageView add = (ImageView) findViewById(R.id.addIcon);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Add Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ================== ADD ICON ONCLICK END ==================

//      ================== SEND ICON ONCLICK START ==================
        ImageView send = (ImageView) findViewById(R.id.sendIcon);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Send Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ================== SEND ICON ONCLICK END ==================

//      ================== RECEIVE ICON ONCLICK START ==================
        ImageView receive = (ImageView) findViewById(R.id.receiveIcon);
        receive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Receive Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ================== RECEIVE ICON ONCLICK END ==================

//      ================== PAY ICON ONCLICK START ==================
        ImageView pay = (ImageView) findViewById(R.id.payIcon);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Pay Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ================== PAY ICON ONCLICK END ==================

//      ================== INSURANCE ICON ONCLICK START ==================
        ImageView insurance = (ImageView) findViewById(R.id.insuranceIcon);
        insurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Insurance Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ================== INSURANCE ICON ONCLICK END ==================

//      ================== EDUCATION ICON ONCLICK START ==================
        ImageView education = (ImageView) findViewById(R.id.educationIcon);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Education Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ================== EDUCATION ICON ONCLICK END ==================

//      ================== CREDIT CARD ICON ONCLICK START ==================
        ImageView creditCard = (ImageView) findViewById(R.id.creditCardIcon);
        creditCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Credit Card Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ================== CREDIT CARD ICON ONCLICK END ==================

//      ================== ELECTRICITY ICON ONCLICK START ==================
        ImageView electricity = (ImageView) findViewById(R.id.electricityIcon);
        electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Electricity Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ==================  ELECTRICITY ICON ONCLICK END ==================

//      ================== FINANCIAL RECORD ICON ONCLICK START ==================
        ImageView financialRecord = (ImageView) findViewById(R.id.financialRecordIcon);
        financialRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Financial Record Card Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ==================  FINANCIAL RECORD ICON ONCLICK END ==================

//      ================== FINANCIAL RECORD ICON ONCLICK START ==================
        ImageView history = (ImageView) findViewById(R.id.historyIcon);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "History Menu", Toast.LENGTH_SHORT).show();
            }
        });
//      ==================  FINANCIAL RECORD ICON ONCLICK END ==================

//      ================== SLIDER IMAGES START ==================
        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.special_1));
        sliderItems.add(new SliderItem(R.drawable.special_2));
        sliderItems.add(new SliderItem(R.drawable.special_3));
        sliderItems.add(new SliderItem(R.drawable.special_4));
        sliderItems.add(new SliderItem(R.drawable.special_5));
        sliderItems.add(new SliderItem(R.drawable.special_6));
        sliderItems.add(new SliderItem(R.drawable.special_7));

        viewPager2.setAdapter(new SliderAdapter(sliderItems,viewPager2));

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);
//      ================== SLIDER IMAGES END ==================

//      ================== AUTOMATION SLIDER START ==================
//        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback(){
//            @Override
//            public void onPageSelected(int position){
//                super.onPageSelected(position);
//                sliderHandler.removeCallbacks(sliderRunnable);
//                sliderHandler.postDelayed(sliderRunnable,3000);
//            }
//        });
//      ================== AUTOMATION SLIDER END ==================
    }

}
package com.example.bankingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class InstroductoryActivity extends AppCompatActivity {

    ImageView splashView;
    TextView tv;
    LottieAnimationView lottieAnimationView;

    private static final int NUM_PAGES = 3;
    private ViewPager mPager;
    private ScreenSliderPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instroductory);
//        getSupportActionBar().hide();

        tv = findViewById(R.id.tvapp);
        splashView = findViewById(R.id.img);
        lottieAnimationView = findViewById(R.id.lottie);

        mPager = findViewById(R.id.viewpager);
        mPagerAdapter = new ScreenSliderPagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        splashView.animate().translationY(-2500).setDuration(1000).setStartDelay(1500);
        tv.animate().translationY(2000).setDuration(1000).setStartDelay(1500);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(1500);
    }

    private class ScreenSliderPagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSliderPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new OnBoardingFragment1();
                case 1:
                    return new OnBoardingFragment2();
                case 2:
                    return new OnBoardingFragment3();


            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }


}
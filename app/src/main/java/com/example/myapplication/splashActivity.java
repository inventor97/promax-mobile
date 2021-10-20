package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.viewPagerFragments.page1Fragment;
import com.example.myapplication.viewPagerFragments.page2Fragment;
import com.example.myapplication.viewPagerFragments.page3Fragment;

public class splashActivity extends AppCompatActivity {

    private ImageView imgLogo, textLogo, bkgImg;

    private static final int NUM_PAGES=3;
    private ViewPager pager;
    private PagerAdapter pagerAdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imgLogo = findViewById(R.id.logo_img);
        textLogo = findViewById(R.id.text_logo);
        bkgImg = findViewById(R.id.bkg_img);
        pager = findViewById(R.id.liquid_pager);
        pagerAdt = new PagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdt);
        bkgImg.animate().translationY(-2500).setDuration(2000).setStartDelay(3000);
        imgLogo.animate().translationY(2600).setDuration(2000).setStartDelay(2500);
        textLogo.animate().translationY(2600).setDuration(2000).setStartDelay(2500);
    }

    private class PagerAdapter extends FragmentStatePagerAdapter {

        public PagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    page1Fragment tab1 = new page1Fragment();
                    return tab1;
                case 1:
                    page2Fragment tab2 = new page2Fragment();
                    return tab2;
                case 2:
                    page3Fragment tab3 = new page3Fragment();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

}
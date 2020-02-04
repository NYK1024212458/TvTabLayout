package com.owen.tab.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.owen.tab.TvTabLayout;

/**
 * @author ZhouSuQiang
 */
public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        TvTabLayout mTabLayout = findViewById(R.id.tablayout1);
        TvTabLayout mTabLayout2 = findViewById(R.id.tablayout2);
        TvTabLayout mTabLayout3 = findViewById(R.id.tablayout3);
        TvTabLayout mTabLayout4 = findViewById(R.id.tablayout4);

        for(int i=0; i<15; i++) {
            mTabLayout.addTab(mTabLayout.newTab().setText("标题"+i), i == 0);
            mTabLayout2.addTab(mTabLayout2.newTab().setText("标题"+i));
            mTabLayout4.addTab(mTabLayout4.newTab().setText("标题"+i));
        }
        
        mTabLayout.addOnTabSelectedListener(new TvTabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TvTabLayout.Tab tab) {
        
            }
    
            @Override
            public void onTabUnselected(TvTabLayout.Tab tab) {
        
            }
    
            @Override
            public void onTabReselected(TvTabLayout.Tab tab) {
        
            }
        });
    }
}

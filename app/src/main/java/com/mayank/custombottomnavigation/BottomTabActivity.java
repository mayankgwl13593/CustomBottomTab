package com.mayank.custombottomnavigation;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mayank.custombottomnavigation.fragments.AboutUsFragment;
import com.mayank.custombottomnavigation.fragments.HomeFragment;
import com.mayank.custombottomnavigation.fragments.NewsFragment;
import com.mayank.custombottomnavigation.fragments.NotificationFragment;

public class BottomTabActivity extends AppCompatActivity implements View.OnClickListener{
    LinearLayout vL_tab1,vL_tab2, vL_tab3, vL_tab4;
    ImageView vI_tab1, vI_tab2, vI_tab3, vI_tab4;
    TextView vT_tab1, vT_tab2, vT_tab3, vT_tab4;
    FrameLayout contentContainer;
    int selectInt;
    HomeFragment homeFragment;
    NewsFragment newsFragment;
    NotificationFragment notificationFragment;
    AboutUsFragment aboutUsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        initilization();

    }

    private void initilization() {
        contentContainer= (FrameLayout) findViewById(R.id.contentContainer);

        //for bottom tab bar

        vL_tab1 = (LinearLayout) findViewById(R.id.vL_tab1);
        vL_tab2 = (LinearLayout) findViewById(R.id.vL_tab2);
        vL_tab3 = (LinearLayout) findViewById(R.id.vL_tab3);
        vL_tab4 = (LinearLayout) findViewById(R.id.vL_tab4);

        vI_tab1 = (ImageView) findViewById(R.id.vI_tab1);
        vI_tab2 = (ImageView) findViewById(R.id.vI_tab2);
        vI_tab3 = (ImageView) findViewById(R.id.vI_tab3);
        vI_tab4 = (ImageView) findViewById(R.id.vI_tab4);

        vT_tab1 = (TextView) findViewById(R.id.vT_tab1);
        vT_tab2 = (TextView) findViewById(R.id.vT_tab2);
        vT_tab3 = (TextView) findViewById(R.id.vT_tab3);
        vT_tab4 = (TextView) findViewById(R.id.vT_tab4);


        selectInt= R.id.vL_tab1;

        // on activity start one tab will select
        // you can change the selected image here
        vI_tab1.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.home));
        // you can change the selected text here
        vT_tab1.setText(R.string.home);
        // you can change the selected text colour here
        vT_tab1.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.white));
        // you can change the selected tab colour here
        vL_tab1.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_orange));

        vI_tab2.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.newspaper_black));
        vT_tab2.setText(R.string.news);
        vT_tab2.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
        vL_tab2.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

        vI_tab3.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.bell_black));
        vT_tab3.setText(R.string.notification);
        vT_tab3.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
        vL_tab3.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

        vI_tab4.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.about_black));
        vT_tab4.setText(R.string.aboutus);
        vT_tab4.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
        vL_tab4.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

        homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, homeFragment).commit();

        vL_tab1.setOnClickListener(this);
        vL_tab2.setOnClickListener(this);
        vL_tab3.setOnClickListener(this);
        vL_tab4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.vL_tab1) {
            if (selectInt == R.id.vL_tab1) {

            } else {

                vI_tab1.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.home));
                vT_tab1.setText(R.string.home);
                vT_tab1.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.white));
                vL_tab1.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_orange));

                vI_tab2.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.newspaper_black));
                vT_tab2.setText(R.string.news);
                vT_tab2.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab2.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                vI_tab3.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.bell_black));
                vT_tab3.setText(R.string.notification);
                vT_tab3.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab3.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                vI_tab4.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.about_black));
                vT_tab4.setText(R.string.aboutus);
                vT_tab4.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab4.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                homeFragment = new HomeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, homeFragment).commit();

            }
            selectInt = R.id.vL_tab1;

        } else if (i == R.id.vL_tab2) {
            if (selectInt == R.id.vL_tab2) {
            } else {

                vI_tab1.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.home_black));
                vT_tab1.setText(R.string.home);
                vT_tab1.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab1.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                vI_tab2.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.newspaper));
                vT_tab2.setText(R.string.news);
                vT_tab2.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.white));
                vL_tab2.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_orange));

                vI_tab3.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.bell_black));
                vT_tab3.setText(R.string.notification);
                vT_tab3.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab3.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                vI_tab4.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.about_black));
                vT_tab4.setText(R.string.aboutus);
                vT_tab4.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab4.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                newsFragment = new NewsFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, newsFragment).commit();

            }
            selectInt = R.id.vL_tab2;

        } else if (i == R.id.vL_tab3) {
            if (selectInt == R.id.vL_tab3) {
            } else {

                vI_tab1.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.home_black));
                vT_tab1.setText(R.string.home);
                vT_tab1.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab1.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                vI_tab2.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.newspaper_black));
                vT_tab2.setText(R.string.news);
                vT_tab2.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab2.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                vI_tab3.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.bell));
                vT_tab3.setText(R.string.notification);
                vT_tab3.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.white));
                vL_tab3.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_orange));

                vI_tab4.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.about_black));
                vT_tab4.setText(R.string.aboutus);
                vT_tab4.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab4.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                notificationFragment = new NotificationFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, notificationFragment).commit();
            }
            selectInt = R.id.vL_tab3;

        } else if (i == R.id.vL_tab4) {
            if (selectInt == R.id.vL_tab4) {
            } else {
                vI_tab1.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.home_black));
                vT_tab1.setText(R.string.home);
                vT_tab1.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab1.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                vI_tab2.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.newspaper_black));
                vT_tab2.setText(R.string.news);
                vT_tab2.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab2.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                vI_tab3.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.bell_black));
                vT_tab3.setText(R.string.notification);
                vT_tab3.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.black));
                vL_tab3.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_grey));

                vI_tab4.setImageDrawable(ContextCompat.getDrawable(BottomTabActivity.this, R.drawable.about));
                vT_tab4.setText(R.string.aboutus);
                vT_tab4.setTextColor(ContextCompat.getColor(BottomTabActivity.this, R.color.white));
                vL_tab4.setBackgroundColor(ContextCompat.getColor(BottomTabActivity.this, R.color.tab_orange));

                aboutUsFragment = new AboutUsFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, aboutUsFragment).commit();
            }
            selectInt = R.id.vL_tab4;

        }
    }
}

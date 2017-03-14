package com.example.aw.berita;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Info.OnFragmentInteractionListener,
        Timeline.OnFragmentInteractionListener, Profile.OnFragmentInteractionListener{
    Button pindah;
    Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewpager;
    private int[] tabIcons = {
            R.drawable.information,
            R.drawable.clock,
            R.drawable.user
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewpager = (ViewPager)findViewById(R.id.viewpager);
        setupViewPager(viewpager);

        tablayout = (TabLayout) findViewById(R.id.tabs);
        tablayout.setupWithViewPager(viewpager);
        setupTabIcons();

    }
    private void setupTabIcons() {

        tablayout.getTabAt(0).setIcon(R.drawable.information);
        tablayout.getTabAt(1).setIcon(R.drawable.clock);
        tablayout.getTabAt(2).setIcon(R.drawable.user);
    }


    @Override
    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Info(), "INFO");
        adapter.addFragment(new Timeline(), "TIMELINE");
        adapter.addFragment(new Profile(), "PROFILE");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}

package com.example.nilesh.actionbar;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {
        private ActionBar mactionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mactionbar=getSupportActionBar();
        setupTabs();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;

    }

    private void setupTabs(){
        mactionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        mactionbar.setDisplayShowTitleEnabled(true);
        ActionBar.Tab tab1=mactionbar.newTab().setText("First").setIcon(R.drawable.help).setTabListener(this);
        mactionbar.addTab(tab1);
        mactionbar.selectTab(tab1);

        ActionBar.Tab tab2=mactionbar.newTab().setText("Second").setIcon(R.drawable.about).setTabListener(this);
        mactionbar.addTab(tab2);

        ActionBar.Tab tab3=mactionbar.newTab().setText("Third").setIcon(R.drawable.help).setTabListener(this);
        mactionbar.addTab(tab3);



    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {


    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}

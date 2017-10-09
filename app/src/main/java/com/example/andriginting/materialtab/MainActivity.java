package com.example.andriginting.materialtab;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.andriginting.materialtab.Adapter.TabFragmentAdapter;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager pager;
    private TabLayout tabs;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item,menu);
        return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //untuk toolbar
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Material tab");

        //inisialisasi tab dan pager
        pager = (ViewPager)findViewById(R.id.view_page);
        tabs = (TabLayout)findViewById(R.id.tabs_menu);

        //set objek ke dalam adapter
        pager.setAdapter(new TabFragmentAdapter(getSupportFragmentManager()));

        //manipulasi untuk text color pada tab
        tabs.setTabTextColors(getResources().getColor(android.R.color.black)
                ,getResources().getColor(android.R.color.white));

        //set tab ke view pager
        tabs.setupWithViewPager(pager);

        //konfigurasi gravity fill untuk tab berada diposisi yg proporsional
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);


    }
}

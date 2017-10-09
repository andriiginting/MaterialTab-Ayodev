package com.example.andriginting.materialtab.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.andriginting.materialtab.Fragment.Tab1Fragment;
import com.example.andriginting.materialtab.Fragment.Tab2Fragment;
import com.example.andriginting.materialtab.Fragment.Tab3Fragment;

/**
 * Created by Andri Ginting on 2/21/2017.
 */

public class TabFragmentAdapter extends FragmentPagerAdapter {
    String []judul = new String[]{"Menu 1","Menu 2","Menu 3"};

    public TabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    //untuk memanipulasi tampilan di layar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment =null;
        switch (position){
            case 0:
                fragment=new Tab1Fragment();
                break;
            case 1:
                fragment= new Tab2Fragment();
                break;
            case 2:
                fragment = new Tab3Fragment();
                break;
            default:
                fragment=null;
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return judul.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return judul[position];
    }
}

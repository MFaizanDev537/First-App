package com.example.hsnfz.criminalintent;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

class ViewPageAdapter  extends FragmentStatePagerAdapter {
    private List<Fragment> FragmentList = new ArrayList<>();
    private List<String> FragmentListTitle = new ArrayList<>();


    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {

        return FragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentListTitle.get(position);
    }

    public void AddFragment(Fragment fragment,String Title){
        FragmentList.add(fragment);
        FragmentListTitle.add(Title);
    }
}

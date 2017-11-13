package com.example.champ.testtabbedfragment.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.champ.testtabbedfragment.Fragments.ChatFragment;
import com.example.champ.testtabbedfragment.Fragments.ContactFragment;
import com.example.champ.testtabbedfragment.Fragments.OnlineFragment;

public class MyPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = MyPagerAdapter.class.getSimpleName();
    private Context context;

    public MyPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ContactFragment.newInstance("Blossom");
            case 1:
                return ChatFragment.newInstance("Bubble");
            case 2:
                return OnlineFragment.newInstance("Buttercup");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        //fragments quantity
        return 3;
    }

}

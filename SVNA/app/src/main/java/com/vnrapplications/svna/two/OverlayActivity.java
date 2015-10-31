package com.vnrapplications.svna.two;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import com.vnrapplications.svna.R;

public class OverlayActivity extends FragmentActivity {

    private static final String TAG = OverlayActivity.class.getSimpleName();
    private ViewFlipper viewFlipper;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "[onCreate]");
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
                | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // fragment表示
//        Fragment fragment = getFragmentManager().findFragmentByTag(FragmentType.OVERLAY.getTag());
//        if (fragment == null) {
//            fragment = OverlayFragment.newInstance();
//        }
//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.replace(android.R.id.content, fragment, FragmentType.OVERLAY.getTag());
//        ft.commit();
setContentView(R.layout.lock_view);

        viewFlipper = (ViewFlipper)findViewById(R.id.view_flipper);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        viewPager.setAdapter(new QuotePageAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(0);
        viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_in));
        viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this,R.anim.anim_out));
        viewFlipper.setFlipInterval(10000);
        viewFlipper.setAutoStart(true);
    }


    public static class QuotePageAdapter extends FragmentPagerAdapter {
        public QuotePageAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public Fragment getItem(int position) {
            return QuoteFragment.newInstance();
        }
    }

    public void unLock(View v){
        finish();
    }


    private enum FragmentType {
        OVERLAY("overlay");
        private String tag;

        private FragmentType(String tag) {
            this.tag = tag;
        }

        public String getTag() {
            return tag;
        }
    }
}

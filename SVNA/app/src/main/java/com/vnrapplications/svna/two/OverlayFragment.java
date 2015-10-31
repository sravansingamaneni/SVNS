//package com.vnrapplications.svna.two;
//
//import android.app.Fragment;
//import android.app.FragmentManager;
//import android.os.Bundle;
//
//import android.os.Parcelable;
//import android.support.v4.view.PagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.view.ViewGroup;
//import android.view.animation.AnimationUtils;
//import android.widget.Button;
//import android.widget.ViewFlipper;
//
//import com.vnrapplications.svna.R;
//
//public class OverlayFragment extends Fragment {
//private ViewFlipper viewFlipper;
//    private ViewPager viewPager;
//    public static OverlayFragment newInstance() {
//        OverlayFragment fragment = new OverlayFragment();
//        return fragment;
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.lock_view, container, false);
//
//        viewFlipper = (ViewFlipper)view.findViewById(R.id.view_flipper);
//        viewPager = (ViewPager)view.findViewById(R.id.viewpager);
//        viewPager.setAdapter(new QuotePageAdapter());
//        viewPager.setCurrentItem(0);
//        viewFlipper.setInAnimation(AnimationUtils.loadAnimation(getActivity(),R.anim.anim_in_from_right));
//        viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(getActivity(),R.anim.anim_out_left));
//        viewFlipper.setFlipInterval(5000);
//        viewFlipper.setAutoStart(true);
////        Button close = (Button) view.findViewById(R.id.close);
////        close.setOnClickListener(new OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                getActivity().finish();
////            }
////        });
//
//        return view;
//    }
//
//
//    class QuotePageAdapter extends PagerAdapter {
//        public QuotePageAdapter() {
//
//        }
//        public Object instantiateItem(View collection, int position) {
//
//            ((ViewPager) collection).addView(view, 0);
//            return QuoteFragment.newInstance().getView();
//        }
//
//        @Override
//        public void destroyItem(View arg0, int arg1, Object arg2) {
//            ((ViewPager) arg0).removeView((View) arg2);
//        }
//
//        @Override
//        public boolean isViewFromObject(View arg0, Object arg1) {
//            return arg0 == ((View) arg1);
//        }
//
//        @Override
//        public Parcelable saveState() {
//            return null;
//        }
//        @Override
//        public int getCount() {
//            return 10;
//        }
//    }
//}

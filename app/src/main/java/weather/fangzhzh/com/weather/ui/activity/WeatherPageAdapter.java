package weather.fangzhzh.com.weather.ui.activity;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import weather.fangzhzh.com.weather.R;

/**
 * @author zhangzf
 * @since 26/10/16 2:43 PM
 */
public class WeatherPageAdapter extends PagerAdapter {
    private final Context context;
    Resources resources;
    private final static int[] names = {R.string.twenty_four_hours, R.string.two_hours, R.string.four_hours, R.string.pm_25_update};


    public WeatherPageAdapter(Context context, Resources resources) {
        this.context = context;
        this.resources = resources;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        RelativeLayout view = new RelativeLayout(context);
        TextView tv = new TextView(context);
        // Set the TextView layout parameters
        RelativeLayout.LayoutParams
                params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        tv.setLayoutParams(params);
        view.addView(tv);

        // Assign some properties to TextView widget
        int resId = names[position];
        tv.setText((resources.getString(resId)).toUpperCase());
        container.addView(view);
        return view;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        int resId = names[position];
        return resources.getString(resId);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}

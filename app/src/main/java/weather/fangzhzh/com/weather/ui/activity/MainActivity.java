package weather.fangzhzh.com.weather.ui.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

import javax.inject.Inject;

import weather.fangzhzh.com.weather.R;
import weather.fangzhzh.com.weather.WeatherApplication;
import weather.fangzhzh.com.weather.ui.activity.module.MainActivityModule;
import weather.fangzhzh.com.weather.ui.activity.presenter.MainPresenter;

@EActivity(R.layout.activity_main1)
public class MainActivity extends BaseActivity {

    @ViewById(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @ViewById(R.id.left_drawer)
    ListView drawerList;
    @ViewById(R.id.days)
    TextView days;
    ActionBarDrawerToggle actionBarDrawerToggle;
    @Inject
    MainPresenter presenter;
    private String[] drawerTitles;
    private String title;
    private String drawerTitle;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
    }

    @AfterViews
    void onViewDrawer() {
        title = drawerTitle = getTitle().toString();
        drawerTitles = getResources().getStringArray(R.array.planets_array);
        drawerLayout.setDrawerShadow(R.drawable.ic_drawer, GravityCompat.START);

        drawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, drawerTitles));
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
            getActionBar().setHomeButtonEnabled(true);
        }
        drawerLayout.openDrawer(drawerList);
        drawerLayout.isDrawerOpen(drawerList);
        actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                drawerLayout,         /* DrawerLayout object */
                R.drawable.ic_drawer,  /* nav drawer image to replace 'Up' caret */
                R.string.drawer_open,  /* "open drawer" description for accessibility */
                R.string.drawer_close  /* "close drawer" description for accessibility */
        ) {
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                setTitle(title);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                setTitle(drawerTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        drawerList.setItemChecked(0, true);
        actionBarDrawerToggle.syncState();
        drawerLayout.closeDrawer(drawerList);
    }

    @AfterViews
    void OnInitData() {
        presenter.loadWeathers();
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    @Override
    protected void setupActivityComponent() {
        WeatherApplication.get(this)
                .getAppComponent()
                .plus(new MainActivityModule(this))
                .inject(this);
    }

    @ItemClick(R.id.left_drawer)
    void drawerClick(int position) {
        drawerList.setItemChecked(position, true);
        setTitle(drawerTitles[position]);
        drawerLayout.closeDrawer(drawerList);
    }



}

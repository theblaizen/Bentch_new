package com.owdienko.jaroslaw.bentch_new.View.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.owdienko.jaroslaw.bentch_new.Adapters.TabsViewPagerAdapter;
import com.owdienko.jaroslaw.bentch_new.Presenter.MainActivityPresenterImpl;
import com.owdienko.jaroslaw.bentch_new.R;
import com.owdienko.jaroslaw.bentch_new.View.Fragments.CreatedPageFragment;
import com.owdienko.jaroslaw.bentch_new.View.Fragments.EditPageFragment;
import com.owdienko.jaroslaw.bentch_new.View.Fragments.FavoritesPageFragment;
import com.owdienko.jaroslaw.bentch_new.View.Fragments.MainPageFragment;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private static String TAG = MainActivity.class.getName();

    private MainActivityPresenterImpl presenter;

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabsViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);

        presenter = new MainActivityPresenterImpl(getApplication(), this);
        presenter.onCreate();

    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        invalidateOptionsMenu();
        presenter.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void setupToolBar() {
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorMainTextWhite));
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);
    }

    @Override
    public void setupViewPager() {
        adapter = new TabsViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new MainPageFragment(), "Main");
        adapter.addFragment(new FavoritesPageFragment(), "Favorites");
        adapter.addFragment(new CreatedPageFragment(), "Created");
        adapter.addFragment(new EditPageFragment(), "Editor");

        viewPager.setAdapter(adapter);
//        viewPager.setOffscreenPageLimit(4);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}

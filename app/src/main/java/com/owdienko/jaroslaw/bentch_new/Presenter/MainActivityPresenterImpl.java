package com.owdienko.jaroslaw.bentch_new.Presenter;

import android.content.Context;

import com.owdienko.jaroslaw.bentch_new.View.Activities.MainActivityView;

/**
 * Created by Iaroslav Ovdienko on 17.07.17.
 * - jaroslaw - 2017 -
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {
    MainActivityView view;
    private Context context;

    public MainActivityPresenterImpl(Context context, MainActivityView view) {
        this.context = context;
        this.view = view;
    }

    @Override
    public void onCreate() {
        view.setupToolBar();
        view.setupViewPager();
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {
        view = null;
    }

}

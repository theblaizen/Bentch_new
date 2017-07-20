package com.owdienko.jaroslaw.bentch_new.Presenter;

import android.content.Context;

import com.owdienko.jaroslaw.bentch_new.Model.MainActivityInteractor;
import com.owdienko.jaroslaw.bentch_new.Model.MainActivityInteractorImpl;
import com.owdienko.jaroslaw.bentch_new.View.Activities.MainActivityView;

/**
 * Created by Iaroslav Ovdienko on 17.07.17.
 * - jaroslaw - 2017 -
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {
    private MainActivityView view;
    private Context context;
    private MainActivityInteractor interactor;

    public MainActivityPresenterImpl(Context context, MainActivityView view) {
        this.context = context;
        this.view = view;
        this.interactor = new MainActivityInteractorImpl();
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

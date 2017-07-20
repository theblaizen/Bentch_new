package com.owdienko.jaroslaw.bentch_new.Presenter;

import com.owdienko.jaroslaw.bentch_new.Model.MainPageFragmentInteractor;
import com.owdienko.jaroslaw.bentch_new.View.Fragments.MainPageFragmentView;

/**
 * Created by Iaroslav Ovdienko on 21.07.17.
 * - jaroslaw - 2017 -
 */

public class MainPageFragmentPresenterImpl implements MainPageFragmentPresenter, MainPageFragmentInteractor.OnFinishedListener {

    private MainPageFragmentInteractor interactor;
    private MainPageFragmentView view;

    public MainPageFragmentPresenterImpl(MainPageFragmentView view, MainPageFragmentInteractor interactor) {
        this.interactor = interactor;
        this.view = view;
    }

    @Override
    public void onResume() {
        if (view != null) {
            view.showProgress();
        }

        interactor.setText(this);
    }

    @Override
    public void onDestroy() {
        view = null;
    }

    @Override
    public void onFinished(String item) {
        view.hideProgress();
        view.setupTextView(item);
    }
}

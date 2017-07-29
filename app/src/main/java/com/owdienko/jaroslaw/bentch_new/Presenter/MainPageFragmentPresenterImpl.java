package com.owdienko.jaroslaw.bentch_new.Presenter;

import android.util.Log;

import com.owdienko.jaroslaw.bentch_new.Adapters.ImageRecyclerViewAdapter;
import com.owdienko.jaroslaw.bentch_new.Adapters.RecyclerViewResources;
import com.owdienko.jaroslaw.bentch_new.Model.Entities.ImageEntity;
import com.owdienko.jaroslaw.bentch_new.Model.Entities.SoundEntity;
import com.owdienko.jaroslaw.bentch_new.Model.MainPageFragmentInteractor;
import com.owdienko.jaroslaw.bentch_new.View.Fragments.MainPageFragmentView;

/**
 * Created by Iaroslav Ovdienko on 21.07.17.
 * - jaroslaw - 2017 -
 */

public class MainPageFragmentPresenterImpl implements MainPageFragmentPresenter, MainPageFragmentInteractor.OnFinishedListener {

    private static final String TAG = MainPageFragmentPresenterImpl.class.getSimpleName();

    private MainPageFragmentInteractor interactor;
    private MainPageFragmentView view;
    private RecyclerViewResources adapterView;

    public MainPageFragmentPresenterImpl(MainPageFragmentView view, MainPageFragmentInteractor interactor, RecyclerViewResources adapterView) {
        this.interactor = interactor;
        this.view = view;
        this.adapterView = adapterView;
    }

    @Override
    public void onLoadResources(ImageEntity imageEntity, SoundEntity soundEntity) {
        adapterView.setImages(imageEntity);
        adapterView.setSounds(soundEntity);

        //need to be set by user in settings
        int spanCount = 3;

        view.setupRecyclerView(spanCount, (ImageRecyclerViewAdapter) adapterView);
        view.hideProgress((ImageRecyclerViewAdapter) adapterView);
    }

    @Override
    public void onResume() {
        if (view != null) {
            view.showProgress();
        }

        interactor.loadResources(this);
    }

    @Override
    public void onDestroy() {
        view = null;
    }

}

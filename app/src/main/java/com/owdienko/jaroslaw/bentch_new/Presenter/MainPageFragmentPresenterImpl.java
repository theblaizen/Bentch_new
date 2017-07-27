package com.owdienko.jaroslaw.bentch_new.Presenter;

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

    private MainPageFragmentInteractor interactor;
    private MainPageFragmentView view;
    private RecyclerViewResources adapterView;

    //TODO pass adapter from MainPageFragment
    public MainPageFragmentPresenterImpl(MainPageFragmentView view, MainPageFragmentInteractor interactor) {
        this.interactor = interactor;
        this.view = view;
    }

    @Override
    public void onLoadResources(ImageEntity imageEntity, SoundEntity soundEntity) {
        adapterView.setImages(imageEntity);
        adapterView.setSounds(soundEntity);
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
    }
}

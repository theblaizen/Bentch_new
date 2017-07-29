package com.owdienko.jaroslaw.bentch_new.View.Fragments;

import com.owdienko.jaroslaw.bentch_new.Adapters.ImageRecyclerViewAdapter;

/**
 * Created by Iaroslav Ovdienko on 20.07.17.
 * - jaroslaw - 2017 -
 */

public interface MainPageFragmentView {

    void showProgress();

    void hideProgress(ImageRecyclerViewAdapter adapter);

    void setupRecyclerView(int spanCount,ImageRecyclerViewAdapter adapter);
}

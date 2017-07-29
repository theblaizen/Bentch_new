package com.owdienko.jaroslaw.bentch_new.View.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.owdienko.jaroslaw.bentch_new.Model.MainPageFragmentInteractorImpl;
import com.owdienko.jaroslaw.bentch_new.Presenter.MainPageFragmentPresenter;
import com.owdienko.jaroslaw.bentch_new.Presenter.MainPageFragmentPresenterImpl;
import com.owdienko.jaroslaw.bentch_new.R;

/**
 * Created by Iaroslav Ovdienko on 17.07.17.
 * - jaroslaw - 2017 -
 */

public class MainPageFragment extends Fragment implements MainPageFragmentView {

    private ProgressBar progressBar;
    private TextView textView;
    private MainPageFragmentPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_page, container, false);

        progressBar = (ProgressBar)view.findViewById(R.id.mainFragmentProgressBar);
        textView = (TextView)view.findViewById(R.id.noItemsInList);

        presenter = new MainPageFragmentPresenterImpl(this, new MainPageFragmentInteractorImpl());
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        textView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
        textView.setVisibility(View.VISIBLE);
    }
}

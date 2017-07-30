package com.owdienko.jaroslaw.bentch_new.View.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.owdienko.jaroslaw.bentch_new.Adapters.ImageRecyclerViewAdapter;
import com.owdienko.jaroslaw.bentch_new.Adapters.RecyclerViewResources;
import com.owdienko.jaroslaw.bentch_new.Model.MainPageFragmentInteractorImpl;
import com.owdienko.jaroslaw.bentch_new.Presenter.MainPageFragmentPresenter;
import com.owdienko.jaroslaw.bentch_new.Presenter.MainPageFragmentPresenterImpl;
import com.owdienko.jaroslaw.bentch_new.R;

/**
 * Created by Iaroslav Ovdienko on 17.07.17.
 * - jaroslaw - 2017 -
 */

public class MainPageFragment extends Fragment implements MainPageFragmentView {

    private static final String TAG = MainPageFragment.class.getSimpleName();

    private ProgressBar mProgressBar;
    private TextView mTextIfListEmpty;
    private MainPageFragmentPresenter mPresenter;
    private RecyclerView mRecyclerView;
    private RecyclerViewResources mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_page, container, false);

        mProgressBar = view.findViewById(R.id.mainFragmentProgressBar);
        mTextIfListEmpty = view.findViewById(R.id.mainFragmentNoItemsInList);
        mRecyclerView = view.findViewById(R.id.mainFragmentRecyclerView);

        mAdapter = new ImageRecyclerViewAdapter(getActivity());
        mPresenter = new MainPageFragmentPresenterImpl(this, new MainPageFragmentInteractorImpl(), mAdapter);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
        mTextIfListEmpty.setVisibility(View.INVISIBLE);
        mRecyclerView.setVisibility(View.GONE);
    }

    @Override
    public void hideProgress(ImageRecyclerViewAdapter adapter) {
        mProgressBar.setVisibility(View.GONE);
        if (adapter.getItemCount() < 1) {
            mTextIfListEmpty.setVisibility(View.VISIBLE);
        } else {
            mRecyclerView.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void setupRecyclerView(int spanCount, ImageRecyclerViewAdapter adapter) {
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), spanCount));
        mRecyclerView.setAdapter((ImageRecyclerViewAdapter) mAdapter);
    }
}

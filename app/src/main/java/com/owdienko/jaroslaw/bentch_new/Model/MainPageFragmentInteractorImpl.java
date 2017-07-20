package com.owdienko.jaroslaw.bentch_new.Model;

import android.os.Handler;

import com.owdienko.jaroslaw.bentch_new.View.Fragments.MainPageFragmentView;

/**
 * Created by Iaroslav Ovdienko on 21.07.17.
 * - jaroslaw - 2017 -
 */

public class MainPageFragmentInteractorImpl implements MainPageFragmentInteractor {

    public MainPageFragmentInteractorImpl() {

    }

    @Override
    public void setText(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(simpleText());
            }
        }, 2000);
    }

    private String simpleText() {
        return "Good, keep going!";
    }
}

package com.owdienko.jaroslaw.bentch_new.Model;

/**
 * Created by Iaroslav Ovdienko on 21.07.17.
 * - jaroslaw - 2017 -
 */

public interface MainPageFragmentInteractor {
    interface OnFinishedListener {
        void onFinished(String item);
    }

    void setText(OnFinishedListener listener);
}

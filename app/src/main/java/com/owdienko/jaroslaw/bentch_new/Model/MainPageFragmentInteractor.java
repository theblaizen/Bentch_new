package com.owdienko.jaroslaw.bentch_new.Model;

import com.owdienko.jaroslaw.bentch_new.Model.Entities.ImageEntity;
import com.owdienko.jaroslaw.bentch_new.Model.Entities.SoundEntity;

/**
 * Created by Iaroslav Ovdienko on 21.07.17.
 * - jaroslaw - 2017 -
 */

public interface MainPageFragmentInteractor {
    void setText(OnFinishedListener listener);

    void loadResources(OnFinishedListener listener);

    interface OnFinishedListener {
        void onFinished(String item);

        void onLoadResources(ImageEntity imageEntity, SoundEntity soundEntity);
    }
}

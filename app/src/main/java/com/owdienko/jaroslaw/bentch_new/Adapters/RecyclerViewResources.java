package com.owdienko.jaroslaw.bentch_new.Adapters;

import com.owdienko.jaroslaw.bentch_new.Model.Entities.ImageEntity;
import com.owdienko.jaroslaw.bentch_new.Model.Entities.SoundEntity;

/**
 * Created by Iaroslav Ovdienko on 27.07.17.
 * - jaroslaw - 2017 -
 */

public interface RecyclerViewResources {
    void setImages(ImageEntity images);

    void setSounds(SoundEntity sounds);

    void setSoundNames(int array);
}

package com.owdienko.jaroslaw.bentch_new.Model.Entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iaroslav Ovdienko on 27.07.17.
 * - jaroslaw - 2017 -
 */

public class ImageEntity {
    private List<Integer> images;


    public ImageEntity() {
        images = new ArrayList<>();
    }

    public ImageEntity(List<Integer> images) {
        this.images = images;
    }

    public List<Integer> getImages() {
        return images;
    }

    public void setImages(List<Integer> images) {
        this.images = images;
    }
}

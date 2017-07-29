package com.owdienko.jaroslaw.bentch_new.Model.Entities;

import android.media.SoundPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Iaroslav Ovdienko on 27.07.17.
 * - jaroslaw - 2017 -
 */

public class SoundEntity {
    private List<Integer> soundPool;

    public SoundEntity() {
        soundPool = new ArrayList<>();
    }

    public SoundEntity(List<Integer> soundPool) {
        this.soundPool = soundPool;
    }

    public List<Integer> getSoundPool() {
        return soundPool;
    }

    public void setSoundPool(List<Integer> soundPool) {
        this.soundPool = soundPool;
    }
}

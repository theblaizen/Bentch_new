package com.owdienko.jaroslaw.bentch_new.Model;

import android.os.Handler;

import com.owdienko.jaroslaw.bentch_new.Model.Entities.ImageEntity;
import com.owdienko.jaroslaw.bentch_new.Model.Entities.ImageResources;
import com.owdienko.jaroslaw.bentch_new.Model.Entities.SoundEntity;
import com.owdienko.jaroslaw.bentch_new.Model.Entities.SoundResources;
import com.owdienko.jaroslaw.bentch_new.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iaroslav Ovdienko on 21.07.17.
 * - jaroslaw - 2017 -
 */

public class MainPageFragmentInteractorImpl implements MainPageFragmentInteractor {

    @Override
    public void loadResources(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
//        new Handler().post(new Runnable() {
            @Override
            public void run() {
                listener.onLoadResources(loadImages(), loadSounds(), R.array.text_for_buttons);
            }
        }, 700);
//        });
    }

    private SoundEntity loadSounds() {
        List<Integer> sounds = new ArrayList<>();

        // Main Sound
        sounds.add(SoundResources.SOUND_MAIN_BENTCH);
        sounds.add(SoundResources.SOUND_MAIN_BLET);
        sounds.add(SoundResources.SOUND_MAIN_NIXIA_SEBE);
        sounds.add(SoundResources.SOUND_MAIN_NE_NIXIA);
        sounds.add(SoundResources.SOUND_MAIN_SHO_TO_XUYNIA);
        sounds.add(SoundResources.SOUND_MAIN_MOLODEC);
        sounds.add(SoundResources.SOUND_MAIN_NEVERIL);
        sounds.add(SoundResources.SOUND_MAIN_POVOROT);
        sounds.add(SoundResources.SOUND_MAIN_MATEMATIKA);
        sounds.add(SoundResources.SOUND_MAIN_MATHERFUKER);
        sounds.add(SoundResources.SOUND_MAIN_IDI_SYDA);
        sounds.add(SoundResources.SOUND_MAIN_POSHUTIL);

        // Green Elephant Sound
        sounds.add(SoundResources.SOUND_GE_VILKOY);
        sounds.add(SoundResources.SOUND_GE_ODNA_ISTORIA);

        // Harry Potter Sound
        sounds.add(SoundResources.SOUND_HP_DARK_LORD);
        sounds.add(SoundResources.SOUND_HP_CHTO_ZA_NAKH);
        sounds.add(SoundResources.SOUND_HP_YA_UBIU);

        // STB Sound
        sounds.add(SoundResources.SOUND_STB_HARAKTER_TAKOY);
        sounds.add(SoundResources.SOUND_STB_YA_USPEU);
        sounds.add(SoundResources.SOUND_STB_YA_NEVIDERJIVAU);
        sounds.add(SoundResources.SOUND_STB_SOKHRANILSA);
        sounds.add(SoundResources.SOUND_STB_CHOKOLADNIK);

        // RED21 Sound
        sounds.add(SoundResources.SOUND_RED_POSHUTIL);
        sounds.add(SoundResources.SOUND_RED_BOMBIT);
        sounds.add(SoundResources.SOUND_RED_ZAEBIC);
        sounds.add(SoundResources.SOUND_RED_BLIAT_ZAEBIC);
        sounds.add(SoundResources.SOUND_RED_BLIAT_VESELO);
        sounds.add(SoundResources.SOUND_RED_DRACHIBELNO);

        // DRUJKO Sound
        sounds.add(SoundResources.SOUND_DRUJKO_BEZPOMOSHNOST);
        sounds.add(SoundResources.SOUND_DRUJKO_S_UMA);
        sounds.add(SoundResources.SOUND_DRUJKO_ISTORIA);
        sounds.add(SoundResources.SOUND_DRUJKO_KARTOSHKA);
        sounds.add(SoundResources.SOUND_DRUJKO_NEPRAVDA);
        sounds.add(SoundResources.SOUND_DRUJKO_NEVEROIATNO);
        sounds.add(SoundResources.SOUND_DRUJKO_INTERNET);
        sounds.add(SoundResources.SOUND_DRUJKO_ZASEKRECHENO);
        sounds.add(SoundResources.SOUND_DRUJKO_ZAIAVLENIE);
        sounds.add(SoundResources.SOUND_DRUJKO_KONECHNO_NET);
        sounds.add(SoundResources.SOUND_DRUJKO_OBS);
        sounds.add(SoundResources.SOUND_DRUJKO_POKHVASTATSA);
        sounds.add(SoundResources.SOUND_DRUJKO_PONIMAETE);
        sounds.add(SoundResources.SOUND_DRUJKO_SITUACIA);
        sounds.add(SoundResources.SOUND_DRUJKO_VSEGO_DOBROGO);
        sounds.add(SoundResources.SOUND_DRUJKO_YETTI);

        return new SoundEntity(sounds);
    }

    private ImageEntity loadImages() {
        List<Integer> images = new ArrayList<>();

        //Main Images
        images.add(ImageResources.IMAGE_MAIN_BENTCH);
        images.add(ImageResources.IMAGE_MAIN_MOLODEC);
        images.add(ImageResources.IMAGE_MAIN_BLET);
        images.add(ImageResources.IMAGE_MAIN_NIXUYA_SEBE);
        images.add(ImageResources.IMAGE_MAIN_NE_NIXUYA);
        images.add(ImageResources.IMAGE_MAIN_SHO_TO_XUYNYA);
        images.add(ImageResources.IMAGE_MAIN_NEVERIL);
        images.add(ImageResources.IMAGE_MAIN_POVOROT);
        images.add(ImageResources.IMAGE_MAIN_MATEMATIKA);
        images.add(ImageResources.IMAGE_MAIN_MOTHERFUCKER);
        images.add(ImageResources.IMAGE_MAIN_IDI_SYDA);
        images.add(ImageResources.IMAGE_MAIN_POSHUTIL);

        // Green Elephant Images
        images.add(ImageResources.IMAGE_GE_VILKOY);
        images.add(ImageResources.IMAGE_GE_ODNA_ISTORIYA);

        // Harry Potter Images
        images.add(ImageResources.IMAGE_HP_DARK_LORD);
        images.add(ImageResources.IMAGE_HP_CHTO_ZA_NAKH);
        images.add(ImageResources.IMAGE_HP_YA_UBIU);

        // STB Images
        images.add(ImageResources.IMAGE_STB_HARAKTER_TAKOY);
        images.add(ImageResources.IMAGE_STB_YA_USPEU);
        images.add(ImageResources.IMAGE_STB_YA_NEVIDERJIVAU);
        images.add(ImageResources.IMAGE_STB_SOKHRANILSA);
        images.add(ImageResources.IMAGE_STB_CHOKOLADNIK);

        // RED21 Images
        images.add(ImageResources.IMAGE_RED_POSHUTIL);
        images.add(ImageResources.IMAGE_RED_BOMBIT);
        images.add(ImageResources.IMAGE_RED_ZAEBIC);
        images.add(ImageResources.IMAGE_RED_BLIAT_ZAEBIC);
        images.add(ImageResources.IMAGE_RED_BLIAT_VESELO);
        images.add(ImageResources.IMAGE_RED_DRACHIBELNO);

        // DRUJKO Images
        images.add(ImageResources.IMAGE_DRUJKO_BEZPOMOSHNOST);
        images.add(ImageResources.IMAGE_DRUJKO_S_UMA);
        images.add(ImageResources.IMAGE_DRUJKO_ISTORIA);
        images.add(ImageResources.IMAGE_DRUJKO_KARTOSHKA);
        images.add(ImageResources.IMAGE_DRUJKO_NEPRAVDA);
        images.add(ImageResources.IMAGE_DRUJKO_NEVEROIATNO);
        images.add(ImageResources.IMAGE_DRUJKO_INTERNET);
        images.add(ImageResources.IMAGE_DRUJKO_ZASEKRECHENO);
        images.add(ImageResources.IMAGE_DRUJKO_ZAIAVLENIE);
        images.add(ImageResources.IMAGE_DRUJKO_KONECHNO_NET);
        images.add(ImageResources.IMAGE_DRUJKO_OBS);
        images.add(ImageResources.IMAGE_DRUJKO_POKHVASTATSA);
        images.add(ImageResources.IMAGE_DRUJKO_PONIMAETE);
        images.add(ImageResources.IMAGE_DRUJKO_SITUACIA);
        images.add(ImageResources.IMAGE_DRUJKO_VSEGO_DOBROGO);
        images.add(ImageResources.IMAGE_DRUJKO_YETTI);

        return new ImageEntity(images);
    }
}

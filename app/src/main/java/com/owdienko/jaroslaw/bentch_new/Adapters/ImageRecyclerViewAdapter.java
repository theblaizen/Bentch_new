package com.owdienko.jaroslaw.bentch_new.Adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.owdienko.jaroslaw.bentch_new.Model.Entities.ImageEntity;
import com.owdienko.jaroslaw.bentch_new.Model.Entities.SoundEntity;
import com.owdienko.jaroslaw.bentch_new.R;

/**
 * Created by Iaroslav Ovdienko on 17.07.17.
 * - jaroslaw - 2017 -
 */

/**
 * <p>
 * Adapter class <b>ImageRecyclerViewAdapter</b> is for sound buttons.
 *
 * @author Yaroslav Ovdiienko
 */
public class ImageRecyclerViewAdapter extends RecyclerView.Adapter<ImageRecyclerViewAdapter.ViewHolder> implements RecyclerViewResources {

    private Context context;
    private ImageEntity mImagesEntity;
    private SoundEntity mSoundsEntity;
    private MediaPlayer mPlayer;

    public ImageRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sound_button, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //TODO setup images, text, progressbar
        holder.setButtonImage(context.getDrawable(mImagesEntity.getImages().get(position)));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void setImages(ImageEntity images) {
        mImagesEntity = images;
    }

    @Override
    public void setSounds(SoundEntity sounds) {
        mSoundsEntity = sounds;
    }


    //ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder {

        private ProgressBar mProgressBar;
        private ImageView mImage;
        private TextView mSoundName;

        public ViewHolder(View rootView) {
            super(rootView);

            mProgressBar = rootView.findViewById(R.id.sound_progress);
            mImage = rootView.findViewById(R.id.img_of_sound_button);
            mSoundName = rootView.findViewById(R.id.sound_name);

        }

        public void setProgressBarMaxProgress(int maxProgress) {
            mProgressBar.setMax(maxProgress);
            mProgressBar.setProgress(0);
        }

        public void setButtonImage(Drawable imgDrawable) {
            mImage.setImageDrawable(imgDrawable);
        }

        public void setSoundName(CharSequence soundName) {
            mSoundName.setText(soundName);
        }
    }
}

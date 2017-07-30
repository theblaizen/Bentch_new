package com.owdienko.jaroslaw.bentch_new.Adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.CardView;
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

import java.util.ArrayList;
import java.util.List;

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

    private static final String TAG = ImageRecyclerViewAdapter.class.getSimpleName();
    private List<Integer> mImagesEntity;
    private List<Integer> mSoundsEntity;
    private String[] mLabels;
    private Context mContext;
    private MediaPlayer mPlayer;

    public ImageRecyclerViewAdapter(Context context) {
        this.mContext = context;
        this.mSoundsEntity = new ArrayList<>();
        this.mImagesEntity = new ArrayList<>();
        this.mLabels = new String[0];
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
        holder.setButtonImage(mContext.getDrawable(mImagesEntity.get(position)));
        holder.setSoundName(mLabels[position]);

        holder.setRootViewHolderTag(position);
        holder.setProgressBarMaxProgress(100);
    }

    @Override
    public int getItemCount() {
        return mSoundsEntity.size();
    }

    @Override
    public void setImages(ImageEntity images) {
        mImagesEntity = images.getImages();

    }

    @Override
    public void setSounds(SoundEntity sounds) {
        mSoundsEntity = sounds.getSoundPool();
    }

    @Override
    public void setSoundNames(int array) {
        mLabels = mContext.getResources().getStringArray(array);
    }


    //ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ProgressBar mProgressBar;
        private ImageView mImage;
        private TextView mSoundName;
        private CardView mRootViewHolder;

        public ViewHolder(View rootView) {
            super(rootView);

            mProgressBar = rootView.findViewById(R.id.sound_progress);
            mImage = rootView.findViewById(R.id.img_of_sound_button);
            mSoundName = rootView.findViewById(R.id.sound_name);
            mRootViewHolder = rootView.findViewById(R.id.card_view);

            mRootViewHolder.setOnClickListener(this);

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

        public void setRootViewHolderTag(int tag) {
            mRootViewHolder.setTag(tag);
        }

        private boolean loopProgress(final View view, final int position) {
            return new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                @Override
                public void run() {

                    mProgressBar.incrementProgressBy(1);
                    if (mProgressBar.getProgress() != mProgressBar.getMax()) {
                        if ((int) view.getTag() == position) {
                            loopProgress(view, position);
                        } else {
                            mProgressBar.setProgress(0);
                            mRootViewHolder.setSelected(false);
                            return;
                        }
                    } else {
                        mProgressBar.setProgress(0);
                        mRootViewHolder.setSelected(false);
                        return;
                    }

                }
                //TODO replace 100 to musicDuration/100
            }, 100);
        }

        @Override
        public void onClick(View view) {
            if (mRootViewHolder.isSelected()) {
                //TODO stop music
                return;
            } else {
                mRootViewHolder.setSelected(true);
            }
            if (mProgressBar.getProgress() == mProgressBar.getMax()) {
                mRootViewHolder.setSelected(false);
                return;
            }
            loopProgress(view, (int) view.getTag());
        }
    }
}

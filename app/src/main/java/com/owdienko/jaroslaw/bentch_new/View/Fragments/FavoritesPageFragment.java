package com.owdienko.jaroslaw.bentch_new.View.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.owdienko.jaroslaw.bentch_new.R;

/**
 * Created by Iaroslav Ovdienko on 17.07.17.
 * - jaroslaw - 2017 -
 */

public class FavoritesPageFragment extends Fragment
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_favorites_page, container, false);
    }
}

package com.aiyaschool.aiya.love.matched;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aiyaschool.aiya.R;
import com.aiyaschool.aiya.base.LazyFragment;

/**
 * Created by EGOISTK21 on 2017/4/9.
 */

public class MatchedContainerFragment extends LazyFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        getChildFragmentManager().beginTransaction()
                .replace(R.id.container_love_matched, new MatchedFragment()).commit();
        return inflater.inflate(R.layout.fragment_love_matched_container, container, false);
    }
}
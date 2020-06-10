package com.jiyun.teach1907.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.jiyun.teach1907.view.activity.SplashActivity;
import com.teach.teach1907.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private View inflate;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        inflate = inflater.inflate(R.layout.fragment_home, container, false);
        Unbinder bind = ButterKnife.bind(this, inflate);
        return inflate;

    }

    @Override
    public void onResume() {
        super.onResume();
        TextView viewById = inflate.findViewById(R.id.select_subject);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "aaa", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SplashActivity.class);
                startActivity(intent);
            }
        });
    }

    @OnClick(R.id.select_subject)
    public void onViewClicked() {

    }
}

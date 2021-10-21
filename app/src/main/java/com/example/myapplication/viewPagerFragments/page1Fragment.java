package com.example.myapplication.viewPagerFragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.sign_in;
import com.example.myapplication.splashActivity;

public class page1Fragment extends Fragment {
    private TextView skip;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root  = (ViewGroup) inflater.inflate(R.layout.fragment_viewpage_1, container, false);
        skip  = root.findViewById(R.id.skip_btn);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), sign_in.class);
                startActivity(intent);;
            }
        });
        return root;
    }
}

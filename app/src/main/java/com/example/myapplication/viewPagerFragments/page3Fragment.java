package com.example.myapplication.viewPagerFragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.sign_in;
import com.example.myapplication.splashActivity;
import com.google.android.material.button.MaterialButton;

public class page3Fragment extends Fragment {

    private MaterialButton btn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root  = (ViewGroup) inflater.inflate(R.layout.fragment_viewpage_3, container, false);
        btn = root.findViewById(R.id.start_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), sign_in.class);
                startActivity(intent);;
            }
        });
        return root;
    }
}

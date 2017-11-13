package com.example.champ.testtabbedfragment.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.champ.testtabbedfragment.R;

public class ContactFragment extends Fragment {

    private static final String NAME = "name";
    private TextView textView;
    private String text;

    public ContactFragment() {
    }

    public static Fragment newInstance(String name) {
        ContactFragment fragment = new ContactFragment();
        Bundle args = new Bundle();
        args.putString(NAME, name);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View itemRootView = inflater.inflate(R.layout.fragment_main_contacts, container, false);
        if (getArguments() != null) {
            textView = itemRootView.findViewById(R.id.section_label_contact);
            text = textView.getText().toString() + getArguments().get(NAME);
        }
        return itemRootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView.setText(text);
    }

}

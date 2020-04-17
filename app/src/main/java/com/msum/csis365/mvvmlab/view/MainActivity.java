package com.msum.csis365.mvvmlab.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.msum.csis365.mvvmlab.R;
import com.msum.csis365.mvvmlab.view.contact.list.ContactsFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.frame_layout, new ContactsFragment()).commit();
    }
}

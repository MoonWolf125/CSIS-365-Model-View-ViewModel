package com.msum.csis365.mvvmlab.view.custom;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.msum.csis365.mvvmlab.R;
import com.msum.csis365.mvvmlab.model.Contact;

public class ContactRowView extends FrameLayout {

    private TextView tvName;

    public ContactRowView(Context context) {
        super(context, null, 0);
        setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        inflate(context, R.layout.view_contact_row, this);
        tvName = findViewById(R.id.tv_name);
    }

    public void setup(final Contact contact, final IContactRowListener listener) {
        tvName.setText(contact.getName().toString());

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onContactClicked(contact);
            }
        });
    }
}

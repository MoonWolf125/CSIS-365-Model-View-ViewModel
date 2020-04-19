package com.msum.csis365.mvvmlab.view.contact.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.msum.csis365.mvvmlab.R;
import com.msum.csis365.mvvmlab.model.Contact;

public class ContactFragment extends Fragment {

    // TODO - STEP 1 - Create a local variable to hold an instance of the ViewModel
    private ContactViewModel viewModel;

    private TextView tvName;
    private TextView tvPhoneNumberValue;
    private TextView tvAddressValue;
    private TextView tvEmailValue;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO - STEP 2 - Create an instance of the ViewModel and set it to the local variable
        viewModel = ViewModelProvider.AndroidViewModelFactory
                .getInstance(getActivity().getApplication())
                .create(ContactViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, null);

        tvName = view.findViewById(R.id.tv_name);
        tvPhoneNumberValue = view.findViewById(R.id.tv_phone_number_value);
        tvAddressValue = view.findViewById(R.id.tv_address_value);
        tvEmailValue = view.findViewById(R.id.tv_email_value);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // TODO - STEP 3 - Observe the exposed Live Data from Step 2
        viewModel.getContact().observe(this, new Observer<Contact>() {
            @Override
            public void onChanged(Contact contact) {
                tvName.setText(contact.getName().toString());
                tvPhoneNumberValue.setText(contact.getPhoneNumber().toString());
                tvAddressValue.setText(contact.getAddress().toString());
                tvEmailValue.setText(contact.getEmail().toString());
            }
        });

        // TODO - STEP 4 - Pass the selected Contact to the ViewModel
        viewModel.setContact(getArguments().<Contact>getParcelable("contact"));
    }
}

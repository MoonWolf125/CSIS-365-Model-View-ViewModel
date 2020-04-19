package com.msum.csis365.mvvmlab.view.contact.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.msum.csis365.mvvmlab.R;
import com.msum.csis365.mvvmlab.model.Contact;
import com.msum.csis365.mvvmlab.view.contact.create.CreateContactActivity;
import com.msum.csis365.mvvmlab.view.contact.detail.ContactFragment;
import com.msum.csis365.mvvmlab.view.custom.IContactRowListener;

import java.util.List;

import static android.app.Activity.RESULT_OK;

public class ContactsFragment extends Fragment implements IContactRowListener {

    // TODO - STEP 1 - Create a local variable to hold an instance of the ViewModel
    private ContactsViewModel viewModel;

    private RecyclerView rvContacts;
    private FloatingActionButton fab;

    private ContactsAdapter contactsAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO - STEP 2 - Create an instance of the ViewModel and set it to the local variable
        viewModel = ViewModelProvider.AndroidViewModelFactory
                .getInstance(getActivity().getApplication())
                .create(ContactsViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_contacts, null);
        rvContacts = view.findViewById(R.id.rv_contacts);
        fab = view.findViewById(R.id.fab);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        contactsAdapter = new ContactsAdapter(this);

        rvContacts.setLayoutManager(new LinearLayoutManager(getContext()));
        rvContacts.setAdapter(contactsAdapter);
        rvContacts.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayout.VERTICAL));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CreateContactActivity.class);
                startActivityForResult(intent, CreateContactActivity.REQUEST_CODE);
            }
        });

        // TODO - STEP 3 - Observe the exposed Live Data from Step 3
        viewModel.getContacts().observe(this, new Observer<List<Contact>>() {
            @Override
            public void onChanged(List<Contact> contacts) {
                contactsAdapter.setContacts(contacts);
            }
        });
    }

    @Override
    public void onContactClicked(Contact contact) {
        ContactFragment fragment = new ContactFragment();
        Bundle args = new Bundle();

        args.putParcelable("contact", contact);
        fragment.setArguments(args);

        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CreateContactActivity.REQUEST_CODE && resultCode == RESULT_OK) {
            // TODO - STEP 4 - Pass the newly created Contact to the ViewModel
            viewModel.addContact(data.<Contact>getParcelableExtra(CreateContactActivity.EXTRA_NAME));
        }
    }
}

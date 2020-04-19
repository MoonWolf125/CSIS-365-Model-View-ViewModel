package com.msum.csis365.mvvmlab.view.contact.list;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.msum.csis365.mvvmlab.model.Address;
import com.msum.csis365.mvvmlab.model.Contact;
import com.msum.csis365.mvvmlab.model.Email;
import com.msum.csis365.mvvmlab.model.Name;
import com.msum.csis365.mvvmlab.model.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class ContactsViewModel extends AndroidViewModel {

    // TODO - STEP 1 - Create local list of contacts
    private List<Contact> contacts = new ArrayList<>();

    // TODO - STEP 2 - Create Mutable Live Data
    private MutableLiveData<List<Contact>> _contacts = new MutableLiveData<>();

    // TODO - STEP 3 - Add Live Data (Immutable) as an accessor to expose for observation
    LiveData<List<Contact>> getContacts() {
        return _contacts;
    }

    public ContactsViewModel(@NonNull Application application) {
        super(application);

        // TODO - STEP 5 - Set an initial item in the list in the mutable live data
        addContact(
                new Contact(
                        new Name("Kyle", "Dahn"),
                        new Address("2972 St Barnick St", "Fargo", "MN", "55112", "USA"),
                        new PhoneNumber("1", "651", "763-2972"),
                        new Email("kdahn", "bushelpowered", "com")));
    }

    // TODO - STEP 4 - Create method to add Contacts to local list
    void addContact(Contact contact) {
        contacts.add(contact);
        _contacts.setValue(contacts);
    }
}

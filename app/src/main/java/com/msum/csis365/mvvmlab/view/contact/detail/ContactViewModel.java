package com.msum.csis365.mvvmlab.view.contact.detail;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.msum.csis365.mvvmlab.model.Contact;

public class ContactViewModel extends AndroidViewModel {

    // TODO - STEP 1 - Create Mutable Live Data
    private MutableLiveData<Contact> _contact = new MutableLiveData<>();

    // TODO - STEP 2 - Add Live Data (Immutable) as an accessor to expose for observation
    public LiveData<Contact> getContact() {
        return _contact;
    }

    public ContactViewModel(@NonNull Application application) {
        super(application);
    }

    // TODO - STEP 3 - Create method to set the Contact to the Mutable Live Data
    public void setContact(Contact contact) {
        _contact.setValue(contact);
    }
}

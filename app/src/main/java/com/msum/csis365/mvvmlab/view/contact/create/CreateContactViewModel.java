package com.msum.csis365.mvvmlab.view.contact.create;

import android.app.Application;
import android.util.Patterns;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.msum.csis365.mvvmlab.BuildConfig;
import com.msum.csis365.mvvmlab.model.Address;
import com.msum.csis365.mvvmlab.model.Contact;
import com.msum.csis365.mvvmlab.model.Email;
import com.msum.csis365.mvvmlab.model.Name;
import com.msum.csis365.mvvmlab.model.PhoneNumber;

import static android.app.Activity.RESULT_OK;

public class CreateContactViewModel extends AndroidViewModel {

    // TODO - STEP 1 - Create Mutable Live Data
    private MutableLiveData<CreateContactViewState> _viewState = new MutableLiveData<>();

    // TODO - STEP 2 - Add Live Data (Immutable) as an accessor to expose for observation
    LiveData<CreateContactViewState> getViewState() {
        return _viewState;
    }

    private String forename = null;
    private String surname = null;
    private String phoneNumber = null;
    private String street = null;
    private String city = null;
    private String state = null;
    private String zipCode = null;
    private String country = null;
    private String email = null;

    public CreateContactViewModel(@NonNull Application application) {
        super(application);

        // TODO - STEP 3 - Set an initial state to the Mutable Live Data
        _viewState.setValue(new CreateContactViewState());
    }

    void setForename(String forename) {

        // TODO - STEP 4 - Retrieve the current state from the Mutable Live Data
        CreateContactViewState viewState = _viewState.getValue();

        if (forename == null || forename.equals("")) {
            // TODO - STEP 5 - Have the State create a new instance of itself with the Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newForenameErrorInstance("First Name is required"));
        } else {
            this.forename = forename;

            // TODO - STEP 6 - Have the State create a new instance of itself with NO Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newForenameErrorInstance(null));
        }
    }

    void setSurname(String surname) {
        // TODO - STEP 7 - Retrieve the current state from the Mutable Live Data
        CreateContactViewState viewState = _viewState.getValue();

        if (surname == null || surname.equals("")) {
            // TODO - STEP 8 - Have the State create a new instance of itself with the Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newSurnameErrorInstance("Last Name is required"));
        } else {
            this.surname = surname;

            // TODO - STEP 9 - Have the State create a new instance of itself with NO Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newSurnameErrorInstance(null));
        }
    }

    void setPhoneNumber(String phoneNumber) {
        // TODO - STEP 10 - Retrieve the current state from the Mutable Live Data
        CreateContactViewState viewState = _viewState.getValue();

        if (phoneNumber == null || phoneNumber.equals("")) {
            // TODO - STEP 11 - Have the State create a new instance of itself with the Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newPhoneNumberErrorInstance("Phone Number is required"));
        } else {
            if (isValidPhoneNumber(phoneNumber)) {
                this.phoneNumber = phoneNumber;

                // TODO - STEP 12 - Have the State create a new instance of itself with NO Error
                //                  Then set that state to the Mutable Live Data
                _viewState.setValue(viewState.newPhoneNumberErrorInstance(null));
            } else {
                // TODO - STEP 13 - Have the State create a new instance of itself with the Error
                //                  Then set that state to the Mutable Live Data
                _viewState.setValue(viewState.newPhoneNumberErrorInstance("Invalid Phone Number"));
            }
        }
    }

    void setStreet(String street) {
        // TODO - STEP 14 - Retrieve the current state from the Mutable Live Data
        CreateContactViewState viewState = _viewState.getValue();

        if (street == null || street.equals("")) {
            // TODO - STEP 15 - Have the State create a new instance of itself with the Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newStreetErrorInstance("Street is required"));
        } else {
            this.street = street;

            // TODO - STEP 16 - Have the State create a new instance of itself with NO Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newStreetErrorInstance(null));
        }
    }

    void setCity(String city) {
        // TODO - STEP 17 - Retrieve the current state from the Mutable Live Data
        CreateContactViewState viewState = _viewState.getValue();

        if (city == null || city.equals("")) {
            // TODO - STEP 18 - Have the State create a new instance of itself with the Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newCityErrorInstance("City is required"));
        } else {
            this.city = city;

            // TODO - STEP 19 - Have the State create a new instance of itself with NO Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newCityErrorInstance(null));
        }
    }

    void setState(String state) {
        // TODO - STEP 20 - Retrieve the current state from the Mutable Live Data
        CreateContactViewState viewState = _viewState.getValue();

        if (state == null || state.equals("")) {
            // TODO - STEP 21 - Have the State create a new instance of itself with the Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newStateErrorInstance("State is required"));
        } else {
            this.state = state;

            // TODO - STEP 22 - Have the State create a new instance of itself with NO Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newStateErrorInstance(null));
        }
    }

    void setZipCode(String zipCode) {
        // TODO - STEP 23 - Retrieve the current state from the Mutable Live Data
        CreateContactViewState viewState = _viewState.getValue();

        if (zipCode == null || zipCode.equals("")) {
            // TODO - STEP 24 - Have the State create a new instance of itself with the Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newZipCodeErrorInstance("Zip Code is required"));
        } else {
            this.zipCode = zipCode;

            // TODO - STEP 25 - Have the State create a new instance of itself with NO Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newZipCodeErrorInstance(null));
        }
    }

    void setCountry(String country) {
        // TODO - STEP 26 - Retrieve the current state from the Mutable Live Data
        CreateContactViewState viewState = _viewState.getValue();

        if (country == null || country.equals("")) {
            // TODO - STEP 27 - Have the State create a new instance of itself with the Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newCountryErrorInstance("Country is required"));
        } else {
            this.country = country;

            // TODO - STEP 28 - Have the State create a new instance of itself with NO Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newCountryErrorInstance(null));
        }
    }

    void setEmail(String email) {
        // TODO - STEP 29 - Retrieve the current state from the Mutable Live Data
        CreateContactViewState viewState = _viewState.getValue();

        if (email == null || email.equals("")) {
            // TODO - STEP 30 - Have the State create a new instance of itself with the Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newEmailErrorInstance("Email is required"));
        } else {
            // Check if the email matches the valid pattern
            if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                this.email = email;

                // TODO - STEP 31 - Have the State create a new instance of itself with NO Error
                //                  Then set that state to the Mutable Live Data
                _viewState.setValue(viewState.newEmailErrorInstance(null));
            } else {
                // TODO - STEP 32 - Have the State create a new instance of itself with the Error
                //                  Then set that state to the Mutable Live Data
                _viewState.setValue(viewState.newEmailErrorInstance("Invalid Email"));
            }
        }
    }

    void onSaveClicked() {
        // TODO - STEP 33 - Retrieve the current state from the Mutable Live Data
        CreateContactViewState viewState = _viewState.getValue();

        // TODO - STEP 34 - Add the state's validation check to this conditional
        if (viewState.isValidSaveState() && isValidSaveState()) {
            // TODO - STEP 35 - Have the State create a new instance of itself with the proper
            //                  Result and newly created Contact
            _viewState.setValue(viewState.newSaveStateInstance(
                    RESULT_OK,
                    new Contact(
                            new Name(forename, surname),
                            new Address(street, city, state, zipCode, country),
                            parsePhoneNumber(phoneNumber),
                            parseEmail(email))));
        } else {
            // TODO - STEP 36 - Have the State create a new instance of itself with the Error
            //                  Then set that state to the Mutable Live Data
            _viewState.setValue(viewState.newGeneralErrorInstance("Please enter the proper Information"));
        }
    }

    private Boolean isValidPhoneNumber(String phoneNumber) {
        boolean isValid;
        try {
            String countryCode = phoneNumber.substring(0, phoneNumber.indexOf('(')).trim();
            String areaCode = phoneNumber.substring(phoneNumber.indexOf('(') + 1, phoneNumber.indexOf(')')).trim();
            String localNumber = phoneNumber.substring(phoneNumber.indexOf(')') + 1).trim();
            isValid = countryCode.length() <= 3 && areaCode.length() == 3 && localNumber.length() == 8;
        } catch (IndexOutOfBoundsException e) {
            isValid = false;
        }
        return isValid;
    }

    private Boolean isValidSaveState() {
        return forename != null
                && surname != null
                && phoneNumber != null
                && street != null
                && city != null
                && state != null
                && zipCode != null
                && country != null
                && email != null;
    }

    private PhoneNumber parsePhoneNumber(String phoneNumber) {
        return new PhoneNumber(BuildConfig.BUILD_TYPE, BuildConfig.BUILD_TYPE, BuildConfig.BUILD_TYPE);
    }

    private Email parseEmail(String email) {
        return new Email(
                BuildConfig.BUILD_TYPE,
                BuildConfig.BUILD_TYPE,
                BuildConfig.BUILD_TYPE);
    }
}

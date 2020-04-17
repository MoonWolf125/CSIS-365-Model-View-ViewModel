package com.msum.csis365.mvvmlab.view.contact.create;

import com.msum.csis365.mvvmlab.model.Contact;

class CreateContactViewState {
    private String forenameError = null;
    private String surnameError = null;
    private String phoneNumberError = null;
    private String streetError = null;
    private String cityError = null;
    private String stateError = null;
    private String zipCodeError = null;
    private String countryError = null;
    private String emailError = null;
    private String generalError = null;
    private Integer resultCode = null;
    private Contact contact = null;

    CreateContactViewState() { }

    private CreateContactViewState(
            String forenameError,
            String surnameError,
            String phoneNumberError,
            String streetError,
            String cityError,
            String stateError,
            String zipCodeError,
            String countryError,
            String emailError,
            String generalError,
            Integer resultCode,
            Contact contact
    ) {
        this.forenameError = forenameError;
        this.surnameError = surnameError;
        this.phoneNumberError = phoneNumberError;
        this.streetError = streetError;
        this.cityError = cityError;
        this.stateError = stateError;
        this.zipCodeError = zipCodeError;
        this.countryError = countryError;
        this.emailError = emailError;
        this.generalError = generalError;
        this.resultCode = resultCode;
        this.contact = contact;
    }

    String getForenameError() {
        return forenameError;
    }

    CreateContactViewState newForenameErrorInstance(String error) {
        return new CreateContactViewState(
                        error,
                        surnameError,
                        phoneNumberError,
                        streetError,
                        cityError,
                        stateError,
                        zipCodeError,
                        countryError,
                        emailError,
                        generalError,
                        resultCode,
                        contact);
    }

    String getSurnameError() {
        return surnameError;
    }

    CreateContactViewState newSurnameErrorInstance(String error) {
        return new CreateContactViewState(
                forenameError,
                error,
                phoneNumberError,
                streetError,
                cityError,
                stateError,
                zipCodeError,
                countryError,
                emailError,
                generalError,
                resultCode,
                contact);
    }

    String getPhoneNumberError() {
        return phoneNumberError;
    }

    CreateContactViewState newPhoneNumberErrorInstance(String error) {
        return new CreateContactViewState(
                forenameError,
                surnameError,
                error,
                streetError,
                cityError,
                stateError,
                zipCodeError,
                countryError,
                emailError,
                generalError,
                resultCode,
                contact);
    }

    String getStreetError() {
        return streetError;
    }

    CreateContactViewState newStreetErrorInstance(String error) {
        return new CreateContactViewState(
                forenameError,
                surnameError,
                phoneNumberError,
                error,
                cityError,
                stateError,
                zipCodeError,
                countryError,
                emailError,
                generalError,
                resultCode,
                contact);
    }

    String getCityError() {
        return cityError;
    }

    CreateContactViewState newCityErrorInstance(String error) {
        return new CreateContactViewState(
                forenameError,
                surnameError,
                phoneNumberError,
                streetError,
                error,
                stateError,
                zipCodeError,
                countryError,
                emailError,
                generalError,
                resultCode,
                contact);
    }

    String getStateError() {
        return stateError;
    }

    CreateContactViewState newStateErrorInstance(String error) {
        return new CreateContactViewState(
                forenameError,
                surnameError,
                phoneNumberError,
                streetError,
                cityError,
                error,
                zipCodeError,
                countryError,
                emailError,
                generalError,
                resultCode,
                contact);
    }

    String getZipCodeError() {
        return zipCodeError;
    }

    CreateContactViewState newZipCodeErrorInstance(String error) {
        return new CreateContactViewState(
                forenameError,
                surnameError,
                phoneNumberError,
                streetError,
                cityError,
                stateError,
                error,
                countryError,
                emailError,
                generalError,
                resultCode,
                contact);
    }

    String getCountryError() {
        return countryError;
    }

    CreateContactViewState newCountryErrorInstance(String error) {
        return new CreateContactViewState(
                forenameError,
                surnameError,
                phoneNumberError,
                streetError,
                cityError,
                stateError,
                zipCodeError,
                error,
                emailError,
                generalError,
                resultCode,
                contact);
    }

    String getEmailError() {
        return emailError;
    }

    CreateContactViewState newEmailErrorInstance(String error) {
        return new CreateContactViewState(
                forenameError,
                surnameError,
                phoneNumberError,
                streetError,
                cityError,
                stateError,
                zipCodeError,
                countryError,
                error,
                generalError,
                resultCode,
                contact);
    }

    String getGeneralError() {
        return generalError;
    }

    CreateContactViewState newGeneralErrorInstance(String error) {
        return new CreateContactViewState(
                forenameError,
                surnameError,
                phoneNumberError,
                streetError,
                cityError,
                stateError,
                zipCodeError,
                countryError,
                emailError,
                error,
                resultCode,
                contact);
    }

    Integer getResultCode() {
        return resultCode;
    }

    Contact getContact() {
        return contact;
    }

    CreateContactViewState newSaveStateInstance(int resultCode, Contact contact) {
        return new CreateContactViewState(
                forenameError,
                surnameError,
                phoneNumberError,
                streetError,
                cityError,
                stateError,
                zipCodeError,
                countryError,
                emailError,
                generalError,
                resultCode,
                contact);
    }

    boolean isValidSaveState() {
        return forenameError == null && surnameError == null
                && phoneNumberError == null && streetError == null
                && cityError == null && stateError == null
                && zipCodeError == null && countryError == null
                && emailError == null && generalError == null;
    }
}

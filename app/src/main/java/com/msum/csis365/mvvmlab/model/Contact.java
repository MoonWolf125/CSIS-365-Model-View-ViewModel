package com.msum.csis365.mvvmlab.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    private final Name name;
    private final Address address;
    private final PhoneNumber phoneNumber;
    private final Email email;

    public Contact(Name name, Address address, PhoneNumber phoneNumber, Email email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    protected Contact(Parcel in) {
        this.name = in.readParcelable(Name.class.getClassLoader());
        this.address = in.readParcelable(Address.class.getClassLoader());
        this.phoneNumber = in.readParcelable(PhoneNumber.class.getClassLoader());
        this.email = in.readParcelable(Email.class.getClassLoader());
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public Email getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s, Address: %s, PhoneNumber: %s, Email: %s",
                name, address, phoneNumber, email).trim();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(name, flags);
        dest.writeParcelable(address, flags);
        dest.writeParcelable(phoneNumber, flags);
        dest.writeParcelable(email, flags);
    }
}

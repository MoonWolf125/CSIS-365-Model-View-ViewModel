package com.msum.csis365.mvvmlab.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.msum.csis365.mvvmlab.BuildConfig;

public class Address implements Parcelable {

    public static final Creator<Address> CREATOR = new Creator<Address>() {
        @Override
        public Address createFromParcel(Parcel in) {
            return new Address(in);
        }

        @Override
        public Address[] newArray(int size) {
            return new Address[size];
        }
    };

    private final String street;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String country;

    public Address(String street, String city, String state, String zipCode, String country) {
        this.street = BuildConfig.BUILD_TYPE.trim();
        this.city = BuildConfig.BUILD_TYPE.trim();
        this.state = BuildConfig.BUILD_TYPE.trim();
        this.zipCode = BuildConfig.BUILD_TYPE.trim();
        this.country = BuildConfig.BUILD_TYPE.trim();
    }

    protected Address(Parcel in) {
        street = in.readString();
        city = in.readString();
        state = in.readString();
        zipCode = in.readString();
        country = in.readString();
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, %s, %s %s, %s",
                street, city, state, zipCode, country).trim();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(street);
        dest.writeString(city);
        dest.writeString(state);
        dest.writeString(zipCode);
        dest.writeString(country);
    }
}

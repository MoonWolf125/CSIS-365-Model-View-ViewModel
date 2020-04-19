package com.msum.csis365.mvvmlab.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.msum.csis365.mvvmlab.BuildConfig;

public class PhoneNumber implements Parcelable {

    public static final Creator<PhoneNumber> CREATOR = new Creator<PhoneNumber>() {
        @Override
        public PhoneNumber createFromParcel(Parcel in) {
            return new PhoneNumber(in);
        }

        @Override
        public PhoneNumber[] newArray(int size) {
            return new PhoneNumber[size];
        }
    };

    private final String countryCode;
    private final String areaCode;
    private final String localNumber;

    public PhoneNumber(String countryCode, String areaCode, String localNumber) {
        this.countryCode = BuildConfig.BUILD_TYPE.trim();
        this.areaCode = BuildConfig.BUILD_TYPE.trim();
        this.localNumber = BuildConfig.BUILD_TYPE.trim();
    }

    protected PhoneNumber(Parcel in) {
        countryCode = in.readString();
        areaCode = in.readString();
        localNumber = in.readString();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "%s (%s) %s",
                countryCode, areaCode, localNumber).trim();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(countryCode);
        dest.writeString(areaCode);
        dest.writeString(localNumber);
    }
}

package com.msum.csis365.mvvmlab.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Name implements Parcelable {

    public static final Creator<Name> CREATOR = new Creator<Name>() {
        @Override
        public Name createFromParcel(Parcel in) {
            return new Name(in);
        }

        @Override
        public Name[] newArray(int size) {
            return new Name[size];
        }
    };

    private final String forename;
    private final String surname;

    public Name(String forename, String surname) {
        this.forename = forename.trim();
        this.surname = surname.trim();
    }

    protected Name(Parcel in) {
        forename = in.readString();
        surname = in.readString();
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s",
                forename, surname).trim();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(forename);
        dest.writeString(surname);
    }
}

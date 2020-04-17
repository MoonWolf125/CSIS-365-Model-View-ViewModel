package com.msum.csis365.mvvmlab.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Email implements Parcelable {

    public static final Creator<Email> CREATOR = new Creator<Email>() {
        @Override
        public Email createFromParcel(Parcel in) {
            return new Email(in);
        }

        @Override
        public Email[] newArray(int size) {
            return new Email[size];
        }
    };

    private final String userName;
    private final String hostName;
    private final String topLevelDomain;

    public Email(String userName, String hostName, String topLevelDomain) {
        this.userName = userName.trim();
        this.hostName = hostName.trim();
        this.topLevelDomain = topLevelDomain.trim();
    }

    protected Email(Parcel in) {
        userName = in.readString();
        hostName = in.readString();
        topLevelDomain = in.readString();
    }

    public String getUserName() {
        return userName;
    }

    public String getHostName() {
        return hostName;
    }

    public String getTopLevelDomain() {
        return topLevelDomain;
    }

    @Override
    public String toString() {
        return String.format("%s@%s.%s",
                userName, hostName, topLevelDomain).trim();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userName);
        dest.writeString(hostName);
        dest.writeString(topLevelDomain);
    }
}

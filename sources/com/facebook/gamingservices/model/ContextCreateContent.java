package com.facebook.gamingservices.model;

import android.os.Parcel;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

public class ContextCreateContent implements ShareModel {
    private final String suggestedPlayerIDs;

    public int describeContents() {
        return 0;
    }

    private ContextCreateContent(Builder builder) {
        this.suggestedPlayerIDs = builder.suggestedPlayerIDs;
    }

    ContextCreateContent(Parcel parcel) {
        this.suggestedPlayerIDs = parcel.readString();
    }

    public String getSuggestedPlayerIDs() {
        return this.suggestedPlayerIDs;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.suggestedPlayerIDs);
    }

    public static class Builder implements ShareModelBuilder<ContextCreateContent, Builder> {
        /* access modifiers changed from: private */
        public String suggestedPlayerIDs;

        public Builder setSuggestedPlayerIDs(String str) {
            this.suggestedPlayerIDs = str;
            return this;
        }

        public ContextCreateContent build() {
            return new ContextCreateContent(this);
        }

        public Builder readFrom(ContextCreateContent contextCreateContent) {
            return contextCreateContent == null ? this : setSuggestedPlayerIDs(contextCreateContent.getSuggestedPlayerIDs());
        }

        /* access modifiers changed from: package-private */
        public Builder readFrom(Parcel parcel) {
            return readFrom((ContextCreateContent) parcel.readParcelable(ContextCreateContent.class.getClassLoader()));
        }
    }
}

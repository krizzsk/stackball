package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BatchReportMessage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }
    };

    /* renamed from: a */
    private String f15646a;

    /* renamed from: b */
    private String f15647b;

    /* renamed from: c */
    private long f15648c;

    public int describeContents() {
        return 0;
    }

    public BatchReportMessage(String str, String str2, long j) {
        this.f15646a = str;
        this.f15647b = str2;
        this.f15648c = j;
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f15646a = parcel.readString();
        this.f15647b = parcel.readString();
        this.f15648c = parcel.readLong();
    }

    public String getUuid() {
        return this.f15646a;
    }

    public void setUuid(String str) {
        this.f15646a = str;
    }

    public String getReportMessage() {
        return this.f15647b;
    }

    public void setReportMessage(String str) {
        this.f15647b = str;
    }

    public long getTimestamp() {
        return this.f15648c;
    }

    public void setTimestamp(long j) {
        this.f15648c = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15646a);
        parcel.writeString(this.f15647b);
        parcel.writeLong(this.f15648c);
    }
}

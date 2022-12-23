package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: com.yandex.metrica.impl.ob.f1 */
public class C11222f1 implements Parcelable {
    public static final Parcelable.Creator<C11222f1> CREATOR = new C11224b();

    /* renamed from: a */
    private ResultReceiver f26856a;

    /* renamed from: b */
    private List<String> f26857b;

    /* renamed from: c */
    private Map<String, String> f26858c;

    /* renamed from: com.yandex.metrica.impl.ob.f1$a */
    class C11223a implements Function0<C10651Q> {
        C11223a(C11222f1 f1Var) {
        }

        public Object invoke() {
            return C10619P0.m27164i().mo61878e();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.f1$b */
    class C11224b implements Parcelable.Creator<C11222f1> {
        C11224b() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C11222f1(parcel);
        }

        public Object[] newArray(int i) {
            return new C11222f1[i];
        }
    }

    public C11222f1(List<String> list, Map<String, String> map, ResultReceiver resultReceiver) {
        HashMap hashMap;
        this.f26857b = list;
        this.f26856a = resultReceiver;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        this.f26858c = hashMap;
    }

    /* renamed from: a */
    public boolean mo62849a(C10675Qi qi) {
        return C10612Oi.m27147a(qi, this.f26857b, this.f26858c, new C11223a(this));
    }

    /* renamed from: b */
    public List<String> mo62850b() {
        return this.f26857b;
    }

    /* renamed from: c */
    public ResultReceiver mo62851c() {
        return this.f26856a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.receiver", this.f26856a);
        if (this.f26857b != null) {
            bundle.putStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList", new ArrayList(this.f26857b));
        }
        Map<String, String> map = this.f26858c;
        if (map != null) {
            bundle.putString("com.yandex.metrica.CounterConfiguration.clidsForVerification", C11993ym.m30987c(map));
        }
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public Map<String, String> mo62848a() {
        return this.f26858c;
    }

    protected C11222f1(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(C11541n0.class.getClassLoader());
        if (readBundle != null) {
            this.f26856a = (ResultReceiver) readBundle.getParcelable("com.yandex.metrica.CounterConfiguration.receiver");
            this.f26857b = readBundle.getStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList");
            this.f26858c = C11993ym.m30966a(readBundle.getString("com.yandex.metrica.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f26858c = new HashMap();
    }
}

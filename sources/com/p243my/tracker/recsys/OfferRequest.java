package com.p243my.tracker.recsys;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.p243my.tracker.MyTracker;
import com.p243my.tracker.MyTrackerConfig;
import com.p243my.tracker.obfuscated.C7806d;
import com.p243my.tracker.obfuscated.C7872t;
import com.p243my.tracker.obfuscated.C7877u0;
import com.p243my.tracker.recsys.OfferRequest;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.tracker.recsys.OfferRequest */
public final class OfferRequest {

    /* renamed from: a */
    final OnCompleteListener f20211a;

    /* renamed from: b */
    final Handler f20212b;

    /* renamed from: c */
    final String f20213c;

    /* renamed from: d */
    private final AtomicBoolean f20214d = new AtomicBoolean(false);
    public final String data;
    public final List<String> placementIds;
    public final Boolean reset;
    public final String userId;

    /* renamed from: com.my.tracker.recsys.OfferRequest$OnCompleteListener */
    public interface OnCompleteListener {
        void onComplete(OfferRequest offerRequest, List<Offer> list, String str);
    }

    /* renamed from: com.my.tracker.recsys.OfferRequest$a */
    class C7886a implements C7872t.C7873a {
        C7886a() {
        }

        /* renamed from: a */
        public String mo52377a() {
            return WebRequest.CONTENT_TYPE_JSON;
        }

        /* renamed from: a */
        public void mo52384a(OutputStream outputStream) {
            if (!TextUtils.isEmpty(OfferRequest.this.data)) {
                outputStream.write(OfferRequest.this.data.getBytes("UTF-8"));
            }
        }
    }

    OfferRequest(String str, List<String> list, String str2, Boolean bool, OnCompleteListener onCompleteListener, Handler handler) {
        this.userId = str;
        this.placementIds = list;
        this.data = str2;
        this.reset = bool;
        this.f20211a = onCompleteListener;
        this.f20212b = handler;
        this.f20213c = "https://recsys.tracker.my.com/api/public/v3/rec/item";
    }

    /* renamed from: a */
    static List<Offer> m21614a(String str) {
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID);
                int optInt = jSONObject.optInt("test_id");
                int optInt2 = jSONObject.optInt("split_id");
                JSONObject jSONObject2 = jSONObject.getJSONObject("offer");
                arrayList.add(new Offer(optString, jSONObject2.optString("item_id"), jSONObject2.optDouble("price"), jSONObject2.optDouble("discount_price"), jSONObject2.optInt("value"), jSONObject2.optInt("discount_value"), optInt, optInt2));
            }
            return arrayList;
        } catch (Throwable unused) {
            C7877u0.m21547a("OfferRequest: error occurred while parsing values from json response");
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21615a() {
        String id = MyTracker.getTrackerConfig().getId();
        if (TextUtils.isEmpty(id)) {
            C7877u0.m21551b("OfferRequest: MyTracker hasn't been initialized yet, MyTracker.initTracker() should be called first");
            m21617a(this, this.f20212b, this.f20211a, (C7872t.C7874b<String>) null);
            return;
        }
        m21617a(this, this.f20212b, this.f20211a, C7872t.m21532a(new C7886a(), (MyTrackerConfig.OkHttpClientProvider) null, false).mo52289a(mo52566a(this.f20213c, id)));
    }

    /* renamed from: a */
    static void m21617a(OfferRequest offerRequest, Handler handler, OnCompleteListener onCompleteListener, C7872t.C7874b<String> bVar) {
        String str;
        List<Offer> list = null;
        if (bVar == null) {
            str = "MyTracker hasn't been initialized yet";
        } else if (!bVar.mo52505b()) {
            C7877u0.m21547a("OfferRequest: http response is unsuccessful");
            str = "Unsuccessful response";
        } else {
            String a = bVar.mo52504a();
            if (TextUtils.isEmpty(a)) {
                C7877u0.m21547a("OfferRequest: http response is empty ");
                str = "Empty response";
            } else {
                List<Offer> a2 = m21614a(a);
                if (a2 == null) {
                    C7877u0.m21547a("OfferRequest: error while parsing offers from response");
                    str = "Offers parsing error";
                } else {
                    list = a2;
                    str = null;
                }
            }
        }
        handler.post(new Runnable(offerRequest, list, str) {
            public final /* synthetic */ OfferRequest f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                OfferRequest.OnCompleteListener.this.onComplete(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo52566a(String str, String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("custom_user_id", this.userId);
        buildUpon.appendQueryParameter(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, str2);
        Boolean bool = this.reset;
        if (bool != null) {
            buildUpon.appendQueryParameter("reset", String.valueOf(bool));
        }
        if (!this.placementIds.isEmpty()) {
            int size = this.placementIds.size();
            for (int i = 0; i < size; i++) {
                buildUpon.appendQueryParameter(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, this.placementIds.get(i));
            }
        }
        return buildUpon.toString();
    }

    public void send() {
        if (this.f20211a == null) {
            C7877u0.m21547a("OfferRequest: listener is null, offers from response can not be returned");
        } else if (!this.f20214d.compareAndSet(false, true)) {
            C7877u0.m21547a("OfferRequest: send has already been called");
        } else {
            C7806d.m21131b(new Runnable() {
                public final void run() {
                    OfferRequest.this.m21615a();
                }
            });
        }
    }
}

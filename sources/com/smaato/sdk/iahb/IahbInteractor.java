package com.smaato.sdk.iahb;

import com.smaato.sdk.flow.Action1;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Function1;
import com.smaato.sdk.iahb.InAppBiddingException;
import com.smaato.sdk.p257ub.AdMarkup;
import com.smaato.sdk.p257ub.UbCache;
import com.smaato.sdk.p257ub.UbId;
import com.smaato.sdk.util.Consumer;
import com.smaato.sdk.util.JsonAdapter;
import java.util.concurrent.Callable;
import javax.inject.Inject;

final class IahbInteractor {
    private final JsonAdapter<IahbResponse> jsonAdapter;
    private final UbCache ubCache;

    @Inject
    IahbInteractor(UbCache ubCache2, JsonAdapter<IahbResponse> jsonAdapter2) {
        this.ubCache = ubCache2;
        this.jsonAdapter = jsonAdapter2;
    }

    /* access modifiers changed from: package-private */
    public final void saveBid(InAppBid inAppBid, Consumer<String> consumer, Consumer<InAppBiddingException> consumer2) {
        if (inAppBid == null) {
            throw new NullPointerException("'inAppBid' specified as non-null is null");
        } else if (consumer == null) {
            throw new NullPointerException("'onSaved' specified as non-null is null");
        } else if (consumer2 != null) {
            String json = inAppBid.getJson();
            if (json != null) {
                Flow map = Flow.fromCallable(new Callable(json) {
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final Object call() {
                        return IahbInteractor.this.lambda$saveAdMarkup$3$IahbInteractor(this.f$1);
                    }
                }).map($$Lambda$IahbInteractor$zILuFvPMDwLm8YyqfzAt69dH2GI.INSTANCE);
                UbCache ubCache2 = this.ubCache;
                ubCache2.getClass();
                map.map(new Function1() {
                    public final Object apply(Object obj) {
                        return UbCache.this.put((AdMarkup) obj);
                    }
                }).doOnError($$Lambda$IahbInteractor$Ahh0biEf86lk5Ei5ktmJG7Vs4.INSTANCE).subscribe(new Action1() {
                    public final void invoke(Object obj) {
                        Consumer.this.accept(((UbId) obj).toString());
                    }
                }, (Action1<? super Throwable>) new Action1() {
                    public final void invoke(Object obj) {
                        IahbInteractor.lambda$saveBid$2(Consumer.this, (Throwable) obj);
                    }
                });
                return;
            }
            throw new NullPointerException("'json' specified as non-null is null");
        } else {
            throw new NullPointerException("'onFailedToSave' specified as non-null is null");
        }
    }

    static /* synthetic */ void lambda$saveBid$2(Consumer consumer, Throwable th) throws Throwable {
        if (th instanceof InAppBiddingException) {
            consumer.accept((InAppBiddingException) th);
        } else {
            consumer.accept(new InAppBiddingException(InAppBiddingException.InApBiddingError.INTERNAL_ERROR, th));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ com.smaato.sdk.iahb.IahbResponse lambda$saveAdMarkup$3$IahbInteractor(java.lang.String r3) throws java.lang.Exception {
        /*
            r2 = this;
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0035 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0035 }
            byte[] r3 = r3.getBytes()     // Catch:{ IOException -> 0x0035 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0035 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0035 }
            com.smaato.sdk.util.JsonAdapter<com.smaato.sdk.iahb.IahbResponse> r3 = r2.jsonAdapter     // Catch:{ all -> 0x0029 }
            android.util.JsonReader r1 = new android.util.JsonReader     // Catch:{ all -> 0x0029 }
            r1.<init>(r0)     // Catch:{ all -> 0x0029 }
            java.lang.Object r3 = r3.fromJson(r1)     // Catch:{ all -> 0x0029 }
            com.smaato.sdk.iahb.IahbResponse r3 = (com.smaato.sdk.iahb.IahbResponse) r3     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0021
            r0.close()     // Catch:{ IOException -> 0x0035 }
            return r3
        L_0x0021:
            com.smaato.sdk.iahb.InAppBiddingException r3 = new com.smaato.sdk.iahb.InAppBiddingException     // Catch:{ all -> 0x0029 }
            com.smaato.sdk.iahb.InAppBiddingException$InApBiddingError r1 = com.smaato.sdk.iahb.InAppBiddingException.InApBiddingError.INVALID_JSON     // Catch:{ all -> 0x0029 }
            r3.<init>(r1)     // Catch:{ all -> 0x0029 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002b }
        L_0x002b:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0030 }
            goto L_0x0034
        L_0x0030:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ IOException -> 0x0035 }
        L_0x0034:
            throw r1     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            r3 = move-exception
            com.smaato.sdk.iahb.InAppBiddingException r0 = new com.smaato.sdk.iahb.InAppBiddingException
            com.smaato.sdk.iahb.InAppBiddingException$InApBiddingError r1 = com.smaato.sdk.iahb.InAppBiddingException.InApBiddingError.INVALID_JSON
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.iahb.IahbInteractor.lambda$saveAdMarkup$3$IahbInteractor(java.lang.String):com.smaato.sdk.iahb.IahbResponse");
    }
}

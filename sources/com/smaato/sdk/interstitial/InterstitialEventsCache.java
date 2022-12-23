package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Supplier;
import com.smaato.sdk.interstitial.AdEvent;
import com.smaato.sdk.interstitial.csm.InterstitialCsmAdImpl;
import com.smaato.sdk.interstitial.csm.InterstitialCsmAdPresenter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class InterstitialEventsCache {
    private final Map<String, C8757Ad> ads;
    private final Map<String, LinkedHashSet<AdEvent>> eventsCache;
    private final InterstitialAdPresenterStorage interstitialAdPresenterStorage;
    private final Supplier<UUID> uuidSupplier;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.Supplier<java.util.UUID>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    InterstitialEventsCache(java.util.Map<java.lang.String, java.util.LinkedHashSet<com.smaato.sdk.interstitial.AdEvent>> r1, java.util.Map<java.lang.String, com.smaato.sdk.interstitial.InterstitialEventsCache.C8757Ad> r2, com.smaato.sdk.interstitial.InterstitialAdPresenterStorage r3, com.smaato.sdk.core.util.p251fi.Supplier<java.util.UUID> r4) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.eventsCache = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r0.ads = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.interstitial.InterstitialAdPresenterStorage r1 = (com.smaato.sdk.interstitial.InterstitialAdPresenterStorage) r1
            r0.interstitialAdPresenterStorage = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.core.util.fi.Supplier r1 = (com.smaato.sdk.core.util.p251fi.Supplier) r1
            r0.uuidSupplier = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.interstitial.InterstitialEventsCache.<init>(java.util.Map, java.util.Map, com.smaato.sdk.interstitial.InterstitialAdPresenterStorage, com.smaato.sdk.core.util.fi.Supplier):void");
    }

    public final void notifyEvent(String str, AdEvent.Type type) {
        notifyEvent(str, new AdEvent(type, Whatever.INSTANCE));
    }

    /* access modifiers changed from: package-private */
    public final void notifyEvent(String str, AdEvent adEvent) {
        Threads.runOnUi(new Runnable(str, adEvent) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ AdEvent f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                InterstitialEventsCache.this.lambda$notifyEvent$0$InterstitialEventsCache(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void handleAdLoaded(AdPresenter adPresenter, String str) {
        EventListener eventListener = getEventListener(str);
        if (eventListener != null) {
            if (adPresenter instanceof InterstitialAdPresenter) {
                Threads.runOnUi(new Runnable(eventListener, (InterstitialAdPresenter) adPresenter) {
                    public final /* synthetic */ EventListener f$1;
                    public final /* synthetic */ InterstitialAdPresenter f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        InterstitialEventsCache.this.lambda$handleAdLoaded$1$InterstitialEventsCache(this.f$1, this.f$2);
                    }
                });
            } else if (adPresenter instanceof InterstitialCsmAdPresenter) {
                Threads.runOnUi(new Runnable(eventListener, (InterstitialCsmAdPresenter) adPresenter) {
                    public final /* synthetic */ EventListener f$1;
                    public final /* synthetic */ InterstitialCsmAdPresenter f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        InterstitialEventsCache.this.lambda$handleAdLoaded$2$InterstitialEventsCache(this.f$1, this.f$2);
                    }
                });
            } else {
                handleAdFailedToLoad(new InterstitialRequestError(InterstitialError.INTERNAL_ERROR, adPresenter.getPublisherId(), adPresenter.getAdSpaceId()), str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void handleAdFailedToLoad(InterstitialRequestError interstitialRequestError, String str) {
        Threads.runOnUi(new Runnable(str, interstitialRequestError) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ InterstitialRequestError f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                InterstitialEventsCache.this.lambda$handleAdFailedToLoad$4$InterstitialEventsCache(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$handleAdFailedToLoad$4$InterstitialEventsCache(String str, InterstitialRequestError interstitialRequestError) {
        Objects.onNotNull(getEventListener(str), new Consumer() {
            public final void accept(Object obj) {
                ((EventListener) obj).onAdFailedToLoad(InterstitialRequestError.this);
            }
        });
    }

    private void doAdNotification(String str) {
        InterstitialAd interstitialAd;
        Set set;
        EventListener eventListener = getEventListener(str);
        if (eventListener != null) {
            C8757Ad ad = this.ads.get(str);
            if (ad == null) {
                interstitialAd = null;
            } else {
                interstitialAd = ad.getInterstitialAd();
            }
            if (interstitialAd != null && (set = this.eventsCache.get(str)) != null) {
                Iterator it = new ArrayList(set).iterator();
                while (it.hasNext()) {
                    AdEvent adEvent = (AdEvent) it.next();
                    set.remove(adEvent);
                    switch (C87561.$SwitchMap$com$smaato$sdk$interstitial$AdEvent$Type[adEvent.getType().ordinal()]) {
                        case 1:
                            eventListener.onAdOpened(interstitialAd);
                            break;
                        case 2:
                            eventListener.onAdClicked(interstitialAd);
                            break;
                        case 3:
                            eventListener.onAdClosed(interstitialAd);
                            break;
                        case 4:
                            eventListener.onAdError(interstitialAd, (InterstitialError) adEvent.getContent());
                            break;
                        case 5:
                            eventListener.onAdImpression(interstitialAd);
                            break;
                        case 6:
                            eventListener.onAdTTLExpired(interstitialAd);
                            break;
                        default:
                            throw new IllegalArgumentException("Unexpected AdEvent");
                    }
                }
            }
        }
    }

    /* renamed from: com.smaato.sdk.interstitial.InterstitialEventsCache$1 */
    static /* synthetic */ class C87561 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$interstitial$AdEvent$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.interstitial.AdEvent$Type[] r0 = com.smaato.sdk.interstitial.AdEvent.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$interstitial$AdEvent$Type = r0
                com.smaato.sdk.interstitial.AdEvent$Type r1 = com.smaato.sdk.interstitial.AdEvent.Type.OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$interstitial$AdEvent$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.interstitial.AdEvent$Type r1 = com.smaato.sdk.interstitial.AdEvent.Type.CLICK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$interstitial$AdEvent$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.interstitial.AdEvent$Type r1 = com.smaato.sdk.interstitial.AdEvent.Type.CLOSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$interstitial$AdEvent$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.interstitial.AdEvent$Type r1 = com.smaato.sdk.interstitial.AdEvent.Type.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$interstitial$AdEvent$Type     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.interstitial.AdEvent$Type r1 = com.smaato.sdk.interstitial.AdEvent.Type.IMPRESS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$interstitial$AdEvent$Type     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.interstitial.AdEvent$Type r1 = com.smaato.sdk.interstitial.AdEvent.Type.TTL_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$smaato$sdk$interstitial$AdEvent$Type     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.interstitial.AdEvent$Type r1 = com.smaato.sdk.interstitial.AdEvent.Type.LOADED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.interstitial.InterstitialEventsCache.C87561.<clinit>():void");
        }
    }

    private EventListener getEventListener(String str) {
        C8757Ad ad = this.ads.get(str);
        if (ad == null) {
            return null;
        }
        return ad.getEventListener();
    }

    /* renamed from: com.smaato.sdk.interstitial.InterstitialEventsCache$Ad */
    static final class C8757Ad {
        private final WeakReference<EventListener> weakEventListener;
        private final WeakReference<InterstitialAd> weakInterstitialAd;

        private C8757Ad(WeakReference<EventListener> weakReference, WeakReference<InterstitialAd> weakReference2) {
            this.weakEventListener = weakReference;
            this.weakInterstitialAd = weakReference2;
        }

        public final EventListener getEventListener() {
            return (EventListener) this.weakEventListener.get();
        }

        public final InterstitialAd getInterstitialAd() {
            return (InterstitialAd) this.weakInterstitialAd.get();
        }

        static C8757Ad create(EventListener eventListener, InterstitialAd interstitialAd) {
            return new C8757Ad(new WeakReference(eventListener), new WeakReference(interstitialAd));
        }
    }

    /* access modifiers changed from: package-private */
    public final void saveAd(String str, C8757Ad ad) {
        Iterator<Map.Entry<String, C8757Ad>> it = this.ads.entrySet().iterator();
        while (it.hasNext()) {
            C8757Ad ad2 = (C8757Ad) it.next().getValue();
            if (ad2.getEventListener() == null && ad2.getInterstitialAd() == null) {
                it.remove();
            }
        }
        this.ads.put(str, ad);
    }

    public /* synthetic */ void lambda$handleAdLoaded$2$InterstitialEventsCache(EventListener eventListener, InterstitialCsmAdPresenter interstitialCsmAdPresenter) {
        if (interstitialCsmAdPresenter.isValid()) {
            String uuid = this.uuidSupplier.get().toString();
            InterstitialCsmAdImpl interstitialCsmAdImpl = new InterstitialCsmAdImpl(interstitialCsmAdPresenter, uuid, this);
            saveAd(uuid, C8757Ad.create(eventListener, interstitialCsmAdImpl));
            eventListener.onAdLoaded(interstitialCsmAdImpl);
            return;
        }
        eventListener.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.CREATIVE_RESOURCE_EXPIRED, interstitialCsmAdPresenter.getPublisherId(), interstitialCsmAdPresenter.getAdSpaceId()));
    }

    public /* synthetic */ void lambda$handleAdLoaded$1$InterstitialEventsCache(EventListener eventListener, InterstitialAdPresenter interstitialAdPresenter) {
        if (interstitialAdPresenter.isValid()) {
            UUID uuid = this.uuidSupplier.get();
            String uuid2 = uuid.toString();
            InterstitialAdImpl interstitialAdImpl = new InterstitialAdImpl(uuid, uuid2, interstitialAdPresenter, this.interstitialAdPresenterStorage, eventListener);
            saveAd(uuid2, C8757Ad.create(eventListener, interstitialAdImpl));
            eventListener.onAdLoaded(interstitialAdImpl);
            return;
        }
        eventListener.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.CREATIVE_RESOURCE_EXPIRED, interstitialAdPresenter.getPublisherId(), interstitialAdPresenter.getAdSpaceId()));
    }

    public /* synthetic */ void lambda$notifyEvent$0$InterstitialEventsCache(String str, AdEvent adEvent) {
        LinkedHashSet linkedHashSet = this.eventsCache.get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            this.eventsCache.put(str, linkedHashSet);
        }
        linkedHashSet.add(adEvent);
        doAdNotification(str);
    }
}

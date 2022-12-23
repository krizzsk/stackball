package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;

/* renamed from: com.smaato.sdk.video.vast.model.Tracking */
public class C8938Tracking {
    public static final String EVENT = "event";
    public static final String NAME = "Tracking";
    public static final String OFFSET = "offset";
    public static final String URL = "url";
    public final String offset;
    public final String url;
    public final VastEvent vastEvent;

    C8938Tracking(VastEvent vastEvent2, String str, String str2) {
        this.vastEvent = vastEvent2;
        this.url = str;
        this.offset = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C8938Tracking tracking = (C8938Tracking) obj;
            if (!this.url.equals(tracking.url) || this.vastEvent != tracking.vastEvent) {
                return false;
            }
            String str = this.offset;
            String str2 = tracking.offset;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.url.hashCode() * 31) + this.vastEvent.hashCode()) * 31;
        String str = this.offset;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: com.smaato.sdk.video.vast.model.Tracking$Builder */
    public static class Builder {
        private String offset;
        private String url;
        private VastEvent vastEvent;

        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder setVastEvent(VastEvent vastEvent2) {
            this.vastEvent = vastEvent2;
            return this;
        }

        public Builder setOffset(String str) {
            this.offset = str;
            return this;
        }

        public C8938Tracking build() throws VastElementMissingException {
            String str;
            VastModels.requireNonNull(this.vastEvent, "Cannot build Tracking: event is missing");
            VastModels.requireNonNull(this.url, "Cannot build Tracking: url is missing");
            if (TextUtils.isEmpty(this.offset)) {
                int i = C89391.$SwitchMap$com$smaato$sdk$video$vast$model$VastEvent[this.vastEvent.ordinal()];
                str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : "0%" : "25%" : "50%" : "75%";
            } else {
                str = this.offset;
            }
            this.offset = str;
            return new C8938Tracking(this.vastEvent, this.url, str);
        }
    }

    /* renamed from: com.smaato.sdk.video.vast.model.Tracking$1 */
    static /* synthetic */ class C89391 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$video$vast$model$VastEvent;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.smaato.sdk.video.vast.model.VastEvent[] r0 = com.smaato.sdk.video.vast.model.VastEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$video$vast$model$VastEvent = r0
                com.smaato.sdk.video.vast.model.VastEvent r1 = com.smaato.sdk.video.vast.model.VastEvent.THIRD_QUARTILE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$model$VastEvent     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.video.vast.model.VastEvent r1 = com.smaato.sdk.video.vast.model.VastEvent.MID_POINT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$model$VastEvent     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.video.vast.model.VastEvent r1 = com.smaato.sdk.video.vast.model.VastEvent.FIRST_QUARTILE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$model$VastEvent     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.video.vast.model.VastEvent r1 = com.smaato.sdk.video.vast.model.VastEvent.START     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.model.C8938Tracking.C89391.<clinit>():void");
        }
    }
}

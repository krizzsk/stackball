package com.yandex.mobile.ads.video.models.p268ad;

import com.tapjoy.TJAdUnitConstants;
import com.yandex.mobile.ads.impl.sl1;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.video.models.ad.a */
public class C15561a {

    /* renamed from: a */
    private final String f44114a;

    /* renamed from: com.yandex.mobile.ads.video.models.ad.a$a */
    public static class C15562a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f44115a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C15564c f44116b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f44117c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Integer f44118d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Integer f44119e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C15563b f44120f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C15565d f44121g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f44122h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Long f44123i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Long f44124j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Integer f44125k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Integer f44126l;

        /* renamed from: d */
        public C15562a mo71975d(String str) {
            C15563b bVar;
            if ("left".equals(str)) {
                bVar = C15563b.ICON_HORIZONTAL_POSITION_LEFT;
            } else if ("right".equals(str)) {
                bVar = C15563b.ICON_HORIZONTAL_POSITION_RIGHT;
            } else {
                bVar = C15563b.ICON_HORIZONTAL_POSITION_LEFT_OFFSET;
            }
            this.f44120f = bVar;
            if (bVar == C15563b.ICON_HORIZONTAL_POSITION_LEFT_OFFSET) {
                this.f44125k = sl1.m42057b(str);
            }
            return this;
        }

        /* renamed from: g */
        public C15562a mo71978g(String str) {
            C15564c cVar;
            Iterator it = Arrays.asList(C15564c.values()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = (C15564c) it.next();
                if (cVar.f44132b.equals(str)) {
                    break;
                }
            }
            this.f44116b = cVar;
            return this;
        }

        /* renamed from: i */
        public C15562a mo71980i(String str) {
            C15565d dVar;
            if ("top".equals(str)) {
                dVar = C15565d.ICON_VERTICAL_POSITION_TOP;
            } else if (TJAdUnitConstants.String.BOTTOM.equals(str)) {
                dVar = C15565d.ICON_VERTICAL_POSITION_BOTTOM;
            } else {
                dVar = C15565d.ICON_VERTICAL_POSITION_TOP_OFFSET;
            }
            this.f44121g = dVar;
            if (dVar == C15565d.ICON_VERTICAL_POSITION_TOP_OFFSET) {
                this.f44126l = sl1.m42057b(str);
            }
            return this;
        }

        /* renamed from: a */
        public C15562a mo71971a(String str) {
            this.f44122h = str;
            return this;
        }

        /* renamed from: b */
        public C15562a mo71973b(String str) {
            this.f44124j = sl1.m42055a(str);
            return this;
        }

        /* renamed from: c */
        public C15562a mo71974c(String str) {
            this.f44119e = sl1.m42057b(str);
            return this;
        }

        /* renamed from: e */
        public C15562a mo71976e(String str) {
            this.f44123i = sl1.m42055a(str);
            return this;
        }

        /* renamed from: f */
        public C15562a mo71977f(String str) {
            this.f44117c = str;
            return this;
        }

        /* renamed from: h */
        public C15562a mo71979h(String str) {
            this.f44115a = str;
            return this;
        }

        /* renamed from: j */
        public C15562a mo71981j(String str) {
            this.f44118d = sl1.m42057b(str);
            return this;
        }

        /* renamed from: a */
        public C15561a mo71972a() {
            return new C15561a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.video.models.ad.a$b */
    public enum C15563b {
        ICON_HORIZONTAL_POSITION_LEFT("left"),
        ICON_HORIZONTAL_POSITION_RIGHT("right"),
        ICON_HORIZONTAL_POSITION_LEFT_OFFSET("leftOffset");

        private C15563b(String str) {
        }
    }

    /* renamed from: com.yandex.mobile.ads.video.models.ad.a$c */
    public enum C15564c {
        ;
        

        /* renamed from: b */
        public final String f44132b;

        private C15564c(String str) {
            this.f44132b = str;
        }
    }

    /* renamed from: com.yandex.mobile.ads.video.models.ad.a$d */
    public enum C15565d {
        ICON_VERTICAL_POSITION_TOP("top"),
        ICON_VERTICAL_POSITION_BOTTOM(TJAdUnitConstants.String.BOTTOM),
        ICON_VERTICAL_POSITION_TOP_OFFSET("topOffset");

        private C15565d(String str) {
        }
    }

    C15561a(C15562a aVar) {
        String unused = aVar.f44115a;
        C15564c unused2 = aVar.f44116b;
        this.f44114a = aVar.f44117c;
        Integer unused3 = aVar.f44118d;
        Integer unused4 = aVar.f44119e;
        C15563b unused5 = aVar.f44120f;
        C15565d unused6 = aVar.f44121g;
        String unused7 = aVar.f44122h;
        Long unused8 = aVar.f44123i;
        Long unused9 = aVar.f44124j;
        Integer unused10 = aVar.f44125k;
        Integer unused11 = aVar.f44126l;
    }

    /* renamed from: a */
    public String mo71970a() {
        return this.f44114a;
    }
}

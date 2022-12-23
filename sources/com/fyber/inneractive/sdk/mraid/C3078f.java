package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.p056m.C3039d;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.f */
public final class C3078f {

    /* renamed from: a */
    protected static C3078f f7584a = new C3078f();

    /* renamed from: com.fyber.inneractive.sdk.mraid.f$a */
    public enum C3080a {
        CLOSE("close"),
        EXPAND(MraidJsMethods.EXPAND),
        USECUSTOMCLOSE("usecustomclose"),
        OPEN("open"),
        RESIZE(MraidJsMethods.RESIZE),
        GET_RESIZE_PROPERTIES("getResizeProperties"),
        SET_RESIZE_PROPERTIES("setResizeProperties"),
        SET_ORIENTATION_PROPERTIES("setOrientationProperties"),
        PLAY_VIDEO(MraidJsMethods.PLAY_VIDEO),
        STORE_PICTURE("storePicture"),
        GET_CURRENT_POSITION("getCurrentPosition"),
        GET_DEFAULT_POSITION("getDefaultPosition"),
        GET_MAX_SIZE("getMaxSize"),
        GET_SCREEN_SIZE("getScreenSize"),
        CREATE_CALENDAR_EVENT("createCalendarEvent"),
        UNSPECIFIED("");
        

        /* renamed from: q */
        public String f7603q;

        private C3080a(String str) {
            this.f7603q = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.f$1 */
    static /* synthetic */ class C30791 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7585a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fyber.inneractive.sdk.mraid.f$a[] r0 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7585a = r0
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.CLOSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.EXPAND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.USECUSTOMCLOSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.OPEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.RESIZE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.GET_RESIZE_PROPERTIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.SET_RESIZE_PROPERTIES     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.SET_ORIENTATION_PROPERTIES     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.PLAY_VIDEO     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.STORE_PICTURE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.GET_CURRENT_POSITION     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.GET_DEFAULT_POSITION     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.GET_MAX_SIZE     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.GET_SCREEN_SIZE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.CREATE_CALENDAR_EVENT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f7585a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.fyber.inneractive.sdk.mraid.f$a r1 = com.fyber.inneractive.sdk.mraid.C3078f.C3080a.UNSPECIFIED     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.mraid.C3078f.C30791.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C3074b m7279a(String str, Map<String, String> map, C3039d dVar, C3629aj ajVar) {
        switch (C30791.f7585a[C3080a.m7280a(str).ordinal()]) {
            case 1:
                return new C3075c(map, dVar, ajVar);
            case 2:
                return new C3077e(map, dVar, ajVar);
            case 3:
                return new C3092r(map, dVar, ajVar);
            case 4:
                return new C3086l(map, dVar, ajVar);
            case 5:
                return new C3088n(map, dVar, ajVar);
            case 6:
                return new C3084j(map, dVar, ajVar);
            case 7:
                return new C3090p(map, dVar, ajVar);
            case 8:
                return new C3089o(map, dVar, ajVar);
            case 9:
                return new C3087m(map, dVar, ajVar);
            case 10:
                return new C3091q(map, dVar, ajVar);
            case 11:
                return new C3081g(map, dVar, ajVar);
            case 12:
                return new C3082h(map, dVar, ajVar);
            case 13:
                return new C3083i(map, dVar, ajVar);
            case 14:
                return new C3085k(map, dVar, ajVar);
            case 15:
                return new C3076d(map, dVar, ajVar);
            default:
                return null;
        }
    }
}

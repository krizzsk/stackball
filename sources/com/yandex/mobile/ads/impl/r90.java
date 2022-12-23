package com.yandex.mobile.ads.impl;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.yandex.mobile.ads.impl.q90;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.BufferedSource;

public final class r90 {

    /* renamed from: a */
    private final BufferedSource f39385a;

    /* renamed from: b */
    private long f39386b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    public r90(BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "source");
        this.f39385a = bufferedSource;
    }

    /* renamed from: a */
    public final q90 mo69705a() {
        q90.C14366a aVar = new q90.C14366a();
        while (true) {
            String readUtf8LineStrict = this.f39385a.readUtf8LineStrict(this.f39386b);
            this.f39386b -= (long) readUtf8LineStrict.length();
            if (readUtf8LineStrict.length() == 0) {
                return aVar.mo69520a();
            }
            Intrinsics.checkNotNullParameter(readUtf8LineStrict, "line");
            int indexOf$default = StringsKt.indexOf$default((CharSequence) readUtf8LineStrict, ':', 1, false, 4, (Object) null);
            if (indexOf$default != -1) {
                String substring = readUtf8LineStrict.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = readUtf8LineStrict.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                aVar.mo69519a(substring, substring2);
            } else if (readUtf8LineStrict.charAt(0) == ':') {
                String substring3 = readUtf8LineStrict.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.String).substring(startIndex)");
                aVar.mo69519a("", substring3);
            } else {
                aVar.mo69519a("", readUtf8LineStrict);
            }
        }
    }

    /* renamed from: b */
    public final String mo69706b() {
        String readUtf8LineStrict = this.f39385a.readUtf8LineStrict(this.f39386b);
        this.f39386b -= (long) readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }
}

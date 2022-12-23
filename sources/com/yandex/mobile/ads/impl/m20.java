package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class m20 {

    /* renamed from: com.yandex.mobile.ads.impl.m20$a */
    private static final class C13951a {

        /* renamed from: a */
        private final String f37166a;

        /* renamed from: b */
        private final InstreamAdBreakPosition.Type f37167b;

        /* renamed from: c */
        private final long f37168c;

        public C13951a(String str, InstreamAdBreakPosition.Type type, long j) {
            Intrinsics.checkNotNullParameter(str, "adBreakType");
            Intrinsics.checkNotNullParameter(type, "adBreakPositionType");
            this.f37166a = str;
            this.f37167b = type;
            this.f37168c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13951a)) {
                return false;
            }
            C13951a aVar = (C13951a) obj;
            return Intrinsics.areEqual((Object) this.f37166a, (Object) aVar.f37166a) && this.f37167b == aVar.f37167b && this.f37168c == aVar.f37168c;
        }

        public int hashCode() {
            return (((this.f37166a.hashCode() * 31) + this.f37167b.hashCode()) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f37168c);
        }

        public String toString() {
            return "AdBreakSignature(adBreakType=" + this.f37166a + ", adBreakPositionType=" + this.f37167b + ", adBreakPositionValue=" + this.f37168c + ')';
        }
    }

    /* renamed from: a */
    public final List<og0> mo68554a(List<? extends og0> list) {
        Intrinsics.checkNotNullParameter(list, "adBreaks");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            og0 og0 = (og0) next;
            String type = og0.getType();
            Intrinsics.checkNotNullExpressionValue(type, "it.type");
            InstreamAdBreakPosition.Type positionType = og0.getAdBreakPosition().getPositionType();
            Intrinsics.checkNotNullExpressionValue(positionType, "it.adBreakPosition.positionType");
            if (hashSet.add(new C13951a(type, positionType, og0.getAdBreakPosition().getValue()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}

package com.yandex.mobile.ads.exo.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.yandex.mobile.ads.exo.drm.C12182b;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.C12874dd;
import com.yandex.mobile.ads.impl.C13209gk;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C13957m7;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.j40;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.exo.drm.b */
public class C12182b<T extends j40> implements C12188d<T> {

    /* renamed from: b */
    private int f29583b;

    /* renamed from: c */
    private C12181a<T> f29584c;

    /* renamed from: d */
    private Looper f29585d;

    /* renamed from: e */
    volatile C12182b<T>.b f29586e;

    /* renamed from: com.yandex.mobile.ads.exo.drm.b$b */
    private class C12184b extends Handler {
        public C12184b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (((byte[]) message.obj) != null) {
                C12182b.this.getClass();
                throw null;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.b$c */
    public static final class C12185c extends Exception {
        private C12185c(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: a */
    private C12181a<T> m31756a(List<DrmInitData.SchemeData> list, boolean z) {
        throw null;
    }

    /* renamed from: b */
    public final void mo64855b() {
        int i = this.f29583b;
        this.f29583b = i + 1;
        if (i == 0) {
            C13479j9.m37708b(true);
            throw null;
        }
    }

    public final void release() {
        int i = this.f29583b - 1;
        this.f29583b = i;
        if (i == 0) {
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo64852a(Handler handler, C13209gk gkVar) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo64853a(DrmInitData drmInitData) {
        if (((ArrayList) m31757a(drmInitData, (UUID) null, true)).isEmpty()) {
            if (drmInitData.f29577e != 1 || !drmInitData.mo64832a(0).mo64839a(C12874dd.f32536b)) {
                return false;
            }
            Log.w("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + null);
        }
        String str = drmInitData.f29576d;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if (("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) && ih1.f34858a < 25) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Class<T> mo64854b(DrmInitData drmInitData) {
        if (!mo64853a(drmInitData)) {
            return null;
        }
        throw null;
    }

    /* renamed from: a */
    public C12186c<T> mo64850a(Looper looper, int i) {
        Looper looper2 = this.f29585d;
        C13479j9.m37708b(looper2 == null || looper2 == looper);
        this.f29585d = looper;
        throw null;
    }

    /* renamed from: a */
    public C12186c<T> mo64851a(Looper looper, DrmInitData drmInitData) {
        Looper looper2 = this.f29585d;
        C13479j9.m37708b(looper2 == null || looper2 == looper);
        this.f29585d = looper;
        if (this.f29586e == null) {
            this.f29586e = new C12184b(looper);
        }
        List<DrmInitData.SchemeData> a = m31757a(drmInitData, (UUID) null, false);
        if (!((ArrayList) a).isEmpty()) {
            C12181a<T> aVar = this.f29584c;
            if (aVar != null) {
                aVar.mo64849e();
                return aVar;
            }
            this.f29584c = m31756a(a, false);
            throw null;
        }
        new a40.C12354a() {
            /* renamed from: a */
            public final void mo64831a(Object obj) {
                ((C13957m7) ((C13209gk) obj)).mo68589a((Exception) C12182b.C12185c.this);
            }
        };
        throw null;
    }

    /* renamed from: a */
    private static List<DrmInitData.SchemeData> m31757a(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f29577e);
        for (int i = 0; i < drmInitData.f29577e; i++) {
            DrmInitData.SchemeData a = drmInitData.mo64832a(i);
            if ((a.mo64839a((UUID) null) || (C12874dd.f32537c.equals((Object) null) && a.mo64839a(C12874dd.f32536b))) && (a.f29582f != null || z)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}

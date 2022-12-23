package com.inmobi.media;

import android.media.MediaMetadataRetriever;

/* renamed from: com.inmobi.media.bo */
/* compiled from: NativeTimer */
public final class C5024bo {

    /* renamed from: a */
    public C5025a f11441a;

    /* renamed from: b */
    public C5025a f11442b;

    public C5024bo(C5025a aVar, C5025a aVar2) {
        this.f11441a = aVar;
        this.f11442b = aVar2;
    }

    /* renamed from: com.inmobi.media.bo$a */
    /* compiled from: NativeTimer */
    public static class C5025a {

        /* renamed from: a */
        private long f11443a;

        /* renamed from: b */
        private long f11444b;

        /* renamed from: c */
        private String f11445c;

        /* renamed from: d */
        private C5016bj f11446d;

        public C5025a(long j, long j2, String str, C5016bj bjVar) {
            this.f11443a = j;
            this.f11444b = j2;
            this.f11445c = str;
            this.f11446d = bjVar;
        }

        /* renamed from: a */
        public final long mo40191a() {
            String b;
            long j = this.f11443a;
            C5010bf b2 = this.f11446d.mo40182b(this.f11445c);
            if ((b2 instanceof C5031bs) && (b = ((C5031bs) b2).mo40205b().mo40359b()) != null) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(b);
                j = (long) (((double) j) + (((((double) this.f11444b) * 1.0d) / 100.0d) * ((double) (((long) Integer.valueOf(mediaMetadataRetriever.extractMetadata(9)).intValue()) / 1000))));
                mediaMetadataRetriever.release();
            }
            if (j >= 0) {
                return j;
            }
            return 0;
        }
    }
}

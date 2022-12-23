package com.yandex.mobile.ads.impl;

import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import com.yandex.mobile.ads.exo.metadata.flac.VorbisComment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class k70 {

    /* renamed from: a */
    public final int f35999a;

    /* renamed from: b */
    public final int f36000b;

    /* renamed from: c */
    public final int f36001c;

    /* renamed from: d */
    public final int f36002d;

    /* renamed from: e */
    public final int f36003e;

    /* renamed from: f */
    public final int f36004f;

    /* renamed from: g */
    public final int f36005g;

    /* renamed from: h */
    public final int f36006h;

    /* renamed from: i */
    public final int f36007i;

    /* renamed from: j */
    public final long f36008j;

    /* renamed from: k */
    public final C13688a f36009k;

    /* renamed from: l */
    private final Metadata f36010l;

    /* renamed from: com.yandex.mobile.ads.impl.k70$a */
    public static class C13688a {

        /* renamed from: a */
        public final long[] f36011a;

        /* renamed from: b */
        public final long[] f36012b;

        public C13688a(long[] jArr, long[] jArr2) {
            this.f36011a = jArr;
            this.f36012b = jArr2;
        }
    }

    public k70(byte[] bArr, int i) {
        ey0 ey0 = new ey0(bArr);
        ey0.mo66895c(i * 8);
        this.f35999a = ey0.mo66886a(16);
        this.f36000b = ey0.mo66886a(16);
        this.f36001c = ey0.mo66886a(24);
        this.f36002d = ey0.mo66886a(24);
        int a = ey0.mo66886a(20);
        this.f36003e = a;
        this.f36004f = m38223b(a);
        this.f36005g = ey0.mo66886a(3) + 1;
        int a2 = ey0.mo66886a(5) + 1;
        this.f36006h = a2;
        this.f36007i = m38221a(a2);
        this.f36008j = ey0.mo66892b(36);
        this.f36009k = null;
        this.f36010l = null;
    }

    /* renamed from: a */
    private static int m38221a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: b */
    private static int m38223b(int i) {
        switch (i) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public long mo68148a(long j) {
        int i = ih1.f34858a;
        return Math.max(0, Math.min((j * ((long) this.f36003e)) / 1000000, this.f36008j - 1));
    }

    /* renamed from: b */
    public long mo68153b() {
        long j = this.f36008j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f36003e);
    }

    /* renamed from: b */
    public k70 mo68154b(List<String> list) {
        return new k70(this.f35999a, this.f36000b, this.f36001c, this.f36002d, this.f36003e, this.f36005g, this.f36006h, this.f36008j, this.f36009k, mo68150a(m38222a(list, (List<PictureFrame>) Collections.emptyList())));
    }

    /* renamed from: a */
    public long mo68147a() {
        long j;
        long j2;
        int i = this.f36002d;
        if (i > 0) {
            j = (((long) i) + ((long) this.f36001c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f35999a;
            j = ((((i2 != this.f36000b || i2 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : (long) i2) * ((long) this.f36005g)) * ((long) this.f36006h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    /* renamed from: a */
    public Format mo68149a(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f36002d;
        int i2 = i > 0 ? i : -1;
        Metadata metadata2 = this.f36010l;
        Metadata a = metadata2 == null ? metadata : metadata2.mo64995a(metadata);
        int i3 = this.f36006h;
        int i4 = this.f36003e;
        int i5 = this.f36005g;
        return Format.m31682a((String) null, "audio/flac", (String) null, i3 * i4 * i5, i2, i5, i4, -1, 0, 0, (List<byte[]>) Collections.singletonList(bArr), (DrmInitData) null, 0, (String) null, a);
    }

    private k70(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C13688a aVar, Metadata metadata) {
        this.f35999a = i;
        this.f36000b = i2;
        this.f36001c = i3;
        this.f36002d = i4;
        this.f36003e = i5;
        this.f36004f = m38223b(i5);
        this.f36005g = i6;
        this.f36006h = i7;
        this.f36007i = m38221a(i7);
        this.f36008j = j;
        this.f36009k = aVar;
        this.f36010l = metadata;
    }

    /* renamed from: a */
    public Metadata mo68150a(Metadata metadata) {
        Metadata metadata2 = this.f36010l;
        return metadata2 == null ? metadata : metadata2.mo64995a(metadata);
    }

    /* renamed from: a */
    public k70 mo68151a(C13688a aVar) {
        return new k70(this.f35999a, this.f36000b, this.f36001c, this.f36002d, this.f36003e, this.f36005g, this.f36006h, this.f36008j, aVar, this.f36010l);
    }

    /* renamed from: a */
    public k70 mo68152a(List<PictureFrame> list) {
        return new k70(this.f35999a, this.f36000b, this.f36001c, this.f36002d, this.f36003e, this.f36005g, this.f36006h, this.f36008j, this.f36009k, mo68150a(m38222a((List<String>) Collections.emptyList(), list)));
    }

    /* renamed from: a */
    private static Metadata m38222a(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int i2 = ih1.f34858a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                Log.w("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new VorbisComment(split[0], split[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }
}

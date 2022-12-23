package com.yandex.mobile.ads.impl;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.IOException;

final class da1 {

    /* renamed from: a */
    private final fy0 f32506a = new fy0(8);

    /* renamed from: b */
    private int f32507b;

    /* renamed from: a */
    private long m35161a(C13416ik ikVar) throws IOException, InterruptedException {
        int i = 0;
        ikVar.mo67806a(this.f32506a.f33778a, 0, 1, false);
        byte b = this.f32506a.f33778a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        ikVar.mo67806a(this.f32506a.f33778a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f32506a.f33778a[i] & 255) + (i4 << 8);
        }
        this.f32507b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: b */
    public boolean mo66540b(C13416ik ikVar) throws IOException, InterruptedException {
        long a;
        int i;
        long a2 = ikVar.mo67804a();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        int i2 = (a2 > -1 ? 1 : (a2 == -1 ? 0 : -1));
        if (i2 != 0 && a2 <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = a2;
        }
        int i3 = (int) j;
        ikVar.mo67806a(this.f32506a.f33778a, 0, 4, false);
        long t = this.f32506a.mo67128t();
        this.f32507b = 4;
        while (t != 440786851) {
            int i4 = this.f32507b + 1;
            this.f32507b = i4;
            if (i4 == i3) {
                return false;
            }
            ikVar.mo67806a(this.f32506a.f33778a, 0, 1, false);
            t = ((t << 8) & -256) | ((long) (this.f32506a.f33778a[0] & 255));
        }
        long a3 = m35161a(ikVar);
        long j2 = (long) this.f32507b;
        if (a3 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + a3 >= a2) {
            return false;
        }
        while (true) {
            int i5 = (((long) this.f32507b) > (j2 + a3) ? 1 : (((long) this.f32507b) == (j2 + a3) ? 0 : -1));
            if (i5 < 0) {
                if (m35161a(ikVar) != Long.MIN_VALUE && a >= 0 && a <= 2147483647L) {
                    if (i != 0) {
                        int a4 = (int) (a = m35161a(ikVar));
                        ikVar.mo67805a(a4, false);
                        this.f32507b += a4;
                    }
                }
            } else if (i5 == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

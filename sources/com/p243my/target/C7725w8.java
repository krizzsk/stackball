package com.p243my.target;

import android.content.Context;

/* renamed from: com.my.target.w8 */
public class C7725w8 {

    /* renamed from: a */
    public static int f19572a;

    static {
        if (C7566n8.m19950a()) {
            f19572a |= 2;
        }
        if (m20767b()) {
            f19572a |= 1;
        }
    }

    /* renamed from: a */
    public static int m20762a() {
        return f19572a;
    }

    /* renamed from: a */
    public static void m20764a(boolean z) {
        f19572a = z ? f19572a | 16 : f19572a & -17;
    }

    /* renamed from: b */
    public static void m20765b(Context context) {
        C7395f0.m19088b(new Runnable(context) {
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C7695u8.m20613a(this.f$0).mo51691a(C7725w8.f19572a);
            }
        });
    }

    /* renamed from: b */
    public static void m20766b(boolean z) {
        f19572a = z ? f19572a | 32 : f19572a & -33;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        java.lang.Runtime.getRuntime().loadLibrary("unity");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20767b() {
        /*
            r0 = 1
            java.lang.String r1 = "com.unity3d.player.UnityPlayerActivity"
            java.lang.Class.forName(r1)     // Catch:{ all -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0011 }
            java.lang.String r2 = "unity"
            r1.loadLibrary(r2)     // Catch:{ all -> 0x0011 }
            return r0
        L_0x0011:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7725w8.m20767b():boolean");
    }

    /* renamed from: c */
    public static void m20768c() {
        f19572a |= 8;
    }

    /* renamed from: d */
    public static void m20769d() {
        f19572a |= 4;
    }

    /* renamed from: e */
    public static void m20770e() {
        f19572a |= 64;
    }

    /* renamed from: f */
    public static void m20771f() {
        f19572a |= 128;
    }

    /* renamed from: g */
    public static void m20772g() {
        f19572a &= -3;
    }
}

package com.fyber.inneractive.sdk.player.p059c.p060a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.c */
public interface C3192c {

    /* renamed from: a */
    public static final ByteBuffer f7942a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: a */
    void mo18900a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo18901a();

    /* renamed from: a */
    boolean mo18902a(int i, int i2, int i3) throws C3193a;

    /* renamed from: b */
    int mo18903b();

    /* renamed from: c */
    int mo18904c();

    /* renamed from: d */
    void mo18905d();

    /* renamed from: e */
    ByteBuffer mo18906e();

    /* renamed from: f */
    boolean mo18907f();

    /* renamed from: g */
    void mo18908g();

    /* renamed from: h */
    void mo18909h();

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.c$a */
    public static final class C3193a extends Exception {
        public C3193a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }
}

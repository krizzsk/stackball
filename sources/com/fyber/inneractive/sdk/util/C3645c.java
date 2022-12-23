package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.fyber.inneractive.sdk.util.c */
public final class C3645c {

    /* renamed from: a */
    private static C3645c f9927a = new C3645c();

    /* renamed from: b */
    private Queue<ByteBuffer> f9928b = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public static C3645c m9069a() {
        return f9927a;
    }

    private C3645c() {
        for (int i = 0; i < 2; i++) {
            this.f9928b.offer(ByteBuffer.allocateDirect(16384));
        }
    }

    /* renamed from: b */
    public final ByteBuffer mo19569b() {
        ByteBuffer poll = this.f9928b.poll();
        return poll == null ? ByteBuffer.allocateDirect(16384) : poll;
    }

    /* renamed from: a */
    public final void mo19568a(ByteBuffer byteBuffer) {
        this.f9928b.offer(byteBuffer);
    }

    /* renamed from: b */
    public static byte[] m9070b(ByteBuffer byteBuffer) {
        return (byteBuffer == null || !byteBuffer.hasArray()) ? new byte[8192] : byteBuffer.array();
    }
}

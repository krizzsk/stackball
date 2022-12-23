package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.aw */
public class C2372aw {

    /* renamed from: m */
    private static final String f5464m = C2372aw.class.getName();

    /* renamed from: a */
    public int f5465a;

    /* renamed from: b */
    public long f5466b;

    /* renamed from: c */
    public long f5467c;

    /* renamed from: d */
    public boolean f5468d;

    /* renamed from: e */
    public int f5469e;

    /* renamed from: f */
    public C2376ax f5470f;

    /* renamed from: g */
    public String f5471g;

    /* renamed from: h */
    public int f5472h;

    /* renamed from: i */
    public long f5473i;

    /* renamed from: j */
    public boolean f5474j;

    /* renamed from: k */
    public long f5475k = 0;

    /* renamed from: l */
    public C2368av f5476l;

    public C2372aw(C2368av avVar, long j, long j2, int i) {
        this.f5476l = avVar;
        this.f5466b = j;
        this.f5467c = j2;
        this.f5465a = i;
        this.f5469e = 0;
        this.f5470f = C2376ax.PENDING_COMPLETION;
    }

    /* renamed from: a */
    public final void mo17585a() {
        this.f5476l.f5453f.add(this);
        if (this.f5468d) {
            this.f5476l.f5460m = true;
        }
    }

    /* renamed from: com.flurry.sdk.aw$a */
    public static class C2373a implements C2587dw<C2372aw> {
        /* renamed from: a */
        public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
            C2372aw awVar = (C2372aw) obj;
            if (outputStream != null && awVar != null) {
                C23741 r0 = new DataOutputStream(outputStream) {
                    public final void close() {
                    }
                };
                r0.writeInt(awVar.f5465a);
                r0.writeLong(awVar.f5466b);
                r0.writeLong(awVar.f5467c);
                r0.writeBoolean(awVar.f5468d);
                r0.writeInt(awVar.f5469e);
                r0.writeInt(awVar.f5470f.f5484e);
                if (awVar.f5471g != null) {
                    r0.writeUTF(awVar.f5471g);
                } else {
                    r0.writeUTF("");
                }
                r0.writeInt(awVar.f5472h);
                r0.writeLong(awVar.f5473i);
                r0.writeBoolean(awVar.f5474j);
                r0.writeLong(awVar.f5475k);
                r0.flush();
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
            InputStream inputStream2 = inputStream;
            if (inputStream2 == null) {
                return null;
            }
            C23752 r1 = new DataInputStream(inputStream2) {
                public final void close() {
                }
            };
            int readInt = r1.readInt();
            long readLong = r1.readLong();
            long readLong2 = r1.readLong();
            boolean readBoolean = r1.readBoolean();
            int readInt2 = r1.readInt();
            C2376ax a = C2376ax.m5092a(r1.readInt());
            String readUTF = r1.readUTF();
            int readInt3 = r1.readInt();
            long readLong3 = r1.readLong();
            C2372aw awVar = new C2372aw((C2368av) null, readLong, readLong2, readInt);
            awVar.f5468d = readBoolean;
            awVar.f5469e = readInt2;
            awVar.f5470f = a;
            awVar.f5471g = readUTF;
            awVar.f5472h = readInt3;
            awVar.f5473i = readLong3;
            awVar.f5474j = r1.readBoolean();
            awVar.f5475k = r1.readLong();
            return awVar;
        }
    }
}

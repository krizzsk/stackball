package com.yandex.mobile.ads.exo.metadata.emsg;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.exo.metadata.emsg.a */
public final class C12232a {

    /* renamed from: a */
    private final ByteArrayOutputStream f29880a;

    /* renamed from: b */
    private final DataOutputStream f29881b;

    public C12232a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f29880a = byteArrayOutputStream;
        this.f29881b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: a */
    public byte[] mo65016a(EventMessage eventMessage) {
        this.f29880a.reset();
        try {
            DataOutputStream dataOutputStream = this.f29881b;
            dataOutputStream.writeBytes(eventMessage.f29874b);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f29875c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f29881b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            m32047a(this.f29881b, eventMessage.f29876d);
            m32047a(this.f29881b, eventMessage.f29877e);
            this.f29881b.write(eventMessage.f29878f);
            this.f29881b.flush();
            return this.f29880a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m32047a(DataOutputStream dataOutputStream, long j) throws IOException {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }
}

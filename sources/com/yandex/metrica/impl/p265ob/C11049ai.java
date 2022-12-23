package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ai */
public abstract class C11049ai {

    /* renamed from: a */
    final Socket f26534a;

    /* renamed from: b */
    final C11288gi f26535b;

    /* renamed from: c */
    final C10226Ei f26536c;

    /* renamed from: d */
    final Uri f26537d;

    /* renamed from: e */
    final C11320hi f26538e;

    C11049ai(Socket socket, Uri uri, C11288gi giVar, C10226Ei ei, C11320hi hiVar) {
        this.f26534a = socket;
        this.f26537d = uri;
        this.f26535b = giVar;
        this.f26536c = ei;
        this.f26538e = hiVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo61985a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62650a(String str, Map<String, String> map, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        this.f26538e.mo63017b();
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(this.f26534a.getOutputStream());
            try {
                bufferedOutputStream.write(str.getBytes());
                m28500a(bufferedOutputStream);
                for (Map.Entry next : map.entrySet()) {
                    m28501a((OutputStream) bufferedOutputStream, (String) next.getKey(), (String) next.getValue());
                }
                m28500a(bufferedOutputStream);
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                this.f26538e.mo63018c();
                ((C11390ji) this.f26535b).mo63117b(this.f26534a.getLocalPort(), this.f26538e);
            } catch (IOException e) {
                e = e;
                bufferedOutputStream2 = bufferedOutputStream;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream2 = bufferedOutputStream;
                C10796U2.m27888a((Closeable) bufferedOutputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            try {
                ((C11390ji) this.f26535b).mo63114a("io_exception_during_sync", (Throwable) e);
                bufferedOutputStream = bufferedOutputStream2;
                C10796U2.m27888a((Closeable) bufferedOutputStream);
            } catch (Throwable th2) {
                th = th2;
                C10796U2.m27888a((Closeable) bufferedOutputStream2);
                throw th;
            }
        }
        C10796U2.m27888a((Closeable) bufferedOutputStream);
    }

    /* renamed from: a */
    private void m28501a(OutputStream outputStream, String str, String str2) throws IOException {
        outputStream.write((str + ": " + str2).getBytes());
        m28500a(outputStream);
    }

    /* renamed from: a */
    private void m28500a(OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes());
    }
}

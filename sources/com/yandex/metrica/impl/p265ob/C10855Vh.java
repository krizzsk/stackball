package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11246fi;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* renamed from: com.yandex.metrica.impl.ob.Vh */
class C10855Vh implements C11246fi {

    /* renamed from: a */
    private final File f26091a;

    C10855Vh(File file) {
        this.f26091a = file;
    }

    /* renamed from: a */
    public ServerSocket mo62149a(int i) throws IOException, C11246fi.C11247a {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            KeyStore instance3 = KeyStore.getInstance("PKCS12");
            instance3.load(new FileInputStream(this.f26091a), "`0l}%01ny{jl~;|&".toCharArray());
            instance2.init(instance3, "`0l}%01ny{jl~;|&".toCharArray());
            instance.init(instance2.getKeyManagers(), (TrustManager[]) null, (SecureRandom) null);
            return instance.getServerSocketFactory().createServerSocket(i);
        } catch (Exception e) {
            throw new C11246fi.C11247a("https_open_error", e);
        }
    }
}

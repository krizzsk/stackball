package com.yandex.mobile.ads.impl;

import java.net.InetSocketAddress;
import java.net.Socket;

/* renamed from: com.yandex.mobile.ads.impl.kk */
public class C13714kk {
    /* renamed from: a */
    public boolean mo68246a(String str) {
        Socket socket;
        try {
            socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, 80), 5000);
                boolean isConnected = socket.isConnected();
                m38372a(socket);
                return isConnected;
            } catch (Throwable unused) {
                m38372a(socket);
                return false;
            }
        } catch (Throwable unused2) {
            socket = null;
            m38372a(socket);
            return false;
        }
    }

    /* renamed from: a */
    private void m38372a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }
}

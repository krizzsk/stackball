package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

public final class hg1 extends C13966mb {

    /* renamed from: e */
    private final int f34411e;

    /* renamed from: f */
    private final byte[] f34412f;

    /* renamed from: g */
    private final DatagramPacket f34413g;

    /* renamed from: h */
    private Uri f34414h;

    /* renamed from: i */
    private DatagramSocket f34415i;

    /* renamed from: j */
    private MulticastSocket f34416j;

    /* renamed from: k */
    private InetAddress f34417k;

    /* renamed from: l */
    private InetSocketAddress f34418l;

    /* renamed from: m */
    private boolean f34419m;

    /* renamed from: n */
    private int f34420n;

    /* renamed from: com.yandex.mobile.ads.impl.hg1$a */
    public static final class C13321a extends IOException {
        public C13321a(IOException iOException) {
            super(iOException);
        }
    }

    public hg1(int i, int i2) {
        super(true);
        this.f34411e = i2;
        byte[] bArr = new byte[i];
        this.f34412f = bArr;
        this.f34413g = new DatagramPacket(bArr, 0, i);
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws C13321a {
        Uri uri = jjVar.f35322a;
        this.f34414h = uri;
        String host = uri.getHost();
        int port = this.f34414h.getPort();
        mo68635b(jjVar);
        try {
            this.f34417k = InetAddress.getByName(host);
            this.f34418l = new InetSocketAddress(this.f34417k, port);
            if (this.f34417k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f34418l);
                this.f34416j = multicastSocket;
                multicastSocket.joinGroup(this.f34417k);
                this.f34415i = this.f34416j;
            } else {
                this.f34415i = new DatagramSocket(this.f34418l);
            }
            try {
                this.f34415i.setSoTimeout(this.f34411e);
                this.f34419m = true;
                mo68637c(jjVar);
                return -1;
            } catch (SocketException e) {
                throw new C13321a(e);
            }
        } catch (IOException e2) {
            throw new C13321a(e2);
        }
    }

    public void close() {
        this.f34414h = null;
        MulticastSocket multicastSocket = this.f34416j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f34417k);
            } catch (IOException unused) {
            }
            this.f34416j = null;
        }
        DatagramSocket datagramSocket = this.f34415i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f34415i = null;
        }
        this.f34417k = null;
        this.f34418l = null;
        this.f34420n = 0;
        if (this.f34419m) {
            this.f34419m = false;
            mo68636c();
        }
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws C13321a {
        if (i2 == 0) {
            return 0;
        }
        if (this.f34420n == 0) {
            try {
                this.f34415i.receive(this.f34413g);
                int length = this.f34413g.getLength();
                this.f34420n = length;
                mo68634a(length);
            } catch (IOException e) {
                throw new C13321a(e);
            }
        }
        int length2 = this.f34413g.getLength();
        int i3 = this.f34420n;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f34412f, length2 - i3, bArr, i, min);
        this.f34420n -= min;
        return min;
    }

    /* renamed from: a */
    public Uri mo65276a() {
        return this.f34414h;
    }
}

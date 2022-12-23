package com.smaato.sdk.dns;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Singleton;

@Singleton
public class DnsLookupImpl implements DnsLookup {
    private static final String[] SERVERS = {"8.8.8.8", "[2001:4860:4860::8888]"};
    private final AtomicInteger sequence = new AtomicInteger();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
        r11.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.smaato.sdk.dns.TxtRecord> blockingTxt(java.lang.String r11) throws java.io.IOException {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0090
            java.lang.String[] r0 = SERVERS
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r3 >= r1) goto L_0x008b
            r4 = r0[r3]
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r4)
            com.smaato.sdk.dns.QType r5 = com.smaato.sdk.dns.QType.TXT
            com.smaato.sdk.dns.QClass r6 = com.smaato.sdk.dns.QClass.f21799IN
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream
            r7.<init>()
            java.io.DataOutputStream r8 = new java.io.DataOutputStream
            r8.<init>(r7)
            java.util.concurrent.atomic.AtomicInteger r9 = r10.sequence
            int r9 = r9.incrementAndGet()
            r8.writeShort(r9)
            r9 = 384(0x180, float:5.38E-43)
            r8.writeShort(r9)
            r9 = 1
            r8.writeShort(r9)
            r8.writeShort(r2)
            r8.writeShort(r2)
            r8.writeShort(r2)
            writeQuestion(r8, r11, r5, r6)
            r8.flush()
            byte[] r5 = r7.toByteArray()
            java.net.DatagramPacket r6 = new java.net.DatagramPacket
            int r7 = r5.length
            r8 = 53
            r6.<init>(r5, r7, r4, r8)
            java.net.DatagramSocket r4 = new java.net.DatagramSocket
            r4.<init>()
            r4.send(r6)     // Catch:{ all -> 0x007f }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ all -> 0x007f }
            r6 = 256(0x100, float:3.59E-43)
            byte[] r7 = new byte[r6]     // Catch:{ all -> 0x007f }
            r5.<init>(r7, r6)     // Catch:{ all -> 0x007f }
            r4.receive(r5)     // Catch:{ all -> 0x007f }
            r4.close()
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ Exception -> 0x007c }
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x007c }
            byte[] r7 = r5.getData()     // Catch:{ Exception -> 0x007c }
            int r8 = r5.getOffset()     // Catch:{ Exception -> 0x007c }
            int r5 = r5.getLength()     // Catch:{ Exception -> 0x007c }
            r6.<init>(r7, r8, r5)     // Catch:{ Exception -> 0x007c }
            r4.<init>(r6)     // Catch:{ Exception -> 0x007c }
            java.util.List r11 = readTxtPacket(r4)     // Catch:{ Exception -> 0x007c }
            return r11
        L_0x007c:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x007f:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r1 = move-exception
            r11.addSuppressed(r1)
        L_0x008a:
            throw r0
        L_0x008b:
            java.util.List r11 = java.util.Collections.emptyList()
            return r11
        L_0x0090:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "'endpoint' specified as non-null is null"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.dns.DnsLookupImpl.blockingTxt(java.lang.String):java.util.List");
    }

    private static void writeQuestion(DataOutputStream dataOutputStream, String str, QType qType, QClass qClass) throws IOException {
        for (String bytes : str.split("\\.")) {
            byte[] bytes2 = bytes.getBytes("US-ASCII");
            dataOutputStream.writeByte(bytes2.length);
            dataOutputStream.write(bytes2);
        }
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(qType.value);
        dataOutputStream.writeShort(qClass.value);
    }

    private static List<TxtRecord> readTxtPacket(DataInputStream dataInputStream) throws IOException {
        int[] iArr = {dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort()};
        for (int i = 0; i < iArr[2]; i++) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                if (readUnsignedByte <= 0) {
                    break;
                }
                byte[] bArr = new byte[readUnsignedByte];
                dataInputStream.readFully(bArr);
                arrayList.add(new String(bArr));
            }
            dataInputStream.readShort();
            dataInputStream.readShort();
        }
        ArrayList arrayList2 = new ArrayList(iArr[3]);
        for (int i2 = 0; i2 < iArr[3]; i2++) {
            dataInputStream.readShort();
            dataInputStream.readShort();
            dataInputStream.readShort();
            int readInt = dataInputStream.readInt();
            byte[] bArr2 = new byte[dataInputStream.readUnsignedShort()];
            dataInputStream.readFully(bArr2);
            arrayList2.add(TxtRecord.create(new String(bArr2), readInt));
        }
        return arrayList2;
    }
}

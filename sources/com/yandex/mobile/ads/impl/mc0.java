package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.C3716C;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class mc0 implements nn0 {

    /* renamed from: c */
    private static final Pattern f37303c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    private final CharsetDecoder f37304a = Charset.forName("UTF-8").newDecoder();

    /* renamed from: b */
    private final CharsetDecoder f37305b = Charset.forName(C3716C.ISO88591_NAME).newDecoder();

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public Metadata mo65103a(pn0 pn0) {
        String str;
        ByteBuffer byteBuffer = pn0.f39147d;
        byteBuffer.getClass();
        String str2 = null;
        try {
            str = this.f37304a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.f37305b.decode(byteBuffer).toString();
                this.f37305b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f37305b.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.f37305b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f37304a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(bArr, (String) null, (String) null));
        }
        Matcher matcher = f37303c.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String e = ih1.m37399e(matcher.group(1));
            String group = matcher.group(2);
            e.getClass();
            if (e.equals("streamurl")) {
                str3 = group;
            } else if (e.equals("streamtitle")) {
                str2 = group;
            }
        }
        return new Metadata(new IcyInfo(bArr, str2, str3));
    }
}

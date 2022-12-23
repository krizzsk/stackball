package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.P */
public class C10618P {

    /* renamed from: a */
    private final Context f25360a;

    /* renamed from: b */
    private final C10306G9 f25361b;

    /* renamed from: c */
    private final String f25362c;

    /* renamed from: d */
    private final C10898Wn f25363d;

    public C10618P(Context context, C10306G9 g9) {
        this(context, g9, context.getPackageName(), new C10898Wn());
    }

    /* renamed from: a */
    public List<String> mo61871a() {
        Signature[] signatureArr;
        String str;
        List<String> g = this.f25361b.mo61368g();
        boolean isEmpty = g.isEmpty();
        ArrayList arrayList = g;
        if (isEmpty) {
            ArrayList arrayList2 = new ArrayList();
            try {
                if (C10796U2.m27890a(28)) {
                    SigningInfo signingInfo = this.f25363d.mo62462b(this.f25360a, this.f25362c, 134217728).signingInfo;
                    if (signingInfo.hasMultipleSigners()) {
                        signatureArr = signingInfo.getApkContentsSigners();
                    } else {
                        signatureArr = signingInfo.getSigningCertificateHistory();
                    }
                } else {
                    signatureArr = this.f25363d.mo62462b(this.f25360a, this.f25362c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature byteArray : signatureArr) {
                        try {
                            str = C10585O2.m27104a(MessageDigest.getInstance("SHA1").digest(byteArray.toByteArray())).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList2);
            boolean isEmpty2 = arrayList2.isEmpty();
            arrayList = arrayList2;
            if (!isEmpty2) {
                this.f25361b.mo61358a((List<String>) arrayList2).mo61454c();
                arrayList = arrayList2;
            }
        }
        return arrayList;
    }

    C10618P(Context context, C10306G9 g9, String str, C10898Wn wn) {
        this.f25360a = context;
        this.f25361b = g9;
        this.f25362c = str;
        this.f25363d = wn;
    }
}

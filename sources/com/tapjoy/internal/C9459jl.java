package com.tapjoy.internal;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;

/* renamed from: com.tapjoy.internal.jl */
public final class C9459jl {

    /* renamed from: a */
    final String f23547a;

    /* renamed from: b */
    final CharSequence f23548b;

    /* renamed from: c */
    final CharSequence[] f23549c;

    /* renamed from: d */
    final boolean f23550d;

    /* renamed from: e */
    final Bundle f23551e;

    /* renamed from: f */
    final Set f23552f;

    /* renamed from: a */
    static RemoteInput[] m25443a(C9459jl[] jlVarArr) {
        if (jlVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[jlVarArr.length];
        for (int i = 0; i < jlVarArr.length; i++) {
            C9459jl jlVar = jlVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(jlVar.f23547a).setLabel(jlVar.f23548b).setChoices(jlVar.f23549c).setAllowFreeFormInput(jlVar.f23550d).addExtras(jlVar.f23551e).build();
        }
        return remoteInputArr;
    }
}

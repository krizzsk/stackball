package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p271io.FilesKt;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.J8 */
public abstract class C10396J8 {

    /* renamed from: a */
    private JSONObject f24970a;

    /* renamed from: b */
    private final Context f24971b;

    /* renamed from: c */
    private final String f24972c;

    /* renamed from: d */
    private final C10442L0 f24973d;

    /* renamed from: com.yandex.metrica.impl.ob.J8$a */
    static final class C10397a extends Lambda implements Function1<String, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C10396J8 f24974a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10397a(C10396J8 j8) {
            super(1);
            this.f24974a = j8;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(!this.f24974a.mo61428a().contains((String) obj));
        }
    }

    public C10396J8(Context context, String str, C10442L0 l0) {
        this.f24971b = context;
        this.f24972c = str;
        this.f24973d = l0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Set<String> mo61428a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo61603a(JSONObject jSONObject) {
        try {
            File a = this.f24973d.mo61697a(this.f24971b, this.f24972c);
            if (a != null) {
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "contents.toString()");
                FilesKt.writeText$default(a, jSONObject2, (Charset) null, 2, (Object) null);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized org.json.JSONObject mo61604b() {
        /*
            r4 = this;
            monitor-enter(r4)
            org.json.JSONObject r0 = r4.f24970a     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x0058
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            com.yandex.metrica.impl.ob.L0 r1 = r4.f24973d     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            android.content.Context r2 = r4.f24971b     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            java.lang.String r3 = r4.f24972c     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            java.io.File r1 = r1.mo61697a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            if (r1 == 0) goto L_0x001c
            r2 = 1
            r3 = 0
            java.lang.String r1 = kotlin.p271io.FilesKt.readText$default(r1, r3, r2, r3)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            if (r1 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "{}"
        L_0x001e:
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            java.util.Iterator r1 = r0.keys()     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            java.lang.String r2 = "json.keys()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.asSequence(r1)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            com.yandex.metrica.impl.ob.J8$a r2 = new com.yandex.metrica.impl.ob.J8$a     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filter(r1, r2)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
        L_0x003b:
            boolean r2 = r1.hasNext()     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            if (r2 == 0) goto L_0x0056
            java.lang.Object r2 = r1.next()     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            r0.remove(r2)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004b }
            goto L_0x003b
        L_0x004b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0063 }
            r0.<init>()     // Catch:{ all -> 0x0063 }
            goto L_0x0056
        L_0x0051:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0063 }
            r0.<init>()     // Catch:{ all -> 0x0063 }
        L_0x0056:
            r4.f24970a = r0     // Catch:{ all -> 0x0063 }
        L_0x0058:
            org.json.JSONObject r0 = r4.f24970a     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x0061
            java.lang.String r1 = "fileContents"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r4)
            return r0
        L_0x0063:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10396J8.mo61604b():org.json.JSONObject");
    }
}

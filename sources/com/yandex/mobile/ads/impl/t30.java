package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.model.ReportDBAdapter;
import com.yandex.mobile.ads.impl.u30;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

public final class t30 {

    /* renamed from: a */
    private final q30 f40220a;

    /* renamed from: b */
    private final Set<Function1<x30, Unit>> f40221b = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Throwable> f40222c = new ArrayList();

    /* renamed from: d */
    private C15055wl f40223d;

    /* renamed from: e */
    private final Function1<List<? extends Throwable>, Unit> f40224e = new C14651a(this);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public x30 f40225f = new x30(false, 0, (String) null, 7);

    /* renamed from: com.yandex.mobile.ads.impl.t30$a */
    static final class C14651a extends Lambda implements Function1<List<? extends Throwable>, Unit> {

        /* renamed from: b */
        final /* synthetic */ t30 f40226b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14651a(t30 t30) {
            super(1);
            this.f40226b = t30;
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, ReportDBAdapter.ReportColumns.COLUMN_ERRORS);
            List a = this.f40226b.f40222c;
            a.clear();
            a.addAll(CollectionsKt.reversed(list));
            t30 t30 = this.f40226b;
            t30.m42242a(x30.m43937a(t30.f40225f, false, this.f40226b.f40222c.size(), Intrinsics.stringPlus("Last 25 errors:\n", CollectionsKt.joinToString$default(CollectionsKt.take(this.f40226b.f40222c, 25), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, s30.f39827b, 30, (Object) null)), 1));
            return Unit.INSTANCE;
        }
    }

    public t30(q30 q30) {
        Intrinsics.checkNotNullParameter(q30, "errorCollectors");
        this.f40220a = q30;
    }

    /* renamed from: c */
    public final void mo70123c() {
        m42242a(x30.m43937a(this.f40225f, true, 0, (String) null, 6));
    }

    /* renamed from: b */
    public final void mo70122b() {
        m42242a(x30.m43937a(this.f40225f, false, 0, (String) null, 6));
    }

    /* renamed from: a */
    public final void mo70121a(C12758cr crVar) {
        C15055wl wlVar = this.f40223d;
        if (wlVar != null) {
            wlVar.close();
        }
        if (crVar != null) {
            this.f40223d = this.f40220a.mo69474a(crVar).mo69303a((Function1<? super List<? extends Throwable>, Unit>) this.f40224e);
        }
    }

    /* renamed from: a */
    public final C15055wl mo70119a(Function1<? super x30, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "observer");
        this.f40221b.add(function1);
        ((u30.C14737a) function1).invoke(this.f40225f);
        return new C15055wl(function1) {
            public final /* synthetic */ Function1 f$1;

            {
                this.f$1 = r2;
            }

            public final void close() {
                t30.m42241a(t30.this, this.f$1);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m42241a(t30 t30, Function1 function1) {
        Intrinsics.checkNotNullParameter(t30, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$observer");
        t30.f40221b.remove(function1);
    }

    /* renamed from: a */
    public final String mo70120a() {
        JSONArray jSONArray = new JSONArray();
        for (Throwable th : this.f40222c) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", th.getMessage());
            jSONObject.put("stacktrace", ExceptionsKt.stackTraceToString(th));
            if (th instanceof oy0) {
                oy0 oy0 = (oy0) th;
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, oy0.mo69284b());
                jSONObject.put("json_source", oy0.mo69285c());
                jSONObject.put("json_summary", oy0.mo69283a());
            }
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString(4);
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "results.toString(/*indentSpaces*/ 4)");
        return jSONArray2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m42242a(x30 x30) {
        this.f40225f = x30;
        for (Function1 invoke : this.f40221b) {
            invoke.invoke(x30);
        }
    }
}

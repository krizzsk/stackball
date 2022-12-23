package com.inmobi.media;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bh */
/* compiled from: NativeContainerAsset */
public final class C5012bh extends C5010bf implements Iterable<C5010bf> {

    /* renamed from: A */
    public byte f11395A;
    /* access modifiers changed from: package-private */

    /* renamed from: B */
    public C5010bf[] f11396B;
    /* access modifiers changed from: package-private */

    /* renamed from: C */
    public int f11397C;

    /* renamed from: z */
    public long f11398z;

    public final Iterator<C5010bf> iterator() {
        return new C5013a();
    }

    public C5012bh(String str, String str2, C5011bg bgVar, byte b, JSONObject jSONObject, byte b2) {
        this(str, str2, bgVar, new LinkedList(), b, jSONObject, b2);
    }

    public C5012bh(String str, String str2, C5011bg bgVar, List<C5030br> list, byte b, JSONObject jSONObject, byte b2) {
        super(str, str2, "CONTAINER", bgVar, list);
        this.f11398z = 0;
        this.f11364f = jSONObject;
        this.f11396B = new C5010bf[1];
        this.f11367i = b;
        this.f11397C = 0;
        this.f11395A = b2;
    }

    /* renamed from: a */
    public final boolean mo40174a() {
        return "root".equalsIgnoreCase(this.f11362d);
    }

    /* renamed from: b */
    public final boolean mo40175b() {
        return "card_scrollable".equalsIgnoreCase(this.f11362d);
    }

    /* renamed from: com.inmobi.media.bh$a */
    /* compiled from: NativeContainerAsset */
    class C5013a implements Iterator<C5010bf> {

        /* renamed from: b */
        private int f11400b = 0;

        public C5013a() {
        }

        public final boolean hasNext() {
            return this.f11400b < C5012bh.this.f11397C;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object next() {
            C5010bf[] b = C5012bh.this.f11396B;
            int i = this.f11400b;
            this.f11400b = i + 1;
            return b[i];
        }
    }

    /* renamed from: a */
    public final C5010bf mo40173a(int i) {
        if (i < 0 || i >= this.f11397C) {
            return null;
        }
        return this.f11396B[i];
    }
}

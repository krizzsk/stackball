package com.ironsource.p131a;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: com.ironsource.a.a */
public final class C5485a {

    /* renamed from: a */
    String f12633a;

    /* renamed from: b */
    public boolean f12634b;

    /* renamed from: c */
    String f12635c;

    /* renamed from: d */
    C5490d f12636d;

    /* renamed from: e */
    boolean f12637e = false;

    /* renamed from: f */
    ArrayList<Pair<String, String>> f12638f;

    /* renamed from: com.ironsource.a.a$a */
    public static class C5486a {

        /* renamed from: a */
        String f12639a = "";

        /* renamed from: b */
        public boolean f12640b = false;

        /* renamed from: c */
        public String f12641c = "POST";

        /* renamed from: d */
        public C5490d f12642d;

        /* renamed from: e */
        public boolean f12643e = false;

        /* renamed from: f */
        public ArrayList<Pair<String, String>> f12644f = new ArrayList<>();

        public C5486a(String str) {
            if (str != null && !str.isEmpty()) {
                this.f12639a = str;
            }
        }
    }

    public C5485a(C5486a aVar) {
        this.f12633a = aVar.f12639a;
        this.f12634b = aVar.f12640b;
        this.f12635c = aVar.f12641c;
        this.f12636d = aVar.f12642d;
        this.f12637e = aVar.f12643e;
        if (aVar.f12644f != null) {
            this.f12638f = new ArrayList<>(aVar.f12644f);
        }
    }
}

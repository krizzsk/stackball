package com.fyber.inneractive.sdk.p051j;

import com.fyber.inneractive.sdk.config.C2808t;
import com.fyber.inneractive.sdk.p037d.p038a.C2823e;
import com.fyber.inneractive.sdk.p047g.p048a.C2918c;
import com.fyber.inneractive.sdk.p047g.p048a.C2931p;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* renamed from: com.fyber.inneractive.sdk.j.d */
public final class C3017d extends C3015b {

    /* renamed from: c */
    C3020g f7390c;

    /* renamed from: d */
    C2808t f7391d;

    /* renamed from: e */
    C2918c f7392e;

    /* renamed from: f */
    List<C2918c> f7393f = new ArrayList();

    /* renamed from: g */
    int f7394g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo18251b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3018e mo18249a() {
        this.f7385a = new C3020g();
        this.f7390c = (C3020g) this.f7385a;
        return this.f7385a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d9, code lost:
        if (r9.f6961c == null) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00db, code lost:
        r8.f7392e = r9;
        r3 = r8.f7393f;
        r4 = new com.fyber.inneractive.sdk.p037d.p038a.C2817a();
        r5 = r8.f7391d.f6648f.f6652c.intValue();
        r6 = r8.f7391d.f6648f.f6651b.intValue();
        r7 = r8.f7391d.f6648f.f6656g.intValue();
        r4.f6675a = r5;
        r4.f6676b = r6;
        r4.f6677c = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0114, code lost:
        if (com.fyber.inneractive.sdk.config.enums.UnitDisplayType.VERTICAL.equals(r8.f7391d.f6648f.f6659j) == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0116, code lost:
        r4.f6678d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0126, code lost:
        if (r8.f7391d.f6648f.f6660k.contains(2) == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0128, code lost:
        r4.f6679e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r8.f7390c.f7426E = r4.mo18094a(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a2, code lost:
        throw new com.fyber.inneractive.sdk.p037d.p038a.C2823e("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b4, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b5, code lost:
        r8.f7390c.f7410m = java.lang.String.format("%s", new java.lang.Object[]{r9.getMessage()});
        r8.f7390c.f7409l = "VastErrorInvalidFile";
        r8.f7390c.f7396B = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d1, code lost:
        if (com.fyber.inneractive.sdk.util.IAlog.f9870a == 2) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d3, code lost:
        r9.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d7, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d8, code lost:
        r8.f7390c.f7409l = r9.getMessage();
        r8.f7390c.f7410m = r9.getCause().getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ed, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ee, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b4 A[ExcHandler: Exception (r9v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:6:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ed A[ExcHandler: InterruptedException (r9v3 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:6:0x0021] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18250a(java.lang.String r9, com.fyber.inneractive.sdk.config.C2808t r10) throws java.lang.Exception {
        /*
            r8 = this;
            java.lang.String r0 = "VastErrorInvalidFile"
            r8.f7391d = r10
            if (r10 == 0) goto L_0x01ef
            com.fyber.inneractive.sdk.config.v r10 = r10.f6648f
            if (r10 != 0) goto L_0x000c
            goto L_0x01ef
        L_0x000c:
            com.fyber.inneractive.sdk.j.g r10 = r8.f7390c
            long r1 = java.lang.System.currentTimeMillis()
            r10.f7431a = r1
            int r10 = com.fyber.inneractive.sdk.config.C2739a.m5961c()
            r8.f7394g = r10
            com.fyber.inneractive.sdk.j.g r10 = r8.f7390c
            r10.f7429H = r9
        L_0x001e:
            r10 = 2
            r1 = 1
            r2 = 0
            com.fyber.inneractive.sdk.g.a.p r9 = m7027b(r9)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.util.List<com.fyber.inneractive.sdk.g.a.c> r9 = r9.f7028a     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r9 == 0) goto L_0x01a3
            int r3 = r9.size()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r3 == 0) goto L_0x01a3
            java.lang.Object r9 = r9.get(r2)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.g.a.c r9 = (com.fyber.inneractive.sdk.p047g.p048a.C2918c) r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.g.a.s r3 = r9.f6960b     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r3 == 0) goto L_0x00d7
            java.lang.String r4 = "Vast response parser: found VAST wrapper #%d"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.util.List<com.fyber.inneractive.sdk.g.a.c> r6 = r8.f7393f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            int r6 = r6.size()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r5[r2] = r6     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r4, r5)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.util.List<com.fyber.inneractive.sdk.g.a.c> r4 = r8.f7393f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            int r4 = r4.size()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            int r5 = r8.f7394g     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r4 >= r5) goto L_0x00ab
            java.util.List<com.fyber.inneractive.sdk.g.a.c> r4 = r8.f7393f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r4.add(r9)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r9 = r3.f7057e     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r3 != 0) goto L_0x009c
            boolean r3 = com.fyber.inneractive.sdk.util.C3685u.m9187g(r9)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r3 == 0) goto L_0x0089
            int r3 = com.fyber.inneractive.sdk.util.C3703z.f10019b     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            int r4 = com.fyber.inneractive.sdk.util.C3703z.f10018a     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r5 = 5
            java.lang.String r3 = com.fyber.inneractive.sdk.util.C3669p.m9147a(r9, r3, r4, r5)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r4 != 0) goto L_0x0081
            com.fyber.inneractive.sdk.j.g r4 = r8.f7390c     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r4.f7430I     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r4.put(r9, r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r9 = r3
            goto L_0x001e
        L_0x0081:
            com.fyber.inneractive.sdk.d.a.e r9 = new com.fyber.inneractive.sdk.d.a.e     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r3 = "Failed getting data from ad tag URI"
            r9.<init>(r0, r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            throw r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x0089:
            java.lang.String r3 = "Vast response parser: Unsecure Wrapper URL. Aborting! url: %s"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r4[r2] = r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r3, r4)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.d.a.e r9 = new com.fyber.inneractive.sdk.d.a.e     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r3 = "VastErrorUnsecure"
            java.lang.String r4 = "Unsecure ad tag URI for wrapper"
            r9.<init>(r3, r4)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            throw r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x009c:
            java.lang.String r9 = "Vast response parser: found an empty tag uri in wrapper! aborting!"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.d.a.e r9 = new com.fyber.inneractive.sdk.d.a.e     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r3 = "No ad tag URI for wrapper"
            r9.<init>(r0, r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            throw r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x00ab:
            java.lang.String r9 = "Vast response parser: too many vast wrappers! Only %dallowed. stopping"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            int r4 = r8.f7394g     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r3[r2] = r4     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.d.a.e r9 = new com.fyber.inneractive.sdk.d.a.e     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r3 = "VastErrorTooManyWrappers"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r5 = "More than "
            r4.<init>(r5)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            int r5 = r8.f7394g     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r4.append(r5)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r5 = " found"
            r4.append(r5)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r9.<init>(r3, r4)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            throw r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x00d7:
            com.fyber.inneractive.sdk.g.a.k r3 = r9.f6961c     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r3 == 0) goto L_0x019b
            r8.f7392e = r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.util.List<com.fyber.inneractive.sdk.g.a.c> r3 = r8.f7393f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.d.a.a r4 = new com.fyber.inneractive.sdk.d.a.a     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r4.<init>()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.t r5 = r8.f7391d     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.v r5 = r5.f6648f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.Integer r5 = r5.f6652c     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            int r5 = r5.intValue()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.t r6 = r8.f7391d     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.v r6 = r6.f6648f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.Integer r6 = r6.f6651b     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            int r6 = r6.intValue()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.t r7 = r8.f7391d     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.v r7 = r7.f6648f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.Integer r7 = r7.f6656g     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            int r7 = r7.intValue()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r4.f6675a = r5     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r4.f6676b = r6     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r4.f6677c = r7     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r5 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.VERTICAL     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.t r6 = r8.f7391d     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.v r6 = r6.f6648f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = r6.f6659j     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            boolean r5 = r5.equals(r6)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r5 == 0) goto L_0x0118
            r4.f6678d = r1     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x0118:
            com.fyber.inneractive.sdk.config.t r5 = r8.f7391d     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.config.v r5 = r5.f6648f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.util.List<java.lang.Integer> r5 = r5.f6660k     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            boolean r5 = r5.contains(r6)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r5 == 0) goto L_0x012a
            r4.f6679e = r1     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x012a:
            com.fyber.inneractive.sdk.g.a.a r9 = r4.mo18094a((com.fyber.inneractive.sdk.p047g.p048a.C2918c) r9, (java.util.List<com.fyber.inneractive.sdk.p047g.p048a.C2918c>) r3)     // Catch:{ e -> 0x0133, InterruptedException -> 0x01ed, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.j.g r3 = r8.f7390c     // Catch:{ e -> 0x0133, InterruptedException -> 0x01ed, Exception -> 0x01b4 }
            r3.f7426E = r9     // Catch:{ e -> 0x0133, InterruptedException -> 0x01ed, Exception -> 0x01b4 }
            goto L_0x013e
        L_0x0133:
            r9 = move-exception
            com.fyber.inneractive.sdk.j.g r3 = r8.f7390c     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r3.f7425D = r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r3.f7409l = r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x013e:
            com.fyber.inneractive.sdk.j.g r9 = r8.f7390c     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.util.Map<com.fyber.inneractive.sdk.g.a.m, com.fyber.inneractive.sdk.d.a.c> r3 = r4.f6680f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r3 == 0) goto L_0x0149
            java.util.Map<com.fyber.inneractive.sdk.g.a.m, com.fyber.inneractive.sdk.d.a.c> r9 = r9.f7427F     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r9.putAll(r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x0149:
            com.fyber.inneractive.sdk.j.g r9 = r8.f7390c     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.util.List<com.fyber.inneractive.sdk.g.a.f> r3 = r4.f6681g     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r3 == 0) goto L_0x0154
            java.util.List<com.fyber.inneractive.sdk.g.a.f> r9 = r9.f7428G     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r9.addAll(r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x0154:
            int r9 = com.fyber.inneractive.sdk.util.IAlog.f9870a     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r9 != r10) goto L_0x019a
            java.util.Map<com.fyber.inneractive.sdk.g.a.m, com.fyber.inneractive.sdk.d.a.c> r9 = r4.f6680f     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            int r3 = r9.size()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r3 <= 0) goto L_0x0193
            java.lang.String r3 = " VParser: Unsupported media files:"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r3, r4)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.util.Set r3 = r9.keySet()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x016f:
            boolean r4 = r3.hasNext()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            if (r4 == 0) goto L_0x0192
            java.lang.Object r4 = r3.next()     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.g.a.m r4 = (com.fyber.inneractive.sdk.p047g.p048a.C2928m) r4     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r5 = "VParser: %s"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r6[r2] = r4     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r5, r6)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r5 = "VParser: reason = %s"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.Object r4 = r9.get(r4)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            r6[r2] = r4     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r5, r6)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            goto L_0x016f
        L_0x0192:
            return
        L_0x0193:
            java.lang.String r9 = "VParser: Unsupported media files: none"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r9, r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x019a:
            return
        L_0x019b:
            com.fyber.inneractive.sdk.d.a.e r9 = new com.fyber.inneractive.sdk.d.a.e     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r3 = "A top level ad with no wrapper on inline found!"
            r9.<init>(r0, r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            throw r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x01a3:
            java.lang.String r9 = "Vast response parser: no ads found in model. aborting"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r3)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            com.fyber.inneractive.sdk.d.a.e r9 = new com.fyber.inneractive.sdk.d.a.e     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            java.lang.String r3 = "ErrorNoMediaFiles"
            java.lang.String r4 = "No ads found in model. Empty Vast?"
            r9.<init>(r3, r4)     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
            throw r9     // Catch:{ InterruptedException -> 0x01ed, e -> 0x01d7, Exception -> 0x01b4 }
        L_0x01b4:
            r9 = move-exception
            com.fyber.inneractive.sdk.j.g r3 = r8.f7390c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r9.getMessage()
            r1[r2] = r4
            java.lang.String r2 = "%s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r3.f7410m = r1
            com.fyber.inneractive.sdk.j.g r1 = r8.f7390c
            r1.f7409l = r0
            com.fyber.inneractive.sdk.j.g r0 = r8.f7390c
            r0.f7396B = r9
            int r0 = com.fyber.inneractive.sdk.util.IAlog.f9870a
            if (r0 != r10) goto L_0x01d6
            r9.printStackTrace()
        L_0x01d6:
            return
        L_0x01d7:
            r9 = move-exception
            com.fyber.inneractive.sdk.j.g r10 = r8.f7390c
            java.lang.String r0 = r9.getMessage()
            r10.f7409l = r0
            com.fyber.inneractive.sdk.j.g r10 = r8.f7390c
            java.lang.Throwable r9 = r9.getCause()
            java.lang.String r9 = r9.getMessage()
            r10.f7410m = r9
            return
        L_0x01ed:
            r9 = move-exception
            throw r9
        L_0x01ef:
            com.fyber.inneractive.sdk.j.e r9 = r8.f7385a
            java.lang.String r10 = "ErrorConfigurationMismatch"
            r9.f7409l = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p051j.C3017d.mo18250a(java.lang.String, com.fyber.inneractive.sdk.config.t):void");
    }

    /* renamed from: b */
    private static C2931p m7027b(String str) throws C2823e {
        try {
            String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setCoalescing(true);
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst)));
            if (parse == null) {
                return null;
            }
            Node firstChild = parse.getFirstChild();
            if (firstChild.getNodeName().equalsIgnoreCase(VastTree.VAST)) {
                return C2931p.m6558a(firstChild);
            }
            IAlog.m9034b("XML does not contain a VAST tag as its first child!", new Object[0]);
            throw new Exception("XML does not contain a VAST tag as its first child!");
        } catch (Exception e) {
            IAlog.m9034b("Failed parsing Vast file! parsing error = %s", e.getMessage());
            throw new C2823e("VastErrorInvalidFile", e.getMessage());
        }
    }
}

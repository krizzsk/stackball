package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.C6263e;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.p171f.C6233b;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.mbridge.msdk.foundation.tools.i */
/* compiled from: MIMManager */
public final class C6338i {

    /* renamed from: d */
    private static volatile String f15718d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CopyOnWriteArrayList<CampaignEx> f15719a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile C6345b f15720b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AtomicBoolean f15721c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile Boolean f15722e;

    /* renamed from: f */
    private CampaignEx f15723f;

    /* renamed from: g */
    private int f15724g;

    /* renamed from: h */
    private Context f15725h;

    /* renamed from: com.mbridge.msdk.foundation.tools.i$a */
    /* compiled from: MIMManager */
    private static final class C6344a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6338i f15741a = new C6338i();
    }

    private C6338i() {
        this.f15724g = 0;
        this.f15719a = new CopyOnWriteArrayList<>();
        this.f15721c = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static C6338i m16066a() {
        return C6344a.f15741a;
    }

    /* renamed from: a */
    public final void mo43939a(CampaignEx campaignEx) {
        if (this.f15722e != null && campaignEx != null && this.f15722e.booleanValue()) {
            this.f15723f = campaignEx;
            this.f15719a.add(campaignEx);
        }
    }

    /* renamed from: b */
    public final void mo43941b(CampaignEx campaignEx) {
        if (this.f15722e != null && campaignEx != null && this.f15722e.booleanValue()) {
            this.f15723f = null;
            try {
                this.f15719a.remove(campaignEx);
            } catch (Exception e) {
                C6361q.m16154a("MIMManager", e.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final CampaignEx mo43940b() {
        return this.f15723f;
    }

    /* renamed from: c */
    public final void mo43942c() {
        this.f15724g++;
    }

    /* renamed from: d */
    public final void mo43943d() {
        int i = this.f15724g - 1;
        this.f15724g = i;
        if (i <= 0) {
            Context context = this.f15725h;
            if (this.f15720b != null && context != null) {
                try {
                    context.unregisterReceiver(this.f15720b);
                } catch (Exception e) {
                    C6361q.m16154a("MIMManager", e.getMessage());
                } catch (Throwable th) {
                    this.f15723f = null;
                    this.f15719a.clear();
                    this.f15719a = null;
                    this.f15720b = null;
                    this.f15725h = null;
                    throw th;
                }
                this.f15723f = null;
                this.f15719a.clear();
                this.f15719a = null;
                this.f15720b = null;
                this.f15725h = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo43937a(final Context context) {
        this.f15725h = context;
        C6233b.m15776a().execute(new Runnable() {
            public final void run() {
                if (C6338i.this.f15721c.compareAndSet(false, true)) {
                    try {
                        Boolean unused = C6338i.this.f15722e = C6338i.this.m16073g();
                    } catch (Exception e) {
                        C6361q.m16154a("MIMManager", e.getMessage());
                    }
                    if (C6338i.this.f15722e != null && C6338i.this.f15722e.booleanValue() && context != null) {
                        try {
                            C6345b unused2 = C6338i.this.f15720b = new C6345b();
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction(C6348l.m16089b("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                            intentFilter.addAction(C6348l.m16089b("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                            intentFilter.addAction(C6348l.m16089b("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                            context.registerReceiver(C6338i.this.f15720b, intentFilter);
                        } catch (Exception e2) {
                            C6361q.m16154a("MIMManager", e2.getMessage());
                        }
                    }
                }
            }
        });
    }

    /* renamed from: e */
    public final Boolean mo43944e() {
        return this.f15722e;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public Boolean m16073g() {
        Cursor cursor;
        Context d = C6122a.m15302b().mo42895d();
        Boolean bool = null;
        if (!(d == null || d.getContentResolver() == null)) {
            try {
                cursor = d.getContentResolver().query(Uri.parse(C6348l.m16089b("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), (String[]) null, (String) null, (String[]) null, (String) null);
            } catch (Exception unused) {
                cursor = null;
            }
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex("support"));
                        if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                            bool = Boolean.valueOf(Boolean.parseBoolean(string));
                        }
                    } catch (Exception e) {
                        C6361q.m16154a("MIMManager", e.getMessage());
                    }
                    try {
                        f15718d = cursor.getString(cursor.getColumnIndex("detailStyle"));
                    } catch (Exception e2) {
                        C6361q.m16154a("MIMManager", e2.getMessage());
                    }
                }
                try {
                    cursor.close();
                } catch (Exception e3) {
                    C6361q.m16154a("MIMManager", e3.getMessage());
                }
            }
        }
        return bool;
    }

    /* renamed from: f */
    public final String mo43945f() {
        try {
            if (f15718d == null) {
                return "";
            }
            return String.format("[%s]", new Object[]{f15718d});
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.i$b */
    /* compiled from: MIMManager */
    private static class C6345b extends BroadcastReceiver {
        private C6345b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                java.lang.String r0 = r6.getAction()
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L_0x002a
                com.mbridge.msdk.foundation.tools.i r6 = com.mbridge.msdk.foundation.tools.C6338i.C6344a.f15741a
                com.mbridge.msdk.foundation.tools.i r0 = com.mbridge.msdk.foundation.tools.C6338i.C6344a.f15741a
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.mo43940b()
                java.lang.String r1 = "dm_page_opened"
                r6.mo43938a(r5, r1, r0)
                goto L_0x00a9
            L_0x002a:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L_0x0048
                com.mbridge.msdk.foundation.tools.i r6 = com.mbridge.msdk.foundation.tools.C6338i.C6344a.f15741a
                com.mbridge.msdk.foundation.tools.i r0 = com.mbridge.msdk.foundation.tools.C6338i.C6344a.f15741a
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.mo43940b()
                java.lang.String r1 = "dm_page_closed"
                r6.mo43938a(r5, r1, r0)
                goto L_0x00a9
            L_0x0048:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r1)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x00a9
                android.os.Bundle r6 = r6.getExtras()
                if (r6 != 0) goto L_0x005b
                return
            L_0x005b:
                java.lang.String r0 = "code"
                r1 = -1
                int r0 = r6.getInt(r0, r1)
                java.lang.String r2 = "packageName"
                java.lang.String r3 = ""
                java.lang.String r6 = r6.getString(r2, r3)
                if (r0 == r1) goto L_0x00a9
                boolean r1 = android.text.TextUtils.isEmpty(r6)
                if (r1 == 0) goto L_0x0073
                goto L_0x00a9
            L_0x0073:
                com.mbridge.msdk.foundation.tools.i r1 = com.mbridge.msdk.foundation.tools.C6338i.C6344a.f15741a
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = com.mbridge.msdk.foundation.tools.C6338i.m16064a((com.mbridge.msdk.foundation.tools.C6338i) r1, (java.lang.String) r6)
                if (r6 != 0) goto L_0x007e
                return
            L_0x007e:
                com.mbridge.msdk.foundation.tools.i r1 = com.mbridge.msdk.foundation.tools.C6338i.C6344a.f15741a
                r2 = 1
                if (r0 == r2) goto L_0x0099
                r2 = 2
                if (r0 == r2) goto L_0x0093
                r2 = 4
                if (r0 == r2) goto L_0x008d
                r5 = 0
                goto L_0x009f
            L_0x008d:
                com.mbridge.msdk.foundation.tools.i$2 r0 = new com.mbridge.msdk.foundation.tools.i$2
                r0.<init>(r5, r6)
                goto L_0x009e
            L_0x0093:
                com.mbridge.msdk.foundation.tools.i$3 r0 = new com.mbridge.msdk.foundation.tools.i$3
                r0.<init>(r5, r6)
                goto L_0x009e
            L_0x0099:
                com.mbridge.msdk.foundation.tools.i$4 r0 = new com.mbridge.msdk.foundation.tools.i$4
                r0.<init>(r5, r6)
            L_0x009e:
                r5 = r0
            L_0x009f:
                if (r5 == 0) goto L_0x00a9
                java.util.concurrent.ThreadPoolExecutor r6 = com.mbridge.msdk.foundation.same.p171f.C6233b.m15776a()
                r6.execute(r5)
            L_0x00a9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6338i.C6345b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43938a(final Context context, final String str, final CampaignEx campaignEx) {
        C6233b.m15776a().execute(new Runnable() {
            public final void run() {
                try {
                    if (context != null && !TextUtils.isEmpty(str) && campaignEx != null) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("key=2000100&");
                        stringBuffer.append("network_type=");
                        stringBuffer.append(C6349m.m16123n(context));
                        stringBuffer.append("&");
                        if (!TextUtils.isEmpty(campaignEx.getRequestIdNotice())) {
                            stringBuffer.append("rid_n=");
                            stringBuffer.append(campaignEx.getRequestIdNotice());
                            stringBuffer.append("&");
                        }
                        if (!TextUtils.isEmpty(campaignEx.getRequestId())) {
                            stringBuffer.append("rid=");
                            stringBuffer.append(campaignEx.getRequestId());
                            stringBuffer.append("&");
                        }
                        if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
                            stringBuffer.append("unit_id=");
                            stringBuffer.append(campaignEx.getCampaignUnitId());
                            stringBuffer.append("&");
                        }
                        if (!TextUtils.isEmpty(campaignEx.getId())) {
                            stringBuffer.append("cid=");
                            stringBuffer.append(campaignEx.getId());
                            stringBuffer.append("&");
                        }
                        stringBuffer.append("status=");
                        stringBuffer.append(str);
                        if (C6301a.m15945a().mo43913c()) {
                            C6301a.m15945a().mo43911a(stringBuffer.toString());
                            return;
                        }
                        new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16026a(stringBuffer.toString(), context), (C6263e) null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    C6361q.m16158d("MIMManager", e.getMessage());
                } catch (Throwable th) {
                    C6361q.m16158d("MIMManager", th.getMessage());
                }
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ CampaignEx m16064a(C6338i iVar, String str) {
        CampaignEx campaignEx = iVar.f15723f;
        if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
            return iVar.f15723f;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = iVar.f15719a;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Iterator<CampaignEx> it = iVar.f15719a.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null && TextUtils.equals(next.getPackageName(), str)) {
                    return next;
                }
            }
        }
        return null;
    }
}

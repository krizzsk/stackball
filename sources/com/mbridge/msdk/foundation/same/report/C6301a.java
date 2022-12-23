package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.p164db.BatchReportDao;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.same.report.p183d.C6327b;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.mbridge.msdk.foundation.same.report.a */
/* compiled from: MBBatchReportManager */
public final class C6301a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15649a = C6301a.class.getSimpleName();

    /* renamed from: b */
    private static volatile C6301a f15650b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f15651c;

    /* renamed from: d */
    private boolean f15652d = false;

    /* renamed from: e */
    private int f15653e = 30;

    /* renamed from: f */
    private long f15654f = 5000;

    /* renamed from: g */
    private String f15655g = C6280d.m15868c().f15565a;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public BatchReportDao f15656h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AtomicInteger f15657i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Stack<Long> f15658j;

    private C6301a() {
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        if (b != null) {
            this.f15653e = b.mo42668M();
            this.f15654f = (long) (b.mo42669N() * 1000);
            this.f15652d = b.mo42670O() != 1 ? false : true;
        }
        if (this.f15652d) {
            this.f15657i = new AtomicInteger(0);
            this.f15658j = new Stack<>();
            this.f15656h = BatchReportDao.getInstance(C6122a.m15302b().mo42895d());
            HandlerThread handlerThread = new HandlerThread("mb_batch_report_thread");
            handlerThread.start();
            this.f15651c = new Handler(handlerThread.getLooper()) {
                public final void handleMessage(Message message) {
                    Bundle data;
                    int i = message.what;
                    if (i == 1) {
                        Bundle data2 = message.getData();
                        if (C6301a.this.f15651c != null && C6301a.this.f15656h != null && data2 != null) {
                            C6301a.this.f15651c.removeMessages(2);
                            long currentTimeMillis = System.currentTimeMillis();
                            C6301a.m15946a(C6301a.this, C6301a.this.f15656h.getBatchReportMessages(currentTimeMillis), currentTimeMillis);
                            C6301a.this.f15657i.set(0);
                        }
                    } else if (i == 2) {
                        Bundle data3 = message.getData();
                        if (C6301a.this.f15651c != null && C6301a.this.f15656h != null && data3 != null) {
                            C6301a.this.f15651c.removeMessages(1);
                            long j = data3.getLong("last_report_time");
                            C6301a.m15946a(C6301a.this, C6301a.this.f15656h.getBatchReportMessages(j), j);
                        }
                    } else if (i == 3 && (data = message.getData()) != null) {
                        C6301a.m15948b(C6301a.this, data.getParcelableArrayList("report_message"), data.getLong("last_report_time"));
                    }
                }
            };
        }
    }

    /* renamed from: a */
    public static C6301a m15945a() {
        if (f15650b == null) {
            synchronized (C6301a.class) {
                if (f15650b == null) {
                    f15650b = new C6301a();
                }
            }
        }
        return f15650b;
    }

    /* renamed from: b */
    public final void mo43912b() {
        Handler handler;
        if (this.f15652d && (handler = this.f15651c) != null && !handler.hasMessages(1)) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.f15651c.sendMessageDelayed(obtain, 5000);
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo43913c() {
        return this.f15652d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43911a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.mbridge.msdk.foundation.db.BatchReportDao r0 = r4.f15656h     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0064
            boolean r0 = r4.f15652d     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0064
        L_0x000a:
            com.mbridge.msdk.foundation.db.BatchReportDao r0 = r4.f15656h     // Catch:{ all -> 0x0066 }
            r0.addReportMessage(r5)     // Catch:{ all -> 0x0066 }
            android.os.Handler r5 = r4.f15651c     // Catch:{ all -> 0x0066 }
            if (r5 == 0) goto L_0x0031
            long r0 = r4.f15654f     // Catch:{ all -> 0x0066 }
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0031
            android.os.Handler r5 = r4.f15651c     // Catch:{ all -> 0x0066 }
            r0 = 1
            boolean r5 = r5.hasMessages(r0)     // Catch:{ all -> 0x0066 }
            if (r5 != 0) goto L_0x0031
            android.os.Message r5 = android.os.Message.obtain()     // Catch:{ all -> 0x0066 }
            r5.what = r0     // Catch:{ all -> 0x0066 }
            android.os.Handler r0 = r4.f15651c     // Catch:{ all -> 0x0066 }
            long r1 = r4.f15654f     // Catch:{ all -> 0x0066 }
            r0.sendMessageDelayed(r5, r1)     // Catch:{ all -> 0x0066 }
        L_0x0031:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f15657i     // Catch:{ all -> 0x0066 }
            int r5 = r5.incrementAndGet()     // Catch:{ all -> 0x0066 }
            int r0 = r4.f15653e     // Catch:{ all -> 0x0066 }
            if (r5 < r0) goto L_0x0062
            android.os.Handler r5 = r4.f15651c     // Catch:{ all -> 0x0066 }
            if (r5 == 0) goto L_0x0062
            android.os.Message r5 = android.os.Message.obtain()     // Catch:{ all -> 0x0066 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "last_report_time"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0066 }
            r0.putLong(r1, r2)     // Catch:{ all -> 0x0066 }
            r5.setData(r0)     // Catch:{ all -> 0x0066 }
            r0 = 2
            r5.what = r0     // Catch:{ all -> 0x0066 }
            android.os.Handler r0 = r4.f15651c     // Catch:{ all -> 0x0066 }
            r0.sendMessage(r5)     // Catch:{ all -> 0x0066 }
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f15657i     // Catch:{ all -> 0x0066 }
            r0 = 0
            r5.set(r0)     // Catch:{ all -> 0x0066 }
        L_0x0062:
            monitor-exit(r4)
            return
        L_0x0064:
            monitor-exit(r4)
            return
        L_0x0066:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.C6301a.mo43911a(java.lang.String):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m15946a(C6301a aVar, ArrayList arrayList, long j) {
        if (arrayList != null && arrayList.size() > 0) {
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("report_message", arrayList);
            bundle.putLong("last_report_time", j);
            obtain.setData(bundle);
            obtain.what = 3;
            aVar.f15651c.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m15948b(C6301a aVar, final ArrayList arrayList, final long j) {
        Context d;
        if (arrayList != null && arrayList.size() > 0 && (d = C6122a.m15302b().mo42895d()) != null) {
            C6287d a = C6323d.m16024a(d);
            a.mo43870a("app_id", C6122a.m15302b().mo42896e());
            a.mo43870a("m_sdk", "msdk");
            a.mo43870a("lqswt", String.valueOf(1));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrayList.size(); i++) {
                BatchReportMessage batchReportMessage = (BatchReportMessage) arrayList.get(i);
                if (batchReportMessage != null) {
                    sb.append(batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp());
                    if (i >= 0 && i < arrayList.size() - 1) {
                        sb.append("\n");
                    }
                }
            }
            try {
                a.mo43870a("data", URLEncoder.encode(sb.toString(), "utf-8"));
                new C6326a(C6122a.m15302b().mo42895d()).mo43867c(0, aVar.f15655g, a, new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                        try {
                            if (C6301a.this.f15656h != null) {
                                C6301a.this.f15656h.deleteBatchReportMessagesByTimestamp(j);
                            }
                        } catch (Exception e) {
                            C6361q.m16158d(C6301a.f15649a, e.getMessage());
                        }
                        synchronized (C6301a.this.f15658j) {
                            C6301a.this.f15658j.clear();
                        }
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                        Stack d;
                        synchronized (C6301a.this.f15658j) {
                            C6301a.this.f15658j.add(Long.valueOf(j));
                            if (C6301a.this.f15656h != null) {
                                C6301a.this.f15656h.updateMessagesReportState(arrayList);
                            }
                            if (C6301a.this.f15658j.size() >= 5) {
                                try {
                                    C6301a.this.f15658j.pop();
                                    long longValue = ((Long) C6301a.this.f15658j.pop()).longValue();
                                    C6301a.this.f15658j.clear();
                                    if (C6301a.this.f15656h != null) {
                                        C6301a.this.f15656h.deleteBatchReportMessagesByTimestamp(longValue);
                                    }
                                    d = C6301a.this.f15658j;
                                } catch (Exception e) {
                                    try {
                                        C6361q.m16158d(C6301a.f15649a, e.getMessage());
                                        d = C6301a.this.f15658j;
                                    } catch (Throwable th) {
                                        C6301a.this.f15658j.clear();
                                        throw th;
                                    }
                                }
                                d.clear();
                            }
                        }
                    }
                });
            } catch (Exception e) {
                C6361q.m16158d(f15649a, e.getMessage());
            }
        }
    }
}

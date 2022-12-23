package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.entity.C6202l;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6157o;
import com.mbridge.msdk.foundation.p164db.C6158p;
import com.mbridge.msdk.foundation.same.net.C6263e;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.p167b.C6211c;
import com.mbridge.msdk.foundation.same.p167b.C6213e;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.tools.C6354n;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6370y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.videocommon.listener.C7212a;
import com.mbridge.msdk.videocommon.p236a.C7167a;
import java.io.File;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.videocommon.download.a */
/* compiled from: CampaignDownLoadTask */
public final class C7180a implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f17958A;

    /* renamed from: B */
    private int f17959B;

    /* renamed from: C */
    private File f17960C;

    /* renamed from: D */
    private OnDownloadStateListener f17961D = new OnDownloadStateListener() {
        public final void onDownloadStart(DownloadMessage downloadMessage) {
            int unused = C7180a.this.f17967e = 1;
            if (C7180a.this.f17983u == null) {
                C6157o unused2 = C7180a.this.f17983u = C6157o.m15466a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
            }
            C7180a.this.f17983u.mo43031a(C7180a.this.f17971i, C7180a.this.f17974l, C7180a.this.f17978p, C7180a.this.f17967e);
        }

        public final void onDownloadComplete(DownloadMessage downloadMessage) {
            try {
                if (C7180a.this.f17983u == null) {
                    C6157o unused = C7180a.this.f17983u = C6157o.m15466a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
                }
                C7180a.this.f17983u.mo43032a(C7180a.this.f17975m, C7180a.this.f17977o, 5);
                String videoMD5Value = C7180a.this.f17971i.getVideoMD5Value();
                if (!TextUtils.isEmpty(videoMD5Value)) {
                    try {
                        if (videoMD5Value.equals(C6354n.m16135a(new File(C7180a.this.f17976n)))) {
                            C7180a.this.mo49174a(C7180a.this.f17977o, true);
                            C7180a.this.m18224c(C7180a.this.m18227e(3));
                            return;
                        }
                    } catch (Throwable th) {
                        C6361q.m16155a("CampaignDownLoadTask", th.getMessage(), th);
                    }
                    C7180a.this.mo49178a("Video download complete but MD5 check failed");
                    return;
                }
                C7180a.this.mo49174a(C7180a.this.f17977o, false);
                C7180a.this.m18224c(C7180a.this.m18227e(3));
            } catch (Exception e) {
                C6361q.m16158d("CampaignDownLoadTask", e.getMessage());
            }
        }

        public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            if (C7180a.this.f17986x != null && C7180a.this.f17986x.getStatus() != DownloadStatus.CANCELLED) {
                String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
                C7180a.this.m18238p();
                C7180a.this.m18214a(3, message);
                C7180a.this.mo49178a(message);
            }
        }
    };

    /* renamed from: E */
    private OnProgressStateListener f17962E = new OnProgressStateListener() {
        public final void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                long unused = C7180a.this.f17977o = downloadProgress.getCurrent();
                long unused2 = C7180a.this.f17974l = downloadProgress.getTotal();
                int unused3 = C7180a.this.f17988z = downloadProgress.getCurrentDownloadRate();
                if (downloadProgress.getCurrentDownloadRate() >= C7180a.this.f17981s) {
                    C6361q.m16158d("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + C7180a.this.f17981s + " " + C7180a.this.f17965c);
                    if (!C7180a.this.f17966d) {
                        boolean unused4 = C7180a.this.f17966d = true;
                        if (!C7180a.this.f17958A) {
                            C7180a.this.m18224c(C7180a.this.m18227e(1));
                            C7180a.this.mo49174a(downloadProgress.getCurrent(), false);
                        }
                        if (C7180a.this.f17986x != null && C7180a.this.f17965c < C7180a.this.f17981s && !C7180a.this.f17958A) {
                            C7180a.this.f17986x.cancel(downloadMessage);
                        }
                    }
                }
            } catch (Exception e) {
                C6361q.m16158d("CampaignDownLoadTask", e.getMessage());
            }
        }
    };

    /* renamed from: a */
    private boolean f17963a = false;

    /* renamed from: b */
    private int f17964b = 1;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f17965c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f17966d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile int f17967e = 0;

    /* renamed from: f */
    private CopyOnWriteArrayList<C7185d> f17968f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    private C7212a f17969g;

    /* renamed from: h */
    private C7212a f17970h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public CampaignEx f17971i;

    /* renamed from: j */
    private String f17972j;

    /* renamed from: k */
    private Context f17973k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f17974l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f17975m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f17976n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f17977o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f17978p;

    /* renamed from: q */
    private boolean f17979q = false;

    /* renamed from: r */
    private long f17980r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f17981s = 100;

    /* renamed from: t */
    private boolean f17982t = false;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C6157o f17983u;

    /* renamed from: v */
    private boolean f17984v = false;

    /* renamed from: w */
    private String f17985w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public DownloadRequest f17986x;

    /* renamed from: y */
    private DownloadMessage f17987y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f17988z;

    public C7180a(Context context, CampaignEx campaignEx, String str, int i) {
        String str2;
        CampaignEx campaignEx2 = campaignEx;
        if (context != null || campaignEx2 != null) {
            this.f17980r = System.currentTimeMillis();
            this.f17973k = C6122a.m15302b().mo42895d();
            this.f17971i = campaignEx2;
            this.f17972j = str;
            this.f17964b = i;
            if (campaignEx2 != null) {
                this.f17975m = campaignEx.getVideoUrlEncode();
            }
            String str3 = this.f17975m;
            if (!TextUtils.isEmpty(str3)) {
                str2 = SameMD5.getMD5(C6370y.m16237a(str3.trim()));
            } else {
                str2 = "";
            }
            this.f17985w = str2;
            this.f17976n = C6213e.m15725b(C6211c.MBRIDGE_VC) + File.separator;
            this.f17978p = this.f17976n + this.f17985w;
            C6361q.m16156b("CampaignDownLoadTask", this.f17971i.getAppName() + " videoLocalPath:" + this.f17978p + " videoUrl: " + this.f17971i.getVideoUrlEncode() + " " + this.f17981s);
            try {
                if (!TextUtils.isEmpty(this.f17975m)) {
                    File file = null;
                    if (!TextUtils.isEmpty(this.f17976n)) {
                        file = new File(this.f17976n);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    }
                    if (file != null && file.exists() && (this.f17960C == null || !this.f17960C.exists())) {
                        File file2 = new File(file + "/.nomedia");
                        this.f17960C = file2;
                        if (!file2.exists()) {
                            this.f17960C.createNewFile();
                        }
                    }
                    C6157o a = C6157o.m15466a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
                    C6202l a2 = a.mo43034a(this.f17975m, "");
                    if (a2 != null) {
                        this.f17977o = a2.mo43710b();
                        if (this.f17967e != 2) {
                            this.f17967e = a2.mo43715d();
                        }
                        if (this.f17967e == 1) {
                            this.f17967e = 2;
                        }
                        this.f17974l = (long) a2.mo43714c();
                        if (a2.mo43706a() > 0) {
                            this.f17980r = a2.mo43706a();
                        }
                        if (this.f17967e == 5) {
                            if (new File(this.f17976n + this.f17985w).exists()) {
                                this.f17978p = this.f17976n + this.f17985w;
                            } else {
                                m18237o();
                            }
                        } else if (this.f17967e != 0) {
                            this.f17978p = this.f17976n + this.f17985w;
                        }
                    } else {
                        a.mo43035a(this.f17975m, this.f17980r);
                    }
                    String str4 = this.f17975m;
                    if (TextUtils.isEmpty(str4)) {
                        this.f17970h.mo47025a("VideoUrl is NULL, Please check it.", "");
                    } else if (this.f17967e == 1) {
                        C6361q.m16154a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
                    } else if (this.f17967e == 5) {
                        C6361q.m16154a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
                        if (this.f17969g != null) {
                            this.f17969g.mo47024a(this.f17975m);
                        }
                        if (this.f17970h != null) {
                            this.f17970h.mo47024a(this.f17975m);
                        }
                    } else if (this.f17964b == 3) {
                        C6361q.m16154a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
                        mo49174a(0, false);
                    } else {
                        if (this.f17971i.getReady_rate() == 0) {
                            if (this.f17969g != null) {
                                this.f17969g.mo47024a(this.f17975m);
                            }
                            if (this.f17970h != null) {
                                this.f17970h.mo47024a(this.f17975m);
                            }
                        }
                        this.f17987y = new DownloadMessage(new Object(), str4, this.f17985w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                        this.f17986x = MBDownloadManager.getInstance().download(this.f17987y).withReadTimeout(30000).withConnectTimeout((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f17976n).withDownloadStateListener(this.f17961D).withProgressStateListener(this.f17962E).build();
                    }
                }
            } catch (Exception e) {
                C6361q.m16156b("CampaignDownLoadTask", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final String mo49171a() {
        return this.f17975m;
    }

    /* renamed from: a */
    public final void mo49172a(int i) {
        this.f17964b = i;
    }

    /* renamed from: b */
    public final void mo49180b(int i) {
        this.f17965c = i;
    }

    /* renamed from: b */
    public final boolean mo49184b() {
        return this.f17984v;
    }

    /* renamed from: a */
    public final void mo49179a(boolean z) {
        this.f17984v = z;
    }

    /* renamed from: c */
    public final long mo49185c() {
        return this.f17980r;
    }

    /* renamed from: b */
    public final void mo49183b(boolean z) {
        this.f17979q = z;
    }

    /* renamed from: d */
    public final String mo49187d() {
        return this.f17978p;
    }

    /* renamed from: e */
    public final long mo49189e() {
        return this.f17974l;
    }

    /* renamed from: f */
    public final int mo49190f() {
        return this.f17967e;
    }

    /* renamed from: a */
    public final void mo49173a(int i, int i2) {
        this.f17967e = i;
        if (this.f17983u == null) {
            this.f17983u = C6157o.m15466a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
        }
        this.f17983u.mo43032a(this.f17975m, (long) i2, i);
    }

    /* renamed from: g */
    public final CampaignEx mo49191g() {
        return this.f17971i;
    }

    /* renamed from: a */
    public final void mo49175a(CampaignEx campaignEx) {
        this.f17971i = campaignEx;
    }

    /* renamed from: c */
    public final void mo49186c(int i) {
        this.f17981s = i;
    }

    /* renamed from: h */
    public final long mo49192h() {
        return this.f17977o;
    }

    /* renamed from: d */
    public final void mo49188d(int i) {
        this.f17959B = i;
    }

    /* renamed from: a */
    public final void mo49174a(long j, boolean z) {
        C6157o oVar;
        C6361q.m16158d("CampaignDownLoadTask", "setStateToDone 下载完成  ： " + this.f17988z + "%  " + this.f17971i.getAppName());
        int i = this.f17981s;
        if ((i == 100 || i == 0) && this.f17964b != 3 && j != this.f17974l && !z) {
            mo49178a("File size is not match witch download size.");
            return;
        }
        this.f17967e = 5;
        m18214a(1, "");
        long j2 = this.f17974l;
        if (!(j2 == 0 || (oVar = this.f17983u) == null)) {
            oVar.mo43036b(this.f17975m, j2);
        }
        this.f17963a = false;
        m18215a(j, this.f17967e);
    }

    /* renamed from: a */
    public final void mo49178a(String str) {
        C7212a aVar = this.f17969g;
        if (aVar != null) {
            aVar.mo47025a(str, this.f17975m);
        }
        C7212a aVar2 = this.f17970h;
        if (aVar2 != null) {
            aVar2.mo47025a(str, this.f17975m);
        }
        C6361q.m16158d("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f17967e != 4 && this.f17967e != 2 && this.f17967e != 5) {
            this.f17967e = 4;
            m18215a(this.f17977o, this.f17967e);
        }
    }

    /* renamed from: i */
    public final void mo49193i() {
        C6361q.m16158d("CampaignDownLoadTask", "start()");
        DownloadRequest downloadRequest = this.f17986x;
        if (downloadRequest != null) {
            downloadRequest.start();
        }
    }

    /* renamed from: j */
    public final void mo49194j() {
        try {
            this.f17958A = true;
            C6361q.m16158d("CampaignDownLoadTask", "resume()");
            if (this.f17987y == null) {
                this.f17987y = new DownloadMessage(new Object(), this.f17975m, this.f17985w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            }
            DownloadRequest build = MBDownloadManager.getInstance().download(this.f17987y).withReadTimeout(30000).withConnectTimeout((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f17976n).withDownloadStateListener(this.f17961D).withProgressStateListener(this.f17962E).build();
            this.f17986x = build;
            build.start();
            m18224c(m18227e(2));
        } catch (Exception e) {
            C6361q.m16158d("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo49182b(String str) {
        m18238p();
        m18214a(2, str);
        this.f17967e = 4;
    }

    /* renamed from: a */
    public final void mo49176a(C7185d dVar) {
        CopyOnWriteArrayList<C7185d> copyOnWriteArrayList = this.f17968f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(dVar);
        }
    }

    /* renamed from: k */
    public final String mo49195k() {
        String str = "";
        if (this.f17964b == 3) {
            return str;
        }
        String str2 = this.f17976n + this.f17985w;
        File file = new File(str2);
        try {
            if (!file.exists()) {
                str = "file is not exist ";
            } else if (!file.isFile()) {
                str = "file is not file ";
            } else if (!file.canRead()) {
                str = "file can not read ";
            } else if (file.length() > 0) {
                this.f17978p = str2;
            } else {
                str = "file length is 0 ";
            }
        } catch (Throwable th) {
            C6361q.m16158d("CampaignDownLoadTask", th.getMessage());
            str = th.getMessage();
        }
        if (this.f17967e == 5 && !TextUtils.isEmpty(str)) {
            m18237o();
        }
        return str;
    }

    /* renamed from: a */
    public final void mo49177a(C7212a aVar) {
        this.f17969g = aVar;
    }

    /* renamed from: b */
    public final void mo49181b(C7212a aVar) {
        this.f17970h = aVar;
    }

    /* renamed from: a */
    private void m18215a(long j, int i) {
        this.f17977o = j;
        int i2 = this.f17981s;
        if (100 * j >= ((long) i2) * this.f17974l && !this.f17982t && i != 4) {
            if (i2 != 100 || i == 5) {
                this.f17982t = true;
                C6361q.m16158d("CampaignDownLoadTask", "UpdateListener : state: " + i + " progress : " + j);
                String k = mo49195k();
                if (TextUtils.isEmpty(k)) {
                    C7212a aVar = this.f17969g;
                    if (aVar != null) {
                        aVar.mo47024a(this.f17975m);
                    }
                    C7212a aVar2 = this.f17970h;
                    if (aVar2 != null) {
                        aVar2.mo47024a(this.f17975m);
                    }
                } else {
                    C7212a aVar3 = this.f17969g;
                    if (aVar3 != null) {
                        aVar3.mo47025a("file is not effective " + k, this.f17975m);
                    }
                    C7212a aVar4 = this.f17970h;
                    if (aVar4 != null) {
                        aVar4.mo47025a("file is not effective " + k, this.f17975m);
                    }
                }
            } else {
                this.f17967e = 5;
                return;
            }
        }
        if (!this.f17963a && j > 0) {
            this.f17963a = true;
            if (this.f17983u == null) {
                this.f17983u = C6157o.m15466a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
            }
            this.f17983u.mo43032a(this.f17975m, j, this.f17967e);
        }
        CopyOnWriteArrayList<C7185d> copyOnWriteArrayList = this.f17968f;
        if (copyOnWriteArrayList != null) {
            Iterator<C7185d> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C7185d next = it.next();
                if (next != null) {
                    next.mo49216a(j, i);
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo49196l() {
        if (this.f17968f != null) {
            this.f17968f = null;
        }
    }

    /* renamed from: o */
    private void m18237o() {
        if (this.f17983u == null) {
            this.f17983u = C6157o.m15466a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
        }
        try {
            this.f17983u.mo43037b(this.f17975m);
            File file = new File(this.f17978p);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        } catch (Throwable th) {
            this.f17967e = 0;
            throw th;
        }
        this.f17967e = 0;
    }

    /* renamed from: m */
    public final void mo49197m() {
        try {
            m18237o();
            if (this.f17971i == null || this.f17971i.getPlayable_ads_without_video() != 2) {
                C7167a a = C7167a.m18072a();
                if (a != null) {
                    a.mo49067a(this.f17971i);
                }
                this.f17967e = 0;
                return;
            }
            this.f17967e = 0;
        } catch (Exception unused) {
            C6361q.m16158d("CampaignDownLoadTask", "del file is failed");
        } catch (Throwable th) {
            this.f17967e = 0;
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m18238p() {
        try {
            Class<?> cls = Class.forName("com.mbridge.msdk.reward.a.a");
            Object newInstance = cls.newInstance();
            cls.getMethod("insertExcludeId", new Class[]{String.class, CampaignEx.class}).invoke(newInstance, new Object[]{this.f17972j, this.f17971i});
            Class<?> cls2 = Class.forName("com.mbridge.msdk.mbnative.c.b");
            Object newInstance2 = cls2.newInstance();
            cls2.getMethod("insertExcludeId", new Class[]{String.class, CampaignEx.class}).invoke(newInstance2, new Object[]{this.f17972j, this.f17971i});
        } catch (Exception e) {
            C6361q.m16158d("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18214a(int i, String str) {
        C6158p a = C6158p.m15475a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
        long j = 0;
        if (this.f17980r != 0) {
            j = System.currentTimeMillis() - this.f17980r;
        }
        C6203m mVar = new C6203m(this.f17973k, this.f17971i, i, Long.toString(j), this.f17974l, this.f17959B);
        mVar.mo43747n(this.f17971i.getId());
        mVar.mo43729e(this.f17971i.getVideoUrlEncode());
        mVar.mo43751p(str);
        mVar.mo43741k(this.f17971i.getRequestId());
        mVar.mo43745m(this.f17972j);
        a.mo43039a(mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m18224c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (C6301a.m15945a().mo43913c()) {
                    C6301a.m15945a().mo43911a(str);
                    return;
                }
                new C6326a(C6122a.m15302b().mo42895d()).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(str, C6122a.m15302b().mo42895d(), this.f17972j), (C6263e) null);
            } catch (Exception e) {
                C6361q.m16158d("CampaignDownLoadTask", e.getMessage());
            }
        }
    }

    /* renamed from: n */
    public final String mo49198n() {
        try {
            File file = new File(this.f17978p);
            if (file.exists() && file.isFile()) {
                return this.f17978p;
            }
        } catch (Exception e) {
            C6361q.m16158d("CampaignDownLoadTask", e.getMessage());
        }
        return this.f17975m;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m18227e(int i) {
        if (this.f17971i == null || TextUtils.isEmpty(this.f17972j) || TextUtils.isEmpty(this.f17971i.getRequestId()) || TextUtils.isEmpty(this.f17971i.getVideoUrlEncode())) {
            return "";
        }
        return "key=" + "2000077" + "&" + "unit_id=" + this.f17972j + "&" + "request_id=" + this.f17971i.getRequestId() + "&" + "request_id_notice=" + this.f17971i.getRequestIdNotice() + "&" + "package_name=" + C6122a.m15302b().mo42884a() + "&" + "app_id=" + C6122a.m15302b().mo42896e() + "&" + "video_url=" + URLEncoder.encode(this.f17971i.getVideoUrlEncode()) + "&" + "process_size=" + this.f17977o + "&" + "file_size=" + this.f17974l + "&" + "ready_rate=" + this.f17981s + "&" + "cd_rate=" + this.f17965c + "&" + "cid=" + this.f17971i.getId() + "&" + "type=" + this.f17967e + "&" + "video_download_status=" + i;
    }
}

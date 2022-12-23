package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.same.p167b.C6211c;
import com.mbridge.msdk.foundation.same.p167b.C6213e;
import com.mbridge.msdk.foundation.same.p170e.C6225a;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6370y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.videocommon.download.C7188f;
import com.mbridge.msdk.videocommon.download.C7200h;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.videocommon.download.g */
/* compiled from: H5DownLoadManager */
public class C7191g {

    /* renamed from: c */
    private static C7191g f18008c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CopyOnWriteArrayList<String> f18009a;

    /* renamed from: b */
    private ConcurrentMap<String, C7183b> f18010b;

    /* renamed from: d */
    private C7206j f18011d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C7200h f18012e;

    /* renamed from: f */
    private boolean f18013f = true;

    /* renamed from: com.mbridge.msdk.videocommon.download.g$a */
    /* compiled from: H5DownLoadManager */
    public interface C7196a {
        /* renamed from: a */
        void mo44018a(String str);

        /* renamed from: a */
        void mo44019a(String str, String str2);
    }

    /* renamed from: com.mbridge.msdk.videocommon.download.g$b */
    /* compiled from: H5DownLoadManager */
    public interface C7197b extends C7196a {
    }

    /* renamed from: com.mbridge.msdk.videocommon.download.g$c */
    /* compiled from: H5DownLoadManager */
    public interface C7198c {
        /* renamed from: a */
        void mo49199a();

        /* renamed from: a */
        void mo49201a(String str);

        /* renamed from: a */
        void mo49202a(String str, byte[] bArr, String str2);
    }

    /* renamed from: com.mbridge.msdk.videocommon.download.g$d */
    /* compiled from: H5DownLoadManager */
    public interface C7199d extends C7196a {
    }

    private C7191g() {
        try {
            this.f18011d = C7206j.m18320a();
            this.f18012e = C7200h.C7202a.f18026a;
            this.f18009a = new CopyOnWriteArrayList<>();
            this.f18010b = new ConcurrentHashMap();
            C6072a b = C6076b.m15089a().mo42749b("app_id");
            if (b != null) {
                this.f18013f = b.mo42698c(1);
            }
        } catch (Throwable th) {
            C6361q.m16155a("H5DownLoadManager", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public static synchronized C7191g m18286a() {
        C7191g gVar;
        synchronized (C7191g.class) {
            if (f18008c == null) {
                f18008c = new C7191g();
            }
            gVar = f18008c;
        }
        return gVar;
    }

    /* renamed from: a */
    public final String mo49218a(String str) {
        C7206j jVar = this.f18011d;
        if (jVar != null) {
            return jVar.mo49234a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo49219a(final String str, final C7196a aVar) {
        if (!this.f18013f) {
            try {
                C6361q.m16158d("H5DownLoadManager", "download url:" + str);
                if (!this.f18009a.contains(str)) {
                    this.f18009a.add(str);
                    C7188f.C7190a.f18007a.mo49217a(new C6225a() {
                        /* renamed from: b */
                        public final void mo42877b() {
                        }

                        /* renamed from: a */
                        public final void mo42876a() {
                            if (!TextUtils.isEmpty(C7191g.this.f18012e.mo49224b(str))) {
                                C7191g.this.f18009a.remove(str);
                                C7196a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo44018a(str);
                                    return;
                                }
                                return;
                            }
                            C7186e.m18282a(str, new C7198c() {
                                /* renamed from: a */
                                public final void mo49199a() {
                                }

                                /* renamed from: a */
                                public final void mo49202a(String str, byte[] bArr, String str2) {
                                    try {
                                        C7191g.this.f18009a.remove(str2);
                                        if (bArr != null && bArr.length > 0) {
                                            if (C7191g.this.f18012e.mo49223a(str2, bArr)) {
                                                if (aVar != null) {
                                                    aVar.mo44018a(str2);
                                                }
                                            } else if (aVar != null) {
                                                aVar.mo44019a(str2, "save file failed");
                                            }
                                        }
                                    } catch (Exception e) {
                                        if (MBridgeConstans.DEBUG) {
                                            e.printStackTrace();
                                        }
                                        if (aVar != null) {
                                            aVar.mo44019a(str2, e.getMessage());
                                        }
                                    }
                                }

                                /* renamed from: a */
                                public final void mo49201a(String str) {
                                    try {
                                        C7191g.this.f18009a.remove(str);
                                        if (aVar != null) {
                                            aVar.mo44019a(str, str);
                                        }
                                    } catch (Exception e) {
                                        if (MBridgeConstans.DEBUG) {
                                            e.printStackTrace();
                                        }
                                        if (aVar != null) {
                                            aVar.mo44019a(str, str);
                                        }
                                    }
                                }
                            }, true);
                        }
                    });
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        } else if (!TextUtils.isEmpty(str)) {
            try {
                new URL(str);
                String md5 = SameMD5.getMD5(C6370y.m16237a(str));
                MBDownloadManager.getInstance().download(new DownloadMessage(new Object(), str, md5 + ".html", 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML)).withReadTimeout(30000).withConnectTimeout((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(C6213e.m15725b(C6211c.MBRIDGE_700_HTML) + "/").withDownloadStateListener(new OnDownloadStateListener() {
                    public final void onDownloadStart(DownloadMessage downloadMessage) {
                    }

                    public final void onDownloadComplete(DownloadMessage downloadMessage) {
                        C7196a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo44018a(str);
                        }
                    }

                    public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                        C7196a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo44019a(str, downloadError.getException().getMessage());
                        }
                    }
                }).build().start();
            } catch (Exception unused) {
                if (aVar != null) {
                    aVar.mo44019a("zip url is unlawful", str);
                }
            }
        } else if (aVar != null) {
            aVar.mo44019a("zip url is null", str);
        }
    }

    /* renamed from: b */
    public final void mo49221b(String str, C7196a aVar) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        final C7199d dVar = (C7199d) aVar;
                        if (!this.f18013f) {
                            try {
                                if (TextUtils.isEmpty(this.f18011d.mo49234a(str))) {
                                    if (this.f18010b.containsKey(str)) {
                                        C7183b bVar = (C7183b) this.f18010b.get(str);
                                        if (bVar != null) {
                                            bVar.mo49200a(dVar);
                                            return;
                                        }
                                        return;
                                    }
                                    C7183b bVar2 = new C7183b(this.f18010b, this.f18011d, dVar, str);
                                    this.f18010b.put(str, bVar2);
                                    C7186e.m18282a(str, bVar2, true);
                                    return;
                                } else if (dVar != null) {
                                    dVar.mo44018a(str);
                                    return;
                                } else {
                                    return;
                                }
                            } catch (Exception e) {
                                if (dVar != null) {
                                    dVar.mo44019a(str, "downloadzip failed");
                                }
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                    return;
                                }
                                return;
                            }
                        } else if (!TextUtils.isEmpty(str)) {
                            try {
                                new URL(str);
                                String b = C6213e.m15725b(C6211c.MBRIDGE_700_RES);
                                String md5 = SameMD5.getMD5(C6370y.m16237a(str));
                                final String str2 = b + "/" + md5;
                                MBDownloadManager.getInstance().download(new DownloadMessage(new Object(), str, md5 + ".zip", 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP)).withReadTimeout(30000).withConnectTimeout((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(b + "/").withDownloadStateListener(new OnDownloadStateListener() {
                                    public final void onDownloadStart(DownloadMessage downloadMessage) {
                                    }

                                    public final void onDownloadComplete(DownloadMessage downloadMessage) {
                                        try {
                                            if (TextUtils.isEmpty(C7206j.m18320a().mo49234a(downloadMessage.getDownloadUrl()))) {
                                                MBResourceManager.getInstance().unZip(downloadMessage.getSaveFilePath(), str2);
                                            }
                                            if (dVar != null) {
                                                dVar.mo44018a(downloadMessage.getDownloadUrl());
                                            }
                                        } catch (IOException e) {
                                            C7199d dVar = dVar;
                                            if (dVar != null) {
                                                dVar.mo44019a(downloadMessage.getDownloadUrl(), e.getMessage());
                                            }
                                        }
                                    }

                                    public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                                        if (!TextUtils.isEmpty(C7206j.m18320a().mo49234a(downloadMessage.getDownloadUrl()))) {
                                            C7199d dVar = dVar;
                                            if (dVar != null) {
                                                dVar.mo44018a(downloadMessage.getDownloadUrl());
                                                return;
                                            }
                                            return;
                                        }
                                        C7199d dVar2 = dVar;
                                        if (dVar2 != null) {
                                            dVar2.mo44019a(downloadMessage.getDownloadUrl(), downloadError.getException().getMessage());
                                        }
                                    }
                                }).build().start();
                                return;
                            } catch (Exception unused) {
                                if (dVar != null) {
                                    dVar.mo44019a(str, "zip url is unlawful");
                                    return;
                                }
                                return;
                            }
                        } else if (dVar != null) {
                            dVar.mo44019a(str, "zip url is null");
                            return;
                        } else {
                            return;
                        }
                    } else {
                        mo49219a(str, aVar);
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (aVar != null) {
            aVar.mo44019a(str, "The URL does not contain a path ");
        }
    }

    /* renamed from: b */
    public final String mo49220b(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri parse = Uri.parse(str);
                String path = parse.getPath();
                if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
                    return str;
                }
                if (path.toLowerCase().endsWith(".zip")) {
                    return mo49218a(str);
                }
                return this.f18012e != null ? this.f18012e.mo49222a(str) : str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}

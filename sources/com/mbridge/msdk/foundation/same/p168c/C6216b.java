package com.mbridge.msdk.foundation.same.p168c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.foundation.same.p166a.C6205a;
import com.mbridge.msdk.foundation.same.p166a.C6207c;
import com.mbridge.msdk.foundation.same.p168c.C6220d;
import com.mbridge.msdk.foundation.same.p170e.C6228b;
import com.mbridge.msdk.foundation.tools.C6364t;
import com.mbridge.msdk.foundation.tools.C6366u;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.c.b */
/* compiled from: CommonImageLoader */
public final class C6216b {

    /* renamed from: a */
    private static C6216b f15450a;

    /* renamed from: b */
    private C6228b f15451b;

    /* renamed from: c */
    private C6207c<String, Bitmap> f15452c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LinkedHashMap<String, List<C6219c>> f15453d = new LinkedHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f15454e = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    String string = message.getData().getString("message_key");
                    Bitmap a = C6215a.m15727a(message.getData().getString("message_bitmap"));
                    C6216b.this.mo43785a(string, a);
                    LinkedList linkedList = (LinkedList) C6216b.this.f15453d.get(string);
                    if (linkedList != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            C6219c cVar = (C6219c) it.next();
                            if (cVar != null) {
                                cVar.onSuccessLoad(a, string);
                            }
                        }
                    }
                    C6216b.this.f15453d.remove(string);
                } else if (message.what == 2) {
                    String string2 = message.getData().getString("message_key");
                    String string3 = message.getData().getString("message_message");
                    LinkedList linkedList2 = (LinkedList) C6216b.this.f15453d.get(string2);
                    if (linkedList2 != null) {
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            C6219c cVar2 = (C6219c) it2.next();
                            if (cVar2 != null) {
                                cVar2.onFailedLoad(string3, string2);
                            }
                        }
                    }
                    C6216b.this.f15453d.remove(string2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    /* renamed from: a */
    public final void mo43785a(String str, Bitmap bitmap) {
        if (m15735c(str) == null && bitmap != null) {
            this.f15452c.mo43766a(str, bitmap);
        }
    }

    /* renamed from: c */
    private Bitmap m15735c(String str) {
        return this.f15452c.mo43764a(str);
    }

    private C6216b(Context context) {
        this.f15451b = new C6228b(context);
        this.f15452c = new C6205a(((int) Runtime.getRuntime().maxMemory()) / 5);
    }

    /* renamed from: a */
    public static C6216b m15729a(Context context) {
        if (f15450a == null) {
            f15450a = new C6216b(context);
        }
        return f15450a;
    }

    /* renamed from: a */
    public static void m15732a() {
        f15450a.mo43787b();
    }

    /* renamed from: a */
    public final void mo43786a(String str, C6219c cVar) {
        String a = C6364t.m16173a(str);
        if (!C6366u.m16200a(str) && !C6366u.m16200a(str) && !C6366u.m16200a(a)) {
            File file = new File(a);
            Bitmap c = m15735c(str);
            if (c != null && !c.isRecycled()) {
                cVar.onSuccessLoad(c, str);
            } else if (file.exists()) {
                Bitmap a2 = C6215a.m15727a(a);
                if (a2 == null || a2.isRecycled()) {
                    m15733a(str, str, a, true, false, cVar);
                    return;
                }
                mo43785a(str, a2);
                cVar.onSuccessLoad(a2, str);
            } else {
                m15733a(str, str, a, false, false, cVar);
            }
        }
    }

    /* renamed from: a */
    public final Bitmap mo43784a(String str) {
        Bitmap a;
        if (C6366u.m16200a(str)) {
            return null;
        }
        String a2 = C6364t.m16173a(str);
        File file = new File(a2);
        if (m15735c(str) != null) {
            return m15735c(str);
        }
        if (!file.exists() || (a = C6215a.m15727a(a2)) == null) {
            return null;
        }
        mo43785a(str, a);
        return a;
    }

    /* renamed from: b */
    public final boolean mo43788b(String str) {
        if (C6366u.m16200a(str)) {
            return false;
        }
        File file = new File(C6364t.m16173a(str));
        if (m15735c(str) == null && !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m15733a(String str, String str2, String str3, boolean z, boolean z2, C6219c cVar) {
        if (!this.f15453d.containsKey(str2)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(cVar);
            this.f15453d.put(str2, linkedList);
            this.f15451b.mo43807a(m15730a(str, str2, str3, z, z2));
            return;
        }
        LinkedList linkedList2 = (LinkedList) this.f15453d.get(str2);
        if (linkedList2 != null && !linkedList2.contains(cVar)) {
            linkedList2.add(cVar);
        }
    }

    /* renamed from: a */
    private C6220d m15730a(String str, String str2, String str3, boolean z, boolean z2) {
        C62182 r6 = new C6220d.C6222a() {
            /* renamed from: a */
            public final void mo43790a(String str, String str2) {
                Message obtainMessage = C6216b.this.f15454e.obtainMessage();
                obtainMessage.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString("message_key", str);
                bundle.putString("message_bitmap", str2);
                obtainMessage.setData(bundle);
                C6216b.this.f15454e.sendMessage(obtainMessage);
            }

            /* renamed from: b */
            public final void mo43791b(String str, String str2) {
                Message obtainMessage = C6216b.this.f15454e.obtainMessage();
                obtainMessage.what = 2;
                Bundle bundle = new Bundle();
                bundle.putString("message_key", str);
                bundle.putString("message_message", str2);
                obtainMessage.setData(bundle);
                C6216b.this.f15454e.sendMessage(obtainMessage);
            }
        };
        C6220d dVar = new C6220d(str, str2, str3);
        dVar.mo43795a(z);
        dVar.mo43794a((C6220d.C6222a) r6);
        return dVar;
    }

    /* renamed from: b */
    public final void mo43787b() {
        C6207c<String, Bitmap> cVar = this.f15452c;
        if (cVar != null) {
            cVar.mo43765a();
        }
    }
}

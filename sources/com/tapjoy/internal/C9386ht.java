package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyUtil;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.ht */
public final class C9386ht {

    /* renamed from: a */
    public static final C9386ht f23261a = new C9386ht();

    /* renamed from: b */
    public Context f23262b;

    /* renamed from: c */
    public SharedPreferences f23263c = null;

    /* renamed from: d */
    public SharedPreferences f23264d = null;

    /* renamed from: e */
    ExecutorService f23265e = new ThreadPoolExecutor(0, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: f */
    private File f23266f;

    /* renamed from: a */
    public static boolean m25212a(long j) {
        return j >= 3600;
    }

    private C9386ht() {
    }

    /* renamed from: a */
    public final void mo58321a() {
        this.f23265e.submit(new Runnable() {
            public final void run() {
                if (C9386ht.this.f23262b != null) {
                    C9386ht.this.m25215c();
                }
            }
        });
    }

    /* renamed from: a */
    public final File mo58320a(URL url) {
        if (this.f23262b == null) {
            return null;
        }
        synchronized (this) {
            String b = mo58323b(url);
            File a = mo58319a(b);
            if (!a.exists()) {
                return null;
            }
            long b2 = C9503v.m25545b();
            long j = this.f23263c.getLong(b, 0);
            if (j >= b2) {
                return a;
            }
            Long.valueOf(b2);
            Long.valueOf(j);
            if (j != 0) {
                this.f23263c.edit().remove(b).commit();
                this.f23264d.edit().remove(b).commit();
            }
            a.delete();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized String mo58323b(URL url) {
        String str;
        String string;
        String url2 = url.toString();
        String convertToHex = TapjoyUtil.convertToHex(C9127ch.m24464a(url2.getBytes()));
        String string2 = this.f23264d.getString(convertToHex, (String) null);
        if (string2 == null) {
            this.f23264d.edit().putString(convertToHex, url2).commit();
            return convertToHex;
        } else if (string2.equals(url2)) {
            return convertToHex;
        } else {
            int i = 0;
            do {
                i++;
                str = convertToHex + "_" + i;
                string = this.f23264d.getString(str, (String) null);
                if (string == null || string.equals(url2)) {
                    this.f23264d.edit().putString(str, url2).commit();
                }
                i++;
                str = convertToHex + "_" + i;
                string = this.f23264d.getString(str, (String) null);
                break;
            } while (string.equals(url2));
            this.f23264d.edit().putString(str, url2).commit();
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo58322b() {
        File file = this.f23266f;
        if (file == null) {
            file = new File(this.f23262b.getCacheDir(), "tapjoy_mm_cache");
            this.f23266f = file;
        }
        if (!file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo58319a(String str) {
        return new File(mo58322b(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m25215c() {
        boolean z;
        long b = C9503v.m25545b();
        File[] listFiles = mo58322b().listFiles();
        HashMap hashMap = new HashMap();
        if (listFiles != null) {
            for (File file : listFiles) {
                hashMap.put(file.getName(), file);
            }
        }
        SharedPreferences.Editor edit = this.f23263c.edit();
        SharedPreferences.Editor edit2 = this.f23264d.edit();
        HashMap hashMap2 = new HashMap(this.f23263c.getAll());
        HashMap hashMap3 = new HashMap(this.f23264d.getAll());
        Iterator it = hashMap2.entrySet().iterator();
        boolean z2 = false;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (!hashMap3.containsKey(str)) {
                it.remove();
                edit.remove(str);
                z2 = true;
            }
        }
        Iterator it2 = hashMap3.entrySet().iterator();
        while (it2.hasNext()) {
            String str2 = (String) ((Map.Entry) it2.next()).getKey();
            if (!hashMap2.containsKey(str2)) {
                it2.remove();
                edit2.remove(str2);
                z2 = true;
            }
        }
        Iterator it3 = hashMap2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            String str3 = (String) entry.getKey();
            if (((Long) entry.getValue()).longValue() < b) {
                it3.remove();
                edit.remove(str3);
                edit2.remove(str3);
                z2 = true;
            } else {
                hashMap.remove(str3);
            }
        }
        for (Map.Entry value : hashMap.entrySet()) {
            ((File) value.getValue()).delete();
        }
        if (hashMap2.size() > 30) {
            int size = hashMap2.size() - 30;
            LinkedList linkedList = new LinkedList(hashMap2.entrySet());
            Collections.sort(linkedList, new Comparator() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((Long) ((Map.Entry) obj).getValue()).compareTo((Long) ((Map.Entry) obj2).getValue());
                }
            });
            Iterator it4 = linkedList.iterator();
            for (int i = 0; i < size && it4.hasNext(); i++) {
                Map.Entry entry2 = (Map.Entry) it4.next();
                String str4 = (String) entry2.getKey();
                Long l = (Long) entry2.getValue();
                edit.remove(str4);
                edit2.remove(str4);
                mo58319a(str4).delete();
            }
        } else {
            z = z2;
        }
        if (z) {
            edit.commit();
            edit2.commit();
        }
    }
}

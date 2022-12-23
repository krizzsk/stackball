package com.ironsource.mediationsdk.utils;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5677b;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.utils.e */
public final class C5794e {

    /* renamed from: a */
    public Map<String, Integer> f13941a;

    /* renamed from: b */
    C5793d f13942b;

    /* renamed from: c */
    public IronSourceLoggerManager f13943c;

    /* renamed from: d */
    private Map<String, Integer> f13944d;

    /* renamed from: e */
    private Map<String, String> f13945e;

    /* renamed from: f */
    private String f13946f;

    /* renamed from: g */
    private Timer f13947g = null;

    public C5794e(String str, C5793d dVar) {
        this.f13946f = str;
        this.f13942b = dVar;
        this.f13941a = new HashMap();
        this.f13944d = new HashMap();
        this.f13945e = new HashMap();
        this.f13943c = IronSourceLoggerManager.getLogger();
        mo42116a();
    }

    /* renamed from: a */
    private void m14306a(String str, int i) {
        this.f13944d.put(str, Integer.valueOf(i));
        this.f13945e.put(str, m14309c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m14312e(str), i);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m14313f(str), m14309c());
    }

    /* renamed from: b */
    private int m14307b(String str) {
        if (!m14309c().equalsIgnoreCase(m14310c(str))) {
            mo42118a(str);
        }
        return m14311d(str);
    }

    /* renamed from: b */
    private static Date m14308b() {
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        return gregorianCalendar.getTime();
    }

    /* renamed from: c */
    private static String m14309c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    /* renamed from: c */
    private String m14310c(String str) {
        if (this.f13945e.containsKey(str)) {
            return this.f13945e.get(str);
        }
        String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m14313f(str), m14309c());
        this.f13945e.put(str, stringFromSharedPrefs);
        return stringFromSharedPrefs;
    }

    /* renamed from: d */
    private int m14311d(String str) {
        if (this.f13944d.containsKey(str)) {
            return this.f13944d.get(str).intValue();
        }
        int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m14312e(str), 0);
        this.f13944d.put(str, Integer.valueOf(intFromSharedPrefs));
        return intFromSharedPrefs;
    }

    /* renamed from: e */
    private static String m14312e(String str) {
        return str + "_counter";
    }

    /* renamed from: f */
    private static String m14313f(String str) {
        return str + "_day";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo42116a() {
        Timer timer = this.f13947g;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f13947g = timer2;
        timer2.schedule(new TimerTask() {
            public final void run() {
                C5794e eVar = C5794e.this;
                synchronized (eVar) {
                    try {
                        for (String a : eVar.f13941a.keySet()) {
                            eVar.mo42118a(a);
                        }
                        eVar.f13942b.mo41338g();
                        eVar.mo42116a();
                    } catch (Exception e) {
                        eVar.f13943c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onTimerTick", e);
                    }
                }
            }
        }, m14308b());
    }

    /* renamed from: a */
    public final void mo42117a(C5677b bVar) {
        synchronized (this) {
            try {
                String d = mo42121d(bVar);
                if (this.f13941a.containsKey(d)) {
                    m14306a(d, m14307b(d) + 1);
                }
            } catch (Exception e) {
                this.f13943c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "increaseShowCounter", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo42118a(String str) {
        this.f13944d.put(str, 0);
        this.f13945e.put(str, m14309c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m14312e(str), 0);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m14313f(str), m14309c());
    }

    /* renamed from: b */
    public final boolean mo42119b(C5677b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d = mo42121d(bVar);
                if (!this.f13941a.containsKey(d)) {
                    return false;
                }
                if (m14309c().equalsIgnoreCase(m14310c(d))) {
                    return false;
                }
                if (this.f13941a.get(d).intValue() <= m14311d(d)) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                this.f13943c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "shouldSendCapReleasedEvent", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo42120c(C5677b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d = mo42121d(bVar);
                if (!this.f13941a.containsKey(d)) {
                    return false;
                }
                if (this.f13941a.get(d).intValue() <= m14307b(d)) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                this.f13943c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "isCapped", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public String mo42121d(C5677b bVar) {
        return this.f13946f + "_" + bVar.f13494f + "_" + bVar.mo41811j();
    }
}

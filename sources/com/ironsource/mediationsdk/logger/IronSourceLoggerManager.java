package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;
import java.util.Iterator;

public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {

    /* renamed from: c */
    private static IronSourceLoggerManager f13674c;

    /* renamed from: d */
    private ArrayList<IronSourceLogger> f13675d;

    private IronSourceLoggerManager(String str) {
        super(str);
        ArrayList<IronSourceLogger> arrayList = new ArrayList<>();
        this.f13675d = arrayList;
        arrayList.add(new C5713a(0));
    }

    public static synchronized IronSourceLoggerManager getLogger() {
        IronSourceLoggerManager ironSourceLoggerManager;
        Class<IronSourceLoggerManager> cls = IronSourceLoggerManager.class;
        synchronized (cls) {
            if (f13674c == null) {
                f13674c = new IronSourceLoggerManager(cls.getSimpleName());
            }
            ironSourceLoggerManager = f13674c;
        }
        return ironSourceLoggerManager;
    }

    public static synchronized IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager ironSourceLoggerManager;
        Class<IronSourceLoggerManager> cls = IronSourceLoggerManager.class;
        synchronized (cls) {
            if (f13674c == null) {
                f13674c = new IronSourceLoggerManager(cls.getSimpleName());
            } else {
                f13674c.f13670a = i;
            }
            ironSourceLoggerManager = f13674c;
        }
        return ironSourceLoggerManager;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f13675d.add(ironSourceLogger);
    }

    public synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (i >= this.f13670a) {
            Iterator<IronSourceLogger> it = this.f13675d.iterator();
            while (it.hasNext()) {
                IronSourceLogger next = it.next();
                if (next.f13670a <= i) {
                    next.log(ironSourceTag, str, i);
                }
            }
        }
    }

    public synchronized void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.f13675d.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
            return;
        }
        Iterator<IronSourceLogger> it2 = this.f13675d.iterator();
        while (it2.hasNext()) {
            it2.next().logException(ironSourceTag, str, th);
        }
    }

    public synchronized void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(String str, int i) {
        if (str != null) {
            IronSourceLogger ironSourceLogger = null;
            Iterator<IronSourceLogger> it = this.f13675d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IronSourceLogger next = it.next();
                if (next.f13671b.equals(str)) {
                    ironSourceLogger = next;
                    break;
                }
            }
            if (ironSourceLogger == null) {
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                log(ironSourceTag, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            } else if (i < 0 || i > 3) {
                this.f13675d.remove(ironSourceLogger);
            } else {
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
                log(ironSourceTag2, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
                ironSourceLogger.setDebugLevel(i);
            }
        }
    }
}

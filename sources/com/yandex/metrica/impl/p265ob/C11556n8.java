package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p264ac.CrashpadServiceHelper;

/* renamed from: com.yandex.metrica.impl.ob.n8 */
public class C11556n8 implements Runnable {
    public void run() {
        CrashpadServiceHelper.deleteCompletedReports();
    }
}

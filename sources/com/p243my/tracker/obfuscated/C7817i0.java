package com.p243my.tracker.obfuscated;

import android.app.Application;
import com.p243my.tracker.plugins.MyTrackerPlugin;
import com.p243my.tracker.plugins.MyTrackerPluginConfig;
import com.p243my.tracker.plugins.PluginEventTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.i0 */
public final class C7817i0 {

    /* renamed from: a */
    private final List<MyTrackerPlugin> f19884a = new ArrayList();

    /* renamed from: b */
    private final AtomicBoolean f19885b = new AtomicBoolean();

    /* renamed from: c */
    private final PluginEventTracker f19886c;

    /* renamed from: d */
    private final Application f19887d;

    private C7817i0(PluginEventTracker pluginEventTracker, Application application) {
        this.f19886c = pluginEventTracker;
        this.f19887d = application;
    }

    /* renamed from: a */
    public static C7817i0 m21191a(C7828m mVar, Application application) {
        return new C7817i0(PluginEventTracker.newTracker(mVar), application);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21192b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();
            String pluginName = myTrackerPluginConfig.getPluginName();
            C7877u0.m21553c("PluginHandler: initializing plugin " + pluginName);
            try {
                MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();
                myTrackerPlugin.init(myTrackerPluginConfig, this.f19886c, this.f19887d);
                this.f19884a.add(myTrackerPlugin);
                C7877u0.m21553c("PluginHandler: plugin " + pluginName + " is initialized");
            } catch (Throwable th) {
                C7877u0.m21552b("PluginHandler: exception occurred while initialization plugin " + pluginName, th);
            }
        }
    }

    /* renamed from: a */
    public void mo52291a(List<MyTrackerPluginConfig> list) {
        if (!this.f19885b.compareAndSet(false, true)) {
            C7877u0.m21547a("PluginHandler: instance has already been initialized");
        } else {
            C7806d.m21130a(new Runnable(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C7817i0.this.m21192b(this.f$1);
                }
            });
        }
    }
}

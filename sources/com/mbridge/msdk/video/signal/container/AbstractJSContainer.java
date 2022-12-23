package com.mbridge.msdk.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.C7050a;
import com.mbridge.msdk.video.signal.C7067b;
import com.mbridge.msdk.video.signal.C7068c;
import com.mbridge.msdk.video.signal.C7155e;
import com.mbridge.msdk.video.signal.C7156f;
import com.mbridge.msdk.video.signal.C7160h;
import com.mbridge.msdk.video.signal.C7161i;
import com.mbridge.msdk.video.signal.factory.C7157a;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.p235a.C7062j;
import com.mbridge.msdk.videocommon.C7165a;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import org.json.JSONObject;

public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: a */
    private int f17836a = 0;

    /* renamed from: b */
    private int f17837b = 1;
    /* access modifiers changed from: protected */

    /* renamed from: j */
    public Activity f17838j;
    /* access modifiers changed from: protected */

    /* renamed from: k */
    public String f17839k;
    /* access modifiers changed from: protected */

    /* renamed from: l */
    public String f17840l;

    /* renamed from: m */
    protected C7179c f17841m;

    /* renamed from: n */
    protected String f17842n;

    /* renamed from: o */
    protected C7170c f17843o;

    /* renamed from: p */
    protected String f17844p;

    /* renamed from: q */
    protected int f17845q = 2;
    /* access modifiers changed from: protected */

    /* renamed from: r */
    public boolean f17846r = false;

    /* renamed from: s */
    protected boolean f17847s = false;

    /* renamed from: t */
    protected int f17848t;

    /* renamed from: u */
    protected int f17849u;

    /* renamed from: v */
    protected int f17850v;
    /* access modifiers changed from: protected */

    /* renamed from: w */
    public boolean f17851w = false;

    /* renamed from: x */
    protected IJSFactory f17852x = new C7157a();

    public AbstractJSContainer(Context context) {
        super(context);
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f17852x = iJSFactory;
    }

    public void onResume() {
        if (getJSCommon().mo48811b()) {
            getActivityProxy().mo48793b();
        }
        getActivityProxy().mo48791a(0);
    }

    public void onPause() {
        if (getJSCommon().mo48811b()) {
            getActivityProxy().mo48790a();
        }
        getActivityProxy().mo48791a(1);
    }

    public void onStop() {
        if (getJSCommon().mo48811b()) {
            getActivityProxy().mo48794c();
        }
        getActivityProxy().mo48791a(3);
    }

    public void onRestart() {
        if (getJSCommon().mo48811b()) {
            getActivityProxy().mo48796e();
        }
        getActivityProxy().mo48791a(4);
    }

    public void onStart() {
        if (getJSCommon().mo48811b()) {
            getActivityProxy().mo48795d();
        }
        getActivityProxy().mo48791a(2);
    }

    public void onDestroy() {
        if (getJSCommon().mo48811b()) {
            getActivityProxy().mo48797f();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().mo48811b()) {
            getActivityProxy().mo48792a(configuration);
        }
    }

    public C7050a getActivityProxy() {
        return this.f17852x.getActivityProxy();
    }

    public C7068c getJSCommon() {
        return this.f17852x.getJSCommon();
    }

    public C7161i getJSVideoModule() {
        return this.f17852x.getJSVideoModule();
    }

    public C7156f getJSNotifyProxy() {
        return this.f17852x.getJSNotifyProxy();
    }

    public C7155e getJSContainerModule() {
        return this.f17852x.getJSContainerModule();
    }

    public C7160h getIJSRewardVideoV1() {
        return this.f17852x.getIJSRewardVideoV1();
    }

    public C7067b getJSBTModule() {
        return this.f17852x.getJSBTModule();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49029a(Object obj) {
        C6563g.m16891a().mo44523a(obj, m18035a(this.f17836a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49030a(Object obj, String str) {
        C6563g.m16891a().mo44525b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    /* renamed from: a */
    private String m18035a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C6361q.m16158d("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    public void setRewardId(String str) {
        this.f17844p = str;
    }

    public void setUserId(String str) {
        this.f17842n = str;
    }

    public void setUnitId(String str) {
        this.f17839k = str;
    }

    public String getUnitId() {
        return this.f17839k;
    }

    public String getPlacementId() {
        return this.f17840l;
    }

    public void setPlacementId(String str) {
        this.f17840l = str;
    }

    public void setActivity(Activity activity) {
        this.f17838j = activity;
    }

    public void setReward(C7170c cVar) {
        this.f17843o = cVar;
    }

    public void setMute(int i) {
        this.f17845q = i;
    }

    public void setIV(boolean z) {
        this.f17846r = z;
    }

    public void setBidCampaign(boolean z) {
        this.f17847s = z;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.f17848t = i;
        this.f17849u = i2;
        this.f17850v = i3;
    }

    public void setBigOffer(boolean z) {
        this.f17851w = z;
    }

    public void setRewardUnitSetting(C7179c cVar) {
        this.f17841m = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo48267a(String str) {
        C6361q.m16158d("AbstractJSContainer", str);
        Activity activity = this.f17838j;
        if (activity != null) {
            activity.finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C7062j mo49031b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        C7165a.C7166a a = C7165a.m18054a(this.f17846r ? 287 : 94, campaignEx);
        if (a != null && a.mo49059c()) {
            WindVaneWebView a2 = a.mo49054a();
            if (a2.getObject() instanceof C7062j) {
                return (C7062j) a2.getObject();
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo49033c(CampaignEx campaignEx) {
        C7062j b = mo49031b(campaignEx);
        if (b != null) {
            return b.mo48827l();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49028a(C7179c cVar, CampaignEx campaignEx) {
        CampaignEx.C6189c rewardTemplateMode;
        if (mo49033c(campaignEx) != 1) {
            boolean z = false;
            if (!(campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null)) {
                z = m18036b(rewardTemplateMode.mo43508b());
            }
            if (!z && cVar != null) {
                m18036b(this.f17841m.mo49126c());
            }
        }
    }

    /* renamed from: b */
    private boolean m18036b(int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f17838j.setRequestedOrientation(11);
                } else {
                    this.f17838j.setRequestedOrientation(0);
                }
            } catch (Throwable th) {
                C6361q.m16155a("AbstractJSContainer", th.getMessage(), th);
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 18) {
            this.f17838j.setRequestedOrientation(12);
        } else {
            this.f17838j.setRequestedOrientation(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo49032b() {
        C7179c cVar;
        if (!TextUtils.isEmpty(this.f17840l) || (cVar = this.f17841m) == null || TextUtils.isEmpty(cVar.mo49169z())) {
            return this.f17840l;
        }
        return this.f17841m.mo49169z();
    }
}

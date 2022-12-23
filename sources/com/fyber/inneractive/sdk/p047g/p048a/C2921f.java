package com.fyber.inneractive.sdk.p047g.p048a;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.p037d.p038a.C2817a;
import com.fyber.inneractive.sdk.util.C3643ap;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.g.a.f */
public final class C2921f {

    /* renamed from: a */
    public Integer f6969a;

    /* renamed from: b */
    public Integer f6970b;

    /* renamed from: c */
    public C2924i f6971c;

    /* renamed from: d */
    public String f6972d;

    /* renamed from: e */
    public String f6973e;

    /* renamed from: f */
    public String f6974f;

    /* renamed from: g */
    public List<String> f6975g;

    /* renamed from: h */
    public C2817a.C2818a f6976h;

    /* renamed from: i */
    public List<C2932q> f6977i;

    /* renamed from: j */
    private String f6978j;

    /* renamed from: k */
    private String f6979k;

    /* renamed from: l */
    private Integer f6980l;

    /* renamed from: m */
    private Integer f6981m;

    C2921f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18384a(Node node) {
        C2924i iVar;
        this.f6969a = C3643ap.m9067d(node, "width");
        this.f6970b = C3643ap.m9067d(node, "height");
        this.f6978j = C3643ap.m9066c(node, "id");
        this.f6979k = C3643ap.m9066c(node, "apiFramework");
        this.f6980l = C3643ap.m9067d(node, Companion.EXPANDED_WIDTH);
        this.f6981m = C3643ap.m9067d(node, Companion.EXPANDED_HEIGHT);
        Node a = C3643ap.m9064a(node, "StaticResource");
        if (a != null) {
            if (a == null) {
                iVar = null;
            } else {
                C2924i iVar2 = new C2924i();
                iVar2.f6993a = C3643ap.m9066c(a, StaticResource.CREATIVE_TYPE);
                iVar2.f6994b = C3643ap.m9063a(a);
                iVar = iVar2;
            }
            if (iVar != null) {
                this.f6971c = iVar;
            }
        }
        Node a2 = C3643ap.m9064a(node, "HTMLResource");
        if (a2 != null) {
            this.f6973e = C3643ap.m9063a(a2);
        }
        Node a3 = C3643ap.m9064a(node, "IFrameResource");
        if (a3 != null) {
            this.f6972d = C3643ap.m9063a(a3);
        }
        Node a4 = C3643ap.m9064a(node, Companion.COMPANION_CLICK_THROUGH);
        if (a4 != null) {
            this.f6974f = C3643ap.m9063a(a4);
        }
        List<Node> b = C3643ap.m9065b(node, Companion.COMPANION_CLICK_TRACKING);
        if (b.size() > 0) {
            this.f6975g = new ArrayList();
            for (Node a5 : b) {
                String a6 = C3643ap.m9063a(a5);
                if (!TextUtils.isEmpty(a6)) {
                    this.f6975g.add(a6);
                }
            }
        }
        Node a7 = C3643ap.m9064a(node, "TrackingEvents");
        if (a7 != null) {
            List<Node> b2 = C3643ap.m9065b(a7, C8938Tracking.NAME);
            if (!b2.isEmpty()) {
                this.f6977i = new ArrayList();
                for (Node a8 : b2) {
                    C2932q a9 = C2932q.m6559a(a8);
                    if (a9 != null) {
                        this.f6977i.add(a9);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo18383a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f6969a);
            jSONObject.put("h", this.f6970b);
            jSONObject.put("ctr", this.f6974f);
            jSONObject.put("clt", this.f6975g);
            if (this.f6973e != null) {
                jSONObject.put("content", this.f6973e);
                str = "HTMLResource";
            } else {
                str = null;
            }
            if (this.f6971c != null) {
                jSONObject.put("content", this.f6971c.f6994b);
                jSONObject.put(StaticResource.CREATIVE_TYPE, this.f6971c.f6993a);
                str = "StaticResource";
            }
            if (!TextUtils.isEmpty(this.f6972d)) {
                jSONObject.put("content", this.f6972d);
                str = "iFrameResource";
            }
            if (str != null) {
                jSONObject.put("type", str);
            }
            if (this.f6976h != null) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, this.f6976h.f6682a);
            }
            return jSONObject;
        } catch (JSONException e) {
            IAlog.m9034b("Failed creating Companion json object: %s", e.getMessage());
            return null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.f6969a);
        sb.append(" h:");
        sb.append(this.f6970b);
        sb.append(" ctr:");
        sb.append(this.f6974f);
        sb.append(" clt:");
        sb.append(this.f6975g);
        if (!TextUtils.isEmpty(this.f6973e)) {
            sb.append(" html:");
            sb.append(this.f6973e);
        }
        if (this.f6971c != null) {
            sb.append(" static:");
            sb.append(this.f6971c.f6994b);
            sb.append("creative:");
            sb.append(this.f6971c.f6993a);
        }
        if (!TextUtils.isEmpty(this.f6972d)) {
            sb.append(" iframe:");
            sb.append(this.f6972d);
        }
        sb.append(" events:");
        sb.append(this.f6977i);
        if (this.f6976h != null) {
            sb.append(" reason:");
            sb.append(this.f6976h.f6682a);
        }
        return sb.toString();
    }
}

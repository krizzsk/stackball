package com.fyber.inneractive.sdk.p037d.p038a;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.p047g.p048a.C2928m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.d.a.f */
public final class C2824f {
    /* renamed from: a */
    public static C2968n.C2971b m6174a(Map<C2928m, C2820c> map) {
        int i;
        Set<C2928m> keySet = map.keySet();
        if (keySet == null || keySet.size() <= 0) {
            return null;
        }
        C2968n.C2971b bVar = new C2968n.C2971b();
        JSONArray jSONArray = new JSONArray();
        for (C2928m next : keySet) {
            try {
                C2820c cVar = map.get(next);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", next.f7016j);
                jSONObject.put(MediaFile.BITRATE, next.f7012f);
                jSONObject.put("mime", TextUtils.isEmpty(next.f7010d) ? "na" : next.f7010d);
                jSONObject.put(MediaFile.DELIVERY, next.f7007a);
                if (cVar.f6686a != null) {
                    i = cVar.f6686a.f6696h;
                } else {
                    i = 0;
                }
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, i);
                jSONObject.put("required_value", cVar.f6687b);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
                IAlog.m9034b("VastResponseValidator: Failed converting media file data to Extra data json!", new Object[0]);
                return null;
            }
        }
        bVar.mo18438a("media_files", jSONArray);
        return bVar;
    }
}

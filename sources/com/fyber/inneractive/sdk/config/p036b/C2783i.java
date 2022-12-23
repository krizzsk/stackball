package com.fyber.inneractive.sdk.config.p036b;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.b.i */
public final class C2783i {

    /* renamed from: a */
    public Boolean f6559a;

    /* renamed from: b */
    public Integer f6560b;

    /* renamed from: c */
    public Integer f6561c;

    /* renamed from: d */
    public Skip f6562d;

    /* renamed from: e */
    public Boolean f6563e;

    /* renamed from: f */
    public TapAction f6564f;

    /* renamed from: g */
    public Orientation f6565g;

    /* renamed from: h */
    public Integer f6566h;

    /* renamed from: i */
    public Integer f6567i;

    /* renamed from: j */
    public UnitDisplayType f6568j;

    /* renamed from: k */
    public List<Integer> f6569k = new ArrayList();

    /* renamed from: a */
    public static C2783i m6056a(JSONObject jSONObject) {
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        C2783i iVar = new C2783i();
        Integer valueOf = Integer.valueOf(jSONObject.optInt(MediaFile.MAX_BITRATE, Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt(MediaFile.MIN_BITRATE, Integer.MIN_VALUE));
        Integer valueOf3 = Integer.valueOf(jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE));
        Integer valueOf4 = Integer.valueOf(jSONObject.optInt("padding", Integer.MIN_VALUE));
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        iVar.f6560b = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        iVar.f6561c = valueOf2;
        iVar.f6562d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        iVar.f6563e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        iVar.f6559a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        iVar.f6565g = Orientation.fromValue(jSONObject.optString("orientation"));
        iVar.f6564f = TapAction.fromValue(jSONObject.optString("tap"));
        if (valueOf3.intValue() == Integer.MIN_VALUE) {
            valueOf3 = null;
        }
        iVar.f6566h = valueOf3;
        if (valueOf4.intValue() != Integer.MIN_VALUE) {
            num = valueOf4;
        }
        iVar.f6567i = num;
        iVar.f6568j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray optJSONArray = jSONObject.optJSONArray("filterApi");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                int optInt = optJSONArray.optInt(i, Integer.MIN_VALUE);
                if (optInt != Integer.MIN_VALUE) {
                    iVar.f6569k.add(Integer.valueOf(optInt));
                }
            }
        }
        return iVar;
    }
}

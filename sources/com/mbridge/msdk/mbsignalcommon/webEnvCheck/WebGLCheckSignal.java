package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6564h;
import org.json.JSONException;
import org.json.JSONObject;

public class WebGLCheckSignal extends C6564h {
    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C6122a.m15302b().mo42893c(jSONObject.optInt("webgl"));
            C6122a.m15302b().mo42889a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

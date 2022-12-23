package com.yandex.mobile.ads.impl;

public class k71 implements i51<d71> {

    /* renamed from: a */
    private final i51<String> f36013a = new sb1();

    /* renamed from: b */
    private final ic1 f36014b = new ic1();

    /* renamed from: c */
    private final j30 f36015c = new j30();

    /* renamed from: d */
    private final C12723cc f36016d = new C12723cc();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = r3.opt("ad_blocker_status_validity_duration");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo66870a(com.yandex.mobile.ads.impl.fv0 r42) {
        /*
            r41 = this;
            r0 = r41
            java.lang.String r1 = "mediation_sensitive_mode_disabled"
            com.yandex.mobile.ads.impl.i51<java.lang.String> r2 = r0.f36013a
            r3 = r42
            java.lang.Object r2 = r2.mo66870a(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 != 0) goto L_0x02b8
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02b8 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r2 = "ad_blocker_status_validity_duration"
            boolean r5 = r3.has(r2)     // Catch:{ JSONException -> 0x02b8 }
            if (r5 == 0) goto L_0x0031
            java.lang.Object r2 = r3.opt(r2)     // Catch:{ JSONException -> 0x02b8 }
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x02b8 }
            java.lang.Long r2 = com.yandex.mobile.ads.impl.C13278h5.m36799a(r2, r4)     // Catch:{ JSONException -> 0x02b8 }
            goto L_0x0032
        L_0x0031:
            r2 = r4
        L_0x0032:
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x0041
            long r7 = r2.longValue()     // Catch:{ JSONException -> 0x02b8 }
            long r7 = r7 * r5
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ JSONException -> 0x02b8 }
            goto L_0x0042
        L_0x0041:
            r2 = r4
        L_0x0042:
            java.lang.String r7 = "aab_disabled"
            boolean r7 = r3.optBoolean(r7)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r8 = "autograb_enabled"
            boolean r8 = r3.optBoolean(r8)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r9 = "custom_click_handling_enabled"
            boolean r9 = r3.optBoolean(r9)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r10 = "legacy_visibility_logic_enabled"
            boolean r10 = r3.optBoolean(r10)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r11 = "legacy_vast_tracking_enabled"
            boolean r11 = r3.optBoolean(r11)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r12 = "overlapping_view_tracking_enabled"
            boolean r12 = r3.optBoolean(r12)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r13 = "overlapping_window_tracking_enabled"
            boolean r13 = r3.optBoolean(r13)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r14 = "open_measurement_sdk_disabled"
            boolean r14 = r3.optBoolean(r14)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r15 = "multibanner_arrow_controls_disabled"
            boolean r15 = r3.optBoolean(r15)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r5 = "visibility_error_indicator_enabled"
            boolean r6 = r3.has(r5)     // Catch:{ JSONException -> 0x02b8 }
            if (r6 == 0) goto L_0x0089
            boolean r5 = r3.optBoolean(r5)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x02b8 }
            goto L_0x008a
        L_0x0089:
            r5 = r4
        L_0x008a:
            java.lang.String r6 = "mraid_controller"
            java.lang.String r6 = r3.optString(r6, r4)     // Catch:{ JSONException -> 0x02b8 }
            r42 = r15
            java.lang.String r15 = "open_measurement_sdk_controller"
            java.lang.String r15 = r3.optString(r15, r4)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r4 = "sensitive_mode_disabled"
            boolean r4 = r3.optBoolean(r4)     // Catch:{ JSONException -> 0x02b8 }
            r18 = r14
            java.lang.String r14 = "encrypted_requests_enabled"
            boolean r14 = r3.optBoolean(r14)     // Catch:{ JSONException -> 0x02b8 }
            boolean r19 = r3.has(r1)     // Catch:{ JSONException -> 0x02b8 }
            if (r19 == 0) goto L_0x00b7
            boolean r1 = r3.optBoolean(r1)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ JSONException -> 0x02b8 }
            r19 = r14
            goto L_0x00ba
        L_0x00b7:
            r19 = r14
            r1 = 0
        L_0x00ba:
            java.lang.String r14 = "mrc_visibility_tracking_enabled"
            boolean r14 = r3.optBoolean(r14)     // Catch:{ JSONException -> 0x02b8 }
            r20 = r13
            java.lang.String r13 = "custom_user_agent_enabled"
            boolean r13 = r3.optBoolean(r13)     // Catch:{ JSONException -> 0x02b8 }
            r21 = r12
            java.lang.String r12 = "fused_location_provider_disabled"
            boolean r12 = r3.optBoolean(r12)     // Catch:{ JSONException -> 0x02b8 }
            r22 = r11
            java.lang.String r11 = "lock_screen_enabled"
            boolean r11 = r3.optBoolean(r11)     // Catch:{ JSONException -> 0x02b8 }
            r23 = r10
            java.lang.String r10 = "impression_validation_on_click_enabled"
            boolean r10 = r3.optBoolean(r10)     // Catch:{ JSONException -> 0x02b8 }
            r24 = r10
            java.lang.String r10 = "legacy_slider_impression_enabled"
            boolean r10 = r3.optBoolean(r10)     // Catch:{ JSONException -> 0x02b8 }
            r25 = r10
            java.lang.String r10 = "reload_timeout"
            long r26 = r3.optLong(r10)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.ic1 r10 = r0.f36014b     // Catch:{ JSONException -> 0x02b8 }
            r10.getClass()     // Catch:{ JSONException -> 0x02b8 }
            long r28 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x02b8 }
            r30 = 0
            int r10 = (r26 > r30 ? 1 : (r26 == r30 ? 0 : -1))
            if (r10 <= 0) goto L_0x0104
            r16 = 1000(0x3e8, double:4.94E-321)
            long r26 = r26 * r16
            goto L_0x0107
        L_0x0104:
            r26 = 86400000(0x5265c00, double:4.2687272E-316)
        L_0x0107:
            r16 = r12
            r10 = r13
            long r12 = r28 + r26
            r17 = r10
            java.lang.String r10 = "ad_ids_storage_size"
            int r10 = r3.optInt(r10)     // Catch:{ JSONException -> 0x02b8 }
            r26 = r4
            java.lang.String r4 = "ad_request_max_retries"
            java.lang.Integer r4 = com.yandex.mobile.ads.impl.gi0.m36621c(r3, r4)     // Catch:{ JSONException -> 0x02b8 }
            r27 = r14
            java.lang.String r14 = "ping_request_max_retries"
            java.lang.Integer r14 = com.yandex.mobile.ads.impl.gi0.m36621c(r3, r14)     // Catch:{ JSONException -> 0x02b8 }
            r28 = r1
            java.lang.String r1 = "show_version_validation_error_log"
            r29 = r11
            r11 = 0
            boolean r1 = r3.optBoolean(r1, r11)     // Catch:{ JSONException -> 0x02b8 }
            r30 = r1
            java.lang.String r1 = "show_version_validation_error_indicator"
            boolean r1 = r3.optBoolean(r1, r11)     // Catch:{ JSONException -> 0x02b8 }
            r31 = r1
            java.lang.String r1 = "fullscreen_back_button_enabled"
            boolean r1 = r3.optBoolean(r1, r11)     // Catch:{ JSONException -> 0x02b8 }
            r32 = r1
            java.lang.String r1 = "click_area_verification_enabled"
            boolean r1 = r3.optBoolean(r1, r11)     // Catch:{ JSONException -> 0x02b8 }
            r33 = r1
            java.lang.String r1 = "divkit_disabled"
            boolean r1 = r3.optBoolean(r1, r11)     // Catch:{ JSONException -> 0x02b8 }
            r34 = r1
            java.lang.String r1 = "use_okhttp_network_stack"
            boolean r1 = r3.optBoolean(r1, r11)     // Catch:{ JSONException -> 0x02b8 }
            r35 = r1
            java.lang.String r1 = "location_consent"
            boolean r1 = r3.optBoolean(r1, r11)     // Catch:{ JSONException -> 0x02b8 }
            r36 = r1
            java.lang.String r1 = "libssl_enabled"
            boolean r1 = r3.optBoolean(r1, r11)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r11 = "bidding_settings"
            org.json.JSONObject r11 = r3.optJSONObject(r11)     // Catch:{ JSONException -> 0x02b8 }
            if (r11 == 0) goto L_0x0178
            r38 = r1
            com.yandex.mobile.ads.impl.cc r1 = r0.f36016d     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.base.model.BiddingSettings r1 = r1.mo66252b(r11)     // Catch:{ JSONException -> 0x02b8 }
            goto L_0x017b
        L_0x0178:
            r38 = r1
            r1 = 0
        L_0x017b:
            java.lang.String r11 = "encryption"
            org.json.JSONObject r11 = r3.optJSONObject(r11)     // Catch:{ JSONException -> 0x02b8 }
            r39 = r1
            com.yandex.mobile.ads.impl.j30 r1 = r0.f36015c     // Catch:{ JSONException -> 0x02b8 }
            r1.getClass()     // Catch:{ JSONException -> 0x02b8 }
            if (r11 == 0) goto L_0x01b2
            java.lang.String r1 = "rsa"
            org.json.JSONObject r1 = r11.optJSONObject(r1)     // Catch:{ JSONException -> 0x02b8 }
            if (r1 == 0) goto L_0x01b2
            java.lang.String r11 = "public_key"
            java.lang.String r0 = ""
            java.lang.String r0 = r1.optString(r11, r0)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r11 = "version"
            java.lang.Integer r1 = com.yandex.mobile.ads.impl.gi0.m36621c(r1, r11)     // Catch:{ JSONException -> 0x02b8 }
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x02b8 }
            if (r11 != 0) goto L_0x01b2
            if (r1 == 0) goto L_0x01b2
            com.yandex.mobile.ads.impl.i30 r11 = new com.yandex.mobile.ads.impl.i30     // Catch:{ JSONException -> 0x02b8 }
            int r1 = r1.intValue()     // Catch:{ JSONException -> 0x02b8 }
            r11.<init>(r0, r1)     // Catch:{ JSONException -> 0x02b8 }
            goto L_0x01b3
        L_0x01b2:
            r11 = 0
        L_0x01b3:
            java.lang.String r0 = "legacy_render_tracking_enabled"
            r1 = 0
            boolean r0 = r3.optBoolean(r0, r1)     // Catch:{ JSONException -> 0x02b8 }
            r37 = r11
            java.lang.String r11 = "legacy_impression_callback_enabled"
            boolean r11 = r3.optBoolean(r11, r1)     // Catch:{ JSONException -> 0x02b8 }
            r40 = r11
            java.lang.String r11 = "use_flex_instead_fixed_banner_enabled"
            boolean r1 = r3.optBoolean(r11, r1)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r3 = new com.yandex.mobile.ads.impl.d71$b     // Catch:{ JSONException -> 0x02b8 }
            r3.<init>()     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r3 = r3.mo66486a((java.lang.Integer) r4)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r3 = r3.mo66492b((java.lang.Integer) r14)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r3.mo66487a((java.lang.Long) r2)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66489a((boolean) r7)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66494b((boolean) r8)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66481a((int) r10)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66482a((long) r12)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66488a((java.lang.String) r6)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66493b((java.lang.String) r15)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66499e((boolean) r9)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66495c((java.lang.Boolean) r5)     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r3 = com.yandex.mobile.ads.common.MobileAds.getLibraryVersion()     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66496c((java.lang.String) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r29
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66512r((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r28
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66485a((java.lang.Boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r27
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66513s((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r26
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66518x((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r17
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66500f((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r16
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66504j((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.l71 r3 = com.yandex.mobile.ads.impl.l71.m38631c()     // Catch:{ JSONException -> 0x02b8 }
            java.lang.Boolean r3 = r3.mo68372g()     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66491b((java.lang.Boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r23
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66509o((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r22
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66508n((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r21
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66516v((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r20
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66517w((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r18
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66515u((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r42
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66514t((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r24
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66505k((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            r3 = r25
            com.yandex.mobile.ads.impl.d71$b r2 = r2.mo66507m((boolean) r3)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r0 = r2.mo66506l((boolean) r0)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r30
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66520z((boolean) r2)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r31
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66519y((boolean) r2)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r32
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66503i((boolean) r2)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r33
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66497c((boolean) r2)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r39
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66483a((com.yandex.mobile.ads.base.model.BiddingSettings) r2)     // Catch:{ JSONException -> 0x02b8 }
            r11 = r37
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66484a((com.yandex.mobile.ads.impl.i30) r11)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r40
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66498d((boolean) r2)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r34
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66501g((boolean) r2)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r35
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66480B((boolean) r2)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r36
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66511q((boolean) r2)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r38
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66510p((boolean) r2)     // Catch:{ JSONException -> 0x02b8 }
            r2 = r19
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66502h((boolean) r2)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71$b r0 = r0.mo66479A((boolean) r1)     // Catch:{ JSONException -> 0x02b8 }
            com.yandex.mobile.ads.impl.d71 r4 = r0.mo66490a()     // Catch:{ JSONException -> 0x02b8 }
            goto L_0x02b9
        L_0x02b8:
            r4 = 0
        L_0x02b9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k71.mo66870a(com.yandex.mobile.ads.impl.fv0):java.lang.Object");
    }
}

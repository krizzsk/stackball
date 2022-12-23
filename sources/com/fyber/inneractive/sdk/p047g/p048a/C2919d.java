package com.fyber.inneractive.sdk.p047g.p048a;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.C3643ap;
import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.g.a.d */
public class C2919d {

    /* renamed from: a */
    C2920e f6962a;

    /* renamed from: b */
    public String f6963b;

    /* renamed from: c */
    public List<String> f6964c = new ArrayList();

    /* renamed from: d */
    public List<C2925j> f6965d = new ArrayList();

    protected C2919d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18382a(Node node) {
        C2921f fVar;
        C2927l lVar;
        C2928m mVar;
        if (node != null) {
            Node a = C3643ap.m9064a(node, "AdSystem");
            if (a != null) {
                this.f6962a = C2920e.m6551a(a);
            }
            Node a2 = C3643ap.m9064a(node, "Error");
            if (a2 != null) {
                String a3 = C3643ap.m9063a(a2);
                if (!TextUtils.isEmpty(a3)) {
                    this.f6963b = a3;
                }
            }
            for (Node a4 : C3643ap.m9065b(node, "Impression")) {
                String a5 = C3643ap.m9063a(a4);
                if (!TextUtils.isEmpty(a5)) {
                    this.f6964c.add(a5);
                }
            }
            Node a6 = C3643ap.m9064a(node, "Creatives");
            if (a6 != null) {
                for (Node next : C3643ap.m9065b(a6, Creative.NAME)) {
                    C2925j jVar = null;
                    if (next != null) {
                        C2925j jVar2 = new C2925j();
                        jVar2.f6995a = C3643ap.m9066c(next, "AdID");
                        jVar2.f6996b = C3643ap.m9066c(next, "id");
                        jVar2.f6997c = C3643ap.m9067d(next, "sequence");
                        Node a7 = C3643ap.m9064a(next, "Linear");
                        if (a7 != null) {
                            if (a7 == null) {
                                lVar = null;
                            } else {
                                lVar = new C2927l();
                                Node a8 = C3643ap.m9064a(a7, Linear.MEDIA_FILES);
                                if (a8 != null) {
                                    List<Node> b = C3643ap.m9065b(a8, MediaFile.NAME);
                                    if (!b.isEmpty()) {
                                        lVar.f7002a = new ArrayList();
                                        for (Node next2 : b) {
                                            if (next2 == null) {
                                                mVar = null;
                                            } else {
                                                mVar = new C2928m();
                                                mVar.f7007a = C3643ap.m9066c(next2, MediaFile.DELIVERY);
                                                mVar.f7008b = C3643ap.m9067d(next2, "width");
                                                mVar.f7009c = C3643ap.m9067d(next2, "height");
                                                mVar.f7010d = C3643ap.m9066c(next2, "type");
                                                mVar.f7011e = C3643ap.m9066c(next2, "id");
                                                mVar.f7013g = C3643ap.m9066c(next2, "apiFramework");
                                                mVar.f7012f = C3643ap.m9067d(next2, MediaFile.BITRATE);
                                                mVar.f7014h = C3643ap.m9068e(next2, MediaFile.MAINTAIN_ASPECT_RATIO);
                                                mVar.f7015i = C3643ap.m9068e(next2, MediaFile.SCALABLE);
                                                mVar.f7016j = C3643ap.m9063a(next2);
                                            }
                                            if (mVar != null) {
                                                lVar.f7002a.add(mVar);
                                            }
                                        }
                                    }
                                }
                                Node a9 = C3643ap.m9064a(a7, "VideoClicks");
                                if (a9 != null) {
                                    lVar.f7004c = C3643ap.m9063a(C3643ap.m9064a(a9, VideoClicks.CLICK_THROUGH));
                                    List<Node> b2 = C3643ap.m9065b(a9, VideoClicks.CLICK_TRACKING);
                                    if (!b2.isEmpty()) {
                                        lVar.f7005d = new ArrayList();
                                        for (Node a10 : b2) {
                                            String a11 = C3643ap.m9063a(a10);
                                            if (!TextUtils.isEmpty(a11)) {
                                                lVar.f7005d.add(a11);
                                            }
                                        }
                                    }
                                }
                                Node a12 = C3643ap.m9064a(a7, "TrackingEvents");
                                if (a12 != null) {
                                    List<Node> b3 = C3643ap.m9065b(a12, C8938Tracking.NAME);
                                    if (!b3.isEmpty()) {
                                        lVar.f7003b = new ArrayList();
                                        for (Node a13 : b3) {
                                            C2932q a14 = C2932q.m6559a(a13);
                                            if (a14 != null) {
                                                lVar.f7003b.add(a14);
                                            }
                                        }
                                    }
                                }
                                Node a15 = C3643ap.m9064a(a7, Linear.DURATION);
                                if (a15 != null) {
                                    lVar.f7006e = C3643ap.m9063a(a15);
                                }
                            }
                            jVar2.f6998d = lVar;
                        }
                        Node a16 = C3643ap.m9064a(next, "CompanionAds");
                        if (a16 != null) {
                            List<Node> b4 = C3643ap.m9065b(a16, "Companion");
                            jVar2.f6999e = new ArrayList();
                            for (Node next3 : b4) {
                                if (next3 == null) {
                                    fVar = null;
                                } else {
                                    fVar = new C2921f();
                                    fVar.mo18384a(next3);
                                }
                                if (fVar != null) {
                                    jVar2.f6999e.add(fVar);
                                }
                            }
                        }
                        jVar = jVar2;
                    }
                    if (jVar != null) {
                        this.f6965d.add(jVar);
                    }
                }
            }
        }
    }
}

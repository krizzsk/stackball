package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.C7050a;
import com.mbridge.msdk.video.signal.C7067b;
import com.mbridge.msdk.video.signal.C7068c;
import com.mbridge.msdk.video.signal.C7155e;
import com.mbridge.msdk.video.signal.C7156f;
import com.mbridge.msdk.video.signal.C7160h;
import com.mbridge.msdk.video.signal.C7161i;

public interface IJSFactory {
    C7050a getActivityProxy();

    C7160h getIJSRewardVideoV1();

    C7067b getJSBTModule();

    C7068c getJSCommon();

    C7155e getJSContainerModule();

    C7156f getJSNotifyProxy();

    C7161i getJSVideoModule();
}

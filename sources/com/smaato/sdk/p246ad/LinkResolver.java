package com.smaato.sdk.p246ad;

import android.content.Intent;
import com.smaato.sdk.flow.Flow;

/* renamed from: com.smaato.sdk.ad.LinkResolver */
public interface LinkResolver {
    Flow<Intent> resolve(String str);
}

package com.facebook.appevents;

import com.appsflyer.internal.referrer.Payload;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: AppEventQueue.kt */
final class AppEventQueue$buildRequestForSession$1 implements GraphRequest.Callback {
    final /* synthetic */ AccessTokenAppIdPair $accessTokenAppId;
    final /* synthetic */ SessionEventsState $appEvents;
    final /* synthetic */ FlushStatistics $flushState;
    final /* synthetic */ GraphRequest $postRequest;

    AppEventQueue$buildRequestForSession$1(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, SessionEventsState sessionEventsState, FlushStatistics flushStatistics) {
        this.$accessTokenAppId = accessTokenAppIdPair;
        this.$postRequest = graphRequest;
        this.$appEvents = sessionEventsState;
        this.$flushState = flushStatistics;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        Intrinsics.checkNotNullParameter(graphResponse, Payload.RESPONSE);
        AppEventQueue.handleResponse(this.$accessTokenAppId, this.$postRequest, graphResponse, this.$appEvents, this.$flushState);
    }
}

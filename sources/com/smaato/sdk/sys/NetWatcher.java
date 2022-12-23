package com.smaato.sdk.sys;

import com.smaato.sdk.flow.Flow;

public interface NetWatcher {
    Flow<NetState> networkState();
}

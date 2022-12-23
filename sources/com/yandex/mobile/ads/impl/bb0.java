package com.yandex.mobile.ads.impl;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

class bb0 extends WebChromeClient {
    bb0() {
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.message();
        consoleMessage.sourceId();
        consoleMessage.lineNumber();
        return true;
    }
}

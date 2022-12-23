package com.smaato.sdk.dns;

import java.io.IOException;
import java.util.List;

public interface DnsLookup {
    List<TxtRecord> blockingTxt(String str) throws IOException;
}

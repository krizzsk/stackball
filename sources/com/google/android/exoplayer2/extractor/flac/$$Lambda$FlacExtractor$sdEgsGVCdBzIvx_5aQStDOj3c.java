package com.google.android.exoplayer2.extractor.flac;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.flac.-$$Lambda$FlacExtractor$s-dEgsGVCd-BzIvx_5aQStDOj3c  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FlacExtractor$sdEgsGVCdBzIvx_5aQStDOj3c implements ExtractorsFactory {
    public static final /* synthetic */ $$Lambda$FlacExtractor$sdEgsGVCdBzIvx_5aQStDOj3c INSTANCE = new $$Lambda$FlacExtractor$sdEgsGVCdBzIvx_5aQStDOj3c();

    private /* synthetic */ $$Lambda$FlacExtractor$sdEgsGVCdBzIvx_5aQStDOj3c() {
    }

    public final Extractor[] createExtractors() {
        return FlacExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return ExtractorsFactory.CC.$default$createExtractors(this, uri, map);
    }
}

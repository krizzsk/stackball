package com.google.android.exoplayer2.extractor.p086ts;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.ts.-$$Lambda$TsExtractor$f-UE6PC86cqq4V-qVoFQnPhfFZ8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$TsExtractor$fUE6PC86cqq4VqVoFQnPhfFZ8 implements ExtractorsFactory {
    public static final /* synthetic */ $$Lambda$TsExtractor$fUE6PC86cqq4VqVoFQnPhfFZ8 INSTANCE = new $$Lambda$TsExtractor$fUE6PC86cqq4VqVoFQnPhfFZ8();

    private /* synthetic */ $$Lambda$TsExtractor$fUE6PC86cqq4VqVoFQnPhfFZ8() {
    }

    public final Extractor[] createExtractors() {
        return TsExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return ExtractorsFactory.CC.$default$createExtractors(this, uri, map);
    }
}

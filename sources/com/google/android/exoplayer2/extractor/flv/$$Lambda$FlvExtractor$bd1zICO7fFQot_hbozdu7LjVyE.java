package com.google.android.exoplayer2.extractor.flv;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.flv.-$$Lambda$FlvExtractor$bd1zICO7f-FQot_hbozdu7LjVyE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FlvExtractor$bd1zICO7fFQot_hbozdu7LjVyE implements ExtractorsFactory {
    public static final /* synthetic */ $$Lambda$FlvExtractor$bd1zICO7fFQot_hbozdu7LjVyE INSTANCE = new $$Lambda$FlvExtractor$bd1zICO7fFQot_hbozdu7LjVyE();

    private /* synthetic */ $$Lambda$FlvExtractor$bd1zICO7fFQot_hbozdu7LjVyE() {
    }

    public final Extractor[] createExtractors() {
        return FlvExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return ExtractorsFactory.CC.$default$createExtractors(this, uri, map);
    }
}

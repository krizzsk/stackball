package com.google.android.exoplayer2.extractor.mkv;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.mkv.-$$Lambda$MatroskaExtractor$jNXW0tyYIOPE6N2jicocV6rRvBs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MatroskaExtractor$jNXW0tyYIOPE6N2jicocV6rRvBs implements ExtractorsFactory {
    public static final /* synthetic */ $$Lambda$MatroskaExtractor$jNXW0tyYIOPE6N2jicocV6rRvBs INSTANCE = new $$Lambda$MatroskaExtractor$jNXW0tyYIOPE6N2jicocV6rRvBs();

    private /* synthetic */ $$Lambda$MatroskaExtractor$jNXW0tyYIOPE6N2jicocV6rRvBs() {
    }

    public final Extractor[] createExtractors() {
        return MatroskaExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return ExtractorsFactory.CC.$default$createExtractors(this, uri, map);
    }
}

package com.google.android.exoplayer2.extractor.p086ts;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.ts.-$$Lambda$Ac3Extractor$c2Fqr1pF6vjFNOhLk9sPPtkNnGE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$Ac3Extractor$c2Fqr1pF6vjFNOhLk9sPPtkNnGE implements ExtractorsFactory {
    public static final /* synthetic */ $$Lambda$Ac3Extractor$c2Fqr1pF6vjFNOhLk9sPPtkNnGE INSTANCE = new $$Lambda$Ac3Extractor$c2Fqr1pF6vjFNOhLk9sPPtkNnGE();

    private /* synthetic */ $$Lambda$Ac3Extractor$c2Fqr1pF6vjFNOhLk9sPPtkNnGE() {
    }

    public final Extractor[] createExtractors() {
        return Ac3Extractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return ExtractorsFactory.CC.$default$createExtractors(this, uri, map);
    }
}

package com.google.android.exoplayer2.extractor.ogg;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.ogg.-$$Lambda$OggExtractor$Ibu4KG2n586HVQ8R-UQJ8hUhsso  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$OggExtractor$Ibu4KG2n586HVQ8RUQJ8hUhsso implements ExtractorsFactory {
    public static final /* synthetic */ $$Lambda$OggExtractor$Ibu4KG2n586HVQ8RUQJ8hUhsso INSTANCE = new $$Lambda$OggExtractor$Ibu4KG2n586HVQ8RUQJ8hUhsso();

    private /* synthetic */ $$Lambda$OggExtractor$Ibu4KG2n586HVQ8RUQJ8hUhsso() {
    }

    public final Extractor[] createExtractors() {
        return OggExtractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return ExtractorsFactory.CC.$default$createExtractors(this, uri, map);
    }
}

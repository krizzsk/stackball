package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.-$$Lambda$Mp4Extractor$quy71uYOGsneho91FZy1d2UGE1Q  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$Mp4Extractor$quy71uYOGsneho91FZy1d2UGE1Q implements ExtractorsFactory {
    public static final /* synthetic */ $$Lambda$Mp4Extractor$quy71uYOGsneho91FZy1d2UGE1Q INSTANCE = new $$Lambda$Mp4Extractor$quy71uYOGsneho91FZy1d2UGE1Q();

    private /* synthetic */ $$Lambda$Mp4Extractor$quy71uYOGsneho91FZy1d2UGE1Q() {
    }

    public final Extractor[] createExtractors() {
        return Mp4Extractor.lambda$static$0();
    }

    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return ExtractorsFactory.CC.$default$createExtractors(this, uri, map);
    }
}

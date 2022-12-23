package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.cea.Cea708Decoder;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.text.cea.-$$Lambda$Cea708Decoder$Cea708CueInfo$8f1il_zEcouq-_x8remACEaVBv8 */
/* compiled from: lambda */
public final /* synthetic */ class C3862xde5f1e35 implements Comparator {
    public static final /* synthetic */ C3862xde5f1e35 INSTANCE = new C3862xde5f1e35();

    private /* synthetic */ C3862xde5f1e35() {
    }

    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((Cea708Decoder.Cea708CueInfo) obj2).priority, ((Cea708Decoder.Cea708CueInfo) obj).priority);
    }
}

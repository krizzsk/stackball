package com.facebook.internal.instrument.anrreport;

import com.facebook.internal.instrument.InstrumentData;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo72093d2 = {"<anonymous>", "", "o1", "Lcom/facebook/internal/instrument/InstrumentData;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: ANRHandler.kt */
final class ANRHandler$sendANRReports$validReports$3<T> implements Comparator {
    public static final ANRHandler$sendANRReports$validReports$3 INSTANCE = new ANRHandler$sendANRReports$validReports$3();

    ANRHandler$sendANRReports$validReports$3() {
    }

    public final int compare(InstrumentData instrumentData, InstrumentData instrumentData2) {
        Intrinsics.checkNotNullExpressionValue(instrumentData2, "o2");
        return instrumentData.compareTo(instrumentData2);
    }
}

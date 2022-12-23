package com.facebook;

import android.util.Pair;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: GraphRequest.kt */
final class GraphRequest$Companion$runCallbacks$runnable$1 implements Runnable {
    final /* synthetic */ ArrayList $callbacks;
    final /* synthetic */ GraphRequestBatch $requests;

    GraphRequest$Companion$runCallbacks$runnable$1(ArrayList arrayList, GraphRequestBatch graphRequestBatch) {
        this.$callbacks = arrayList;
        this.$requests = graphRequestBatch;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Iterator it = this.$callbacks.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    Object obj = pair.second;
                    Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                    ((GraphRequest.Callback) pair.first).onCompleted((GraphResponse) obj);
                }
                for (GraphRequestBatch.Callback onBatchCompleted : this.$requests.getCallbacks()) {
                    onBatchCompleted.onBatchCompleted(this.$requests);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}

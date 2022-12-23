package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.RuntimeExecutionException;
import com.google.android.play.core.tasks.Task;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class AssetPackManagerWrapper {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static AssetPackManagerWrapper f23627a;

    /* renamed from: b */
    private AssetPackManager f23628b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public HashSet f23629c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Object f23630d;

    /* renamed from: com.unity3d.player.AssetPackManagerWrapper$a */
    private static class C9515a implements Runnable {

        /* renamed from: a */
        private Set f23631a;

        /* renamed from: b */
        private String f23632b;

        /* renamed from: c */
        private int f23633c;

        /* renamed from: d */
        private long f23634d;

        /* renamed from: e */
        private long f23635e;

        /* renamed from: f */
        private int f23636f;

        /* renamed from: g */
        private int f23637g;

        C9515a(Set set, String str, int i, long j, long j2, int i2, int i3) {
            this.f23631a = set;
            this.f23632b = str;
            this.f23633c = i;
            this.f23634d = j;
            this.f23635e = j2;
            this.f23636f = i2;
            this.f23637g = i3;
        }

        public final void run() {
            for (IAssetPackManagerDownloadStatusCallback onStatusUpdate : this.f23631a) {
                onStatusUpdate.onStatusUpdate(this.f23632b, this.f23633c, this.f23634d, this.f23635e, this.f23636f, this.f23637g);
            }
        }
    }

    /* renamed from: com.unity3d.player.AssetPackManagerWrapper$b */
    private class C9516b implements AssetPackStateUpdateListener {

        /* renamed from: b */
        private HashSet f23639b;

        /* renamed from: c */
        private Looper f23640c;

        public C9516b(AssetPackManagerWrapper assetPackManagerWrapper, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
            this(iAssetPackManagerDownloadStatusCallback, Looper.myLooper());
        }

        public C9516b(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
            HashSet hashSet = new HashSet();
            this.f23639b = hashSet;
            hashSet.add(iAssetPackManagerDownloadStatusCallback);
            this.f23640c = looper;
        }

        /* renamed from: a */
        private static Set m25565a(HashSet hashSet) {
            return (Set) hashSet.clone();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public synchronized void onStateUpdate(AssetPackState assetPackState) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                synchronized (AssetPackManagerWrapper.f23627a) {
                    AssetPackManagerWrapper.this.f23629c.remove(assetPackState.name());
                    if (AssetPackManagerWrapper.this.f23629c.isEmpty()) {
                        AssetPackManagerWrapper.this.unregisterDownloadStatusListener(AssetPackManagerWrapper.this.f23630d);
                        Object unused = AssetPackManagerWrapper.this.f23630d = null;
                    }
                }
            }
            if (this.f23639b.size() != 0) {
                new Handler(this.f23640c).post(new C9515a(m25565a(this.f23639b), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
            }
        }

        /* renamed from: a */
        public final synchronized void mo58562a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
            this.f23639b.add(iAssetPackManagerDownloadStatusCallback);
        }
    }

    /* renamed from: com.unity3d.player.AssetPackManagerWrapper$c */
    private static class C9517c implements OnSuccessListener {

        /* renamed from: a */
        private IAssetPackManagerMobileDataConfirmationCallback f23641a;

        /* renamed from: b */
        private Looper f23642b = Looper.myLooper();

        /* renamed from: com.unity3d.player.AssetPackManagerWrapper$c$a */
        private static class C9518a implements Runnable {

            /* renamed from: a */
            private IAssetPackManagerMobileDataConfirmationCallback f23643a;

            /* renamed from: b */
            private boolean f23644b;

            C9518a(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
                this.f23643a = iAssetPackManagerMobileDataConfirmationCallback;
                this.f23644b = z;
            }

            public final void run() {
                this.f23643a.onMobileDataConfirmationResult(this.f23644b);
            }
        }

        public C9517c(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
            this.f23641a = iAssetPackManagerMobileDataConfirmationCallback;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(Integer num) {
            if (this.f23641a != null) {
                new Handler(this.f23642b).post(new C9518a(this.f23641a, num.intValue() == -1));
            }
        }
    }

    /* renamed from: com.unity3d.player.AssetPackManagerWrapper$d */
    private static class C9519d implements OnCompleteListener {

        /* renamed from: a */
        private IAssetPackManagerDownloadStatusCallback f23645a;

        /* renamed from: b */
        private Looper f23646b = Looper.myLooper();

        /* renamed from: c */
        private String f23647c;

        public C9519d(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String str) {
            this.f23645a = iAssetPackManagerDownloadStatusCallback;
            this.f23647c = str;
        }

        /* renamed from: a */
        private void m25569a(String str, int i, int i2, long j) {
            new Handler(this.f23646b).post(new C9515a(Collections.singleton(this.f23645a), str, i, j, i == 4 ? j : 0, 0, i2));
        }

        public final void onComplete(Task task) {
            try {
                AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
                Map packStates = assetPackStates.packStates();
                if (packStates.size() != 0) {
                    for (AssetPackState assetPackState : packStates.values()) {
                        if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                            m25569a(assetPackState.name(), assetPackState.status(), assetPackState.errorCode(), assetPackStates.totalBytes());
                        } else {
                            AssetPackManagerWrapper.f23627a.m25561a(assetPackState.name(), this.f23645a, this.f23646b);
                        }
                    }
                }
            } catch (RuntimeExecutionException e) {
                m25569a(this.f23647c, 0, e.getErrorCode(), 0);
            }
        }
    }

    /* renamed from: com.unity3d.player.AssetPackManagerWrapper$e */
    private static class C9520e implements OnCompleteListener {

        /* renamed from: a */
        private IAssetPackManagerStatusQueryCallback f23648a;

        /* renamed from: b */
        private Looper f23649b = Looper.myLooper();

        /* renamed from: c */
        private String[] f23650c;

        /* renamed from: com.unity3d.player.AssetPackManagerWrapper$e$a */
        private static class C9521a implements Runnable {

            /* renamed from: a */
            private IAssetPackManagerStatusQueryCallback f23651a;

            /* renamed from: b */
            private long f23652b;

            /* renamed from: c */
            private String[] f23653c;

            /* renamed from: d */
            private int[] f23654d;

            /* renamed from: e */
            private int[] f23655e;

            C9521a(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j, String[] strArr, int[] iArr, int[] iArr2) {
                this.f23651a = iAssetPackManagerStatusQueryCallback;
                this.f23652b = j;
                this.f23653c = strArr;
                this.f23654d = iArr;
                this.f23655e = iArr2;
            }

            public final void run() {
                this.f23651a.onStatusResult(this.f23652b, this.f23653c, this.f23654d, this.f23655e);
            }
        }

        public C9520e(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, String[] strArr) {
            this.f23648a = iAssetPackManagerStatusQueryCallback;
            this.f23650c = strArr;
        }

        public final void onComplete(Task task) {
            if (this.f23648a != null) {
                int i = 0;
                try {
                    AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
                    Map packStates = assetPackStates.packStates();
                    int size = packStates.size();
                    String[] strArr = new String[size];
                    int[] iArr = new int[size];
                    int[] iArr2 = new int[size];
                    for (AssetPackState assetPackState : packStates.values()) {
                        strArr[i] = assetPackState.name();
                        iArr[i] = assetPackState.status();
                        iArr2[i] = assetPackState.errorCode();
                        i++;
                    }
                    new Handler(this.f23649b).post(new C9521a(this.f23648a, assetPackStates.totalBytes(), strArr, iArr, iArr2));
                } catch (RuntimeExecutionException e) {
                    String message = e.getMessage();
                    for (String str : this.f23650c) {
                        if (message.contains(str)) {
                            new Handler(this.f23649b).post(new C9521a(this.f23648a, 0, new String[]{str}, new int[]{0}, new int[]{e.getErrorCode()}));
                            return;
                        }
                    }
                    String[] strArr2 = this.f23650c;
                    int[] iArr3 = new int[strArr2.length];
                    int[] iArr4 = new int[strArr2.length];
                    for (int i2 = 0; i2 < this.f23650c.length; i2++) {
                        iArr3[i2] = 0;
                        iArr4[i2] = e.getErrorCode();
                    }
                    new Handler(this.f23649b).post(new C9521a(this.f23648a, 0, this.f23650c, iArr3, iArr4));
                }
            }
        }
    }

    private AssetPackManagerWrapper(Context context) {
        if (f23627a == null) {
            try {
                this.f23628b = AssetPackManagerFactory.getInstance(context);
            } catch (NoClassDefFoundError unused) {
                this.f23628b = null;
            }
            this.f23629c = new HashSet();
            return;
        }
        throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25561a(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
        synchronized (f23627a) {
            if (this.f23630d == null) {
                C9516b bVar = new C9516b(iAssetPackManagerDownloadStatusCallback, looper);
                this.f23628b.registerListener(bVar);
                this.f23630d = bVar;
            } else {
                ((C9516b) this.f23630d).mo58562a(iAssetPackManagerDownloadStatusCallback);
            }
            this.f23629c.add(str);
            this.f23628b.fetch(Collections.singletonList(str));
        }
    }

    /* renamed from: b */
    private void m25563b() {
        if (playCoreApiMissing()) {
            throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes \"com.google.android.play:core\" dependency.");
        }
    }

    public static synchronized AssetPackManagerWrapper getInstance() {
        AssetPackManagerWrapper assetPackManagerWrapper;
        Class<AssetPackManagerWrapper> cls = AssetPackManagerWrapper.class;
        synchronized (cls) {
            while (f23627a == null) {
                try {
                    cls.wait(3000);
                } catch (InterruptedException e) {
                    C9578d.Log(6, e.getMessage());
                }
            }
            if (f23627a != null) {
                assetPackManagerWrapper = f23627a;
            } else {
                throw new RuntimeException("AssetPackManagerWrapper is not yet initialised.");
            }
        }
        return assetPackManagerWrapper;
    }

    public static synchronized AssetPackManagerWrapper init(Context context) {
        AssetPackManagerWrapper assetPackManagerWrapper;
        Class<AssetPackManagerWrapper> cls = AssetPackManagerWrapper.class;
        synchronized (cls) {
            if (f23627a == null) {
                f23627a = new AssetPackManagerWrapper(context);
                cls.notifyAll();
                assetPackManagerWrapper = f23627a;
            } else {
                throw new RuntimeException("AssetPackManagerWrapper.init() should be called only once. Use getInstance() instead.");
            }
        }
        return assetPackManagerWrapper;
    }

    public void cancelAssetPackDownload(String str) {
        cancelAssetPackDownloads(new String[]{str});
    }

    public void cancelAssetPackDownloads(String[] strArr) {
        m25563b();
        this.f23628b.cancel(Arrays.asList(strArr));
    }

    public void downloadAssetPack(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        downloadAssetPacks(new String[]{str}, iAssetPackManagerDownloadStatusCallback);
    }

    public void downloadAssetPacks(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        m25563b();
        for (String str : strArr) {
            this.f23628b.getPackStates(Collections.singletonList(str)).addOnCompleteListener(new C9519d(iAssetPackManagerDownloadStatusCallback, str));
        }
    }

    public String getAssetPackPath(String str) {
        m25563b();
        AssetPackLocation packLocation = this.f23628b.getPackLocation(str);
        return packLocation == null ? "" : packLocation.assetsPath();
    }

    public void getAssetPackState(String str, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        getAssetPackStates(new String[]{str}, iAssetPackManagerStatusQueryCallback);
    }

    public void getAssetPackStates(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        m25563b();
        this.f23628b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C9520e(iAssetPackManagerStatusQueryCallback, strArr));
    }

    public boolean playCoreApiMissing() {
        return this.f23628b == null;
    }

    public Object registerDownloadStatusListener(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        m25563b();
        C9516b bVar = new C9516b(this, iAssetPackManagerDownloadStatusCallback);
        this.f23628b.registerListener(bVar);
        return bVar;
    }

    public void removeAssetPack(String str) {
        m25563b();
        this.f23628b.removePack(str);
    }

    public void requestToUseMobileData(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        m25563b();
        this.f23628b.showCellularDataConfirmation(activity).addOnSuccessListener(new C9517c(iAssetPackManagerMobileDataConfirmationCallback));
    }

    public void unregisterDownloadStatusListener(Object obj) {
        m25563b();
        if (obj instanceof C9516b) {
            this.f23628b.unregisterListener((C9516b) obj);
        }
    }
}

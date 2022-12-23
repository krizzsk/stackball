package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.l8 */
public abstract class C11485l8 {

    /* renamed from: a */
    private static final C10442L0 f27655a = new C10442L0();

    /* renamed from: a */
    public static String[] m29724a(Context context, String str) {
        File file;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), (C10796U2.m27890a(24) ? 8192 : 0) | 1024);
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            String[] strArr = packageInfo.applicationInfo.splitSourceDirs;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            String[] strArr2 = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr2 != null) {
                Collections.addAll(arrayList, strArr2);
            }
            ArrayList arrayList2 = new ArrayList(10);
            String str2 = packageInfo.applicationInfo.nativeLibraryDir;
            if (TextUtils.isEmpty(str2)) {
                file = null;
            } else {
                file = new File(str2).getParentFile();
            }
            if (file != null) {
                arrayList2.add(new File(file, str).getPath());
                if (str.startsWith("arm64")) {
                    arrayList2.add(new File(file, "arm64").getPath());
                } else if (str.startsWith("arm")) {
                    arrayList2.add(new File(file, "arm").getPath());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.endsWith(".apk")) {
                    arrayList2.add(str3 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str4 = File.pathSeparator;
            return new String[]{TextUtils.join(str4, arrayList), TextUtils.join(str4, arrayList2)};
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

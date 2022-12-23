package com.ogury.p245ed.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.webkit.DownloadListener;
import android.widget.Toast;
import com.vungle.warren.p261ui.JavascriptBridge;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ogury.ed.internal.hz */
public final class C8315hz implements DownloadListener {

    /* renamed from: a */
    private final Context f21484a;

    public C8315hz(Context context) {
        C8467mq.m23881b(context, "context");
        this.f21484a = context;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String str5;
        C8467mq.m23881b(str, "url");
        C8467mq.m23881b(str2, "userAgent");
        C8467mq.m23881b(str3, "contentDisposition");
        C8467mq.m23881b(str4, "mimetype");
        if (C8257gh.m23192a(this.f21484a, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            Uri parse = Uri.parse(str);
            String path = parse.getPath();
            List<String> b = path == null ? null : new C8512ob("/").mo54000b(path);
            if (b != null && (b.isEmpty() ^ true)) {
                str5 = (String) C8394km.m23766c(b);
            } else {
                str5 = UUID.randomUUID().toString();
                C8467mq.m23878a((Object) str5, "randomUUID().toString()");
            }
            DownloadManager.Request request = new DownloadManager.Request(parse);
            request.setTitle(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, JavascriptBridge.MraidHandler.DOWNLOAD_ACTION);
            Object systemService = this.f21484a.getSystemService(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION);
            if (systemService != null) {
                ((DownloadManager) systemService).enqueue(request);
                Context context = this.f21484a;
                C8472mv mvVar = C8472mv.f21701a;
                String format = String.format("Start downloading %s", Arrays.copyOf(new Object[]{str5}, 1));
                C8467mq.m23878a((Object) format, "java.lang.String.format(format, *args)");
                Toast.makeText(context, format, 0).show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
        }
    }
}

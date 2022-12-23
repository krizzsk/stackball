package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;

@Metadata(mo72092d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo72093d2 = {"Lcom/facebook/internal/UrlRedirectCache;", "", "()V", "redirectContentTag", "", "tag", "urlRedirectFileLruCache", "Lcom/facebook/internal/FileLruCache;", "cacheUriRedirect", "", "fromUri", "Landroid/net/Uri;", "toUri", "clearCache", "getCache", "getRedirectedUri", "uri", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: UrlRedirectCache.kt */
public final class UrlRedirectCache {
    public static final UrlRedirectCache INSTANCE = new UrlRedirectCache();
    private static final String redirectContentTag = (tag + "_Redirect");
    private static final String tag;
    private static FileLruCache urlRedirectFileLruCache;

    static {
        String simpleName = Reflection.getOrCreateKotlinClass(UrlRedirectCache.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "UrlRedirectCache";
        }
        tag = simpleName;
    }

    private UrlRedirectCache() {
    }

    @JvmStatic
    public static final synchronized FileLruCache getCache() throws IOException {
        FileLruCache fileLruCache;
        synchronized (UrlRedirectCache.class) {
            fileLruCache = urlRedirectFileLruCache;
            if (fileLruCache == null) {
                fileLruCache = new FileLruCache(tag, new FileLruCache.Limits());
            }
            urlRedirectFileLruCache = fileLruCache;
        }
        return fileLruCache;
    }

    @JvmStatic
    public static final Uri getRedirectedUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        InputStreamReader inputStreamReader = null;
        HashSet hashSet = new HashSet();
        hashSet.add(uri2);
        try {
            FileLruCache cache = getCache();
            InputStream inputStream = cache.get(uri2, redirectContentTag);
            boolean z = false;
            while (true) {
                if (inputStream == null) {
                    break;
                }
                z = true;
                InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream);
                try {
                    char[] cArr = new char[128];
                    StringBuilder sb = new StringBuilder();
                    for (int read = inputStreamReader2.read(cArr, 0, 128); read > 0; read = inputStreamReader2.read(cArr, 0, 128)) {
                        sb.append(cArr, 0, read);
                    }
                    Utility.closeQuietly(inputStreamReader2);
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "urlBuilder.toString()");
                    if (!hashSet.contains(sb2)) {
                        hashSet.add(sb2);
                        inputStream = cache.get(sb2, redirectContentTag);
                        uri2 = sb2;
                        inputStreamReader = inputStreamReader2;
                    } else if (Intrinsics.areEqual((Object) sb2, (Object) uri2)) {
                        inputStreamReader = inputStreamReader2;
                    } else {
                        Logger.Companion.log(LoggingBehavior.CACHE, 6, tag, "A loop detected in UrlRedirectCache");
                        Utility.closeQuietly(inputStreamReader2);
                        return null;
                    }
                } catch (IOException e) {
                    e = e;
                    inputStreamReader = inputStreamReader2;
                    try {
                        Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
                        Utility.closeQuietly(inputStreamReader);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader = inputStreamReader2;
                    Utility.closeQuietly(inputStreamReader);
                    throw th;
                }
            }
            if (z) {
                Uri parse = Uri.parse(uri2);
                Utility.closeQuietly(inputStreamReader);
                return parse;
            }
        } catch (IOException e2) {
            e = e2;
            Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
            Utility.closeQuietly(inputStreamReader);
            return null;
        }
        Utility.closeQuietly(inputStreamReader);
        return null;
    }

    @JvmStatic
    public static final void cacheUriRedirect(Uri uri, Uri uri2) {
        if (uri != null && uri2 != null) {
            OutputStream outputStream = null;
            try {
                FileLruCache cache = getCache();
                String uri3 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri3, "fromUri.toString()");
                outputStream = cache.openPutStream(uri3, redirectContentTag);
                String uri4 = uri2.toString();
                Intrinsics.checkNotNullExpressionValue(uri4, "toUri.toString()");
                Charset charset = Charsets.UTF_8;
                if (uri4 != null) {
                    byte[] bytes = uri4.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    Utility.closeQuietly(outputStream);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (IOException e) {
                Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
            } catch (Throwable th) {
                Utility.closeQuietly(outputStream);
                throw th;
            }
        }
    }

    @JvmStatic
    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
            String str = tag;
            companion.log(loggingBehavior, 5, str, "clearCache failed " + e.getMessage());
        }
    }
}

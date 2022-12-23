package com.smaato.sdk.res;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.smaato.sdk.flow.Action1;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.log.Logger;
import com.smaato.sdk.net.HttpClient;
import com.smaato.sdk.res.ImageLoaderImpl;
import com.smaato.sdk.util.Schedulers;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ImageLoaderImpl implements ImageLoader {
    /* access modifiers changed from: private */
    public final Schedulers executors;
    /* access modifiers changed from: private */
    public final HttpClient httpClient;

    @Inject
    ImageLoaderImpl(HttpClient httpClient2, Schedulers schedulers) {
        this.httpClient = httpClient2;
        this.executors = schedulers;
    }

    public ImageRequest load(Uri uri) {
        if (uri != null) {
            return new UriImageRequest(uri);
        }
        throw new NullPointerException("'uri' specified as non-null is null");
    }

    class UriImageRequest implements ImageRequest {
        private final Uri uri;

        UriImageRequest(Uri uri2) {
            this.uri = uri2;
        }

        public final void into(ImageView imageView) {
            if (imageView != null) {
                into((ImageTarget) new ImageViewTarget(imageView));
                return;
            }
            throw new NullPointerException("'view' specified as non-null is null");
        }

        public final void into(ImageTarget imageTarget) {
            if (imageTarget != null) {
                Flow.fromCallable(new Callable() {
                    public final Object call() {
                        return ImageLoaderImpl.UriImageRequest.this.blockingGet();
                    }
                }).subscribeOn(ImageLoaderImpl.this.executors.mo56385io()).observeOn(ImageLoaderImpl.this.executors.main()).subscribe(new Action1(imageTarget) {
                    public final /* synthetic */ ImageTarget f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void invoke(Object obj) {
                        ImageLoaderImpl.UriImageRequest.this.lambda$into$0$ImageLoaderImpl$UriImageRequest(this.f$1, (Bitmap) obj);
                    }
                }, (Action1<? super Throwable>) new Action1(imageTarget) {
                    public final /* synthetic */ ImageTarget f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void invoke(Object obj) {
                        ImageLoaderImpl.UriImageRequest.this.lambda$into$1$ImageLoaderImpl$UriImageRequest(this.f$1, (Throwable) obj);
                    }
                });
                return;
            }
            throw new NullPointerException("'target' specified as non-null is null");
        }

        public /* synthetic */ void lambda$into$0$ImageLoaderImpl$UriImageRequest(ImageTarget imageTarget, Bitmap bitmap) throws Throwable {
            imageTarget.onSuccess(this.uri, bitmap);
        }

        public /* synthetic */ void lambda$into$1$ImageLoaderImpl$UriImageRequest(ImageTarget imageTarget, Throwable th) throws Throwable {
            imageTarget.onFailure(this.uri, th);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
            if (r0 != null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
            r1.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
            r2 = move-exception;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Bitmap blockingGet() throws java.io.IOException {
            /*
                r3 = this;
                com.smaato.sdk.res.ImageLoaderImpl r0 = com.smaato.sdk.res.ImageLoaderImpl.this
                com.smaato.sdk.net.HttpClient r0 = r0.httpClient
                android.net.Uri r1 = r3.uri
                java.lang.String r1 = r1.toString()
                com.smaato.sdk.net.Request r1 = com.smaato.sdk.net.Request.get(r1)
                com.smaato.sdk.net.Call r0 = r0.newCall(r1)
                com.smaato.sdk.net.Response r0 = r0.execute()
                com.smaato.sdk.net.Response$Body r1 = r0.body()     // Catch:{ all -> 0x002a }
                java.io.InputStream r1 = r1.source()     // Catch:{ all -> 0x002a }
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ all -> 0x002a }
                if (r0 == 0) goto L_0x0029
                r0.close()
            L_0x0029:
                return r1
            L_0x002a:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x002c }
            L_0x002c:
                r2 = move-exception
                if (r0 == 0) goto L_0x0037
                r0.close()     // Catch:{ all -> 0x0033 }
                goto L_0x0037
            L_0x0033:
                r0 = move-exception
                r1.addSuppressed(r0)
            L_0x0037:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.res.ImageLoaderImpl.UriImageRequest.blockingGet():android.graphics.Bitmap");
        }
    }

    static class ImageViewTarget implements ImageTarget {
        private final Reference<ImageView> view;

        ImageViewTarget(ImageView imageView) {
            this.view = new WeakReference(imageView);
        }

        public final void onSuccess(Uri uri, Bitmap bitmap) {
            if (uri == null) {
                throw new NullPointerException("'uri' specified as non-null is null");
            } else if (bitmap != null) {
                ImageView imageView = this.view.get();
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
            } else {
                throw new NullPointerException("'bitmap' specified as non-null is null");
            }
        }

        public final void onFailure(Uri uri, Throwable th) {
            if (uri == null) {
                throw new NullPointerException("'uri' specified as non-null is null");
            } else if (th != null) {
                Logger.m24076e("Unable to load image: %s", th, uri);
            } else {
                throw new NullPointerException("'error' specified as non-null is null");
            }
        }
    }
}

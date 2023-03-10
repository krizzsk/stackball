package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class DynamiteModule {
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    public static final VersionPolicy zza = new zzl();
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static final ThreadLocal<zzn> zzf = new ThreadLocal<>();
    private static final ThreadLocal<Long> zzg = new zzd();
    private static final VersionPolicy.IVersions zzh = new zze();
    private static zzq zzj;
    private static zzr zzk;
    private final Context zzi;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzp) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzp) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzi = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02b2, code lost:
        if (r1 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b1, code lost:
        if (r1 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0331  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r19, java.lang.String r20) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r0 = zzf
            java.lang.Object r0 = r0.get()
            r5 = r0
            com.google.android.gms.dynamite.zzn r5 = (com.google.android.gms.dynamite.zzn) r5
            com.google.android.gms.dynamite.zzn r6 = new com.google.android.gms.dynamite.zzn
            r7 = 0
            r6.<init>(r7)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r0 = zzf
            r0.set(r6)
            java.lang.ThreadLocal<java.lang.Long> r0 = zzg
            java.lang.Object r0 = r0.get()
            java.lang.Long r0 = (java.lang.Long) r0
            long r8 = r0.longValue()
            r10 = 0
            java.lang.ThreadLocal<java.lang.Long> r0 = zzg     // Catch:{ all -> 0x0318 }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0318 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0318 }
            r0.set(r12)     // Catch:{ all -> 0x0318 }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions r0 = zzh     // Catch:{ all -> 0x0318 }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r12 = r2.selectModule(r1, r3, r0)     // Catch:{ all -> 0x0318 }
            java.lang.String r0 = "DynamiteModule"
            int r13 = r12.localVersion     // Catch:{ all -> 0x0318 }
            int r14 = r12.remoteVersion     // Catch:{ all -> 0x0318 }
            java.lang.String r15 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x0318 }
            int r15 = r15.length()     // Catch:{ all -> 0x0318 }
            int r15 = r15 + 68
            java.lang.String r16 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x0318 }
            int r16 = r16.length()     // Catch:{ all -> 0x0318 }
            int r15 = r15 + r16
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0318 }
            r7.<init>(r15)     // Catch:{ all -> 0x0318 }
            java.lang.String r15 = "Considering local module "
            r7.append(r15)     // Catch:{ all -> 0x0318 }
            r7.append(r3)     // Catch:{ all -> 0x0318 }
            java.lang.String r15 = ":"
            r7.append(r15)     // Catch:{ all -> 0x0318 }
            r7.append(r13)     // Catch:{ all -> 0x0318 }
            java.lang.String r13 = " and remote module "
            r7.append(r13)     // Catch:{ all -> 0x0318 }
            r7.append(r3)     // Catch:{ all -> 0x0318 }
            java.lang.String r13 = ":"
            r7.append(r13)     // Catch:{ all -> 0x0318 }
            r7.append(r14)     // Catch:{ all -> 0x0318 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0318 }
            android.util.Log.i(r0, r7)     // Catch:{ all -> 0x0318 }
            int r0 = r12.selection     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x02d9
            r7 = -1
            if (r0 != r7) goto L_0x008f
            int r0 = r12.localVersion     // Catch:{ all -> 0x0318 }
            if (r0 == 0) goto L_0x02d9
            r0 = -1
        L_0x008f:
            r13 = 1
            if (r0 != r13) goto L_0x0096
            int r14 = r12.remoteVersion     // Catch:{ all -> 0x0318 }
            if (r14 == 0) goto L_0x02d9
        L_0x0096:
            if (r0 != r7) goto L_0x00bc
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r1, r3)     // Catch:{ all -> 0x0318 }
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x00a6
            java.lang.ThreadLocal<java.lang.Long> r1 = zzg
            r1.remove()
            goto L_0x00af
        L_0x00a6:
            java.lang.ThreadLocal<java.lang.Long> r1 = zzg
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x00af:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x00b6
        L_0x00b3:
            r1.close()
        L_0x00b6:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r1 = zzf
            r1.set(r5)
            return r0
        L_0x00bc:
            if (r0 != r13) goto L_0x02bf
            int r0 = r12.remoteVersion     // Catch:{ LoadingException -> 0x0263 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.Boolean r15 = zzb     // Catch:{ all -> 0x0244 }
            monitor-exit(r4)     // Catch:{ all -> 0x0244 }
            if (r15 == 0) goto L_0x023b
            boolean r15 = r15.booleanValue()     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r13 = 2
            if (r15 == 0) goto L_0x017e
            java.lang.String r15 = "DynamiteModule"
            java.lang.String r17 = java.lang.String.valueOf(r20)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            int r17 = r17.length()     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            int r7 = r17 + 51
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r14.<init>(r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r7 = "Selected remote version of "
            r14.append(r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r14.append(r3)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r7 = ", version >= "
            r14.append(r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r14.append(r0)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r7 = r14.toString()     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            android.util.Log.i(r15, r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamite.zzr r7 = zzk     // Catch:{ all -> 0x017b }
            monitor-exit(r4)     // Catch:{ all -> 0x017b }
            if (r7 == 0) goto L_0x0172
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r14 = zzf     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.Object r14 = r14.get()     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamite.zzn r14 = (com.google.android.gms.dynamite.zzn) r14     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            if (r14 == 0) goto L_0x0169
            android.database.Cursor r15 = r14.zza     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            if (r15 == 0) goto L_0x0169
            android.content.Context r15 = r18.getApplicationContext()     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            android.database.Cursor r14 = r14.zza     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r16 = 0
            com.google.android.gms.dynamic.ObjectWrapper.wrap(r16)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            int r10 = zze     // Catch:{ all -> 0x0166 }
            if (r10 < r13) goto L_0x011b
            r13 = 1
            goto L_0x011c
        L_0x011b:
            r13 = 0
        L_0x011c:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0166 }
            monitor-exit(r4)     // Catch:{ all -> 0x0166 }
            boolean r4 = r10.booleanValue()     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            if (r4 == 0) goto L_0x013b
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r10 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r4, r10)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r15)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r14)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = r7.zzf(r4, r3, r0, r10)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            goto L_0x014e
        L_0x013b:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r10 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r4, r10)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r15)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r14)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = r7.zze(r4, r3, r0, r10)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x014e:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            if (r0 == 0) goto L_0x015d
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r4.<init>(r0)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            goto L_0x0207
        L_0x015d:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r4 = "Failed to get module context"
            r7 = 0
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            throw r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x0166:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0166 }
            throw r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x0169:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r4 = "No result cursor"
            r7 = 0
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            throw r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x0172:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r4 = "DynamiteLoaderV2 was not cached."
            r7 = 0
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            throw r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x017b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x017b }
            throw r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x017e:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r7 = java.lang.String.valueOf(r20)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            int r7 = r7.length()     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            int r7 = r7 + 51
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r10.<init>(r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r7 = "Selected remote version of "
            r10.append(r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r10.append(r3)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r7 = ", version >= "
            r10.append(r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r10.append(r0)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r7 = r10.toString()     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            android.util.Log.i(r4, r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamite.zzq r4 = zzf(r18)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            if (r4 == 0) goto L_0x0232
            int r7 = r4.zze()     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r10 = 3
            if (r7 < r10) goto L_0x01d5
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r7 = zzf     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.Object r7 = r7.get()     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamite.zzn r7 = (com.google.android.gms.dynamite.zzn) r7     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            if (r7 == 0) goto L_0x01cc
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r18)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            android.database.Cursor r7 = r7.zza     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzi(r10, r3, r0, r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            goto L_0x01f6
        L_0x01cc:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r4 = "No cached result cursor holder"
            r7 = 0
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            throw r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x01d5:
            if (r7 != r13) goto L_0x01e7
            java.lang.String r7 = "DynamiteModule"
            java.lang.String r10 = "IDynamite loader version = 2"
            android.util.Log.w(r7, r10)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r18)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzj(r7, r3, r0)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            goto L_0x01f6
        L_0x01e7:
            java.lang.String r7 = "DynamiteModule"
            java.lang.String r10 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r7, r10)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r18)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzh(r7, r3, r0)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x01f6:
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            if (r4 == 0) goto L_0x0229
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            r4.<init>(r0)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x0207:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0213
            java.lang.ThreadLocal<java.lang.Long> r0 = zzg
            r0.remove()
            goto L_0x021c
        L_0x0213:
            java.lang.ThreadLocal<java.lang.Long> r0 = zzg
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0.set(r1)
        L_0x021c:
            android.database.Cursor r0 = r6.zza
            if (r0 == 0) goto L_0x0223
            r0.close()
        L_0x0223:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r0 = zzf
            r0.set(r5)
            return r4
        L_0x0229:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r4 = "Failed to load remote module."
            r7 = 0
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            throw r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x0232:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r4 = "Failed to create IDynamiteLoader."
            r7 = 0
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            throw r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x023b:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            java.lang.String r4 = "Failed to determine which loading route to use."
            r7 = 0
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
            throw r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x0244:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0244 }
            throw r0     // Catch:{ RemoteException -> 0x024b, LoadingException -> 0x0249, all -> 0x0247 }
        L_0x0247:
            r0 = move-exception
            goto L_0x024d
        L_0x0249:
            r0 = move-exception
            goto L_0x0259
        L_0x024b:
            r0 = move-exception
            goto L_0x025a
        L_0x024d:
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch:{ all -> 0x0314 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0314 }
            java.lang.String r7 = "Failed to load remote module."
            r10 = 0
            r4.<init>(r7, r0, r10)     // Catch:{ all -> 0x0314 }
            throw r4     // Catch:{ all -> 0x0314 }
        L_0x0259:
            throw r0     // Catch:{ all -> 0x0314 }
        L_0x025a:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0314 }
            java.lang.String r7 = "Failed to load remote module."
            r10 = 0
            r4.<init>(r7, r0, r10)     // Catch:{ all -> 0x0314 }
            throw r4     // Catch:{ all -> 0x0314 }
        L_0x0263:
            r0 = move-exception
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r7 = "Failed to load remote module: "
            java.lang.String r10 = r0.getMessage()     // Catch:{  }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{  }
            int r11 = r10.length()     // Catch:{  }
            if (r11 == 0) goto L_0x027b
            java.lang.String r7 = r7.concat(r10)     // Catch:{  }
            goto L_0x0281
        L_0x027b:
            java.lang.String r10 = new java.lang.String     // Catch:{  }
            r10.<init>(r7)     // Catch:{  }
            r7 = r10
        L_0x0281:
            android.util.Log.w(r4, r7)     // Catch:{  }
            int r4 = r12.localVersion     // Catch:{  }
            if (r4 == 0) goto L_0x02b6
            com.google.android.gms.dynamite.zzo r7 = new com.google.android.gms.dynamite.zzo     // Catch:{  }
            r10 = 0
            r7.<init>(r4, r10)     // Catch:{  }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r2 = r2.selectModule(r1, r3, r7)     // Catch:{  }
            int r2 = r2.selection     // Catch:{  }
            r4 = -1
            if (r2 != r4) goto L_0x02b6
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r1, r3)     // Catch:{  }
            r1 = 0
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x02a7
            java.lang.ThreadLocal<java.lang.Long> r1 = zzg
            r1.remove()
            goto L_0x02b0
        L_0x02a7:
            java.lang.ThreadLocal<java.lang.Long> r1 = zzg
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x02b0:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x00b6
            goto L_0x00b3
        L_0x02b6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{  }
            throw r1     // Catch:{  }
        L_0x02bf:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
            r3 = 47
            r2.<init>(r3)     // Catch:{  }
            java.lang.String r3 = "VersionPolicy returned invalid code:"
            r2.append(r3)     // Catch:{  }
            r2.append(r0)     // Catch:{  }
            java.lang.String r0 = r2.toString()     // Catch:{  }
            r2 = 0
            r1.<init>(r0, r2)     // Catch:{  }
            throw r1     // Catch:{  }
        L_0x02d9:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            int r1 = r12.localVersion     // Catch:{  }
            int r2 = r12.remoteVersion     // Catch:{  }
            java.lang.String r4 = java.lang.String.valueOf(r20)     // Catch:{  }
            int r4 = r4.length()     // Catch:{  }
            int r4 = r4 + 92
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{  }
            r7.<init>(r4)     // Catch:{  }
            java.lang.String r4 = "No acceptable module "
            r7.append(r4)     // Catch:{  }
            r7.append(r3)     // Catch:{  }
            java.lang.String r3 = " found. Local version is "
            r7.append(r3)     // Catch:{  }
            r7.append(r1)     // Catch:{  }
            java.lang.String r1 = " and remote version is "
            r7.append(r1)     // Catch:{  }
            r7.append(r2)     // Catch:{  }
            java.lang.String r1 = "."
            r7.append(r1)     // Catch:{  }
            java.lang.String r1 = r7.toString()     // Catch:{  }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x0314:
            r0 = move-exception
            r1 = 0
            goto L_0x031a
        L_0x0318:
            r0 = move-exception
            r1 = r10
        L_0x031a:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0324
            java.lang.ThreadLocal<java.lang.Long> r1 = zzg
            r1.remove()
            goto L_0x032d
        L_0x0324:
            java.lang.ThreadLocal<java.lang.Long> r1 = zzg
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x032d:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x0334
            r1.close()
        L_0x0334:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r1 = zzf
            r1.set(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0090=Splitter:B:43:0x0090, B:18:0x003a=Splitter:B:18:0x003a, B:24:0x004a=Splitter:B:24:0x004a} */
    public static int zza(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01c9 }
            java.lang.Boolean r1 = zzb     // Catch:{ all -> 0x01c6 }
            r2 = 0
            if (r1 != 0) goto L_0x00d4
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r3 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.Class r1 = r1.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.String r3 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.Class r3 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            monitor-enter(r3)     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x003d
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a8 }
            if (r4 != r1) goto L_0x0037
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a8 }
            goto L_0x00a6
        L_0x0037:
            zzd(r4)     // Catch:{ LoadingException -> 0x003a }
        L_0x003a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a8 }
            goto L_0x00a6
        L_0x003d:
            boolean r4 = zzd     // Catch:{ all -> 0x00a8 }
            if (r4 != 0) goto L_0x009d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x004a
            goto L_0x009d
        L_0x004a:
            int r4 = zzb(r9, r10, r11)     // Catch:{ LoadingException -> 0x0093 }
            java.lang.String r5 = zzc     // Catch:{ LoadingException -> 0x0093 }
            if (r5 == 0) goto L_0x0090
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x0093 }
            if (r5 == 0) goto L_0x0059
            goto L_0x0090
        L_0x0059:
            java.lang.ClassLoader r5 = com.google.android.gms.dynamite.zzb.zza()     // Catch:{ LoadingException -> 0x0093 }
            if (r5 == 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x0093 }
            r6 = 29
            if (r5 < r6) goto L_0x0075
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x0093 }
            java.lang.String r6 = zzc     // Catch:{ LoadingException -> 0x0093 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ LoadingException -> 0x0093 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0093 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x0093 }
            goto L_0x0083
        L_0x0075:
            com.google.android.gms.dynamite.zzc r5 = new com.google.android.gms.dynamite.zzc     // Catch:{ LoadingException -> 0x0093 }
            java.lang.String r6 = zzc     // Catch:{ LoadingException -> 0x0093 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ LoadingException -> 0x0093 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0093 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x0093 }
        L_0x0083:
            zzd(r5)     // Catch:{ LoadingException -> 0x0093 }
            r1.set(r2, r5)     // Catch:{ LoadingException -> 0x0093 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x0093 }
            zzb = r5     // Catch:{ LoadingException -> 0x0093 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c6 }
            return r4
        L_0x0090:
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c6 }
            return r4
        L_0x0093:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a8 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a8 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a8 }
            goto L_0x00a6
        L_0x009d:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a8 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a8 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a8 }
        L_0x00a6:
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            goto L_0x00d2
        L_0x00a8:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            goto L_0x00b0
        L_0x00ad:
            r1 = move-exception
            goto L_0x00b0
        L_0x00af:
            r1 = move-exception
        L_0x00b0:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01c6 }
            int r4 = r1.length()     // Catch:{ all -> 0x01c6 }
            int r4 = r4 + 30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c6 }
            r5.<init>(r4)     // Catch:{ all -> 0x01c6 }
            java.lang.String r4 = "Failed to load module via V2: "
            r5.append(r4)     // Catch:{ all -> 0x01c6 }
            r5.append(r1)     // Catch:{ all -> 0x01c6 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01c6 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x01c6 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01c6 }
        L_0x00d2:
            zzb = r1     // Catch:{ all -> 0x01c6 }
        L_0x00d4:
            monitor-exit(r0)     // Catch:{ all -> 0x01c6 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01c9 }
            r1 = 0
            if (r0 == 0) goto L_0x0102
            int r9 = zzb(r9, r10, r11)     // Catch:{ LoadingException -> 0x00e1 }
            return r9
        L_0x00e1:
            r10 = move-exception
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x01c9 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01c9 }
            int r2 = r10.length()     // Catch:{ all -> 0x01c9 }
            if (r2 == 0) goto L_0x00f9
            java.lang.String r10 = r0.concat(r10)     // Catch:{ all -> 0x01c9 }
            goto L_0x00fe
        L_0x00f9:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x01c9 }
            r10.<init>(r0)     // Catch:{ all -> 0x01c9 }
        L_0x00fe:
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x01c9 }
            return r1
        L_0x0102:
            com.google.android.gms.dynamite.zzq r3 = zzf(r9)     // Catch:{ all -> 0x01c9 }
            if (r3 != 0) goto L_0x010a
            goto L_0x01bd
        L_0x010a:
            int r0 = r3.zze()     // Catch:{ RemoteException -> 0x0197 }
            r4 = 3
            if (r0 < r4) goto L_0x0172
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r0 = zzf     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0197 }
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch:{ RemoteException -> 0x0197 }
            if (r0 == 0) goto L_0x0125
            android.database.Cursor r0 = r0.zza     // Catch:{ RemoteException -> 0x0197 }
            if (r0 == 0) goto L_0x0125
            int r1 = r0.getInt(r1)     // Catch:{ RemoteException -> 0x0197 }
            goto L_0x01bd
        L_0x0125:
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x0197 }
            java.lang.ThreadLocal<java.lang.Long> r0 = zzg     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0197 }
            long r7 = r0.longValue()     // Catch:{ RemoteException -> 0x0197 }
            r5 = r10
            r6 = r11
            com.google.android.gms.dynamic.IObjectWrapper r10 = r3.zzk(r4, r5, r6, r7)     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)     // Catch:{ RemoteException -> 0x0197 }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ RemoteException -> 0x0197 }
            if (r10 == 0) goto L_0x015f
            boolean r11 = r10.moveToFirst()     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r11 != 0) goto L_0x014a
            goto L_0x015f
        L_0x014a:
            int r11 = r10.getInt(r1)     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r11 <= 0) goto L_0x0157
            boolean r0 = zze(r10)     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r0 == 0) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r2 = r10
        L_0x0158:
            if (r2 == 0) goto L_0x015d
            r2.close()     // Catch:{ all -> 0x01c9 }
        L_0x015d:
            r1 = r11
            goto L_0x01bd
        L_0x015f:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r0)     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r10 == 0) goto L_0x01bd
            r10.close()     // Catch:{ all -> 0x01c9 }
            goto L_0x01bd
        L_0x016c:
            r11 = move-exception
            r2 = r10
            goto L_0x01c0
        L_0x016f:
            r11 = move-exception
            r2 = r10
            goto L_0x0199
        L_0x0172:
            r4 = 2
            if (r0 != r4) goto L_0x0185
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x0197 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x0197 }
            int r1 = r3.zzg(r0, r10, r11)     // Catch:{ RemoteException -> 0x0197 }
            goto L_0x01bd
        L_0x0185:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x0197 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x0197 }
            int r1 = r3.zzf(r0, r10, r11)     // Catch:{ RemoteException -> 0x0197 }
            goto L_0x01bd
        L_0x0195:
            r11 = r10
            goto L_0x01c0
        L_0x0197:
            r10 = move-exception
            r11 = r10
        L_0x0199:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01be }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01be }
            int r3 = r11.length()     // Catch:{ all -> 0x01be }
            if (r3 == 0) goto L_0x01b0
            java.lang.String r11 = r0.concat(r11)     // Catch:{ all -> 0x01be }
            goto L_0x01b5
        L_0x01b0:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x01be }
            r11.<init>(r0)     // Catch:{ all -> 0x01be }
        L_0x01b5:
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x01bd
            r2.close()     // Catch:{ all -> 0x01c9 }
        L_0x01bd:
            return r1
        L_0x01be:
            r10 = move-exception
            goto L_0x0195
        L_0x01c0:
            if (r2 == 0) goto L_0x01c5
            r2.close()     // Catch:{ all -> 0x01c9 }
        L_0x01c5:
            throw r11     // Catch:{ all -> 0x01c9 }
        L_0x01c6:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c6 }
            throw r10     // Catch:{ all -> 0x01c9 }
        L_0x01c9:
            r10 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r9, r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = zzg     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r12.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            if (r10 == 0) goto L_0x00a0
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009e }
            if (r11 == 0) goto L_0x00a0
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009e }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009e }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            zzc = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            zze = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            zzd = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = zze(r10)     // Catch:{ Exception -> 0x009e }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x008e:
            if (r11 != 0) goto L_0x0096
            if (r10 == 0) goto L_0x0095
            r10.close()
        L_0x0095:
            return r12
        L_0x0096:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009e }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009e }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            r11 = move-exception
            goto L_0x00b5
        L_0x00a0:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009e }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009e }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009e }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x00af:
            r10 = move-exception
            r11 = r10
            goto L_0x00c4
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b5:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00c2 }
            if (r12 == 0) goto L_0x00ba
            throw r11     // Catch:{ all -> 0x00c2 }
        L_0x00ba:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r11, r0)     // Catch:{ all -> 0x00c2 }
            throw r12     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r11 = move-exception
            r0 = r10
        L_0x00c4:
            if (r0 == 0) goto L_0x00c9
            r0.close()
        L_0x00c9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzr;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzr = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzr = (zzr) queryLocalInterface;
                } else {
                    zzr = new zzr(iBinder);
                }
            }
            zzk = zzr;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (zzp) null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zzn = zzf.get();
        if (zzn == null || zzn.zza != null) {
            return false;
        }
        zzn.zza = cursor;
        return true;
    }

    private static zzq zzf(Context context) {
        zzq zzq;
        synchronized (DynamiteModule.class) {
            zzq zzq2 = zzj;
            if (zzq2 != null) {
                return zzq2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzq = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzq = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzq != null) {
                    zzj = zzq;
                    return zzq;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    public Context getModuleContext() {
        return this.zzi;
    }

    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzi.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (zzp) null);
        }
    }
}

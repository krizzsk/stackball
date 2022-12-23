package com.amazon.device.ads;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

class AppEventRegistrationHandler {
    protected static final String APP_EVENTS_FILE = "AppEventsJsonFile";
    protected static final long APP_EVENTS_FILE_MAX_SIZE = 1048576;
    protected static final String APP_EVENT_NAME_KEY = "evtName";
    protected static final String APP_EVENT_TIMESTAMP_KEY = "ts";
    protected static final String INSTALL_REFERRER_EVENT_NAME = "INSTALL_REFERRER";
    private static final String LOGTAG = AppEventRegistrationHandler.class.getSimpleName();
    protected static AppEventRegistrationHandler instance = new AppEventRegistrationHandler(MobileAdsInfoStore.getInstance(), new DefaultFileHandlerFactory());
    protected final Object appEventsFileLock;
    protected final Set<String> eventsSent;
    private final FileHandlerFactory fileHandlerFactory;
    private FileInputHandler fileInputHandler;
    private FileOutputHandler fileOutputHandler;
    /* access modifiers changed from: private */
    public final MobileAdsInfoStore infoStore;
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
    protected final Set<String> newEventsToSave;

    protected AppEventRegistrationHandler(MobileAdsInfoStore mobileAdsInfoStore, FileHandlerFactory fileHandlerFactory2) {
        this.infoStore = mobileAdsInfoStore;
        this.fileHandlerFactory = fileHandlerFactory2;
        this.appEventsFileLock = new Object();
        this.newEventsToSave = Collections.synchronizedSet(new HashSet());
        this.eventsSent = Collections.synchronizedSet(new HashSet());
    }

    public static AppEventRegistrationHandler getInstance() {
        return instance;
    }

    public void addEventToAppEventsCacheFile(final AppEvent appEvent) {
        ThreadUtils.scheduleRunnable(new Runnable() {
            public void run() {
                AppEventRegistrationHandler.this.appendAppEventToFile(appEvent);
                if (appEvent.getEventName().equals(AppEventRegistrationHandler.INSTALL_REFERRER_EVENT_NAME) && AppEventRegistrationHandler.this.infoStore.getRegistrationInfo().isRegisteredWithSIS()) {
                    AppEventRegistrationHandler.this.infoStore.getSISRegistration().registerEvents();
                }
            }
        });
    }

    private boolean createFileOutputHandlerIfNeeded() {
        if (this.fileOutputHandler == null) {
            File filesDir = this.infoStore.getFilesDir();
            if (filesDir == null) {
                this.logger.mo10939e("No files directory has been set.");
                return false;
            }
            this.fileOutputHandler = this.fileHandlerFactory.createFileOutputHandler(filesDir, APP_EVENTS_FILE);
        }
        if (this.fileOutputHandler != null) {
            return true;
        }
        return false;
    }

    private boolean createFileInputHandlerIfNeeded() {
        if (this.fileInputHandler == null) {
            File filesDir = this.infoStore.getFilesDir();
            if (filesDir == null) {
                this.logger.mo10939e("No files directory has been set.");
                return false;
            }
            this.fileInputHandler = this.fileHandlerFactory.createFileInputHandler(filesDir, APP_EVENTS_FILE);
        }
        if (this.fileInputHandler != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00ad */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void appendAppEventToFile(com.amazon.device.ads.AppEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.createFileOutputHandlerIfNeeded()
            if (r0 != 0) goto L_0x000e
            com.amazon.device.ads.MobileAdsLogger r10 = r9.logger
            java.lang.String r0 = "Error creating file output handler."
            r10.mo10939e(r0)
            return
        L_0x000e:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "evtName"
            java.lang.String r4 = r10.getEventName()     // Catch:{ JSONException -> 0x00c6 }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r3 = "ts"
            long r4 = r10.getTimestamp()     // Catch:{ JSONException -> 0x00c6 }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x00c6 }
            java.util.Set r3 = r10.getPropertyEntries()     // Catch:{ JSONException -> 0x00c6 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ JSONException -> 0x00c6 }
        L_0x002f:
            boolean r4 = r3.hasNext()     // Catch:{ JSONException -> 0x00c6 }
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r3.next()     // Catch:{ JSONException -> 0x00c6 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ JSONException -> 0x00c6 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x00c6 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ JSONException -> 0x00c6 }
            r0.put(r5, r4)     // Catch:{ JSONException -> 0x00c6 }
            goto L_0x002f
        L_0x0049:
            java.util.Set<java.lang.String> r3 = r9.newEventsToSave
            java.lang.String r4 = r0.toString()
            r3.add(r4)
            java.lang.Object r3 = r9.appEventsFileLock
            monitor-enter(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r4.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c3 }
            r4.append(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "\n"
            r4.append(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00c3 }
            com.amazon.device.ads.FileOutputHandler r4 = r9.fileOutputHandler     // Catch:{ all -> 0x00c3 }
            long r4 = r4.getFileLength()     // Catch:{ all -> 0x00c3 }
            int r6 = r0.length()     // Catch:{ all -> 0x00c3 }
            long r6 = (long) r6     // Catch:{ all -> 0x00c3 }
            long r4 = r4 + r6
            r6 = 1048576(0x100000, double:5.180654E-318)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x008e
            com.amazon.device.ads.MobileAdsLogger r0 = r9.logger     // Catch:{ all -> 0x00c3 }
            java.lang.String r4 = "Couldn't write the application event %s to the cache file. Maximum size limit reached."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c3 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00c3 }
            r2[r1] = r10     // Catch:{ all -> 0x00c3 }
            r0.mo11028w(r4, r2)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c3 }
            return
        L_0x008e:
            com.amazon.device.ads.FileOutputHandler r4 = r9.fileOutputHandler     // Catch:{ all -> 0x00c3 }
            com.amazon.device.ads.FileOutputHandler$WriteMethod r5 = com.amazon.device.ads.FileOutputHandler.WriteMethod.APPEND     // Catch:{ all -> 0x00c3 }
            boolean r4 = r4.open(r5)     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x00bc
            com.amazon.device.ads.FileOutputHandler r4 = r9.fileOutputHandler     // Catch:{ IOException -> 0x00ad }
            r4.write((java.lang.String) r0)     // Catch:{ IOException -> 0x00ad }
            com.amazon.device.ads.MobileAdsLogger r0 = r9.logger     // Catch:{ IOException -> 0x00ad }
            java.lang.String r4 = "Added the application event %s to the cache file."
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x00ad }
            java.lang.String r6 = r10.toString()     // Catch:{ IOException -> 0x00ad }
            r5[r1] = r6     // Catch:{ IOException -> 0x00ad }
            r0.mo11019d(r4, r5)     // Catch:{ IOException -> 0x00ad }
            goto L_0x00bc
        L_0x00ad:
            com.amazon.device.ads.MobileAdsLogger r0 = r9.logger     // Catch:{ all -> 0x00c3 }
            java.lang.String r4 = "Couldn't write the application event %s to the file."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c3 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00c3 }
            r2[r1] = r10     // Catch:{ all -> 0x00c3 }
            r0.mo11028w(r4, r2)     // Catch:{ all -> 0x00c3 }
        L_0x00bc:
            com.amazon.device.ads.FileOutputHandler r10 = r9.fileOutputHandler     // Catch:{ all -> 0x00c3 }
            r10.close()     // Catch:{ all -> 0x00c3 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c3 }
            return
        L_0x00c3:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c3 }
            throw r10
        L_0x00c6:
            com.amazon.device.ads.MobileAdsLogger r0 = r9.logger
            java.lang.String r3 = "Internal error while persisting the application event %s."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r10 = r10.toString()
            r2[r1] = r10
            r0.mo11028w(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AppEventRegistrationHandler.appendAppEventToFile(com.amazon.device.ads.AppEvent):void");
    }

    public JSONArray getAppEventsJSONArray() {
        if (!createFileInputHandlerIfNeeded()) {
            this.logger.mo10939e("Error creating file input handler.");
            return null;
        }
        synchronized (this.appEventsFileLock) {
            if (!this.fileInputHandler.doesFileExist()) {
                return null;
            }
            if (!this.fileInputHandler.open()) {
                this.logger.mo10939e("App Events File could not be opened.");
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            while (true) {
                String readLine = this.fileInputHandler.readLine();
                if (readLine != null) {
                    JSONObject jSONObjectFromString = JSONUtils.getJSONObjectFromString(readLine);
                    if (jSONObjectFromString == null) {
                        onAppEventsRegistered();
                        this.fileInputHandler.close();
                        return null;
                    }
                    jSONArray.put(jSONObjectFromString);
                    this.eventsSent.add(jSONObjectFromString.toString());
                } else {
                    this.fileInputHandler.close();
                    if (jSONArray.length() > 0) {
                        return jSONArray;
                    }
                    return null;
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAppEventsRegistered() {
        /*
            r5 = this;
            boolean r0 = r5.createFileOutputHandlerIfNeeded()
            if (r0 != 0) goto L_0x000e
            com.amazon.device.ads.MobileAdsLogger r0 = r5.logger
            java.lang.String r1 = "Error creating file output handler."
            r0.mo10939e(r1)
            return
        L_0x000e:
            java.lang.Object r0 = r5.appEventsFileLock
            monitor-enter(r0)
            java.util.Set<java.lang.String> r1 = r5.newEventsToSave     // Catch:{ all -> 0x0084 }
            java.util.Set<java.lang.String> r2 = r5.eventsSent     // Catch:{ all -> 0x0084 }
            r1.removeAll(r2)     // Catch:{ all -> 0x0084 }
            java.util.Set<java.lang.String> r1 = r5.newEventsToSave     // Catch:{ all -> 0x0084 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0084 }
            if (r1 != 0) goto L_0x0072
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r1.<init>()     // Catch:{ all -> 0x0084 }
            java.util.Set<java.lang.String> r2 = r5.newEventsToSave     // Catch:{ all -> 0x0084 }
            monitor-enter(r2)     // Catch:{ all -> 0x0084 }
            java.util.Set<java.lang.String> r3 = r5.newEventsToSave     // Catch:{ all -> 0x006f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x006f }
        L_0x002e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x006f }
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x006f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x006f }
            r1.append(r4)     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "\n"
            r1.append(r4)     // Catch:{ all -> 0x006f }
            goto L_0x002e
        L_0x0043:
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            com.amazon.device.ads.FileOutputHandler r2 = r5.fileOutputHandler     // Catch:{ all -> 0x0084 }
            com.amazon.device.ads.FileOutputHandler$WriteMethod r3 = com.amazon.device.ads.FileOutputHandler.WriteMethod.APPEND     // Catch:{ all -> 0x0084 }
            boolean r2 = r2.open(r3)     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x0069
            com.amazon.device.ads.FileOutputHandler r2 = r5.fileOutputHandler     // Catch:{ IOException -> 0x0062 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0062 }
            r2.write((java.lang.String) r1)     // Catch:{ IOException -> 0x0062 }
            java.util.Set<java.lang.String> r1 = r5.newEventsToSave     // Catch:{ IOException -> 0x0062 }
            r1.clear()     // Catch:{ IOException -> 0x0062 }
            java.util.Set<java.lang.String> r1 = r5.eventsSent     // Catch:{ IOException -> 0x0062 }
            r1.clear()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0069
        L_0x0062:
            com.amazon.device.ads.MobileAdsLogger r1 = r5.logger     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "Couldn't write the application event(s) to the file."
            r1.mo10942w(r2)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            com.amazon.device.ads.FileOutputHandler r1 = r5.fileOutputHandler     // Catch:{ all -> 0x0084 }
            r1.close()     // Catch:{ all -> 0x0084 }
            goto L_0x0082
        L_0x006f:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0072:
            com.amazon.device.ads.MobileAdsInfoStore r1 = r5.infoStore     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "AppEventsJsonFile"
            r1.deleteFile(r2)     // Catch:{ all -> 0x0084 }
            java.util.Set<java.lang.String> r1 = r5.eventsSent     // Catch:{ all -> 0x0084 }
            r1.clear()     // Catch:{ all -> 0x0084 }
        L_0x0082:
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            return
        L_0x0084:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AppEventRegistrationHandler.onAppEventsRegistered():void");
    }
}

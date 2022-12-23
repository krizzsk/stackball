package com.amazon.device.ads;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ThreadUtils {
    /* access modifiers changed from: private */
    public static ThreadRunner threadRunner = new ThreadRunner();

    public enum ExecutionStyle {
        RUN_ASAP,
        SCHEDULE
    }

    public enum ExecutionThread {
        MAIN_THREAD,
        BACKGROUND_THREAD
    }

    ThreadUtils() {
    }

    public static ThreadRunner getThreadRunner() {
        return threadRunner;
    }

    static void setThreadRunner(ThreadRunner threadRunner2) {
        threadRunner = threadRunner2;
    }

    public static boolean isOnMainThread() {
        return ThreadVerify.getInstance().isOnMainThread();
    }

    public static final <T> void executeAsyncTask(MobileAdsAsyncTask<T, ?, ?> mobileAdsAsyncTask, T... tArr) {
        threadRunner.executeAsyncTask(ExecutionStyle.RUN_ASAP, ExecutionThread.MAIN_THREAD, mobileAdsAsyncTask, tArr);
    }

    public static final <T> void executeAsyncTask(ThreadRunner threadRunner2, ExecutionStyle executionStyle, ExecutionThread executionThread, MobileAdsAsyncTask<T, ?, ?> mobileAdsAsyncTask, T... tArr) {
        threadRunner2.executeAsyncTask(executionStyle, executionThread, mobileAdsAsyncTask, tArr);
    }

    public static void scheduleRunnable(Runnable runnable) {
        scheduleRunnable(runnable, threadRunner);
    }

    public static void scheduleRunnable(Runnable runnable, ThreadRunner threadRunner2) {
        threadRunner2.execute(runnable, ExecutionStyle.SCHEDULE, ExecutionThread.BACKGROUND_THREAD);
    }

    public static void executeRunnableWithThreadCheck(Runnable runnable) {
        executeRunnableWithThreadCheck(runnable, threadRunner);
    }

    public static void executeRunnableWithThreadCheck(Runnable runnable, ThreadRunner threadRunner2) {
        threadRunner2.execute(runnable, ExecutionStyle.RUN_ASAP, ExecutionThread.BACKGROUND_THREAD);
    }

    public static void scheduleOnMainThread(Runnable runnable) {
        scheduleOnMainThread(runnable, threadRunner);
    }

    public static void scheduleOnMainThread(Runnable runnable, ThreadRunner threadRunner2) {
        threadRunner2.execute(runnable, ExecutionStyle.SCHEDULE, ExecutionThread.MAIN_THREAD);
    }

    public static void executeOnMainThread(Runnable runnable) {
        executeOnMainThread(runnable, threadRunner);
    }

    public static void executeOnMainThread(Runnable runnable, ThreadRunner threadRunner2) {
        threadRunner2.execute(runnable, ExecutionStyle.RUN_ASAP, ExecutionThread.MAIN_THREAD);
    }

    public static class ThreadRunner {
        private static final String LOGTAG = ThreadRunner.class.getSimpleName();
        private final HashMap<ExecutionStyle, HashMap<ExecutionThread, RunnableExecutor>> executors;
        private final MobileAdsLogger logger;

        ThreadRunner() {
            this(new MobileAdsLoggerFactory());
            ThreadVerify threadVerify = new ThreadVerify();
            withExecutor(new ThreadPoolScheduler());
            withExecutor(new BackgroundThreadRunner(threadVerify));
            withExecutor(new MainThreadScheduler());
            withExecutor(new MainThreadRunner(threadVerify));
        }

        ThreadRunner(MobileAdsLoggerFactory mobileAdsLoggerFactory) {
            this.executors = new HashMap<>();
            this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        }

        public ThreadRunner withExecutor(RunnableExecutor runnableExecutor) {
            HashMap hashMap = this.executors.get(runnableExecutor.getExecutionStyle());
            if (hashMap == null) {
                hashMap = new HashMap();
                this.executors.put(runnableExecutor.getExecutionStyle(), hashMap);
            }
            hashMap.put(runnableExecutor.getExecutionThread(), runnableExecutor);
            return this;
        }

        public void execute(Runnable runnable, ExecutionStyle executionStyle, ExecutionThread executionThread) {
            HashMap hashMap = this.executors.get(executionStyle);
            if (hashMap == null) {
                this.logger.mo11020e("No executor available for %s execution style.", executionStyle);
                return;
            }
            RunnableExecutor runnableExecutor = (RunnableExecutor) hashMap.get(executionThread);
            if (runnableExecutor == null) {
                this.logger.mo11020e("No executor available for %s execution style on % execution thread.", executionStyle, executionThread);
            }
            runnableExecutor.execute(runnable);
        }

        public <T> void executeAsyncTask(MobileAdsAsyncTask<T, ?, ?> mobileAdsAsyncTask, T... tArr) {
            executeAsyncTask(ExecutionStyle.RUN_ASAP, ExecutionThread.MAIN_THREAD, mobileAdsAsyncTask, tArr);
        }

        public <T> void executeAsyncTask(ExecutionStyle executionStyle, ExecutionThread executionThread, final MobileAdsAsyncTask<T, ?, ?> mobileAdsAsyncTask, final T... tArr) {
            ThreadUtils.threadRunner.execute(new Runnable() {
                public void run() {
                    AndroidTargetUtils.executeAsyncTask(mobileAdsAsyncTask, tArr);
                }
            }, executionStyle, executionThread);
        }
    }

    public static abstract class RunnableExecutor {
        private final ExecutionStyle executionStyle;
        /* access modifiers changed from: private */
        public final ExecutionThread executionThread;

        public abstract void execute(Runnable runnable);

        public RunnableExecutor(ExecutionStyle executionStyle2, ExecutionThread executionThread2) {
            this.executionStyle = executionStyle2;
            this.executionThread = executionThread2;
        }

        public ExecutionStyle getExecutionStyle() {
            return this.executionStyle;
        }

        public ExecutionThread getExecutionThread() {
            return this.executionThread;
        }
    }

    public static class MainThreadScheduler extends RunnableExecutor {
        public MainThreadScheduler() {
            super(ExecutionStyle.SCHEDULE, ExecutionThread.MAIN_THREAD);
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static class ThreadPoolScheduler extends RunnableExecutor {
        private static final int keepAliveTimeSeconds = 30;
        private static final int maxNumberThreads = 3;
        private static final int numberThreads = 1;
        private final ExecutorService executorService = new ThreadPoolExecutor(1, 3, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());

        public ThreadPoolScheduler() {
            super(ExecutionStyle.SCHEDULE, ExecutionThread.BACKGROUND_THREAD);
        }

        public void execute(Runnable runnable) {
            this.executorService.submit(runnable);
        }
    }

    public static class SingleThreadScheduler extends RunnableExecutor {
        private ExecutorService executorService = Executors.newSingleThreadExecutor();

        public SingleThreadScheduler() {
            super(ExecutionStyle.SCHEDULE, ExecutionThread.BACKGROUND_THREAD);
        }

        public void execute(Runnable runnable) {
            this.executorService.submit(runnable);
        }
    }

    public static class MainThreadRunner extends ThreadExecutor {
        public MainThreadRunner(ThreadVerify threadVerify) {
            super(threadVerify, new MainThreadScheduler());
        }
    }

    public static class BackgroundThreadRunner extends ThreadExecutor {
        public BackgroundThreadRunner(ThreadVerify threadVerify) {
            super(threadVerify, new ThreadPoolScheduler());
        }
    }

    public static class ThreadExecutor extends RunnableExecutor {
        private final RunnableExecutor threadScheduler;
        private final ThreadVerify threadVerify;

        public ThreadExecutor(ThreadVerify threadVerify2, RunnableExecutor runnableExecutor) {
            super(ExecutionStyle.RUN_ASAP, runnableExecutor.executionThread);
            this.threadVerify = threadVerify2;
            this.threadScheduler = runnableExecutor;
        }

        public void execute(Runnable runnable) {
            boolean z;
            int i = C09871.$SwitchMap$com$amazon$device$ads$ThreadUtils$ExecutionThread[this.threadScheduler.getExecutionThread().ordinal()];
            if (i == 1) {
                z = !this.threadVerify.isOnMainThread();
            } else if (i != 2) {
                z = false;
            } else {
                z = this.threadVerify.isOnMainThread();
            }
            if (z) {
                this.threadScheduler.execute(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: com.amazon.device.ads.ThreadUtils$1 */
    static /* synthetic */ class C09871 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$ThreadUtils$ExecutionThread;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.amazon.device.ads.ThreadUtils$ExecutionThread[] r0 = com.amazon.device.ads.ThreadUtils.ExecutionThread.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$ThreadUtils$ExecutionThread = r0
                com.amazon.device.ads.ThreadUtils$ExecutionThread r1 = com.amazon.device.ads.ThreadUtils.ExecutionThread.MAIN_THREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$ThreadUtils$ExecutionThread     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.ThreadUtils$ExecutionThread r1 = com.amazon.device.ads.ThreadUtils.ExecutionThread.BACKGROUND_THREAD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.ThreadUtils.C09871.<clinit>():void");
        }
    }

    static class ThreadVerify {
        private static ThreadVerify instance = new ThreadVerify();

        ThreadVerify() {
        }

        static ThreadVerify getInstance() {
            return instance;
        }

        /* access modifiers changed from: package-private */
        public boolean isOnMainThread() {
            return Looper.getMainLooper().getThread() == Thread.currentThread();
        }
    }

    static abstract class MobileAdsAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
        /* access modifiers changed from: protected */
        public abstract Result doInBackground(Params... paramsArr);

        MobileAdsAsyncTask() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Result result) {
            super.onPostExecute(result);
        }
    }
}

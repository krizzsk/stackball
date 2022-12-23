package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

public interface AudioRendererEventListener {
    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    @Deprecated
    void onAudioInputFormatChanged(Format format);

    void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j);

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i, long j, long j2);

    void onSkipSilenceEnabledChanged(boolean z);

    /* renamed from: com.google.android.exoplayer2.audio.AudioRendererEventListener$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAudioDecoderInitialized(AudioRendererEventListener audioRendererEventListener, String str, long j, long j2) {
        }

        public static void $default$onAudioDecoderReleased(AudioRendererEventListener audioRendererEventListener, String str) {
        }

        public static void $default$onAudioDisabled(AudioRendererEventListener audioRendererEventListener, DecoderCounters decoderCounters) {
        }

        public static void $default$onAudioEnabled(AudioRendererEventListener audioRendererEventListener, DecoderCounters decoderCounters) {
        }

        @Deprecated
        public static void $default$onAudioInputFormatChanged(AudioRendererEventListener audioRendererEventListener, Format format) {
        }

        public static void $default$onAudioPositionAdvancing(AudioRendererEventListener audioRendererEventListener, long j) {
        }

        public static void $default$onAudioSinkError(AudioRendererEventListener audioRendererEventListener, Exception exc) {
        }

        public static void $default$onAudioUnderrun(AudioRendererEventListener audioRendererEventListener, int i, long j, long j2) {
        }

        public static void $default$onSkipSilenceEnabledChanged(AudioRendererEventListener audioRendererEventListener, boolean z) {
        }

        public static void $default$onAudioInputFormatChanged(AudioRendererEventListener _this, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            _this.onAudioInputFormatChanged(format);
        }
    }

    public static final class EventDispatcher {
        private final Handler handler;
        private final AudioRendererEventListener listener;

        public EventDispatcher(Handler handler2, AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler2) : null;
            this.listener = audioRendererEventListener;
        }

        public void enabled(DecoderCounters decoderCounters) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(decoderCounters) {
                    public final /* synthetic */ DecoderCounters f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$enabled$0$AudioRendererEventListener$EventDispatcher(this.f$1);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$enabled$0$AudioRendererEventListener$EventDispatcher(DecoderCounters decoderCounters) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioEnabled(decoderCounters);
        }

        public void decoderInitialized(String str, long j, long j2) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(str, j, j2) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ long f$2;
                    public final /* synthetic */ long f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r5;
                    }

                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.mo20662xba417f1c(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* renamed from: lambda$decoderInitialized$1$AudioRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo20662xba417f1c(String str, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDecoderInitialized(str, j, j2);
        }

        public void inputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(format, decoderReuseEvaluation) {
                    public final /* synthetic */ Format f$1;
                    public final /* synthetic */ DecoderReuseEvaluation f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.mo20666x2eadf638(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: lambda$inputFormatChanged$2$AudioRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo20666x2eadf638(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void positionAdvancing(long j) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(j) {
                    public final /* synthetic */ long f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.mo20667x7926274e(this.f$1);
                    }
                });
            }
        }

        /* renamed from: lambda$positionAdvancing$3$AudioRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo20667x7926274e(long j) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioPositionAdvancing(j);
        }

        public void underrun(int i, long j, long j2) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(i, j, j2) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ long f$2;
                    public final /* synthetic */ long f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r5;
                    }

                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$underrun$4$AudioRendererEventListener$EventDispatcher(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$underrun$4$AudioRendererEventListener$EventDispatcher(int i, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioUnderrun(i, j, j2);
        }

        public void decoderReleased(String str) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(str) {
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.mo20663x3d1d9721(this.f$1);
                    }
                });
            }
        }

        /* renamed from: lambda$decoderReleased$5$AudioRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo20663x3d1d9721(String str) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDecoderReleased(str);
        }

        public void disabled(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(decoderCounters) {
                    public final /* synthetic */ DecoderCounters f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.lambda$disabled$6$AudioRendererEventListener$EventDispatcher(this.f$1);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$disabled$6$AudioRendererEventListener$EventDispatcher(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDisabled(decoderCounters);
        }

        public void skipSilenceEnabledChanged(boolean z) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(z) {
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.mo20668xa226f8cb(this.f$1);
                    }
                });
            }
        }

        /* renamed from: lambda$skipSilenceEnabledChanged$7$AudioRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo20668xa226f8cb(boolean z) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onSkipSilenceEnabledChanged(z);
        }

        public void audioSinkError(Exception exc) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(exc) {
                    public final /* synthetic */ Exception f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AudioRendererEventListener.EventDispatcher.this.mo20661xbc79aa86(this.f$1);
                    }
                });
            }
        }

        /* renamed from: lambda$audioSinkError$8$AudioRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo20661xbc79aa86(Exception exc) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioSinkError(exc);
        }
    }
}

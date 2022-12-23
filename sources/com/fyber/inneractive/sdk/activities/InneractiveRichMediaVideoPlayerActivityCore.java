package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.VideoView;
import com.fyber.inneractive.sdk.C2677R;
import com.fyber.inneractive.sdk.util.IAlog;

public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";

    /* renamed from: a */
    private View f6402a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public VideoView f6403b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f6404c = 0;

    /* renamed from: d */
    private final MediaPlayer.OnPreparedListener f6405d = new MediaPlayer.OnPreparedListener() {
        public final void onPrepared(MediaPlayer mediaPlayer) {
            IAlog.m9034b("onPrepared", new Object[0]);
            InneractiveRichMediaVideoPlayerActivityCore.this.f6403b.seekTo(InneractiveRichMediaVideoPlayerActivityCore.this.f6404c);
            InneractiveRichMediaVideoPlayerActivityCore.this.f6403b.start();
        }
    };

    /* access modifiers changed from: protected */
    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6404c = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(C2677R.layout.ia_rich_media_video);
        this.f6403b = (VideoView) findViewById(C2677R.C2679id.mraid_video_view);
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("video_url")) {
            str = null;
        } else {
            str = intent.getStringExtra("video_url");
        }
        if (TextUtils.isEmpty(str)) {
            IAlog.m9034b("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.f6403b.setVideoPath(str);
            this.f6403b.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    InneractiveRichMediaVideoPlayerActivityCore.this.finish();
                }
            });
            this.f6403b.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    IAlog.m9034b("Error: video can not be played.", new Object[0]);
                    InneractiveRichMediaVideoPlayerActivityCore.this.finish();
                    return false;
                }
            });
            this.f6403b.setOnPreparedListener(this.f6405d);
        }
        View findViewById = findViewById(C2677R.C2679id.ia_iv_close_button);
        this.f6402a = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                InneractiveRichMediaVideoPlayerActivityCore.this.finish();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f6404c = this.f6403b.getCurrentPosition();
        this.f6403b.pause();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.f6403b;
        bundle.putInt(VIDEO_CURRENT_POSITION, videoView == null ? 0 : videoView.getCurrentPosition());
    }

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra("video_url", str);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            IAlog.m9034b("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }
}

package com.amazon.device.ads;

import java.util.Timer;
import java.util.TimerTask;

class AdTimer {
    private Timer timer;

    AdTimer() {
    }

    public void cancelTimer() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
    }

    public void restartTimer() {
        cancelTimer();
        this.timer = new Timer();
    }

    public void scheduleTask(TimerTask timerTask, long j) {
        this.timer.schedule(timerTask, j);
    }
}

package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.Base64;

/* renamed from: com.my.target.q5 */
public class C7622q5 {
    /* renamed from: a */
    public static Bitmap m20196a(int i) {
        Bitmap bitmap;
        int i2 = (i / 4) + (i / 32);
        int i3 = i / 8;
        try {
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            C7374e0.m18989a("cannot build play icon: OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-2013265920);
        float f = (float) i;
        canvas.drawOval(new RectF(0.0f, 0.0f, f, f), paint);
        Paint paint2 = new Paint();
        paint2.setColor(0);
        canvas.drawPaint(paint2);
        paint2.setStrokeWidth(4.0f);
        paint2.setColor(-16733198);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setAntiAlias(true);
        int i4 = i3 * 3;
        Point point = new Point(i4, i2);
        Point point2 = new Point(i4, i - i2);
        Point point3 = new Point(i - (i3 * 2), i / 2);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        path.lineTo((float) point.x, (float) point.y);
        path.close();
        canvas.drawPath(path, paint2);
        return bitmap;
    }

    /* renamed from: a */
    public static Bitmap m20197a(Context context) {
        return m20198a(context, "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", 320);
    }

    /* renamed from: a */
    public static Bitmap m20198a(Context context, String str, int i) {
        byte[] decode = Base64.decode(str, 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = i;
        options.inTargetDensity = C7761y8.m20943b();
        return BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
    }

    /* renamed from: b */
    public static Bitmap m20199b(Context context) {
        return m20198a(context, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjITNKc0rQAAAJFJREFUeNrt2tENgCAMQEEwLuD+QzpC3cBURWLsvV+JNRfhi9YkSSpbP3sYETF0WO89s27m3KX6H1AeYL2wdrs5Y3/4ja/OTZ8B2f074h0z5zoDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/lr6rvDoK+xfmWsLNEmSVLUD47EiX/OuE8UAAAAASUVORK5CYII=", 420);
    }

    /* renamed from: c */
    public static Bitmap m20200c(Context context) {
        return m20198a(context, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCy8fw79+rQAAAhVJREFUeNrt2y9IXlEYx3H3ooIiiCAIC4JgMRgsCyaLwWaxLK0srZhWVtYWVtYWlpYMNsvK0sKKRTANBivDIIggIiLiZ+URDncHFgzbznN+8d77nvPwvec99zz/xsa6uv4oPMWjzADgK55kBnCvj3icGQBc4hWmsgK41w/sZAPwswLiC9ayAJjGa1wNrt/hAxaaBlBcW8ReZTVc4CUmmwZQ3FvHYQXEd2w3DyDuj/AMJxUQn7HaNIDiuRm8wfUAwi3eY75pAMXzS9ivrIZz7GKiaQDF7zZwVAHxDVvNAyj2h+c4rYD4hJWmARRjzOItbir7wzvMNQ2gGGsZB5XVcIYXGG8aQDHmJo4rII6x2TyAGHc83vpZBcQBlpsGUIw/F/vA7QDCTewbs00DKOZZiS/DUKfxJRk1DaCYbyvOCkMdYaN5ADHnRJwazysg9rHUNIBi7vnwI4b7w3X4HTNNAyhsWA3PcqiT8ERHTQMobNmOWMNQh1hvHkDYMxlRp4sKiD0sNg2gsGsh4pB3AwhXEbecbhpAYd9aRKZVItgPT+v96wAKO3ciVzHUw9J6/wuAsHUqslaXFRC/pfVGY139L9A3wf4Z7AehfhTuzlB3h3tApIfE/jqAtEHRtGHx1ImRtKmxtMnRtOnx1AUSaUtk0hZJpS2TS10ombZUNm2xdPpy+d4w0VtmetNU2ra51I2TuVtnuxrWL/YiKQ6CN9uRAAAAAElFTkSuQmCC", 420);
    }

    /* renamed from: d */
    public static Bitmap m20201d(Context context) {
        return m20198a(context, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjM59gfMOgAAA59JREFUeNrtmkloFEEUhl/N6KgxriiJOHEXF4gENYlgRFA8uyAoCNGggl68CCJ6EQx6cCFqUFzABQQRMYh4EfSi4IJbiFERQVxRgxuRMWri5yE1UBY9yWh6Znq6+z+96a6ZV/8/tbz3qkRChAgRwiMAFgJngWgQyVcDHXTiFKCCRH4Df6MFKAkK+W0W+VfAxCAQV8A+i/wTIB4E8lHgpEX+LjA8COQHAM8t8o3ATKC338kXA59IjXbgEVAPLAb6+k2AHRbhVrrGV+AwMNVPIpx3INncjRi/gTPAWL+IcMIieBGIAXFgGXAU+OggRALY7ItIEdhvkTsNRIz3MWCp3h1sXAGK/RAHnLKIHUzRdgnwwmr7Epjsh3jggkWsNkXbQuC4Q8g8Ld9F6ANctYht7KL9GiNpAnib94ujDo5uaUIdwMo00uafhghNQL98F2EYcA9YlGb75daoOeqHnSHyj+23WyLMC1oRJQpct7LJXkETYSrwyxBhlQQNwAFrFKigCTDK2hXmBnEUnDMEOBZEARYaArwLogAF1jRIq4YQ8YsASqmEiNw2HpUHSgCNB4Y9KYgCPDXs8UEU4LNhF6bzhW7DRmCEiFTqjx+VUtc8LECrYfd3RQA9lxq03SgiZR4WIGbYv9yaAt8Me5DHp8DAFP3ukQDvDTvu8WxrnGG/dUUApdQrEUkYU2a8hwWYnGJH6PEu0GzYczwaCSoRqTIeNbkpwFXDnu/Rf79URJKnyz9E5Kab6i4wYuxvQKEHR8BO8+DE7R+PAu8MB6s9Rj4GvDH6tzYTTvZaVZeIhwSoMfr2HRiUCSd21aXGI+T7WRcu6jLp7Ijh6AMw1AMCmKXxtozeLgOKgC+Gw4ZcFiCB2fpWSRLbsuF0nXUYsSlH5EfqE+IknmblSo0+1m6wRKjOMvnB+jzQHPpl2ezAEOCx0YEOYH2WfMct8rlZkIES4LXVkXqgTwZ9Vjn43JrLFXgC8Mzq0H2g0mU/BTrSa7d8bfHCPlwE3HC41XWyp9fbdIS3Tt8fxprzq7wUivYGdmnithCXgRXpxgw67K4A9ljhdxKPgVK3+q5cFqJcRA6JyAyn1zpFfaBz9RZdtYnpStNonc/PEpEhDt9vE5FaEdmtlPrh2YoEEAEWpbje9j9o1aNrhOQbgOlAncNC2R0SwCVgZaZTb5VFMUpEpEJEpojIGBEZLJ21+zbpLGe3iMgTEXkoIneUUj8lRIgQIUKECJFJ/AEepzU1TSID5QAAAABJRU5ErkJggg==", 420);
    }

    /* renamed from: e */
    public static Bitmap m20202e(Context context) {
        return m20198a(context, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAclBMVEUAAAAAAAAgICDf39+goKAgICAQEBDe3t7Pz88QEBDv7+9wcHBAQEDf39+AgIDv7+/AwMCQkJDPz8+/v7+vr69gYGCfn5+Pj49fX19QUFBAQEAwMDBQUFDu7u5/f39/f39wcHBvb2+/v78wMDCvr6////9R0hTPAAAAJXRSTlOAAJDvzyAQ3ueI97ig34Dv38fPv6+vn49fUECYqO7Av3Bv35fYiozA+AAAAjJJREFUSMe91um2mjAUBeBDGMOkjDJoe63d7/+KTbyxpzZJgXat7j8i8nkICUkocCRZ7mNbQaXq+vsSuEK2mrsT3nLqp22Y1FplzbAKUhFl0WS68hj7ILNvhaS3iEHbOvbDuVKsJEfWCEgnD0wuzOyIELgkLhi3yAv6Q4ocaWzDuEIoPISLsiR2maSNyIwl/XQR7Uj0lAwTVY92JUOb/AIvCOU+KENcGE7IBe2MyDEbqBtYeB9kaPUK0sTA2tvAMgesk2fUnzAGhNt9ARywxC15wtHTEzICvhpoldSwwuoZJ3lJBlolFZyQeZoXCjLQKjkr2GNwNy+S5IEFOgVPEO7mEfmgVPdKCzK+PIeJbp4fUoaFPtDwCOYIYihfXx5k0uCDeh41+dvlfBSGwvzx1ZwdMFKHki9yH0VQ0nx8ZkVLFcQGNIQdkUCqf9mEGrHTAXZBLdn9Fxgh/P4mgb9/OC3WLdhY3VGioxHD8QFQoN8z5IR89TvxkPMN8vC6NciTE+TR10rgFlDQoTj6Ig/oFZxxJkeuoX/qyDApqO61dEmh5NUJV6TPWa7G+dj0GGHUkEvunJAFEGvIJZ0NtWFolgBVMj246MQGBvOxZW7694U1SNr9S3mavG0e0uObh5c8vF1heXCDxHJ7S9bGvk1g5i1anq1NIGdKgejhY+ns3+jGNYBs+K2sLBQ71UnggEzHVNumKJ9aPIYmAzMH5Ez9DRytupkZQ1eWe9+l2lTteF+UsvMDBKFIvMRHIr8AAAAASUVORK5CYII=", 320);
    }

    /* renamed from: f */
    public static Bitmap m20203f(Context context) {
        return m20198a(context, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAdVBMVEUAAAAAAAAgICDf398QEBDv7+/Pz8+fn58gICAQEBDe3t5AQEBwcHDv7+9/f3/f398wMDCAgIBgYGCQkJDAwMC/v7/Pz8+fn59QUFBAQECvr69QUFCPj4+/v79wcHBvb29gYGBfX1++vr6urq6Ojo5hYWH///+8blWlAAAAJnRSTlOAAJDviPfnzyAQ3qC478DfmICvx9/fz59QQK+oj79wb2Bfvq6OsPCmZBAAAAJhSURBVEjHndbXYuIwEAXQiSQXueAGtmkhJNn7/5+4I8JmbJAWw33iQYex7FGhN0/s9jT0FTjVcXfavvlC92o8lpil3J0fQ9s4FXdtrYij8qKLXeUhDUFhm8LQLKp1tknDcKyY5eRJnQDZOQDtwcOkrAa+rQ+mPaKC/pMiQpbew7SCVgEiRUWSuNjQg5hYJP26hBYkYTmFluvRosTo7QQeoM0yaDS+BX4gUrQwKsJ4hW6CRfBF6ruvgsxeYROcYB4BdJs1mh+YAoEHXQEemKO0FzgEvoRJAKbkL8mwQh3okygnhv6SxK80DkxPKxI4Lzky3KH1Ty8x9AM14mQ/f7GfDEso//SIfiEwWwEGpaUtYhke4Ro3vX+QU//hCdfTxtvSOzrpYIkigS6mm3ZXh3faSddEN8PlUTet+9vNL2wx0BH5ZFAAuhmbSEbW6KmCegTJFGC0kkZRyGRMEHIYbXi0ngxdCA0i9/sViNdggQ3ViCdDl72cFdBSO385PeqFn0NjL+vjkwa0DxsgcidDBz3p8t3ilktuWi7U5Ho/hWoV3TW5LWGWLKuN1COFktfjEcXDhayT2fHXYsdwxJo82evw1hHjzNCWyAObld57YY3ssss1WD+3PSYYHJSSCzdkBaQOSknfRD1QX48ALpk9eeikF8gZnzvmzi8erIfpUd4vP8ozO7s8ZK9dHpx8+roi8skLksjHV7I+DV0C42DRfA0cbODa+ZEBSR1i2Ri+6KYNuGp7U9YUzMpGygmc0CFztivyi1Z128UQ5oPywF+3l/njKEygL9vT12cGTtUPp631DfkLyeFPR/ZOiKIAAAAASUVORK5CYII=", 320);
    }
}

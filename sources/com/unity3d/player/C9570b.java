package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.player.b */
public final class C9570b {

    /* renamed from: b */
    private static CameraManager f23818b;

    /* renamed from: c */
    private static String[] f23819c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Semaphore f23820e = new Semaphore(1);

    /* renamed from: A */
    private CameraCaptureSession.CaptureCallback f23821A = new CameraCaptureSession.CaptureCallback() {
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C9570b.this.m25628a(captureRequest.getTag());
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            C9578d.Log(5, "Camera2: Capture session failed " + captureRequest.getTag() + " reason " + captureFailure.getReason());
            C9570b.this.m25628a(captureRequest.getTag());
        }

        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        }

        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        }
    };

    /* renamed from: B */
    private final CameraDevice.StateCallback f23822B = new CameraDevice.StateCallback() {
        public final void onClosed(CameraDevice cameraDevice) {
            C9570b.f23820e.release();
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            C9578d.Log(5, "Camera2: CameraDevice disconnected.");
            C9570b.this.m25626a(cameraDevice);
            C9570b.f23820e.release();
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            C9578d.Log(6, "Camera2: Error opeining CameraDevice " + i);
            C9570b.this.m25626a(cameraDevice);
            C9570b.f23820e.release();
        }

        public final void onOpened(CameraDevice cameraDevice) {
            CameraDevice unused = C9570b.this.f23826d = cameraDevice;
            C9570b.f23820e.release();
        }
    };

    /* renamed from: C */
    private final ImageReader.OnImageAvailableListener f23823C = new ImageReader.OnImageAvailableListener() {
        public final void onImageAvailable(ImageReader imageReader) {
            if (C9570b.f23820e.tryAcquire()) {
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage != null) {
                    Image.Plane[] planes = acquireNextImage.getPlanes();
                    if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                        C9577c h = C9570b.this.f23825a;
                        ByteBuffer buffer = planes[0].getBuffer();
                        ByteBuffer buffer2 = planes[1].getBuffer();
                        ByteBuffer buffer3 = planes[2].getBuffer();
                        h.mo58573a(buffer, buffer2, buffer3, planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                    } else {
                        C9578d.Log(6, "Camera2: Wrong image format.");
                    }
                    if (C9570b.this.f23840s != null) {
                        C9570b.this.f23840s.close();
                    }
                    Image unused = C9570b.this.f23840s = acquireNextImage;
                }
                C9570b.f23820e.release();
            }
        }
    };

    /* renamed from: D */
    private final SurfaceTexture.OnFrameAvailableListener f23824D = new SurfaceTexture.OnFrameAvailableListener() {
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            C9570b.this.f23825a.mo58572a(surfaceTexture);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C9577c f23825a = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public CameraDevice f23826d;

    /* renamed from: f */
    private HandlerThread f23827f;

    /* renamed from: g */
    private Handler f23828g;

    /* renamed from: h */
    private Rect f23829h;

    /* renamed from: i */
    private Rect f23830i;

    /* renamed from: j */
    private int f23831j;

    /* renamed from: k */
    private int f23832k;

    /* renamed from: l */
    private float f23833l = -1.0f;

    /* renamed from: m */
    private float f23834m = -1.0f;

    /* renamed from: n */
    private int f23835n;

    /* renamed from: o */
    private int f23836o;

    /* renamed from: p */
    private boolean f23837p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Range f23838q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ImageReader f23839r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Image f23840s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public CaptureRequest.Builder f23841t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public CameraCaptureSession f23842u = null;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Object f23843v = new Object();

    /* renamed from: w */
    private int f23844w;

    /* renamed from: x */
    private SurfaceTexture f23845x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Surface f23846y = null;

    /* renamed from: z */
    private int f23847z = C9576a.f23855c;

    /* renamed from: com.unity3d.player.b$a */
    private enum C9576a {
        ;

        static {
            f23856d = new int[]{1, 2, 3};
        }
    }

    protected C9570b(C9577c cVar) {
        this.f23825a = cVar;
        m25644g();
    }

    /* renamed from: a */
    public static int m25617a(Context context) {
        return m25637c(context).length;
    }

    /* renamed from: a */
    public static int m25618a(Context context, int i) {
        try {
            return ((Integer) m25630b(context).getCameraCharacteristics(m25637c(context)[i]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e) {
            C9578d.Log(6, "Camera2: CameraAccessException " + e);
            return 0;
        }
    }

    /* renamed from: a */
    private static int m25619a(Range[] rangeArr, int i) {
        int i2 = -1;
        double d = Double.MAX_VALUE;
        for (int i3 = 0; i3 < rangeArr.length; i3++) {
            int intValue = ((Integer) rangeArr[i3].getLower()).intValue();
            int intValue2 = ((Integer) rangeArr[i3].getUpper()).intValue();
            float f = (float) i;
            if (f + 0.1f > ((float) intValue) && f - 0.1f < ((float) intValue2)) {
                return i;
            }
            double min = (double) ((float) Math.min(Math.abs(i - intValue), Math.abs(i - intValue2)));
            if (min < d) {
                i2 = i3;
                d = min;
            }
        }
        return ((Integer) (i > ((Integer) rangeArr[i2].getUpper()).intValue() ? rangeArr[i2].getUpper() : rangeArr[i2].getLower())).intValue();
    }

    /* renamed from: a */
    private static Rect m25620a(Size[] sizeArr, double d, double d2) {
        Size[] sizeArr2 = sizeArr;
        double d3 = Double.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < sizeArr2.length; i3++) {
            int width = sizeArr2[i3].getWidth();
            int height = sizeArr2[i3].getHeight();
            double abs = Math.abs(Math.log(d / ((double) width))) + Math.abs(Math.log(d2 / ((double) height)));
            if (abs < d3) {
                i = width;
                i2 = height;
                d3 = abs;
            }
        }
        return new Rect(0, 0, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25626a(CameraDevice cameraDevice) {
        synchronized (this.f23843v) {
            this.f23842u = null;
        }
        cameraDevice.close();
        this.f23826d = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25628a(Object obj) {
        if (obj == "Focus") {
            this.f23837p = false;
            synchronized (this.f23843v) {
                if (this.f23842u != null) {
                    try {
                        this.f23841t.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.f23841t.setTag("Regular");
                        this.f23842u.setRepeatingRequest(this.f23841t.build(), this.f23821A, this.f23828g);
                    } catch (CameraAccessException e) {
                        C9578d.Log(6, "Camera2: CameraAccessException " + e);
                    }
                }
            }
        } else if (obj == "Cancel focus") {
            synchronized (this.f23843v) {
                if (this.f23842u != null) {
                    m25650j();
                }
            }
        }
    }

    /* renamed from: a */
    private static Size[] m25629a(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C9578d.Log(6, "Camera2: configuration map is not available.");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        return outputSizes;
    }

    /* renamed from: b */
    private static CameraManager m25630b(Context context) {
        if (f23818b == null) {
            f23818b = (CameraManager) context.getSystemService("camera");
        }
        return f23818b;
    }

    /* renamed from: b */
    private void m25632b(CameraCharacteristics cameraCharacteristics) {
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
        this.f23832k = intValue;
        if (intValue > 0) {
            Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            this.f23830i = rect;
            float width = ((float) rect.width()) / ((float) this.f23830i.height());
            float width2 = ((float) this.f23829h.width()) / ((float) this.f23829h.height());
            if (width2 > width) {
                this.f23835n = 0;
                this.f23836o = (int) ((((float) this.f23830i.height()) - (((float) this.f23830i.width()) / width2)) / 2.0f);
            } else {
                this.f23836o = 0;
                this.f23835n = (int) ((((float) this.f23830i.width()) - (((float) this.f23830i.height()) * width2)) / 2.0f);
            }
            this.f23831j = Math.min(this.f23830i.width(), this.f23830i.height()) / 20;
        }
    }

    /* renamed from: b */
    public static boolean m25634b(Context context, int i) {
        try {
            return ((Integer) m25630b(context).getCameraCharacteristics(m25637c(context)[i]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e) {
            C9578d.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m25636c(Context context, int i) {
        try {
            return ((Integer) m25630b(context).getCameraCharacteristics(m25637c(context)[i]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e) {
            C9578d.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* renamed from: c */
    private static String[] m25637c(Context context) {
        if (f23819c == null) {
            try {
                f23819c = m25630b(context).getCameraIdList();
            } catch (CameraAccessException e) {
                C9578d.Log(6, "Camera2: CameraAccessException " + e);
                f23819c = new String[0];
            }
        }
        return f23819c;
    }

    /* renamed from: d */
    public static int m25638d(Context context, int i) {
        try {
            CameraCharacteristics cameraCharacteristics = m25630b(context).getCameraCharacteristics(m25637c(context)[i]);
            float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (fArr.length > 0) {
                return (int) ((fArr[0] * 36.0f) / sizeF.getWidth());
            }
        } catch (CameraAccessException e) {
            C9578d.Log(6, "Camera2: CameraAccessException " + e);
        }
        return 0;
    }

    /* renamed from: e */
    public static int[] m25641e(Context context, int i) {
        try {
            Size[] a = m25629a(m25630b(context).getCameraCharacteristics(m25637c(context)[i]));
            if (a == null) {
                return null;
            }
            int[] iArr = new int[(a.length * 2)];
            for (int i2 = 0; i2 < a.length; i2++) {
                int i3 = i2 * 2;
                iArr[i3] = a[i2].getWidth();
                iArr[i3 + 1] = a[i2].getHeight();
            }
            return iArr;
        } catch (CameraAccessException e) {
            C9578d.Log(6, "Camera2: CameraAccessException " + e);
            return null;
        }
    }

    /* renamed from: g */
    private void m25644g() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f23827f = handlerThread;
        handlerThread.start();
        this.f23828g = new Handler(this.f23827f.getLooper());
    }

    /* renamed from: h */
    private void m25647h() {
        this.f23827f.quit();
        try {
            this.f23827f.join(4000);
            this.f23827f = null;
            this.f23828g = null;
        } catch (InterruptedException e) {
            this.f23827f.interrupt();
            C9578d.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + e);
        }
    }

    /* renamed from: i */
    private void m25649i() {
        try {
            if (!f23820e.tryAcquire(4, TimeUnit.SECONDS)) {
                C9578d.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
            this.f23826d.close();
            try {
                if (!f23820e.tryAcquire(4, TimeUnit.SECONDS)) {
                    C9578d.Log(5, "Camera2: Timeout waiting to close camera.");
                }
            } catch (InterruptedException e) {
                C9578d.Log(6, "Camera2: Interrupted while waiting to close camera " + e);
            }
            this.f23826d = null;
            f23820e.release();
        } catch (InterruptedException e2) {
            C9578d.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m25650j() {
        try {
            if (this.f23832k != 0 && this.f23833l >= 0.0f && this.f23833l <= 1.0f && this.f23834m >= 0.0f) {
                if (this.f23834m <= 1.0f) {
                    this.f23837p = true;
                    int max = Math.max(this.f23831j + 1, Math.min((int) ((((float) (this.f23830i.width() - (this.f23835n * 2))) * this.f23833l) + ((float) this.f23835n)), (this.f23830i.width() - this.f23831j) - 1));
                    int max2 = Math.max(this.f23831j + 1, Math.min((int) ((((double) (this.f23830i.height() - (this.f23836o * 2))) * (1.0d - ((double) this.f23834m))) + ((double) this.f23836o)), (this.f23830i.height() - this.f23831j) - 1));
                    this.f23841t.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(max - this.f23831j, max2 - this.f23831j, this.f23831j * 2, this.f23831j * 2, 999)});
                    this.f23841t.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    this.f23841t.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    this.f23841t.setTag("Focus");
                    this.f23842u.capture(this.f23841t.build(), this.f23821A, this.f23828g);
                    return;
                }
            }
            this.f23841t.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f23841t.setTag("Regular");
            if (this.f23842u != null) {
                this.f23842u.setRepeatingRequest(this.f23841t.build(), this.f23821A, this.f23828g);
            }
        } catch (CameraAccessException e) {
            C9578d.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: k */
    private void m25651k() {
        try {
            if (this.f23842u != null) {
                this.f23842u.stopRepeating();
                this.f23841t.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.f23841t.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f23841t.setTag("Cancel focus");
                this.f23842u.capture(this.f23841t.build(), this.f23821A, this.f23828g);
            }
        } catch (CameraAccessException e) {
            C9578d.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: a */
    public final Rect mo58733a() {
        return this.f23829h;
    }

    /* renamed from: a */
    public final boolean mo58734a(float f, float f2) {
        if (this.f23832k <= 0) {
            return false;
        }
        if (!this.f23837p) {
            this.f23833l = f;
            this.f23834m = f2;
            synchronized (this.f23843v) {
                if (!(this.f23842u == null || this.f23847z == C9576a.f23854b)) {
                    m25651k();
                }
            }
            return true;
        }
        C9578d.Log(5, "Camera2: Setting manual focus point already started.");
        return false;
    }

    /* renamed from: a */
    public final boolean mo58735a(Context context, int i, int i2, int i3, int i4, int i5) {
        try {
            CameraCharacteristics cameraCharacteristics = f23818b.getCameraCharacteristics(m25637c(context)[i]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                C9578d.Log(5, "Camera2: only LEGACY hardware level is supported.");
                return false;
            }
            Size[] a = m25629a(cameraCharacteristics);
            if (!(a == null || a.length == 0)) {
                this.f23829h = m25620a(a, (double) i2, (double) i3);
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null || rangeArr.length == 0) {
                    C9578d.Log(6, "Camera2: target FPS ranges are not avialable.");
                } else {
                    int a2 = m25619a(rangeArr, i4);
                    this.f23838q = new Range(Integer.valueOf(a2), Integer.valueOf(a2));
                    try {
                        if (!f23820e.tryAcquire(4, TimeUnit.SECONDS)) {
                            C9578d.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                            return false;
                        }
                        try {
                            f23818b.openCamera(m25637c(context)[i], this.f23822B, this.f23828g);
                            try {
                                if (!f23820e.tryAcquire(4, TimeUnit.SECONDS)) {
                                    C9578d.Log(5, "Camera2: Timeout waiting to open camera.");
                                    return false;
                                }
                                f23820e.release();
                                this.f23844w = i5;
                                m25632b(cameraCharacteristics);
                                return this.f23826d != null;
                            } catch (InterruptedException e) {
                                C9578d.Log(6, "Camera2: Interrupted while waiting to open camera " + e);
                            }
                        } catch (CameraAccessException e2) {
                            C9578d.Log(6, "Camera2: CameraAccessException " + e2);
                            f23820e.release();
                            return false;
                        }
                    } catch (InterruptedException e3) {
                        C9578d.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + e3);
                        return false;
                    }
                }
            }
            return false;
        } catch (CameraAccessException e4) {
            C9578d.Log(6, "Camera2: CameraAccessException " + e4);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo58736b() {
        if (this.f23826d != null) {
            mo58739e();
            m25649i();
            this.f23821A = null;
            this.f23846y = null;
            this.f23845x = null;
            Image image = this.f23840s;
            if (image != null) {
                image.close();
                this.f23840s = null;
            }
            ImageReader imageReader = this.f23839r;
            if (imageReader != null) {
                imageReader.close();
                this.f23839r = null;
            }
        }
        m25647h();
    }

    /* renamed from: c */
    public final void mo58737c() {
        List list;
        if (this.f23839r == null) {
            ImageReader newInstance = ImageReader.newInstance(this.f23829h.width(), this.f23829h.height(), 35, 2);
            this.f23839r = newInstance;
            newInstance.setOnImageAvailableListener(this.f23823C, this.f23828g);
            this.f23840s = null;
            if (this.f23844w != 0) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f23844w);
                this.f23845x = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f23829h.width(), this.f23829h.height());
                this.f23845x.setOnFrameAvailableListener(this.f23824D, this.f23828g);
                this.f23846y = new Surface(this.f23845x);
            }
        }
        try {
            if (this.f23842u == null) {
                CameraDevice cameraDevice = this.f23826d;
                if (this.f23846y != null) {
                    list = Arrays.asList(new Surface[]{this.f23846y, this.f23839r.getSurface()});
                } else {
                    list = Arrays.asList(new Surface[]{this.f23839r.getSurface()});
                }
                cameraDevice.createCaptureSession(list, new CameraCaptureSession.StateCallback() {
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        C9578d.Log(6, "Camera2: CaptureSession configuration failed.");
                    }

                    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        if (C9570b.this.f23826d != null) {
                            synchronized (C9570b.this.f23843v) {
                                CameraCaptureSession unused = C9570b.this.f23842u = cameraCaptureSession;
                                try {
                                    CaptureRequest.Builder unused2 = C9570b.this.f23841t = C9570b.this.f23826d.createCaptureRequest(1);
                                    if (C9570b.this.f23846y != null) {
                                        C9570b.this.f23841t.addTarget(C9570b.this.f23846y);
                                    }
                                    C9570b.this.f23841t.addTarget(C9570b.this.f23839r.getSurface());
                                    C9570b.this.f23841t.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, C9570b.this.f23838q);
                                    C9570b.this.m25650j();
                                } catch (CameraAccessException e) {
                                    C9578d.Log(6, "Camera2: CameraAccessException " + e);
                                }
                            }
                        }
                    }
                }, this.f23828g);
            } else if (this.f23847z == C9576a.f23854b) {
                this.f23842u.setRepeatingRequest(this.f23841t.build(), this.f23821A, this.f23828g);
            }
            this.f23847z = C9576a.f23853a;
        } catch (CameraAccessException e) {
            C9578d.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: d */
    public final void mo58738d() {
        synchronized (this.f23843v) {
            if (this.f23842u != null) {
                try {
                    this.f23842u.stopRepeating();
                    this.f23847z = C9576a.f23854b;
                } catch (CameraAccessException e) {
                    C9578d.Log(6, "Camera2: CameraAccessException " + e);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo58739e() {
        synchronized (this.f23843v) {
            if (this.f23842u != null) {
                try {
                    this.f23842u.abortCaptures();
                } catch (CameraAccessException e) {
                    C9578d.Log(6, "Camera2: CameraAccessException " + e);
                }
                this.f23842u.close();
                this.f23842u = null;
                this.f23847z = C9576a.f23855c;
            }
        }
    }
}

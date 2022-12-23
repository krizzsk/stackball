package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6368w;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import java.util.Locale;

public class MBAlertDialog extends Dialog {

    /* renamed from: a */
    private C7218a f18073a;

    /* renamed from: b */
    private TextView f18074b;

    /* renamed from: c */
    private TextView f18075c;

    /* renamed from: d */
    private Button f18076d;

    /* renamed from: e */
    private Button f18077e;

    public MBAlertDialog(Context context, final C7218a aVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(C6347k.m16084a(context, "mbridge_cm_alertview", "layout"), (ViewGroup) null);
        this.f18073a = aVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f18074b = (TextView) inflate.findViewById(C6347k.m16084a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                C6361q.m16154a("MBAlertDialog", e.getMessage());
            }
            try {
                this.f18075c = (TextView) inflate.findViewById(C6347k.m16084a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f18076d = (Button) inflate.findViewById(C6347k.m16084a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f18077e = (Button) inflate.findViewById(C6347k.m16084a(context, "mbridge_video_common_alertview_cancel_button", "id"));
            } catch (Exception e2) {
                C6361q.m16154a("MBAlertDialog", e2.getMessage());
            }
        }
        Button button = this.f18077e;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C7218a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo44064a();
                    }
                    MBAlertDialog.this.cancel();
                    MBAlertDialog.this.clear();
                }
            });
        }
        Button button2 = this.f18076d;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C7218a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo44065b();
                    }
                    MBAlertDialog.this.cancel();
                    MBAlertDialog.this.clear();
                }
            });
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public void clear() {
        if (this.f18073a != null) {
            this.f18073a = null;
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f18074b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setContent(String str) {
        TextView textView = this.f18075c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.f18076d;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setCancelText(String str) {
        Button button = this.f18077e;
        if (button != null) {
            button.setText(str);
        }
    }

    /* renamed from: a */
    private void m18362a(String str, String str2, String str3, String str4) {
        setTitle(str);
        setContent(str2);
        setConfirmText(str3);
        setCancelText(str4);
    }

    public void makeRVAlertView(String str) {
        String str2 = str;
        try {
            Context context = getContext();
            String obj = C6368w.m16234b(context, "MBridge_ConfirmTitle" + str2, "").toString();
            Context context2 = getContext();
            String obj2 = C6368w.m16234b(context2, "MBridge_ConfirmContent" + str2, "").toString();
            Context context3 = getContext();
            String obj3 = C6368w.m16234b(context3, "MBridge_CancelText" + str2, "").toString();
            Context context4 = getContext();
            String obj4 = C6368w.m16234b(context4, "MBridge_ConfirmText" + str2, "").toString();
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            if (TextUtils.isEmpty(obj)) {
                if (TextUtils.isEmpty(obj2) && TextUtils.isEmpty(obj3) && TextUtils.isEmpty(obj4)) {
                    if (b != null) {
                        m18362a(b.mo42658C(), b.mo42659D(), b.mo42660E(), b.mo42661F());
                        return;
                    }
                    String language = Locale.getDefault().getLanguage();
                    if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                        setTitle("Confirm to close? ");
                        setContent("You will not be rewarded after closing the window");
                        setConfirmText("Close it");
                        setCancelText("Continue");
                        return;
                    }
                    setTitle("确认关闭？");
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                    setConfirmText("确认关闭");
                    setCancelText("继续观看");
                    return;
                }
            }
            String language2 = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(obj)) {
                if (b != null) {
                    obj = b.mo42658C();
                } else if (TextUtils.isEmpty(language2) || !language2.equals("zh")) {
                    setTitle("Confirm to close? ");
                } else {
                    setTitle("确认关闭？");
                }
            }
            if (TextUtils.isEmpty(obj2)) {
                if (b != null) {
                    obj2 = b.mo42659D();
                } else if (TextUtils.isEmpty(language2) || !language2.equals("zh")) {
                    setContent("You will not be rewarded after closing the window");
                } else {
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                }
            }
            if (TextUtils.isEmpty(obj4)) {
                if (b != null) {
                    obj4 = b.mo42660E();
                } else if (TextUtils.isEmpty(language2) || !language2.equals("zh")) {
                    setConfirmText("Close it");
                } else {
                    setConfirmText("确认关闭");
                }
            }
            if (TextUtils.isEmpty(obj3)) {
                if (b != null) {
                    obj3 = b.mo42661F();
                } else if (TextUtils.isEmpty(language2) || !language2.equals("zh")) {
                    setCancelText("Continue");
                } else {
                    setCancelText("继续观看");
                }
            }
            m18362a(obj, obj2, obj4, obj3);
        } catch (Exception e) {
            C6361q.m16154a("MBAlertDialog", e.getMessage());
        }
    }

    public void makePlayableAlertView() {
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        if (b != null) {
            m18362a(b.mo42658C(), b.mo42659D(), b.mo42660E(), b.mo42662G());
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle("Confirm to close? ");
            setContent("You will not be rewarded after closing the window");
            setConfirmText("Close it");
            setCancelText("Continue");
            return;
        }
        setTitle("确认关闭？");
        setContent("关闭后您将不会获得任何奖励噢~ ");
        setConfirmText("确认关闭");
        setCancelText("继续试玩");
    }

    public void makeIVAlertView(int i, String str) {
        try {
            Context context = getContext();
            String obj = C6368w.m16234b(context, "MBridge_ConfirmTitle" + str, "").toString();
            Context context2 = getContext();
            String obj2 = C6368w.m16234b(context2, "MBridge_ConfirmContent" + str, "").toString();
            Context context3 = getContext();
            String obj3 = C6368w.m16234b(context3, "MBridge_CancelText" + str, "").toString();
            Context context4 = getContext();
            String obj4 = C6368w.m16234b(context4, "MBridge_ConfirmText" + str, "").toString();
            if (!TextUtils.isEmpty(obj) || !TextUtils.isEmpty(obj2) || !TextUtils.isEmpty(obj3) || !TextUtils.isEmpty(obj4)) {
                m18362a(obj, obj2, obj3, obj4);
                return;
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                setTitle(i == C6204a.f15403m ? "Confirm" : "Tips");
                setContent(i == C6204a.f15403m ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?");
                setConfirmText(i == C6204a.f15403m ? "Close" : "Cancel");
                setCancelText("Continue");
                return;
            }
            setTitle(i == C6204a.f15403m ? "确认关闭？" : "提示");
            setContent(i == C6204a.f15403m ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？");
            setConfirmText(i == C6204a.f15403m ? "确认关闭" : "取消");
            setCancelText("继续");
        } catch (Exception e) {
            C6361q.m16154a("MBAlertDialog", e.getMessage());
        }
    }

    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e) {
            C6361q.m16158d("MBAlertDialog", e.getMessage());
            super.show();
        }
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            if (Build.VERSION.SDK_INT >= 19) {
                window.addFlags(67108864);
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            } else {
                window.getDecorView().setSystemUiVisibility(2);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }
}

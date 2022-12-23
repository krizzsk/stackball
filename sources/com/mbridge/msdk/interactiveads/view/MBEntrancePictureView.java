package com.mbridge.msdk.interactiveads.view;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.interactiveads.activity.InteractiveShowActivity;
import com.mbridge.msdk.interactiveads.activity.InteractiveWebView;
import com.mbridge.msdk.interactiveads.p186c.C6408a;
import com.mbridge.msdk.interactiveads.p189f.C6417a;

public class MBEntrancePictureView extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f15989a = "";

    public void setUnitId(String str) {
        this.f15989a = str;
    }

    public MBEntrancePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    public void refreshUI(final Context context, String str, final CampaignEx campaignEx) {
        if (getChildCount() > 0) {
            removeAllViews();
        }
        if (!TextUtils.isEmpty(str)) {
            InteractiveWebView interactiveWebView = new InteractiveWebView(context);
            interactiveWebView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            interactiveWebView.loadDataWithBaseURL((String) null, "<!DOCTYPE html><html lang=\"en\"><head>  <meta charset=\"UTF-8\">  <meta name=\"viewport\" content=\"width=100, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">  <title>Document</title>  <style>  *{    margin: 0;    padding: 0;  }  html, body{    width: 100%;    height: 100%;  }  body{    background-image: url('gifUrl');    background-position: center;    background-size: contain;    background-repeat: no-repeat;  }  </style></head><body></body></html>".replace("gifUrl", str), WebRequest.CONTENT_TYPE_HTML, "utf-8", (String) null);
            addView(interactiveWebView);
            setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBEntrancePictureView.this.f15989a != null) {
                        C6417a.m16390a(context, campaignEx, 2, 4, MBEntrancePictureView.this.f15989a);
                        Intent intent = new Intent(context, InteractiveShowActivity.class);
                        C6408a.f15950f = true;
                        intent.putExtra("unitId", MBEntrancePictureView.this.f15989a);
                        intent.putExtra("campaign", campaignEx);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }
}

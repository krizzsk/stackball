package com.mbridge.msdk.video.dynview.p230i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p168c.C6216b;
import com.mbridge.msdk.foundation.same.p168c.C6219c;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6370y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.video.dynview.C6925b;
import com.mbridge.msdk.video.dynview.p220c.C6931a;
import com.mbridge.msdk.video.dynview.p221d.C6932a;
import com.mbridge.msdk.video.dynview.p221d.C6933b;
import com.mbridge.msdk.video.dynview.p226g.C6963b;
import com.mbridge.msdk.video.dynview.p227h.p228a.C6970a;
import com.mbridge.msdk.video.dynview.p227h.p229b.C6972a;
import com.mbridge.msdk.video.dynview.p227h.p229b.C6973b;
import com.mbridge.msdk.video.dynview.widget.MBridgeImageView;
import com.mbridge.msdk.video.dynview.widget.MBridgeTextView;
import com.mbridge.msdk.widget.C7215a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.i.a */
/* compiled from: DataEnergizeWrapper */
public final class C6975a {

    /* renamed from: a */
    private C6973b f17185a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Map<String, Bitmap> f17186b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f17187c;

    /* renamed from: a */
    public final void mo48500a(C6925b bVar, View view, final Map map, C6933b bVar2) {
        CampaignEx campaignEx;
        FrameLayout.LayoutParams layoutParams;
        if (this.f17186b == null) {
            this.f17186b = new HashMap();
        }
        final List<CampaignEx> g = bVar.mo48426g();
        Context context = view.getContext();
        if (context == null) {
            bVar2.mo48444a(C6931a.NOT_FOUND_CONTEXT);
            return;
        }
        CampaignEx campaignEx2 = null;
        if (g == null || g.size() <= 1) {
            campaignEx = null;
        } else {
            campaignEx2 = g.get(0);
            campaignEx = g.get(1);
        }
        if (campaignEx2 == null && bVar2 != null) {
            bVar2.mo48444a(C6931a.CAMPAIGNEX_IS_NULL);
        } else if (campaignEx != null || bVar2 == null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m17594a("mbridge_top_item_rl"));
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new C7215a() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo48366a(View view) {
                        if (!C6975a.this.f17187c) {
                            boolean unused = C6975a.this.f17187c = true;
                            C6975a.m17598a(C6975a.this, map, g, 0);
                        }
                    }
                });
            }
            MBridgeImageView mBridgeImageView = (MBridgeImageView) view.findViewById(m17594a("mbridge_top_iv"));
            if (mBridgeImageView != null) {
                m17600a(campaignEx2.getImageUrl(), (ImageView) mBridgeImageView, bVar, view);
            }
            MBridgeImageView mBridgeImageView2 = (MBridgeImageView) view.findViewById(m17594a("mbridge_top_icon_iv"));
            if (mBridgeImageView2 != null) {
                m17599a(campaignEx2.getIconUrl(), (ImageView) mBridgeImageView2);
            }
            TextView textView = (TextView) view.findViewById(m17594a("mbridge_top_title_tv"));
            if (textView != null) {
                if (!TextUtils.isEmpty(campaignEx2.getAppName())) {
                    textView.setText(campaignEx2.getAppName());
                } else {
                    textView.setVisibility(8);
                }
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(m17594a("mbridge_bottom_item_rl"));
            if (relativeLayout2 != null) {
                relativeLayout2.setOnClickListener(new C7215a() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo48366a(View view) {
                        if (!C6975a.this.f17187c) {
                            boolean unused = C6975a.this.f17187c = true;
                            C6975a.m17598a(C6975a.this, map, g, 1);
                        }
                    }
                });
            }
            MBridgeImageView mBridgeImageView3 = (MBridgeImageView) view.findViewById(m17594a("mbridge_bottom_iv"));
            if (mBridgeImageView3 != null) {
                m17600a(campaignEx.getImageUrl(), (ImageView) mBridgeImageView3, bVar, view);
            }
            MBridgeImageView mBridgeImageView4 = (MBridgeImageView) view.findViewById(m17594a("mbridge_bottom_icon_iv"));
            if (mBridgeImageView4 != null) {
                m17599a(campaignEx.getIconUrl(), (ImageView) mBridgeImageView4);
            }
            TextView textView2 = (TextView) view.findViewById(m17594a("mbridge_bottom_title_tv"));
            if (textView2 != null) {
                textView2.setText(campaignEx.getAppName());
            }
            String mof_template_url = campaignEx2.getMof_template_url();
            int e = bVar.mo48424e();
            String a = C6370y.m16238a(mof_template_url, "cltp");
            long parseLong = !TextUtils.isEmpty(a) ? Long.parseLong(a) : 0;
            if (parseLong != 0) {
                final MBridgeTextView mBridgeTextView = (MBridgeTextView) view.findViewById(m17594a("mbridge_choice_one_countdown_tv"));
                mBridgeTextView.setRadius(C6366u.m16203b(view.getContext(), 12.0f));
                mBridgeTextView.setBackgroundColor(Color.parseColor("#60000000"));
                mBridgeTextView.setTextSize(11.0f);
                mBridgeTextView.setTextColor(Color.parseColor("#FFFFFFFF"));
                mBridgeTextView.setStrokeData(C6366u.m16203b(context.getApplicationContext(), 1.0f), Color.parseColor("#60e3eaec"));
                if (e == 2 && (layoutParams = (FrameLayout.LayoutParams) mBridgeTextView.getLayoutParams()) != null) {
                    int e2 = C6366u.m16218e(context);
                    int b = C6366u.m16203b(context, 10.0f);
                    layoutParams.setMargins(b, b, e2, b);
                }
                if (mBridgeTextView != null) {
                    mBridgeTextView.setVisibility(0);
                    mBridgeTextView.setOnClickListener(new C7215a() {
                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public final void mo48366a(View view) {
                            if (!C6975a.this.f17187c) {
                                boolean unused = C6975a.this.f17187c = true;
                                C6975a.m17597a(C6975a.this, map);
                            }
                        }
                    });
                    C6973b a2 = new C6973b().mo48495b(parseLong * 1000).mo48492a(1000).mo48493a((C6972a) new C6972a() {
                        /* renamed from: a */
                        public final void mo48491a(long j) {
                            String str;
                            if (C6349m.m16100c(mBridgeTextView.getContext()).contains("zh")) {
                                str = (j / 1000) + "秒后自动播放";
                            } else {
                                str = "Auto play after " + (j / 1000) + " s";
                            }
                            mBridgeTextView.setText(str);
                        }

                        /* renamed from: a */
                        public final void mo48490a() {
                            C6975a.m17597a(C6975a.this, map);
                        }
                    });
                    this.f17185a = a2;
                    a2.mo48494a();
                }
            }
            if (!C6349m.m16100c(view.getContext()).contains("zh")) {
                ImageView imageView = (ImageView) view.findViewById(m17594a("mbridge_reward_choice_one_like_iv"));
                if (!(bVar == null || imageView == null)) {
                    if (bVar.mo48424e() == 1) {
                        imageView.setImageResource(C6347k.m16084a(context.getApplicationContext(), "mbridge_choice_video_title_en_por", "drawable"));
                    } else {
                        imageView.setImageResource(C6347k.m16084a(context.getApplicationContext(), "mbridge_choice_video_title_en_land", "drawable"));
                    }
                }
            }
            if (bVar2 != null) {
                bVar2.mo48443a();
            }
        } else {
            bVar2.mo48444a(C6931a.CAMPAIGNEX_IS_NULL);
        }
    }

    /* renamed from: a */
    private void m17599a(String str, final ImageView imageView) {
        C6216b.m15729a(imageView.getContext()).mo43786a(str, (C6219c) new C6219c() {
            public final void onSuccessLoad(Bitmap bitmap, String str) {
                ImageView imageView;
                if (bitmap != null && (imageView = imageView) != null) {
                    imageView.setImageBitmap(bitmap);
                }
            }

            public final void onFailedLoad(String str, String str2) {
                Log.d("NATVIEW", "");
            }
        });
    }

    /* renamed from: a */
    private void m17600a(String str, ImageView imageView, C6925b bVar, View view) {
        final ImageView imageView2 = imageView;
        final String str2 = str;
        final C6925b bVar2 = bVar;
        final View view2 = view;
        C6216b.m15729a(imageView.getContext()).mo43786a(str, (C6219c) new C6219c() {
            public final void onSuccessLoad(Bitmap bitmap, String str) {
                ImageView imageView;
                if (bitmap != null && !bitmap.isRecycled() && (imageView = imageView2) != null) {
                    imageView.setImageBitmap(bitmap);
                    if (C6975a.this.f17186b != null) {
                        C6975a.this.f17186b.put(SameMD5.getMD5(str2), bitmap);
                        C6975a.m17596a(C6975a.this, bVar2, view2);
                    }
                }
            }

            public final void onFailedLoad(String str, String str2) {
                C6975a.this.f17186b.put(SameMD5.getMD5(str2), C6975a.this.m17595a());
                C6975a.m17596a(C6975a.this, bVar2, view2);
            }
        });
    }

    /* renamed from: a */
    private int m17594a(String str) {
        return C6347k.m16084a(C6122a.m15302b().mo42895d(), str, "id");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m17595a() {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            bitmap.eraseColor(Color.parseColor("#FF0000"));
            return bitmap;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return bitmap;
            }
            e.printStackTrace();
            return bitmap;
        }
    }

    /* renamed from: b */
    private void m17604b() {
        C6970a.m17581a().mo48489b();
        C6973b bVar = this.f17185a;
        if (bVar != null) {
            bVar.mo48496b();
            this.f17185a = null;
        }
        Map<String, Bitmap> map = this.f17186b;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f17186b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        if (!(next == null || next.getValue() == null || ((Bitmap) next.getValue()).isRecycled())) {
                            ((Bitmap) next.getValue()).recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f17186b.clear();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17598a(C6975a aVar, Map map, List list, int i) {
        if (map != null && map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof C6932a) && list != null && list.size() > 1) {
            ((C6932a) map.get("choice_one_callback")).mo47081a((CampaignEx) list.get(i));
            aVar.m17604b();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17597a(C6975a aVar, Map map) {
        if (map != null && map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof C6932a)) {
            ((C6932a) map.get("choice_one_callback")).mo47080a();
            aVar.m17604b();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17596a(C6975a aVar, C6925b bVar, View view) {
        Map<String, Bitmap> map = aVar.f17186b;
        if (map != null && map.size() > 1) {
            new C6963b();
            Map<String, Bitmap> map2 = aVar.f17186b;
            if (view != null) {
                C6970a.m17581a().mo48488a(map2, bVar, view);
            }
        }
    }
}

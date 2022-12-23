package com.mbridge.msdk.video.dynview.endcard.adapter;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p168c.C6216b;
import com.mbridge.msdk.foundation.same.p168c.C6219c;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6370y;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.video.dynview.endcard.C6947b;
import com.mbridge.msdk.video.dynview.widget.MBridgeImageView;
import java.util.ArrayList;
import java.util.List;

public class MBMoreOfferAdapter extends RecyclerView.Adapter<C6946b> implements NoProGuard {
    /* access modifiers changed from: private */
    public int bitmapSuccessCount = 0;
    private List<CampaignEx> campaignExList = new ArrayList();
    /* access modifiers changed from: private */
    public boolean isShowMoreOffer;
    public C6945a listener;
    /* access modifiers changed from: private */
    public C6947b moreOfferShowCallBack;
    private String rewardEndCardurl = "";

    /* renamed from: com.mbridge.msdk.video.dynview.endcard.adapter.MBMoreOfferAdapter$a */
    public interface C6945a {
        /* renamed from: a */
        void mo48456a(int i);
    }

    static /* synthetic */ int access$008(MBMoreOfferAdapter mBMoreOfferAdapter) {
        int i = mBMoreOfferAdapter.bitmapSuccessCount;
        mBMoreOfferAdapter.bitmapSuccessCount = i + 1;
        return i;
    }

    public void setOnItemClickListener(C6945a aVar) {
        this.listener = aVar;
    }

    public void setRewardEndCardurl(String str) {
        this.rewardEndCardurl = str;
    }

    public void setMoreOfferShowCallBack(C6947b bVar) {
        this.moreOfferShowCallBack = bVar;
    }

    public C6946b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6946b(LayoutInflater.from(viewGroup.getContext()).inflate(C6347k.m16084a(viewGroup.getContext(), "mbridge_reward_end_card_more_offer_item", "layout"), viewGroup, false));
    }

    public void onBindViewHolder(final C6946b bVar, final int i) {
        List<CampaignEx> list = this.campaignExList;
        if (list != null && list.size() > 0) {
            C6216b.m15729a(bVar.itemView.getContext()).mo43786a(this.campaignExList.get(i).getIconUrl(), (C6219c) new C6219c() {
                public final void onFailedLoad(String str, String str2) {
                }

                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    bVar.f17107a.setImageBitmap(bitmap);
                    MBMoreOfferAdapter.access$008(MBMoreOfferAdapter.this);
                    if (!MBMoreOfferAdapter.this.isShowMoreOffer && MBMoreOfferAdapter.this.bitmapSuccessCount >= 5 && MBMoreOfferAdapter.this.moreOfferShowCallBack != null) {
                        boolean unused = MBMoreOfferAdapter.this.isShowMoreOffer = true;
                        MBMoreOfferAdapter.this.moreOfferShowCallBack.mo48457a();
                    }
                }
            });
            if (!TextUtils.isEmpty(this.campaignExList.get(i).getAppName())) {
                String a = C6370y.m16238a(this.rewardEndCardurl, "mof_textmod");
                if (TextUtils.isEmpty(a) || !a.equals("1")) {
                    bVar.f17108b.setVisibility(8);
                } else {
                    bVar.f17108b.setText(this.campaignExList.get(i).getAppName());
                }
            }
            bVar.itemView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBMoreOfferAdapter.this.listener != null) {
                        MBMoreOfferAdapter.this.listener.mo48456a(i);
                    }
                }
            });
        }
    }

    public int getItemCount() {
        List<CampaignEx> list = this.campaignExList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: com.mbridge.msdk.video.dynview.endcard.adapter.MBMoreOfferAdapter$b */
    static class C6946b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        MBridgeImageView f17107a;

        /* renamed from: b */
        TextView f17108b;

        public C6946b(View view) {
            super(view);
            MBridgeImageView mBridgeImageView = (MBridgeImageView) view.findViewById(C6347k.m16084a(view.getContext(), "mbridge_reward_end_card_item_iv", "id"));
            this.f17107a = mBridgeImageView;
            if (mBridgeImageView != null) {
                mBridgeImageView.setRadius((float) C6366u.m16203b(view.getContext(), 3.0f));
            }
            this.f17108b = (TextView) view.findViewById(C6347k.m16084a(view.getContext(), "mbridge_reward_end_card_item_title_tv", "id"));
        }
    }

    public void setMoreOfferData(List<CampaignEx> list) {
        this.campaignExList = list;
    }
}

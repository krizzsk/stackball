package com.p243my.target.nativeads.views;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.p243my.target.C7311a9;
import com.p243my.target.C7374e0;
import com.p243my.target.C7506k6;
import com.p243my.target.C7509k8;
import com.p243my.target.C7636r6;
import com.p243my.target.C7707v6;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.nativeads.banners.NativePromoCard;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.nativeads.views.PromoCardRecyclerView */
public class PromoCardRecyclerView extends RecyclerView implements C7707v6 {
    private static final float MIN_CARD_VISIBILITY = 50.0f;
    private final CardAdapterListener cardClickListener = new CardAdapterListener() {
        public void onCardRender(int i) {
            PromoCardRecyclerView.this.renderCard(i);
        }

        public void onClick(View view) {
            PromoCardRecyclerView.this.clickOnCard(view);
        }
    };
    private int displayedCardNum = -1;
    private final C7636r6 layoutManager = new C7636r6(getContext());
    private boolean moving;
    private C7707v6.C7708a onPromoCardSliderListener;
    private PromoCardAdapter promoCardAdapter;
    private final PagerSnapHelper snapHelper;

    /* renamed from: com.my.target.nativeads.views.PromoCardRecyclerView$CardAdapterListener */
    public interface CardAdapterListener extends View.OnClickListener {
        void onCardRender(int i);
    }

    /* renamed from: com.my.target.nativeads.views.PromoCardRecyclerView$PromoCardAdapter */
    public static abstract class PromoCardAdapter extends RecyclerView.Adapter<PromoCardViewHolder> {
        private CardAdapterListener cardAdapterListener;
        private final List<NativePromoCard> nativePromoCards = new ArrayList();

        /* access modifiers changed from: private */
        public void dispose() {
            this.cardAdapterListener = null;
        }

        private void setBannerToView(NativePromoCard nativePromoCard, PromoCardView promoCardView) {
            if (nativePromoCard.getImage() != null) {
                promoCardView.getMediaAdView().setPlaceHolderDimension(nativePromoCard.getImage().getWidth(), nativePromoCard.getImage().getHeight());
                if (nativePromoCard.getImage().getData() != null) {
                    promoCardView.getMediaAdView().getImageView().setImageBitmap(nativePromoCard.getImage().getData());
                } else {
                    C7509k8.m19623b(nativePromoCard.getImage(), promoCardView.getMediaAdView().getImageView());
                }
            }
            promoCardView.getTitleTextView().setText(nativePromoCard.getTitle());
            promoCardView.getDescriptionTextView().setText(nativePromoCard.getDescription());
            String ctaText = nativePromoCard.getCtaText();
            promoCardView.getCtaButtonView().setText(ctaText);
            promoCardView.getCtaButtonView().setContentDescription(ctaText);
        }

        public int getItemCount() {
            return this.nativePromoCards.size();
        }

        public List<NativePromoCard> getNativePromoCards() {
            return this.nativePromoCards;
        }

        public abstract PromoCardView getPromoCardView();

        public void onBindViewHolder(PromoCardViewHolder promoCardViewHolder, int i) {
            NativePromoCard nativePromoCard;
            if (i < this.nativePromoCards.size() && (nativePromoCard = this.nativePromoCards.get(i)) != null) {
                setBannerToView(nativePromoCard, promoCardViewHolder.getPromoCardView());
                CardAdapterListener cardAdapterListener2 = this.cardAdapterListener;
                if (cardAdapterListener2 != null) {
                    cardAdapterListener2.onCardRender(i);
                }
            }
            View view = promoCardViewHolder.getPromoCardView().getView();
            view.setContentDescription("card_" + i);
            promoCardViewHolder.getPromoCardView().getView().setOnClickListener(this.cardAdapterListener);
            promoCardViewHolder.getPromoCardView().getCtaButtonView().setOnClickListener(this.cardAdapterListener);
        }

        public PromoCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new PromoCardViewHolder(getPromoCardView());
        }

        public void onViewRecycled(PromoCardViewHolder promoCardViewHolder) {
            NativePromoCard nativePromoCard;
            ImageData image;
            int layoutPosition = promoCardViewHolder.getLayoutPosition();
            C7506k6 k6Var = (C7506k6) promoCardViewHolder.getPromoCardView().getMediaAdView().getImageView();
            k6Var.setImageData((ImageData) null);
            if (layoutPosition > 0 && layoutPosition < this.nativePromoCards.size() && (nativePromoCard = this.nativePromoCards.get(layoutPosition)) != null && (image = nativePromoCard.getImage()) != null) {
                C7509k8.m19619a(image, (ImageView) k6Var);
            }
            promoCardViewHolder.getPromoCardView().getView().setOnClickListener((View.OnClickListener) null);
            promoCardViewHolder.getPromoCardView().getCtaButtonView().setOnClickListener((View.OnClickListener) null);
            super.onViewRecycled(promoCardViewHolder);
        }

        public void setCards(List<NativePromoCard> list) {
            this.nativePromoCards.clear();
            this.nativePromoCards.addAll(list);
            notifyDataSetChanged();
        }

        public void setClickListener(CardAdapterListener cardAdapterListener2) {
            this.cardAdapterListener = cardAdapterListener2;
        }
    }

    /* renamed from: com.my.target.nativeads.views.PromoCardRecyclerView$PromoCardViewHolder */
    public static class PromoCardViewHolder extends RecyclerView.ViewHolder {
        private final PromoCardView promoCardView;

        public PromoCardViewHolder(PromoCardView promoCardView2) {
            super(promoCardView2.getView());
            promoCardView2.getView().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.promoCardView = promoCardView2;
        }

        public PromoCardView getPromoCardView() {
            return this.promoCardView;
        }
    }

    public PromoCardRecyclerView(Context context) {
        super(context);
        setHasFixedSize(true);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        this.snapHelper = pagerSnapHelper;
        pagerSnapHelper.attachToRecyclerView(this);
    }

    public PromoCardRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHasFixedSize(true);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        this.snapHelper = pagerSnapHelper;
        pagerSnapHelper.attachToRecyclerView(this);
    }

    public PromoCardRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setHasFixedSize(true);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        this.snapHelper = pagerSnapHelper;
        pagerSnapHelper.attachToRecyclerView(this);
    }

    private void checkCardChanged() {
        int findFirstCompletelyVisibleItemPosition = this.layoutManager.findFirstCompletelyVisibleItemPosition();
        if (findFirstCompletelyVisibleItemPosition >= 0 && this.displayedCardNum != findFirstCompletelyVisibleItemPosition) {
            this.displayedCardNum = findFirstCompletelyVisibleItemPosition;
            if (this.onPromoCardSliderListener != null && this.layoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition) != null) {
                this.onPromoCardSliderListener.mo50113a(new int[]{this.displayedCardNum}, getContext());
            }
        }
    }

    /* access modifiers changed from: private */
    public void clickOnCard(View view) {
        View findContainingItemView;
        if (this.moving || (findContainingItemView = this.layoutManager.findContainingItemView(view)) == null) {
            return;
        }
        if (this.layoutManager.mo51455a(findContainingItemView)) {
            int position = this.layoutManager.getPosition(findContainingItemView);
            C7707v6.C7708a aVar = this.onPromoCardSliderListener;
            if (aVar != null && position >= 0) {
                aVar.mo50111a(findContainingItemView, position);
                return;
            }
            return;
        }
        int[] calculateDistanceToFinalSnap = this.snapHelper.calculateDistanceToFinalSnap(this.layoutManager, findContainingItemView);
        if (calculateDistanceToFinalSnap != null) {
            smoothScrollBy(calculateDistanceToFinalSnap[0], 0);
        }
    }

    /* access modifiers changed from: private */
    public void renderCard(int i) {
        C7707v6.C7708a aVar = this.onPromoCardSliderListener;
        if (aVar != null) {
            aVar.mo50109a(i, getContext());
        }
    }

    public void dispose() {
        PromoCardAdapter promoCardAdapter2 = this.promoCardAdapter;
        if (promoCardAdapter2 != null) {
            promoCardAdapter2.dispose();
        }
    }

    public Parcelable getState() {
        return this.layoutManager.onSaveInstanceState();
    }

    public int[] getVisibleCardNumbers() {
        int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
            return new int[0];
        }
        if (C7311a9.m18721a(this.layoutManager.findViewByPosition(findFirstVisibleItemPosition)) < 50.0d) {
            findFirstVisibleItemPosition++;
        }
        if (C7311a9.m18721a(this.layoutManager.findViewByPosition(findLastVisibleItemPosition)) < 50.0d) {
            findLastVisibleItemPosition--;
        }
        if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
            return new int[0];
        }
        if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
            return new int[]{findFirstVisibleItemPosition};
        }
        int i = (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = findFirstVisibleItemPosition;
            findFirstVisibleItemPosition++;
        }
        return iArr;
    }

    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.moving = z;
        if (!z) {
            checkCardChanged();
        }
    }

    public void restoreState(Parcelable parcelable) {
        this.layoutManager.onRestoreInstanceState(parcelable);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof PromoCardAdapter) {
            setPromoCardAdapter((PromoCardAdapter) adapter);
        } else {
            C7374e0.m18989a("You must use setPromoCardAdapter(PromoCardAdapter) method with custom CardRecyclerView");
        }
    }

    public void setPromoCardAdapter(PromoCardAdapter promoCardAdapter2) {
        if (promoCardAdapter2 != null) {
            this.promoCardAdapter = promoCardAdapter2;
            promoCardAdapter2.setClickListener(this.cardClickListener);
            setLayoutManager(this.layoutManager);
            super.swapAdapter(this.promoCardAdapter, true);
        }
    }

    public void setPromoCardSliderListener(C7707v6.C7708a aVar) {
        this.onPromoCardSliderListener = aVar;
    }
}

package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p243my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.s6 */
public class C7653s6 extends RecyclerView.Adapter<C7655b> {

    /* renamed from: a */
    public final Context f19329a;

    /* renamed from: b */
    public final List<C7453i2> f19330b = new ArrayList();

    /* renamed from: c */
    public C7656c f19331c;

    /* renamed from: com.my.target.s6$a */
    public static class C7654a extends FrameLayout {

        /* renamed from: a */
        public int f19332a;

        /* renamed from: b */
        public int f19333b;

        public C7654a(Context context) {
            super(context);
        }

        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (size == 0) {
                size = this.f19332a;
            }
            if (size2 == 0) {
                size2 = this.f19333b;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        }
    }

    /* renamed from: com.my.target.s6$b */
    public static class C7655b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final C7506k6 f19334a;

        /* renamed from: b */
        public final FrameLayout f19335b;

        public C7655b(FrameLayout frameLayout, C7506k6 k6Var, FrameLayout frameLayout2) {
            super(frameLayout);
            this.f19334a = k6Var;
            this.f19335b = frameLayout2;
        }
    }

    /* renamed from: com.my.target.s6$c */
    public interface C7656c extends View.OnClickListener {
        void onCardRender(int i);
    }

    public C7653s6(Context context) {
        this.f19329a = context;
    }

    /* renamed from: a */
    public C7655b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7654a aVar = new C7654a(this.f19329a);
        aVar.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        C7506k6 k6Var = new C7506k6(this.f19329a);
        C7761y8.m20947b(k6Var, "card_media_view");
        aVar.addView(k6Var, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(this.f19329a);
        if (viewGroup.isClickable()) {
            C7761y8.m20936a((View) frameLayout, 0, 1153821432);
        }
        aVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return new C7655b(aVar, k6Var, frameLayout);
    }

    /* renamed from: a */
    public void mo51508a() {
        this.f19330b.clear();
        notifyDataSetChanged();
        this.f19331c = null;
    }

    /* renamed from: a */
    public void onViewRecycled(C7655b bVar) {
        int adapterPosition = bVar.getAdapterPosition();
        C7453i2 i2Var = (adapterPosition <= 0 || adapterPosition >= this.f19330b.size()) ? null : this.f19330b.get(adapterPosition);
        bVar.f19334a.setImageData((ImageData) null);
        ImageData image = i2Var != null ? i2Var.getImage() : null;
        if (image != null) {
            C7509k8.m19619a(image, (ImageView) bVar.f19334a);
        }
        bVar.f19335b.setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: a */
    public void onBindViewHolder(C7655b bVar, int i) {
        C7656c cVar = this.f19331c;
        if (cVar != null) {
            cVar.onCardRender(i);
        }
        ImageData imageData = null;
        C7453i2 i2Var = i < this.f19330b.size() ? this.f19330b.get(i) : null;
        if (i2Var != null) {
            imageData = i2Var.getImage();
        }
        if (imageData != null) {
            bVar.f19334a.setPlaceholderDimensions(imageData.getWidth(), imageData.getHeight());
            Bitmap bitmap = imageData.getBitmap();
            if (bitmap != null) {
                bVar.f19334a.setImageBitmap(bitmap);
            } else {
                C7509k8.m19623b(imageData, bVar.f19334a);
            }
        }
        C7506k6 a = bVar.f19334a;
        a.setContentDescription("card_" + i);
        bVar.f19335b.setOnClickListener(this.f19331c);
    }

    /* renamed from: a */
    public void mo51511a(C7656c cVar) {
        this.f19331c = cVar;
    }

    /* renamed from: a */
    public void mo51512a(List<C7453i2> list) {
        this.f19330b.addAll(list);
    }

    public int getItemCount() {
        return this.f19330b.size();
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return i == this.f19330b.size() - 1 ? 2 : 0;
    }
}

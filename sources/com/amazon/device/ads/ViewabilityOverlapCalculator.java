package com.amazon.device.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ViewabilityOverlapCalculator {
    private static final String LOGTAG = ViewabilityOverlapCalculator.class.getSimpleName();
    private final AdController adController;
    private final MobileAdsLogger logger;
    private View rootView;
    private Rect visibleAdRectangle;

    public ViewabilityOverlapCalculator(AdController adController2) {
        this(adController2, new MobileAdsLoggerFactory());
    }

    ViewabilityOverlapCalculator(AdController adController2, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        this.adController = adController2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
    }

    public float calculateViewablePercentage(View view, Rect rect) {
        int width = view.getWidth() * view.getHeight();
        float f = (float) width;
        if (f == 0.0f) {
            return 0.0f;
        }
        this.visibleAdRectangle = rect;
        if (this.rootView == null) {
            this.rootView = this.adController.getRootView();
        }
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            this.logger.mo10938d("AdContainer is null");
            return 0.0f;
        }
        findOverlapppingViews(new Rectangle(rect), viewGroup.indexOfChild(view) + 1, viewGroup, arrayList, true);
        int width2 = (rect.width() * rect.height()) - getTotalAreaOfSetOfRectangles(arrayList);
        this.logger.mo11019d("Visible area: %s , Total area: %s", Integer.valueOf(width2), Integer.valueOf(width));
        return (((float) width2) / f) * 100.0f;
    }

    private void findOverlapppingViews(Rectangle rectangle, int i, ViewGroup viewGroup, List<Rectangle> list, boolean z) {
        ViewParent parent;
        List<Rectangle> list2 = list;
        if (viewGroup == null || !z || !AndroidTargetUtils.isAdTransparent(viewGroup)) {
            for (int i2 = i; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                boolean z2 = childAt != null && (childAt instanceof ListView);
                if (childAt.isShown() && (!AndroidTargetUtils.isAtLeastAndroidAPI(11) || childAt.getAlpha() != 0.0f)) {
                    Rectangle viewRectangle = getViewRectangle(childAt);
                    Rectangle rectangle2 = rectangle;
                    if (viewRectangle.intersect(rectangle)) {
                        if (z2 || !(childAt instanceof ViewGroup)) {
                            this.logger.mo11019d("Overlap found with View: %s", childAt);
                            list.add(viewRectangle);
                        } else {
                            findOverlapppingViews(rectangle, 0, (ViewGroup) childAt, list, false);
                        }
                    }
                } else {
                    Rectangle rectangle3 = rectangle;
                }
            }
            Rectangle rectangle4 = rectangle;
            if (z && !this.rootView.equals(viewGroup) && (parent = viewGroup.getParent()) != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                findOverlapppingViews(rectangle, viewGroup2.indexOfChild(viewGroup) + 1, viewGroup2, list, true);
                return;
            }
            return;
        }
        list.add(new Rectangle(this.visibleAdRectangle));
    }

    private Rectangle getViewRectangle(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Rectangle(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    /* access modifiers changed from: protected */
    public int getTotalAreaOfSetOfRectangles(List<Rectangle> list) {
        int size = list.size() * 2;
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Rectangle rectangle = list.get(i2);
            int i3 = i2 * 2;
            iArr[i3] = rectangle.getLeft();
            iArr[i3 + 1] = rectangle.getRight();
        }
        Arrays.sort(iArr);
        Collections.sort(list);
        int i4 = 0;
        while (i < size - 1) {
            int i5 = iArr[i];
            i++;
            int i6 = iArr[i];
            if (i5 != i6) {
                Range range = new Range(i5, i6);
                i4 += computeArea(range, getYRanges(range, list));
            }
        }
        return i4;
    }

    private int computeArea(Range range, List<Range> list) {
        int i = range.high - range.low;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Range range2 = list.get(i3);
            i2 += (range2.high - range2.low) * i;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public List<Range> getYRanges(Range range, List<Rectangle> list) {
        ArrayList arrayList = new ArrayList();
        Range range2 = null;
        for (int i = 0; i < list.size(); i++) {
            Rectangle rectangle = list.get(i);
            if (range.low < rectangle.getRight() && range.high > rectangle.getLeft()) {
                Range range3 = new Range(rectangle.getTop(), rectangle.getBottom());
                if (range2 == null) {
                    arrayList.add(range3);
                } else if (range3.isOverlap(range2)) {
                    range2.mergeRange(range3);
                } else {
                    arrayList.add(range3);
                }
                range2 = range3;
            }
        }
        return arrayList;
    }

    class Range {
        int high;
        int low;

        public Range(int i, int i2) {
            this.low = i;
            this.high = i2;
        }

        public boolean isOverlap(Range range) {
            return this.low <= range.high && this.high >= range.low;
        }

        public void mergeRange(Range range) {
            int i = this.low;
            int i2 = range.low;
            if (i > i2) {
                i = i2;
            }
            this.low = i;
            int i3 = this.high;
            int i4 = range.high;
            if (i3 < i4) {
                i3 = i4;
            }
            this.high = i3;
        }
    }

    class Rectangle implements Comparable<Rectangle> {
        private final Rect rect;

        public Rectangle(Rect rect2) {
            this.rect = rect2;
        }

        public Rectangle(int i, int i2, int i3, int i4) {
            Rect rect2 = new Rect();
            this.rect = rect2;
            rect2.left = i;
            this.rect.top = i2;
            this.rect.right = i3;
            this.rect.bottom = i4;
        }

        public int getLeft() {
            return this.rect.left;
        }

        public int getTop() {
            return this.rect.top;
        }

        public int getRight() {
            return this.rect.right;
        }

        public int getBottom() {
            return this.rect.bottom;
        }

        public boolean intersect(Rectangle rectangle) {
            if (this.rect.width() == 0 || this.rect.height() == 0) {
                return false;
            }
            return this.rect.intersect(rectangle.rect);
        }

        public boolean contains(Rectangle rectangle) {
            return this.rect.contains(rectangle.rect);
        }

        public int getWidth() {
            return this.rect.width();
        }

        public int getHeight() {
            return this.rect.height();
        }

        public int compareTo(Rectangle rectangle) {
            if (this.rect.top < rectangle.rect.top) {
                return 1;
            }
            return this.rect.top == rectangle.rect.top ? 0 : -1;
        }
    }
}

package nd.sevakkalpesh.app.navigationdrawer_types;

import android.graphics.drawable.Drawable;

/**
 * Created by Kalpesh on 15/2/2015.
 */
public class NavigationItem {
    private String mText;
    private Drawable mDrawable;

    public NavigationItem(String text, Drawable drawable) {
        mText = text;
        mDrawable = drawable;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Drawable getDrawable() {
        return mDrawable;
    }

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
    }
}

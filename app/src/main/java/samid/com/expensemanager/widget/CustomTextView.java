package samid.com.expensemanager.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import samid.com.expensemanager.app.ExpenseManagerApp;
import samid.com.expensemanager.utils.FontCache;

public class CustomTextView extends TextView {
    private TextView textView;

    public CustomTextView(Context context) {
        super(context);
        applyCustomFont(context);
        singleLine(context);
        init();
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
        singleLine(context);
        init();
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        applyCustomFont(context);
        singleLine(context);
         init();
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("yekanbakhbold.ttf", context);
        setTypeface(customFont);

    }

    private void singleLine(Context context) {
        textView = new TextView(context);
        textView.setSingleLine(false);
    }

    private void init() {
        //setTypeface(ExpenseManagerApp.getInstance().getNormalTypeFace());
    }

}
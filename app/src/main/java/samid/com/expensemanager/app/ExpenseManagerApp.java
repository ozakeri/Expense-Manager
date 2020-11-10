package samid.com.expensemanager.app;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;

import java.util.Locale;

public class ExpenseManagerApp extends Application {
    private Typeface typeFaceNormal = null;
    private static ExpenseManagerApp instance;

    @Override
    public void onCreate() {
        Locale.setDefault(new Locale("fa", "IR"));
        super.onCreate();
        instance = this;
    }

    public static synchronized ExpenseManagerApp getInstance() {
        return instance;
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }

    public Typeface getNormalTypeFace() {
        if (typeFaceNormal == null) {
            typeFaceNormal = Typeface.createFromAsset(getContext().getAssets(), "yekanbakhbold.ttf");
        }
        return typeFaceNormal;
    }
}

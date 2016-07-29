package vn.datsan.datsan;


import android.content.Context;
import android.support.multidex.MultiDex;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import vn.datsan.datsan.utils.AppLog;
import vn.datsan.datsan.utils.Constants;
import vn.datsan.datsan.utils.Elasticsearch;
import vn.datsan.datsan.utils.ElasticsearchEvent;
import vn.datsan.datsan.utils.ElasticsearchParam;
import vn.datsan.datsan.utils.listeners.FirebaseChildEventListener;

/**
 * Created by yennguyen on 10/06/2016.
 */
public class SocialSportApplication extends android.app.Application {

    private static final String TAG = SocialSportApplication.class.getName();

    @Override
    public void onCreate() {
        super.onCreate();

        AppLog.log(AppLog.LogType.LOG_DEBUG, TAG, "App starting up");

        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);


    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}

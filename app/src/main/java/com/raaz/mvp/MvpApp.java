
package com.raaz.mvp;

import android.app.Application;

import com.raaz.mvp.data.DataManager;
import com.raaz.mvp.data.SharedPrefsHelper;

/**
 * Created by rajeshkumar on 23-08-2017.
 */

public class MvpApp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);

    }

    public DataManager getDataManager() {
        return dataManager;
    }

}

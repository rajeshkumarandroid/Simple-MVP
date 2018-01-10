

package com.raaz.mvp.ui.splash;

import com.raaz.mvp.data.DataManager;
import com.raaz.mvp.ui.base.BasePresenter;

/**
 * Created by rajeshkumar on 04-01-2018.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}



package com.raaz.mvp.ui.main;

import com.raaz.mvp.data.DataManager;
import com.raaz.mvp.ui.base.BasePresenter;

/**
 * Created by rajeshkumar on 23-08-2017.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }

}

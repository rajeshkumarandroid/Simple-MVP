
package com.raaz.mvp.ui.login;

import com.raaz.mvp.data.DataManager;
import com.raaz.mvp.ui.base.BasePresenter;

/**
 * Created by rajeshkumar on 05-01-2018.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }

}

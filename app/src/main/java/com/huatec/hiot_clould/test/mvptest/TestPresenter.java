package com.huatec.hiot_clould.test.mvptest;

import com.huatec.hiot_clould.base.BasePresenter;
import com.huatec.hiot_clould.base.BaseView;
import com.huatec.hiot_clould.test.mvptest.modele.User;

public class TestPresenter extends BasePresenter<TestView> {

    public  TestPresenter() {
    }


    public void login(User user){
        if ("dengyajing".equals(user.getUserName()) && "123".equals(user.getPassword())){
            getView().showMessage("登录成功");
        }else{
            getView().showMessage("登录失败");
        }

    }

}


package com.huatec.hiot_clould.test.mvptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.huatec.hiot_clould.R;
import com.huatec.hiot_clould.base.BaseActivity;
import com.huatec.hiot_clould.test.mvptest.modele.User;

public class TestMVPActivity extends BaseActivity<TestView,TestPresenter> implements TestView{

    private TestPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        presenter = new TestPresenter();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test_mvp);
        final EditText etUserName = findViewById(R.id.et_user_name);
        final EditText etPassword = findViewById(R.id.et_password);
        final Button btnLogin = findViewById(R.id.btn_login);
        final User user = new User();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setUserName(etUserName.getText().toString());
                user.setPassword(etPassword.getText().toString());
                presenter.login(user);
            }
        });
    }

    @Override
    public TestPresenter createPresenter() {
        return presenter;
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }

//    private void login(User user) {
//       if ("lisi".equals(user.getUserName()) && "123".equals(user.getPassword())){
//            Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
//        }else {
//            Toast.makeText(this, "登陆失败", Toast.LENGTH_SHORT).show();
//        }
//    }
}

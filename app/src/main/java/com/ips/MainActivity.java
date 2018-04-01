package com.ips;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ips.databinding.ActivityLoginBinding;
import com.ips.databinding.ActivitySignUpBinding;

public class MainActivity extends AppCompatActivity {
    ActivityLoginBinding loginBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_login);
    }
}

package kr.co.a20200318_01_intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.a20200318_01_intent.databinding.ActivityEditUserInfoBinding;

public class EditUserInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ActivityEditUserInfoBinding binding = null;
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_edit_user_info);
    }
}

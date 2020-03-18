package kr.co.a20200318_01_intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.a20200318_01_intent.databinding.ActivityEditUserInfoBinding;

public class EditUserInfo extends AppCompatActivity {
    ActivityEditUserInfoBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_edit_user_info);

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                데이터 첨부만을 위한 intent , 출발 / 도착점 설정x.
                Intent intent = new Intent();
//                이름 입력칸에 적힌 내용을 String 을 통해 첨부
                intent.putExtra("inputName",binding.nameEdt.getText().toString());

//                결과 입력 완료 신호 + 어떤 데이터가 들어있는지 intent 설정.
//                RESULT_OK는 : 정말로 완료다! 명시 역할.
//                 -> 기본값은 취소로 설정됨.
//                + 완료해서 입력한 데이터는 intent안에 들어있다고 명시.
                setResult(RESULT_OK,intent);

                finish();
            }
        });
    }
}

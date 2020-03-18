package kr.co.a20200318_01_intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.a20200318_01_intent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

//        1. 메인화면 => 버튼 누름 -> 프로필 수정화면으로 이동
        binding.inputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditUserInfo.class);
                startActivityForResult(intent,1000);
            }
        });
//        2. 프로필 수정 화면에서 이름입력 = > 확인 - > 종료 /메인으로 복귀
//        3.돌아온 메인에서 2에서 입력한 이름을 텍스트뷰에 반영


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        requesCode -=> 어떤 요청으로 띄운화면인지? 구분
//        이름변경 or 표시 변경 개발자가 분류한 requestCode값을 따라감
        if (requestCode == 1000){
//            우리가 요청한 프로필 변경 화면이동 이다

//            resultCode => 완료 / 취소 여부 보통 완료일떄만 대응.
            if (resultCode == RESULT_OK){
//                확인버튼을 눌러서 finish가 되었다.

//                첨부에 데이터가 있나 확인 -> intent data변수에 들어있다.

                String name = data.getStringExtra("inputName");
                binding.nameTxt.setText(name);
            }
        }
    }
}

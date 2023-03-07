package tukorea2018180009.ac.kr.example.SampleProject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {   // extends 는 상속을 하는 문법

    @Override   // 아래의 onCreate함수를 오버라이드 하겠다는 의미
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // super는 부모의 onCreate()를 부르겠다는 의미
        setContentView(R.layout.activity_main); // R은 리소스를 의미하는 생성된 클래스 (res/lalyout/activity_main.xml이라는 파일이 있고 R.layout.activity_main를 지치하는 상수가 생긴다.)
        // 에물레이터 : 안드로이트를 PC에서 실행시켜주는것 AVD(Android virtual Divece)
        // 사이즈 크리 dp : 는 해상도가 달라도 보이는 크기 정도로 나오게 된다.
        // text는 sp라는 단위도 있다. 텍스트 단위는 보통 sp단위를 쓴다.
        // 더 좋은건 숫자를 사용하지 않고 내용물에 맞춰 크기를 조절하는 것이 좋다.(a는 왼쪽에 붙이고 b는 a의 왼쪽에 붙여라 같은 식으로)
        // 레이아웃 메니저?
        // constraint Layout은 제안을 둔다.
    }
}
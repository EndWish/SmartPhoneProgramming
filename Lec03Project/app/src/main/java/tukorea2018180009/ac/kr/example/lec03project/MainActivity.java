package tukorea2018180009.ac.kr.example.lec03project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    // 화면을 구성할때 :
    // w나 h를 pixel로 정하는 건 별로 좋지 않다. 기기마다 pixel은 천차만별이기 때문에 => cm, dp 사용 => 기기의 크기에 따라 바뀌도록 한다.
    // Linear(Vertical)
        //Linear(Horizontal) (h=)
            //Button (w=)
            //Text (fill)
            //Button (w=)
        //imageView (fill)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnPrev(View view) {
        Log.d(TAG, "Prev pressed");
    }

    public void onBtnNext(View view) {
        Log.d(TAG, "Next pressed");
    }
}
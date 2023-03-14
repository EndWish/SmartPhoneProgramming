package tukorea2018180009.ac.kr.example.lec03project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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

    private ImageView mainImageView;
    private TextView pageTextView;
    private Button prevButton, nextButton;

    private int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainImageView = findViewById(R.id.mainImageView);    // find는 비용이 조금 드는 행동.
        pageTextView = findViewById(R.id.pageTextView);
        prevButton = findViewById(R.id.prevButton);
        nextButton = findViewById(R.id.nextButton);

        SetPage(1);
    }

    public void onBtnPrev(View view) {
        Log.d(TAG, "Prev pressed");
        SetPage(page - 1);
    }

    public void onBtnNext(View view) {
        Log.d(TAG, "Next pressed");
        SetPage(page + 1);
    }

    private static final int[] IMG_RES_IDS = new int[]{    // 클래스와 라이프 사이클을 같이 하도록하기 위해서 static으로 선언해 준다. final : const와 비슷한 역할(앞으로 변경이 없다.)
            R.mipmap.cat_1,
            R.mipmap.cat_2,
            R.mipmap.cat_3,
            R.mipmap.cat_4,
            R.mipmap.cat_5,
            R.mipmap.cat_6,
    };



    private void SetPage(int page){
        if(page < 1 || page > IMG_RES_IDS.length) return;

        int resId = IMG_RES_IDS[page - 1];
        mainImageView.setImageResource(resId);
        pageTextView.setText(page + " / " + IMG_RES_IDS.length );

        prevButton.setEnabled(page > 1);
        nextButton.setEnabled(page < IMG_RES_IDS.length);

        this.page = page;
    }

}
package tukorea2018180009.ac.kr.example.lec03project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

    private int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnPrev(View view) {
        Log.d(TAG, "Prev pressed");
        SetPage(page - 1);
    }

    public void onBtnNext(View view) {
        Log.d(TAG, "Next pressed");
        SetPage(page + 1);
    }

    private void SetPage(int page){
        if(page < 1 || page > 5) return;

        int[] resIds = new int[]{
                R.mipmap.cat_1,
                R.mipmap.cat_2,
                R.mipmap.cat_3,
                R.mipmap.cat_4,
                R.mipmap.cat_5,
        };

        int resId = resIds[page - 1];
        ImageView iv = findViewById(R.id.mainImageView);
        iv.setImageResource(resId);
        this.page = page;

        TextView tv = findViewById(R.id.pageTextView);
        tv.setText(page + " / " + resIds.length );
    }

}
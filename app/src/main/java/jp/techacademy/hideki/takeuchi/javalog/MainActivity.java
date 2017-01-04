package jp.techacademy.hideki.takeuchi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog( "ポチ", 3 );

        dog.say();
        Log.d("javatest","犬の名前は" + dog.name + "です");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        int num = 10;
        Log.d("javatest", String.valueOf(num));

        Log.d("javatest","Log出力テスト");
    }
}

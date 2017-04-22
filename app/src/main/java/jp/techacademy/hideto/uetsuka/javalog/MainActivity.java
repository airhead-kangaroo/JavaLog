package jp.techacademy.hideto.uetsuka.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dog dog = new Dog("ポチ", 3);
        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");
        Dog.introduce();
        Log.d("javatest", Dog.to_jp + "のクラス変数です。");

        Dog dog2 = new Dog("ハチ", 10);
        dog2.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        BigDog bigdog = new BigDog("ヨーゼフ", 15);
        bigdog.say();
        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");

        dog.move();

        Human tanaka = new Human("田中", 30, "囲碁");
        tanaka.say();
        tanaka.think();
    }

    private int total(int first, int last){
        int sum = 0;
        for (int i=first;i<=last;i++){
            sum = sum + i;
        }
        return sum;
    }
}

package jp.techacademy.hideto.uetsuka.javalog;

import android.util.Log;

/**
 * Created by Airhead_Kangaroo on 2017/04/22.
 */

public class BigDog extends Dog {
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}

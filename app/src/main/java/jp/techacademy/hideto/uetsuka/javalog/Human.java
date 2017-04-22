package jp.techacademy.hideto.uetsuka.javalog;


import android.util.Log;

/**
 * Created by Airhead-Kangaroo on 2017/04/22.
 */

public class Human extends Animal implements Thinkable{

    private String hobby;

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    @Override
    public void say() {
        Log.d("javatest", "「私の名前は" + this.name + "です。歳は" + this.age + "歳です。」" );
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + hobby + "について考える");
    }
}

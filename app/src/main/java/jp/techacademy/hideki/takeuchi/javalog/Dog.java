package jp.techacademy.hideki.takeuchi.javalog;

/**
 * Created by OWNER on 2017/01/03.
 */

import android.util.Log;

class Dog {

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say(){
        Log.d("javatest",this.name+ "("+  this.age + "歳)"+ "[ワンワン]");
    }
}

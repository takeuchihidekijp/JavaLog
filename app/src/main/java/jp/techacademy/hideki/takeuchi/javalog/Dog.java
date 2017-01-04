package jp.techacademy.hideki.takeuchi.javalog;

/**
 * Created by OWNER on 2017/01/03.
 */

import android.util.Log;

class Dog extends Animal implements Movable {

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say(){
        Log.d("javatest",this.name+ "("+  this.age + "歳)"+ "[ワンワン]");
    }

    @Override
    public void move(){
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }

}

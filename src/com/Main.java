package com;

public class Main {
    public static void main(String[] args) {
        //Parent parent=new GenParent<String>();
        GenParent<String> genParent=new Child4<String,Object,String>();
    }
}
class Parent{}
class GenParent<T> extends Parent{}
class Child extends GenParent{}
class Child2 extends GenParent<String>{}
class Child3<T> extends GenParent<T>{}
class Child4<X,T,Y> extends GenParent<Y>{}
class Child5<X,T,Y> extends GenParent{}
class Child6<X,T,Y> extends Child5<Integer,T,String>{}

interface GenericInterface<T>{
    T getT();
}
class One implements GenericInterface{
    @Override
    public Object getT() {
        return null;
    }
}
class Two implements GenericInterface<String>{
    @Override
    public String getT() {
        return null;
    }
}


class Three<T> implements GenericInterface<T>{
    @Override
    public T getT() {
        return null;
    }
}























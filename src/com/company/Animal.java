package com.company;

public class Animal <T extends Animal<T>>{
    public T parent(){
        return (T)new Animal();
    }
}

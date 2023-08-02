package com.test.neosoft.practice;

import java.io.Serializable;

class FinalSingleton implements Serializable {

    private static FinalSingleton instance = null;

    private FinalSingleton() {
        if (instance != null) {
            throw new RuntimeException("You have broken Singleton class!");
        }
    }

    public static FinalSingleton getInstance() {
        if (instance == null) {
            synchronized (FinalSingleton.class) {
                if (instance == null) {
                    instance = new FinalSingleton();
                }
            }
        }
        return instance;
    }

    public Object readResolve() {
        return instance;
    }
    
}

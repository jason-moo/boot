package com.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
        WeakReference<String> str = new WeakReference<String>(new String("hello"),referenceQueue);
        System.out.println(referenceQueue.poll());
        while (true){
            if (referenceQueue.poll() != null){
                System.out.println("将要被回收了");
                break;
            }
            System.out.println();
        }
    }

    public static String feasda(){
        String a = "S";
        try {
            return a;
        }finally {
         a = "QQQ";
            System.out.println(a);
        }
    }


}

package models;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message2{

    public void init() {
        System.out.println("init()!!");
    }

    public void close() {
        System.out.println("close()!!");
    }
}
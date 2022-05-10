package singleDesignPatterns.LazyLoadBalancer;

import java.util.ArrayList;
import java.util.List;

public class LazyLoadBalancer {

    private volatile static LazyLoadBalancer instance = null;

    private List serverList = null;

    private LazyLoadBalancer(){
        serverList = new ArrayList();
    }

    public static LazyLoadBalancer getInstance(){
        if (instance == null){
            synchronized(LazyLoadBalancer.class){
                if (instance == null){
                    return new LazyLoadBalancer();
                }
            }
        }
        return instance;
    }

    public void addLazyLoadBalancer(String server){}

    public void removeLazyBalancer(String server){}

    public String getServer(){return null;}

    public int getServerNumber(){return 0;}

}

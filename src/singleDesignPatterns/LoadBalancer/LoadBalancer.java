package singleDesignPatterns.LoadBalancer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private static LoadBalancer instance = null;
    private List serverList = null;

    private LoadBalancer(){
        serverList = new ArrayList();
    }

    public static LoadBalancer getLoadBalancer(){
        if (instance == null) return new LoadBalancer();
        return instance;
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServer(String server){
        serverList.remove(server);
    }

    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }

    public void getServerListSize(){
        int size = serverList.size();
        System.out.println(size);
    }
}

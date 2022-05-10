package singleDesignPatterns.EagerLoadBalancer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EagerLoadBalancer {

    private static final EagerLoadBalancer instace = new EagerLoadBalancer();
    private List serverList = null;

    private EagerLoadBalancer(){
        serverList = new ArrayList();
    }

    public static EagerLoadBalancer getInstance(){
        return instace;
    }

    public void addEagerLoadBalancer(String server){
        serverList.add(server);
    }

    public void removeEagerLoadBalancer(String server){
        serverList.remove(server);
    }

    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());

        System.out.println(serverList.get(i));
        return (String) serverList.get(i);
    }

    public void getServerListSize(){
        int size = serverList.size();
        System.out.println(size);
    }
}

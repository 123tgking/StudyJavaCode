package singleDesignPatterns.LoadBalancer;

public class LoadBalancerClient {
    public static void main(String[] args){
        LoadBalancer balancer1,balancer2;

        balancer1 = LoadBalancer.getLoadBalancer();
        balancer2 = LoadBalancer.getLoadBalancer();

        if (balancer1 == balancer2) System.out.println("实例相同");
        else System.out.println("实例不同");

        balancer1.addServer("server1");
        balancer1.addServer("server2");
        balancer2.addServer("server3");

        System.out.println(balancer1.getServer());
        System.out.println(balancer1.getServer());
        System.out.println(balancer1.getServer());
        System.out.println(balancer1.getServer());
        System.out.println(balancer1.getServer());
        System.out.println(balancer1.getServer());
        System.out.println(balancer1.getServer());
        System.out.println(balancer1.getServer());
        System.out.println(balancer1.getServer());
        System.out.println(balancer1.getServer());
    }


}

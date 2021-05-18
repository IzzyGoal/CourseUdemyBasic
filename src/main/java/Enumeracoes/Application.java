package Enumeracoes;

import Enumeracoes.Entities.Order;
import Enumeracoes.Entities.orderStatus;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        Order order = new Order(1080,new Date(), orderStatus.PENDING_PAYMENT);
        System.out.println(order);


        orderStatus os1 = orderStatus.DELIVERED;
        orderStatus os2 = orderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);



    }
}

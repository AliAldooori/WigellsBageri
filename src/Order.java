package WigellsBageri.src;

import java.util.ArrayList;
import java.util.List;

public class Order implements BusinesObject {


    private String oreder_name;
    private static int id = 0;

    List<Observer> observerList = new ArrayList<Observer>();
    List<Order> orderList = new ArrayList<>();


    public Order(String oreder_name) {
        this.oreder_name = oreder_name;
        setId(id);
    }


    public void addOrderList(Order order) {
        this.orderList.add(order);
    }

    public void print_orederList() {
        for (Order item : orderList) {
            System.out.println(item);
        }
    }


    public String getOreder_name() {
        return oreder_name;
    }

    public void setOrderName(String order_name) {
        this.oreder_name = oreder_name;
    }


    public static void setId(int id) {
        Order.id += 1;
    }

    @Override
    public void add(Observer o) {
        observerList.add(o);
    }

    @Override
    public void remove(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyMe() {
        for (Observer item : observerList) {

            item.MakingOrder();
            item.ItemLevererat();
        }
    }
}

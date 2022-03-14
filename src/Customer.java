package WigellsBageri.src;

public class Customer implements Observer {
    String name;
    Order order ;

    public Customer(String name) {
        this.name = name;
    }


    @Override
    public void ItemLevererat() {
       System.out.println(this.order.getOreder_name() + " is levererat  and he or she must to pay 150 kr  ");
        }

    @Override
    public void MakingOrder() {
        System.out.println(this.order.getOreder_name() + " for " + this.name + " was made ");
    }
}
package WigellsBageri.src;

public class VD implements Observer {

    private String name;
    Order order;

    public VD(String name) {
        this.name = name;
    }


    @Override
    public void ItemLevererat() {
        System.out.println("the Order was  levererat  ");
    }

    @Override
    public void MakingOrder() {
        System.out.println("Hi " + this.name + " order was made ");
    }

}

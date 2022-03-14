package WigellsBageri.src;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    // Command command ;
    List<Command> skapandeList = new ArrayList<>() ;

    public void addSkapandeBageri ( Command command) {
        skapandeList.add( command) ;

        }

    public void print_SkapandeBageri () {
        for (Command item :
                skapandeList) {
            System.out.println(item);

        }
    }
   /* public void SetCommand (Command command) {
        this.command = command ;
    }*/
   public void execute() throws InterruptedException {

       for(var command : skapandeList){
           command.execute();

       }


    }
}

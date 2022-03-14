package WigellsBageri.src;

import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {


        //   Customer c1 = new Customer("Leia ") ;
//   Customer c2 = new Customer("Dalia") ;
//
//   VD vd = new VD("Wingels") ;
//
//
//
//
//
//   c1.order =  new Order("KladdKaka") ;
//   c2.order =  new Order("Semla" ) ;
//        c1.order.add(vd);
//   c1.order.add(c1);
//   c1.order.notifyMe();
//
//   c2.order.add(c2);
//   c2.order.notifyMe();
/*
   Skapande s = new Skapande() ;
   PrinsessTårtaSkapande PTS = new PrinsessTårtaSkapande() ;
   KladdKakaSkapande KKS = new KladdKakaSkapande() ;*/





    int menuVal = 0;
    while(menuVal !=4) {

        printMenu();
        menuVal = scan.nextInt();

        switch (menuVal) {
            case 1 -> {

                // Skapa invoker/pipeline
                Invoker invoker = new Invoker();

                // Starta oberver för alla processer
                BakKontroll bakKontroll = new BakKontroll();

                // Skapa semla (så kan demonstrera observer)
                Semla semla = new Semla();

                // Lägg till listner
                semla.addPropertyChangeListner(bakKontroll);

                // Trigga oberver när kakan är beställd
                semla.setBestalld(true);

                // Semla process
                invoker.addSkapandeBageri(new SemlaCommand()); // Lägg till semla-command
                invoker.execute(); // Kör vald command

                // Trigga oberver när kakan är klar
                semla.setStatus("Klar!");

            }
            case 2 -> {
                // Skapa invoker/pipeline
                Invoker invoker = new Invoker();

                // Starta oberver för alla processer
                BakKontroll bakKontroll = new BakKontroll();

                // Skapa KladdKaka  (så kan demonstrera observer)

                Kladdkaka kladdkaka = new Kladdkaka() ;

                // Lägg till listner
                kladdkaka.addPropertyChangeListner(bakKontroll);

                // Trigga oberver när kakan är beställd
                kladdkaka.setBestalld(true);

                // Semla process
                invoker.addSkapandeBageri(new KladdKakaCommand()); // Lägg till semla-command
                invoker.execute(); // Kör vald command

                // Trigga oberver när kakan är klar
                kladdkaka.setStatus("Klar!");

            }
            case 3 -> {
               // Skapa invoker/pipeline
                Invoker invoker = new Invoker();

                // Starta oberver för alla processer
                BakKontroll bakKontroll = new BakKontroll();

                // Skapa Prinsesstårta  (så kan demonstrera observer)

                Prinsesstårta prinsesstårta = new Prinsesstårta() ;

                // Lägg till listner
                prinsesstårta.addPropertyChangeListner(bakKontroll);

                // Trigga oberver när kakan är beställd
                prinsesstårta.setBestalld(true);

                // Semla process
                invoker.addSkapandeBageri(new PrinseståtraCommand()); // Lägg till semla-command
                invoker.execute(); // Kör vald command

                // Trigga oberver när kakan är klar
                prinsesstårta.setStatus("Klar!");

            }

            case 4 -> {
                System.out.println("Välkommen tillbaka");
            }

            default -> System.out.println("Testa igen. Välj 1-4");
        }
    }

}


    private static void printMenu() {
        System.out.println();
        System.out.println("1. Semla");
        System.out.println("2. Kladdkakae");
        System.out.println("3. Prinsesstårta");
        System.out.println("4. Exit");
        System.out.print("Val: ");
        System.out.println();
    }

}

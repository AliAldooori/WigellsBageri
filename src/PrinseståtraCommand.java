package WigellsBageri.src;

public class PrinseståtraCommand implements Command{
    public void step1() {
        System.out.println("Prinsesstårta\n" +
                "1.Vispa grädden hård\n" ) ;
    }
    public void step2() {
        System.out.println("2.Ta fram en tårtbotten\n" ) ;
    }
    public void step3() {
        System.out.println("3.Applicera ett tunt lager hallonsylt\n") ;
    }
    public void step4() {
        System.out.println( "4.Lägg på en tårtbotten\n" ) ;
    }
    public void step5() {
        System.out.println( "5.Bred på ett lager vaniljkräm\n") ;
    }
    public void step6() {
        System.out.println("6.Fördela grädde på tårtan så den får en kupolform\n" ) ;
    }
    public void step7() {
        System.out.println("7.Lägg marsipanlocket på tårtan\n" ) ;
    } public void step8() {
        System.out.println("8.Garnera med marsipanros och florsocker\n") ;
    }

    @Override
    public void execute() {
     step1();
     step2();
     step3();
     step4();
     step5();
     step6();
     step7();
     step8();
    }
}

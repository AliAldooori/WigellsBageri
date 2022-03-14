package WigellsBageri.src;

public class KladdKakaCommand implements Command {
    public void  step1() {
        System.out.println("Kladdkaka\n" +
                "1.Smält smöret i kastrull\n" ) ;
    }
    public void  step2() {
        System.out.println(
                "2.Rör ihop socker, ägg, vetemjöl, kakao, vaniljsocker och salt\n"
        );
    }public void  step3() {
        System.out.println(

                "3.Tillsätt det smälta smöret\n"
        );
    }public void  step4() {
        System.out.println(

                "4.Häll smeten i en form\n"
        );
    }public void  step5() {
        System.out.println("5.Grädda ca 20 min. Ugnstemperatur 175 grader\n");


    }




        @Override
    public void execute() {
        step1();
        step2();
        step3();
        step4();
        step5();

    }
}

package WigellsBageri.src;

public class SemlaCommand implements Command{
  public void  step1() {
      System.out.println("\nSemla\n" +
              "1.Värm mjölk, smula jäst i en bunke. Häll i mjölken och rör om. Tillsätt 4 dl vetemjöl. Blanda och låt vila ca 15 min\n");
  }
    public void  step2() {
        System.out.println(
                "2.Tillsätt 3dl mjöl, ägg, salt, kardemumma och strösocker. Arbeta in smöret i degen och låt jäsa i 30 minuter.\n"
                );
    }public void  step3() {
        System.out.println(

                "3.Dela degen i 12 bitar och forma till släta bullar. Låt jäsa i ca 90 minuter\n"
               );
    }public void  step4() {
        System.out.println(

                "4.Grädda bullarna i 8 minuter. Ugnstemperatur 225 grader\n"
              );
    }public void  step5() {
        System.out.println(
                "5.Skär av ett lock på varje bulle. Gröp ur bullen lite grann och fyll med mandelmassa\n");

    }public void  step6() {
        System.out.println(

                "6.Spritsa en klick grädde på mandelmassan. Lägg tillbaka locket och pudra över florsocker\n");
  }

    @Override
    public void execute() {
     step1();
     step2();
     step3();
     step4();
     step5();
     step6();
    }
}

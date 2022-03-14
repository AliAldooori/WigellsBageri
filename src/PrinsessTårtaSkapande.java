package WigellsBageri.src;

public class PrinsessTårtaSkapande implements Command{
    Skapande skapande ;

    public PrinsessTårtaSkapande(Skapande skapande) {
        this.skapande = skapande;
    }

    @Override
    public void execute() {
        skapande.PrinsesstårtaSkapande();
    }
}

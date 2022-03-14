package WigellsBageri.src;

public class KladdKakaSkapande  implements Command {
    Skapande skapande ;

    public KladdKakaSkapande(Skapande skapande) {
        this.skapande = skapande;
    }

    @Override
    public void execute() {
        skapande.KladKakaSkapande();
    }
}

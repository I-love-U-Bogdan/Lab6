public class Sniff extends Trolls {
    public Sniff(String TrollName, ThingActions... thingActions) {
        super(TrollName);
        addThingAction(thingActions);
    }
}

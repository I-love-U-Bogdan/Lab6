public class Clefts extends Thing {
    public Clefts(String name, String direction, ThingActions... thingActions) {
        super(name,direction);
        addThingAction(thingActions);
    }
    @Override
    public void addThingAction(ThingActions... thingActions) {
        super.addThingAction(thingActions);
    }


    public void action() {

    }


    public void getDescribe() {
        System.out.print(" таинсвенные темные");
    }
}

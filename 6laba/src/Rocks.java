public class Rocks extends Thing {
    public Rocks(String name,String direction, ThingActions ... thingActions){
        super(name,direction);
        addThingAction(thingActions);
    }

    @Override
    public void addThingAction(ThingActions... thingActions) {
        super.addThingAction(thingActions);
    }


    public void action() {
        System.out.println(" взмывали");
    }


    public void getDescribe() {
        System.out.print(" первозднанные");
    }
}

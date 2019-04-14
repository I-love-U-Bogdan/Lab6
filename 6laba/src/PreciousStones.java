public abstract class PreciousStones extends Thing {
    public enum Rarety{
        RARE,
        COMMON,
        EXTREMELYRARE;
    }


    public void action() {

    }


    public void getDescribe() {

    }

    public PreciousStones(String name, String direction, ThingActions... thingActions) {
        super(name,direction);
        addThingAction(thingActions);

    }

    public static class Diamond extends PreciousStones {
        public Diamond(String name, String direction, ThingActions... thingActions) {
            super(name,direction);
            addThingAction(thingActions);
        }
    }

    public static class Emerald extends PreciousStones {
        public Emerald(String name, String direction, ThingActions... thingActions) {
            super(name,direction);
            addThingAction(thingActions);
        }
    }
    public static class Ruby extends PreciousStones{
        public Ruby(String name, String direction, ThingActions... thingActions) {
            super(name,direction);
            addThingAction(thingActions);
        }
    }
}

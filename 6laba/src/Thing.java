import java.util.ArrayList;

public  class Thing  {
    protected ArrayList<Thing> ThingInThing = new ArrayList<Thing>();

    public ArrayList<ThingActions> ThingActionList= new ArrayList<ThingActions>();
    public String name;
    public String direction;
    public Thing(String name, String direction){
        this.name = name;
        this.direction = direction;
    }

    public String getName(){
        return name;
    }
    public void AddThingInThing(Thing ... things) {
        for (Thing th : things) {
            ThingInThing.add(th);
        }
    }



    public void addThingAction(ThingActions ... thingActions){
        for(ThingActions thAc : thingActions){
            ThingActionList.add(thAc);
        }
    }



    public void doActions(){
        int index = 0;
        int count = ThingActionList.size();
        for (ThingAction thAction : ThingActionList){
            thAction.run();
            index += 1;
            if (index != count){
                System.out.print("и");
            }
        }
    }
}

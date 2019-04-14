public class Hit extends ThingActions {
    String name = "бил";
    Object operand;

    Hit(Object operand){
        this.operand = " " + operand;


    }
    public void run(){
        System.out.print(" " + name + operand + " " );
    }

    public String getName(){
        return name;
    }
    public String getTitle(){
        return getTitle();
    }

    @Override
    String getOperand() {
        return operand.toString();
    }
}

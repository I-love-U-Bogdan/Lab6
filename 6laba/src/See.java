public class See extends ThingActions {
    String name = "видел";
    String operand;

    See(String operand){
        this.operand = " " + operand;
    }

    public void run(){
        System.out.print(" " + name + operand + " ");
    }

    public String getName(){
        return name;
    }

    public String getOperand(){
        return operand;
    }
}

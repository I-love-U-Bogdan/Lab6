public class Raise extends  ThingActions {
    String name = "вздымали";
    String operand;

    Raise(String operand){
        this.operand = " " + operand;
    }
    public void run(){
        System.out.print(" " + name  + " из" + operand + " ");
    }

    public String getName(){
        return name;
    }

    public String getOperand(){
        return operand;
    }
}

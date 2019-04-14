public class Were extends ThingActions {
    String name = "находились";
    String operand;

    Were(String operand){
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

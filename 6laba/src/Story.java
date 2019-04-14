import java.util.NoSuchElementException;
import java.util.Scanner;

public class Story extends IslandManager {
    public static void main(String[] args) {
        IslandManager islandManager = new IslandManager();
        islandManager.createDirection();
        islandManager.readFile(output);
        islandManager.createVector();
        islandManager.creation();
        islandManager.TellStory();
        islandManager.Event();

        while (true) {
            System.out.println("Введите команду: ");
            try  {
                Scanner input = new Scanner(System.in);
                String command = input.nextLine();
                if (command.equals("removeLast")) {
                    islandManager.removeLast();
                } else if (command.equals("reorder")) {
                    islandManager.reorder();
                } else if (command.equals("info")) {
                    islandManager.info();
                } else if (command.equals("exit")) {
                        System.out.println("Хотите ли вы сохранить коллекцию перед выходом?");
                        String yesOrNo = input.nextLine();
                        if (yesOrNo.equals("yes")){
                            islandManager.save(false);
                            break;
                        }
                        else if (yesOrNo.equals("no")){
                            break;
                        }
                        else {
                            System.out.println("Введите yes или no");
                        }

                } else if (command.equals("show")){
                    islandManager.TellStory();
                }else if (command.length()> 8 &&command.substring(0,9).equalsIgnoreCase("addNormal")){
                    islandManager.addNormal(command);
                }
                else if (command.equals("help")){
                    islandManager.help();
                }
                else if (command.equals("save")){
                    islandManager.save(false);
                    System.out.println("Успешно сохранено");
                }else if (command.length()> 6 &&command.substring(0,6).equals("remove")){
                    islandManager.remove(command);
                }else if (command.length()>3&&command.substring(0,3).equals("add")){
                    String kek =(command.substring(3,command.length()-1+1));
                    System.out.println(kek);
                    islandManager.add(kek);
                }else {
                    System.out.println("Команда не найдена");
                    System.out.println("Введите help для получения информации о командах");
                }
            }catch (NoSuchElementException e){
                break;
            }
        }
    }
}


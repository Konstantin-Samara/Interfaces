import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        FullStackProgrammer programmer = new FullStackProgrammer();
//        programmer.writeBackEndCode();
//        programmer.writeFrontEndCode();
    ArrayList<FullStackProgrammer> dev = new ArrayList<>();
    dev.add(new BackEndProgrammer("Ivan"));
    dev.add(new FrontEndProgrammer("Nikolay"));
    dev.add(new BackEndProgrammer("Petr"));
    dev.add(new FrontEndProgrammer("Dmitriy"));
    dev.add(new BackEndProgrammer("Sergey"));
    dev.add(new FrontEndProgrammer("Olga"));
        for (int i = 0; i < dev.size(); i++) {
            if (dev.get(i) instanceof FrontEndProgrammer){
                ((FrontEndProgrammer) dev.get(i)).developGUI();}
            else{
                (dev.get(i)).drinkCoffee();
            }


        }



    }
}
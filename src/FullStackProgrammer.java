public class FullStackProgrammer implements BackEndProgramming, FrontEndProgramming{
String name;
FullStackProgrammer(String name){
    this.name = name;
};
    @Override
    public void writeBackEndCode() {
        System.out.println("Code of BackEnd");
    }

    @Override
    public void writeFrontEndCode() {
        System.out.println("Code of FrontEnd");

    }
    void drinkCoffee(){
        System.out.println(name+ " : \"I'm drink coffee.\"");
    }
}

package workWithOjects;

import org.testng.annotations.Test;

public class Person {
    @Test
    public void doit(){
        System.out.println("Hello, my name is " + name + ".My age is " + age + ".And my speciality " + speciality + ".");

        Engineer engineerProgrammer = new Engineer("Jacky", 18);//создаем обьект класса инженер
        System.out.println(engineerProgrammer.engineerName + ":" + engineerProgrammer.age);

        Engineer engineerQA = new Engineer("Amanda", 30);
        System.out.println(engineerQA.engineerName + ":" + engineerQA.age);


        Engineer engineerSantechnic = new Engineer("Igor", 55);
        System.out.println(engineerSantechnic.engineerName + ":" + engineerSantechnic.age);

        Engineer defaultEngineer = new Engineer();
        System.out.println(defaultEngineer.engineerName + ":" + defaultEngineer.age);

//        engineerProgrammer.printName();
        System.out.println(engineerProgrammer.engineerName + ":" + engineerProgrammer.age);
    }
    int age = 35;
    String name = "Vadym";
    String speciality = "Automation";


}

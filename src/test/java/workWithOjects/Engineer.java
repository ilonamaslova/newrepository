package workWithOjects;

public class Engineer extends Human{

    public Engineer(String n, int a){
        age = a;
        engineerName = n;
    }

    public Engineer(){

    }

    String speciality = "Engineer";

    String engineerName = " Jake";
    int age = 45;

    public void printName(){
        System.out.println("Name of this guy is" + engineerName);
    }
}

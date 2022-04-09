import org.testng.annotations.Test;

public class testWithGit {
    @Test
    public static void createdPerson(){
        user userFist = new user("Alex1", 30);
        System.out.println(userFist.namee + ":" + userFist.agee);

        user userSecond = new user("Alex2", 27);
        System.out.println(userSecond.namee + ":" + userSecond.agee);



    }
}

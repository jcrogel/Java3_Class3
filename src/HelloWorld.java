import java.util.List;

public class HelloWorld {
    private HelloWorldDB db  = new HelloWorldDB();

    public HelloWorld(){
        db = new HelloWorldDB();
    }

    public void greetFromDB(){
        List<String> names = db.getDBNames();
        for (String name : names){
            String greet = this.greet(name);
            System.out.println(greet);
        }
    }

    public String greet(String name){
        return "Hello " + name;
    }
}

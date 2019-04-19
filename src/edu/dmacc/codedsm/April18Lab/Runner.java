package edu.dmacc.codedsm.April18Lab;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a username: ");
        String userName = in.next();
        System.out.println("Enter a number: ");
        Integer inputNumber = in.nextInt();

        MapRepository repository = new FizzBuzzMapRepository();   //new implementation for homework
        FizzBuzzService service = new FizzBuzzServiceImpl(repository);      //new implementation for homework
        SubmissionController controller = new SubmissionControllerImpl(service);

        InputView view = controller.submit(inputNumber, userName);
        view.render();

    }

}




























/*
MODEL
POJO- plain old java object- an object that only contains state. no behavior in it. always private(encapsulated)
public class Pojo {
    private String name;

    public String getName() {
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
You can also put = hashcode and toString. no constructor.
------------------------------------------------------

DTO- data transfer object

--------------------------------------------------------
Repository or DAO (data access object) - a way to find info about the POJO. how we find, save, update, and delete POJOs
public class PojoRepository{
    public Pojo findPojo(...some value that helps find a pojo) {}

    public Pojo updatePojo(Pojo p) {}

    public void save(Pojo p) {}

    public void delete(Pojo p) {}

}



VIEW

public class PageView {
    public String render(Pojo p) {
        return turnPojoToHtml(p);
    }
}

--------------------------------------------------------------
Controller

Controller or ViewController

Service - usually put any kind of logic here

public class Controller{
    public View handleInput(...) {
        //does logic
        return new View();
    }

}

public class Service {
    .
    .
    .
    .
    //program behavior goes in this space
}

 */
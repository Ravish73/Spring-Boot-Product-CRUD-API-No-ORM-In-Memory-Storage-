package com.MySpringProject.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class practice
{

    public static void main(String[] args) {
        ApplicationContext con  =SpringApplication.run(WebAppApplication.class, args);
       Abc abc = con.getBean(Abc.class);
       abc.iamabc();
    }

}
    @Component
    class Abc
    {
        @Autowired
        def dd;
        void iamabc()

        {
            System.out.println("abc method");
            dd.dd();
        }

    }
@Component
class def {
//    @Autowired
    BB bb;

    public def (BB bb){
        this.bb= bb;

    }

    void dd() {

        System.out.println("def methhod");
        bb.king();
    }
}

    @Component
    class BB{

        void king(){
            System.out.println("King method");
        }
    }


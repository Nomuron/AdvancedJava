package pl.pjatk.patkli;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Third {

//    public Third(ApplicationContext applicationContext) {
//        First first = applicationContext.getBean("first", First.class);
//        Second second = applicationContext.getBean("second", Second.class);
//        second.helloFromTheHood();
//
//        System.out.println("I'm third!");
//
//        MySimpleClass mySimpleClass = applicationContext.getBean("mySimpleClass", MySimpleClass.class);
//        MySimpleClass mySecondSimpleClass = applicationContext.getBean("mySecondSimpleClass", MySimpleClass.class);
//
//        System.out.println(mySimpleClass.getName());
//        System.out.println(mySecondSimpleClass.getName());
//    }

    public Third(First first, Second second, MySimpleClass mySimpleClass, MySimpleClass mySecondSimpleClass) {
        second.helloFromTheHood();

        System.out.println("I'm third!");
        System.out.println(mySimpleClass.getName());
        System.out.println(mySecondSimpleClass.getName());
    }
}

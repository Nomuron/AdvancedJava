package pl.pjatk.patkli;

import org.springframework.stereotype.Component;

@Component
public class First {

    public First(Second second) {
        System.out.println("I'm first!");
        second.helloFromTheHood();
    }
}

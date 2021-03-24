package pl.pjatk.patkli;

import org.springframework.stereotype.Component;

@Component
public class Second {

    public Second() {
        System.out.println("I'm second!");
    }

    public void helloFromTheHood() {
        System.out.println("I'm second.hood");
    }
}

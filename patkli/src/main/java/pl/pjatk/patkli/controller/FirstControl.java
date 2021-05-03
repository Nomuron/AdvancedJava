package pl.pjatk.patkli.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.patkli.model.Car;

@RestController
@RequestMapping("/test")
public class FirstControl {

    @GetMapping("/hello")
    public ResponseEntity<String> testHello(){
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/model2")
    public ResponseEntity<Car> testModel(){
        Car car = new Car(1994, "Paseratti");
        return ResponseEntity.ok(car);
    }

    @GetMapping("/hello/{value}")
    public ResponseEntity<String> testValue(@PathVariable String value){
        return ResponseEntity.ok(value);
    }

    @GetMapping("/hello2")
    public ResponseEntity<String> testValueParam(@RequestParam String value){
        return ResponseEntity.ok(value);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> testBody(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }

}

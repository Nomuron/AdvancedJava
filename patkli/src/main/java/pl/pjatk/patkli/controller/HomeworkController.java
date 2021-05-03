package pl.pjatk.patkli.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.patkli.model.Car;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    @GetMapping("/get_path/{value}")
    public ResponseEntity<String> getPathVariable(@PathVariable String value) {
        return ResponseEntity.ok(value);
    }

    @GetMapping("/get_param")
    public ResponseEntity<String> getRequestParam(@RequestParam String paramValue) {
        return ResponseEntity.ok(paramValue);
    }

    @PostMapping("/post_body")
    public ResponseEntity<Car> postBody(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }

    @PutMapping("/put_path/{putValue}")
    public ResponseEntity<String> putPath(@PathVariable String putValue) {
        return ResponseEntity.ok(putValue);
    }

    @PutMapping("/put_body")
    public ResponseEntity<Car> putParam(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }

    @DeleteMapping("/delete_path/{deleteValue}")
    public ResponseEntity<Void> deletePath(@PathVariable String deleteValue) {
        return ResponseEntity.ok().build();
    }
}

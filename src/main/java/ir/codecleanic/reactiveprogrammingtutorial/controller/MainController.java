package ir.codecleanic.reactiveprogrammingtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/main")
public class MainController {

    @GetMapping("/start")
    public Mono<String> start() {
        return Mono.just("""
                               Hello, This is my firsthand experience with Reactive Programming and Spring Boot!
                               """);
    }

}

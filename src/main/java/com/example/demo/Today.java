/*package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class  Today {
    @GetMapping("/square")
    public int square(@RequestParam int number) {
        return number * number;
    }

    @GetMapping("/time")
    public String time() {
        return LocalDateTime.now().toString();
    }*/

    //request param: /url?variableName=value
    /*@GetMapping("/greet/spanish")
    public String greetspanish(@RequestParam (defaultValue = "amigo") String name) { //request param
        return spanishGreetingService(name);


    private String spanishGreetingService(String name) {
        return "¡Hola, " + name + "!";
        }    @GetMapping("/new user")


    public String newuser(@RequestParam (defaultValue = "1L") String name) { //request param
        */


 /*   List<Long> list = List.of(1L,2L);
    List<User> users = List.of(
            new User(1L, "John", "John1@gmail.com"),
            new User(2L, "Kate"),
            new User(3L, "Favour", "Favourani12@gmail.com"),
            new User(4L, "Joy")
            );

    @GetMapping("/getuser")
    public User getUser(@RequestParam Long id){
        User gottenUser = null;
        for (User user: users){
            if (id != user.getId()) continue;
            else {
                gottenUser = user;
            }
        }
        return gottenUser;
    }

    //path variable: /url/{variable}
    //{placeholder}
    //http://localhost:8080/user/get/{id}
    @GetMapping("/getuser/id/{id}")
    public User getUserById(@PathVariable Long id){
        User gottenUser = null;
        for (User user: users){
            if (id != user.getId()) continue;
            else {
                gottenUser = user;
            }
        }
        return gottenUser;
    }

}*/




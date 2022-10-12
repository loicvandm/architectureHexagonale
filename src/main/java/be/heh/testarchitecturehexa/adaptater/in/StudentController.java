package be.heh.testarchitecturehexa.adaptater.in;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/")
    public String studentList(){
        return "studentList";
    }
}

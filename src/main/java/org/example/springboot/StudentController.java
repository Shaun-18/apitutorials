package org.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {


    @GetMapping
    public List<Student> getStudent() {

        return List.of(new Student(1,
                        "kagiso",
                        "Molefe",
                        "kagisomolefe@gamil.com", "Java"),


                new Student(2,
                        "kg",
                        "Molife",
                        "kgmorelife@gmail.com", "Python")


        );

    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {

        return new Student(
                id,
                "Kagiso",
                "Molefe",
                "kagiso@gmail.com",
                "Java");


}
}
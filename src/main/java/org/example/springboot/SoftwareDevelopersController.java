
package org.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-dev")
public class SoftwareDevelopersController {

    @GetMapping
    public List<softwareDevelopers> getSoftwareDevs() {

        return List.of(
                new softwareDevelopers(
                        1,
                        "kagisomolefe@gmail.com",
                        "kagiso",
                        List.of("Java", "JavaScript", "Node"), "12345"
                ),

                new softwareDevelopers(
                        2,
                        "kg@gmail.com",
                        "Kg",
                        List.of("Python", "TypeScript", "Node"),"098765"
                )
        );
    }
}

package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
    public class InfoController {
        @GetMapping("/info")
        public String info() {
            return "This is the products API, a Spring Boot application for tutorial 1";
        }
    }


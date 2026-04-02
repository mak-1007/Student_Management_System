package com.example.Student_Management_system;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
@RestController
public class StudentController {
    HashMap<Integer, Student> map = new HashMap<>();

    @PostMapping("/registerdStudent")
    public void addStudent(@RequestBody Student std) {
        int key = std.getRollNo();
        map.put(key, std);

    }

@GetMapping("/getinfo")
        public Student getStudent(@RequestParam("rollNo")Integer rollNo){
            Student std =map.get(rollNo);
            return  std;
        }

}

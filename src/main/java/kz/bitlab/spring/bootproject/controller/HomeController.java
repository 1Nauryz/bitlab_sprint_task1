package kz.bitlab.spring.bootproject.controller;

import kz.bitlab.spring.bootproject.db.DBManager;
import kz.bitlab.spring.bootproject.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String indexPage(Model model){
        ArrayList<Student> studentArray = DBManager.getStudents();
        model.addAttribute("studentter", studentArray);
        return "index";
    }

    @GetMapping(value = "/add-student")
    public String addPage(Student student){
        return "add_page";
    }

    @PostMapping(value = "/store-student")
    public String storePage(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }

}

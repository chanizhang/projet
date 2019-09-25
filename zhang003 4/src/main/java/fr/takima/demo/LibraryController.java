package fr.takima.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 */
@RequestMapping("/")
@Controller
public class LibraryController {

  private final UserDAO userDAO;

  public LibraryController(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @GetMapping
  public String homePage(Model m) {
    m.addAttribute("users", userDAO.findAll());
    return "index";
  }
  @GetMapping("/new")
  public String addUserPage(Model m) {
    m.addAttribute("user", new User());
    return "new";
  }
  @PostMapping("/new")
  public RedirectView createNewUser(@ModelAttribute User user, RedirectAttributes attrs) {
    attrs.addFlashAttribute("message", "Ajouté avec succès");
    userDAO.save(user);
    return new RedirectView("/");
  }

  @GetMapping("/new/{id}")
  public RedirectView deleteAnimal(@PathVariable("id") String id) {
    userDAO.deleteById(Long.valueOf(id));
    return new RedirectView("/");
  }
  @PostMapping("/new")
  public String updateData(Model m){
    Optional<Grade> grade = gradeService.getGradeByID(student.getGrade().getGID()); ;
    student.setGrade(grade.get());
    studentService.addStudent(student);
    return "redirect:/";
  }

}

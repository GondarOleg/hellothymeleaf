package hello;

import hello.aspects.BeforeAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    Gizmo gizmo = new Gizmo();

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("gizmo", new Gizmo());
        return "hello";
    }

    @RequestMapping("/save")
    public String save(Gizmo gizmo) {
            this.gizmo.setField1(gizmo.getField1());
            this.gizmo.setField2(gizmo.getField2());
            return "redirect:/";
    }

    @RequestMapping("/deny")
    public String deny() {
        return "notallowedmore";
    }

    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute("gizmo", gizmo);
        return "show";
    }
}

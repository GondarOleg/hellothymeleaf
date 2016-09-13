package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by O.Gondar on 13.09.2016.
 */
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

    @RequestMapping("/tst")
    public String index1(Model model) {
        model.addAttribute("gizmo", gizmo);
        return "show";
    }

}

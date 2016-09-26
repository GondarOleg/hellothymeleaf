package aspectshomework.controler;

import aspectshomework.pojo.SampleClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SampleController {

    SampleClass sampleClass = new SampleClass();

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("sampleClass", new SampleClass());
        return "hello";
    }

    @RequestMapping("/save")
    public String save(SampleClass sampleClass) {
            this.sampleClass.setField1(sampleClass.getField1());
            this.sampleClass.setField2(sampleClass.getField2());
            return "redirect:/";
    }

    @RequestMapping("/deny")
    public String deny() {
        return "notallowedmore";
    }

    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute("sampleClass", sampleClass);
        return "show";
    }
}

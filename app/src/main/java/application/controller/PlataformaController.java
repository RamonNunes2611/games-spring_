package application.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import application.model.Plataforma;
import application.repository.PlataformaRepository;

@Controller
@RequestMapping("/plataforma")
public class PlataformaController {
    @Autowired
    private PlataformaRepository plataformaRepo;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("plataformas", plataformaRepo.findAll());
        return "plataforma/list";
    }

    @GetMapping("/insert")
    public String insert(Model model) {
        model.addAttribute("plataforma", new Plataforma());
        return "plataforma/insert";
    }

    @PostMapping("/insert")
    public String insert(@Valid Plataforma plataforma) {
        plataformaRepo.save(plataforma);
        return "redirect:/plataforma/list";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") Long id, Model model) {
        Plataforma plataforma = plataformaRepo.findById(id).orElse(null);
        if (plataforma != null) {
            model.addAttribute("plataforma", plataforma);
            return "plataforma/update";
        }
        return "redirect:/plataforma/list";
    }

    @PostMapping("/update")
    public String update(@RequestParam("id") Long id, @Valid Plataforma plataforma) {
        Plataforma plataformaFromDb = plataformaRepo.findById(id).orElse(null);
        if (plataformaFromDb != null) {
            plataformaFromDb.setNome(plataforma.getNome());
            plataformaRepo.save(plataformaFromDb);
        }
        return "redirect:/plataforma/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        Plataforma plataforma = plataformaRepo.findById(id).orElse(null);
        if (plataforma != null) {
            plataformaRepo.delete(plataforma);
        }
        return "redirect:/plataforma/list";
    }

    @PostMapping("/delete")
    public String deletePost(@RequestParam("id") Long id) {
        plataformaRepo.deleteById(id);
        return "redirect:/plataforma/list";
    }
}

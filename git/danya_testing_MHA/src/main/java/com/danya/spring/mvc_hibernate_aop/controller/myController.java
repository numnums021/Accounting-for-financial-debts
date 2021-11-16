package com.danya.spring.mvc_hibernate_aop.controller;

import com.danya.spring.mvc_hibernate_aop.dao.DebtorsDao;
import com.danya.spring.mvc_hibernate_aop.entity.Debtors;
import com.danya.spring.mvc_hibernate_aop.service.DebtorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class myController {

    @Autowired
    private DebtorsService debtorsService;

    @RequestMapping("/")
    public String showAllDebtors(Model model){

        List<Debtors> allDebtors = debtorsService.getAllDebtors(999);
        model.addAttribute("allDebts", allDebtors);

        return "all_debtors";
    }

//////////////////////////////////////////////////
    @RequestMapping("/showDebtors")
    public String showDebtors(Model model){

        List<Debtors> allDebtors = debtorsService.getAllDebtors(-999);
        model.addAttribute("allDebts", allDebtors);

        return "all_debtors";
    }
//////////////////////////////////////////////////////

    @RequestMapping("/addNewDebtors")
    public String addNewDebtors(Model model){

        Debtors debtors = new Debtors();
        model.addAttribute("debtors", debtors);

        return "debtors_info";
    }

    @RequestMapping("/saveDebtors")
    public String saveDebtors(@ModelAttribute("debtors") Debtors debtors){

        debtorsService.saveDebtors(debtors);

        return "redirect:/";
    }

    @RequestMapping("/deleteDebtors")
    public String deleteDebtors(@RequestParam("dbtId") int id){

        debtorsService.getDebtors(id);

        return "redirect:/";
    }
}

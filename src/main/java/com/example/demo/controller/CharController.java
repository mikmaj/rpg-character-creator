package com.example.demo.controller;

import com.example.demo.model.RPChar;

import com.example.demo.repository.RPCharRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CharController {

    @Autowired
    RPCharRepository repository;

    // Show all characters
    @RequestMapping(value = "/admin/characters")
    public String charList(Model model) {
        model.addAttribute("characters", repository.findAll());
        return "admin/characters";
    }

    // REST for all characters
    @RequestMapping(value="/admin/charlist", method = RequestMethod.GET)
    public @ResponseBody List<RPChar> charList() {
        return (List<RPChar>) repository.findAll();
    }

    // REST for one character
    @RequestMapping(value="/admin/rpchar/{id}", method = RequestMethod.GET)
    public @ResponseBody RPChar findChar(@PathVariable("id") Long charId) {
        return repository.findById(charId).orElse(null);
    }

    // Create a new character
    @RequestMapping(value="admin/add")
    public String addChar(Model model) {
        model.addAttribute("rpchar", new RPChar());
        return "admin/add";
    }

    // Save a new character
    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String save(RPChar rpchar) {
        repository.save(rpchar);
        return "redirect:/admin/characters";
    }

    // Delete a character from the database
    @RequestMapping(value="/admin/delete/{id}", method = RequestMethod.GET)
    public String deleteChar(@PathVariable("id") Long id, Model model) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:../characters"; }

    // Hahmon muokkaus
    @RequestMapping(value="/admin/editchar/{id}", method = RequestMethod.GET)
    public String editChar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("rpchar", repository.findById(id).orElse(null));
        return "/admin/editchar";
    }
}

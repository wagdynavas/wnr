package com.wagdynavas.register.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReaderController {

    @RequestMapping(value = "/readers", method = RequestMethod.GET)
    public String readersList(Model model) {
        return "";
    }
}

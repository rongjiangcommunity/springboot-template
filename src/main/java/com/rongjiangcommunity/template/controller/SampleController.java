package com.rongjiangcommunity.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * A sample controller, notified by the annotation <code>@Controller</code>.
 *
 * "Mapping" can be recognized as the "web path" of this controller. There are several kinds of mapping, named by HTTP
 * methods such as <code>@GetMapping</code>, <code>@PostMapping</code>, and a summary mapping called
 * <code>@RequestMapping</code>.
 *
 * The functions inside controller will be called while triggered the "Mapping" via HTTP(S) URL path.
 */
@Controller
@RequestMapping("/sample")
public class SampleController {

    /**
     * A sample function.
     *
     * This function will be called when requesting
     * <a href="http://localhost:8080/sample/index-with-data.html">/sample/index-with-data.html</a>. The URL path is
     * the combination of the mapping of controller and the mapping of function.
     *
     * You can handle the param <code>session</code> for persistent state. param <code>model</code> is a wrapper of
     * <code>Map</code> structure, used by Thymeleaf for filling data in template.
     *
     * Return value of such a function is actually the template file for the page returning to the user. The extension
     * name ".html" can be omitted in the next example.
     */
    @GetMapping("/index-with-data.html")
    public String returnData(HttpSession session, Model model) {
        // You can do any operation here.
        model.addAttribute("parsingFromJava", "0");
        return "index-with-data-template.html";
    }

    /**
     * A sample function with URL parameter included.
     *
     * Using the mustache "{}" included in the URL parameter of <code>@GetMapping</code>, the section inside bracket
     * can be used as the parameter passing to the function, with the annotation <code>@PathVariable</code> before
     * the specified parameter of Java function.
     */
    @GetMapping("/index-with-data.html/{who are you}")
    public String returnData(HttpSession session, Model model, @PathVariable("who are you") String name) {
        model.addAttribute("parsingFromJava", name);
        return "index-with-data-template";
    }
}

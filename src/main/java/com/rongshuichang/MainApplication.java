package com.rongshuichang;

import com.rongshuichang.entity.Pinfo;
import com.rongshuichang.entity.Userinfo;
import com.rongshuichang.service.PinfoService;
import com.rongshuichang.service.UserinfoService;
import com.rongshuichang.util.JSONConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.rongshuichang.repository", "com.rongshuichang.service"})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    JSONConverter jsonConverter = new JSONConverter();

    @Autowired
    PinfoService pinfoService;

    @Autowired
    UserinfoService userinfoService;

    @RequestMapping("/")
    String home(){return "hello world";}

    //get user info from user table by ID
    @RequestMapping(value = "/getuserinfo/{id}",method = RequestMethod.GET)
    public Userinfo newPinfo(@PathVariable("id")long id){

        Optional<Userinfo> dataOptional = userinfoService.findbyId(id);
        if(dataOptional.isPresent()){
            Userinfo uidata = dataOptional.get();
            return uidata;
        }
        return null;
    }

    //get queqiao info from pinfo table by ID
    @RequestMapping(value = "/getpinfo/{id}",method = RequestMethod.GET)
    public Pinfo getPinfobyId(@PathVariable("id")long id){
        Optional<Pinfo> dataOptional = pinfoService.findbyId(id);
        if(dataOptional.isPresent()){
            Pinfo pidata = dataOptional.get();
            return pidata;
        }
        return null;
    }

    @RequestMapping(value = "/newpinfo",method = RequestMethod.POST)
    public String newPinfo(@RequestBody String body){
        Pinfo pinfo = jsonConverter.getPinfofromJSON(body);

        return pinfoService.savePinfo(pinfo);
    }








}

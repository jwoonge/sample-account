package com.nhn.rookie8.sample.account;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
public class HelloWorldController {
    @GetMapping("/helloworld")
    @ResponseBody
    public String helloWorld()
    {
        return "Hello World!"; //이 경우 미디어타입 plaintext가 됨
    }
}

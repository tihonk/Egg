package egg.actions.controllers;

import egg.actions.services.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HomeController {

    @Resource
    HomeService homeService;

    @GetMapping("/")
    public String giveFreeField() {
        return homeService.generateStartField();
    }
}

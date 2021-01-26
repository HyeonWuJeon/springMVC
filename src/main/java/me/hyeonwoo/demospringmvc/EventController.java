package me.hyeonwoo.demospringmvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// controller
@Controller
public class EventController {
      // 4.3 이전
//    @RequestMapping(value="/events", method = RequestMethod.GET)
//    public String events(Model model){ // Get 핸들러
//        return "events";
//    }

    @Autowired
    EventService eventService;

    // spring 4.3 부터 지원
    @GetMapping("/events")
    public String events(Model model){
        model.addAttribute("events", eventService.getEvents());
        return "events";
    }
}

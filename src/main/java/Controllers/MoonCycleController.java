package Controllers;

import Models.MoonCycle;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class MoonCycleController {
    MoonCycle moon = new MoonCycle();
    @GetMapping("/moonCycle")
    public String moonCycle(){
        LocalDateTime now = LocalDateTime.now();
        if(now.getDayOfMonth() <= 6)
            return moon.getmoon()[0];
        else if(now.getDayOfMonth() == 7)
            return moon.getmoon()[1];
        else if(now.getDayOfMonth() > 7 && now.getDayOfMonth() <= 14 )
            return moon.getmoon()[2];
        else if(now.getDayOfMonth() == 15)
            return moon.getmoon()[3];
        else if(now.getDayOfMonth() > 15 && now.getDayOfMonth() <= 20)
            return moon.getmoon()[4];
        else if(now.getDayOfMonth() == 22)
            return moon.getmoon()[5];
        else if(now.getDayOfMonth() > 22 && now.getDayOfMonth() <= 28)
            return moon.getmoon()[6];
        else if(now.getDayOfMonth() > 28 && now.getDayOfMonth() <= 30)
            return moon.getmoon()[7];
        else if(now.getDayOfMonth() == 31)
            return moon.getmoon()[0];
        else return "Error";
    }

    @PostMapping("/setDate")
    public String setMoonCycle(@RequestParam("localDate") LocalDate localDate) {
        if(localDate.getDayOfMonth()  <= 6)
            return moon.getmoon()[0];
        else if( localDate.getDayOfMonth() == 7 )
            return moon.getmoon()[1];
        else if(localDate.getDayOfMonth() > 7 && localDate.getDayOfMonth() <= 14 )
            return moon.getmoon()[2];
        else if(localDate.getDayOfMonth() == 15)
            return moon.getmoon()[3];
        else if(localDate.getDayOfMonth() > 15 && localDate.getDayOfMonth() <= 20)
            return moon.getmoon()[4];
        else if(localDate.getDayOfMonth() == 22)
            return moon.getmoon()[5];
        else if(localDate.getDayOfMonth() > 22 && localDate.getDayOfMonth() <= 28)
            return moon.getmoon()[6];
        else if(localDate.getDayOfMonth() > 28 && localDate.getDayOfMonth() <= 30)
            return moon.getmoon()[7];
        else if(localDate.getDayOfMonth() == 31)
            return moon.getmoon()[0];
        else return "Error";
    }
}

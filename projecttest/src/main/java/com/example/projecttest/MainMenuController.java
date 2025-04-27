package com.example.projecttest;

import org.springframework.web.bind.annotation.*;
/*API for sending info from back end to front (and back again, if needed)
 * Get information from the classes needed (FillerInfo as example)
 */
@RestController
@RequestMapping("/api")
public class MainMenuController {
    FillerInfo filler = new FillerInfo();
    @GetMapping("/getBalance")
    public double getBalance() {
        return filler.getBalance();
    }
    @GetMapping("/getUsername")
    public String getUsername() {
    return filler.getUserName();
    }
}

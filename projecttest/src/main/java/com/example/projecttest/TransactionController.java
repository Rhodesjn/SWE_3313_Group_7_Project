package com.example.projecttest;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/api")
public class TransactionController {
    FillerInfo filler = new FillerInfo();
    private List<TransactionTest> scheduledTransactions = new ArrayList<>();

    @PostMapping("/scheduleTransaction")
    public String scheduleTransaction(@RequestBody TransactionTest transaction) {
        scheduledTransactions.add(transaction);
        return "Transaction scheduled: " + transaction.getName();
    }
    @PostMapping("/numberOfTransactions")
    public int numberOfTransactions(){
        return scheduledTransactions.size();
    }
    @GetMapping("/getUsername")
    public String getUsername() {
    return filler.getUserName();
    }
}

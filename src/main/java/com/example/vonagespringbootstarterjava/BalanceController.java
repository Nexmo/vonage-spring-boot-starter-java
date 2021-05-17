package com.example.vonagespringbootstarterjava;

import com.vonage.client.VonageClient;
import com.vonage.client.account.BalanceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BalanceController {
    @Autowired
    private VonageProperties vonageProperties;
    @GetMapping("/")
    public String GetBalance(Model model){
        VonageClient client = VonageClient.builder()
                .apiKey(vonageProperties.getApiKey())
                .apiSecret(vonageProperties.getApiSecret()).build();
        BalanceResponse balance = client.getAccountClient().getBalance();
        model.addAttribute("balance", String.valueOf(balance.getValue()));
        return "balanceResponse";
    }
}

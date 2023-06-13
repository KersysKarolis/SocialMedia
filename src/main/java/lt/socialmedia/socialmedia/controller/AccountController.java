package lt.socialmedia.socialmedia.controller;

import lt.socialmedia.socialmedia.entity.Account;
import lt.socialmedia.socialmedia.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping
    public List<Account> createAccount(Account account){
        return this.accountService.createNewAccount(account);
    }
}

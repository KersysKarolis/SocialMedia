package lt.socialmedia.socialmedia.controller;

import lt.socialmedia.socialmedia.entity.Account;
import lt.socialmedia.socialmedia.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping
    public List<Account> getAllAccounts(){
        return this.accountService.getAllAccounts();
    }
    @PostMapping
    public List<Account> createAccount(@RequestBody  Account account){
        return this.accountService.createNewAccount(account);
    }
    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id){
        return this.accountService.getAccountById(id);
    }


}

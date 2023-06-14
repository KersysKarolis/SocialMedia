package lt.socialmedia.socialmedia.service;

import lt.socialmedia.socialmedia.entity.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AccountService {
    List<Account> accountList = new ArrayList<>();

    public List<Account> createNewAccount (Account account){
        this.accountList.add(account);
        return accountList;
    }
    public List<Account> getAllAccounts(){
        return this.accountList;
    }
    public Account getAccountById(Long id){
        if(!(accountList.isEmpty())){
            return this.accountList.stream().filter(account -> account.getId().equals(id)).findFirst().orElseThrow();
        }
        return null;
    }

}

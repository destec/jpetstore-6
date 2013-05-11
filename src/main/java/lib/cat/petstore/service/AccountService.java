package lib.cat.petstore.service;

import lib.cat.petstore.entity.Account;
import lib.cat.petstore.persistence.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

  @Autowired
  private AccountMapper accountMapper;

  public Account getAccount(String username) {
    return accountMapper.getAccountByUsername(username);
  }

  public Account getAccount(String username, String password) {
    return accountMapper.getAccountByUsernameAndPassword(username, password);
  }

  @Transactional
  public void insertAccount(Account account) {
    accountMapper.insertAccount(account);
    accountMapper.insertProfile(account);
    accountMapper.insertSignon(account);
  }

  @Transactional
  public void updateAccount(Account account) {
    accountMapper.updateAccount(account);
    accountMapper.updateProfile(account);

    if (account.getPassword() != null && account.getPassword().length() > 0) {
      accountMapper.updateSignon(account);
    }
  }

}

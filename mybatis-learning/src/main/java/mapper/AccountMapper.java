package mapper;

import model.Account;

import java.util.List;
import java.util.Map;

public interface AccountMapper {
    public Account findAccountById(int id);

    public Account findAccountByNameAndBalacne(Map<String,Object> map);

    public int findAccountCount();

    public List<Account> findAll();

    public Account findAccountByIdWithResultmap(int id);

    public List<Account> findAccounts(Account account);

    List<Account> findAccountsByIds(List<Integer> ids);

    List<Account> findAccountsWithChoose(Account account);

    public void updateAccount(Account account);
}

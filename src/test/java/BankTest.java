
import hu.eszterhazy.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {
    DigitalBank digitalBank;
    String bankname;
    String ownername;
    String username;
    String password;
    Account account;

    @BeforeEach
    public void setup(){
        bankname="Scrooge McDuck Banking";
        ownername="Scrooge McDuck";
        AccountDB accountDB= new AccountSQLDB();
        digitalBank=new DigitalBank(ownername, bankname, accountDB);
        username="some_guy";
        password="123";
        account = new UserAccount(username, password);
        digitalBank.registerAccount(account);
    }


    @Test
    public void authenticateAccountTest(){
        Assertions.assertEquals(digitalBank.authenticateAccount(username, password), true);
    }
}

package isp1.pay;

import java.util.List;

public interface Payable {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmmachineproject;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationlmpl implements AtmOperationInterf{
    ATM atm=new ATM();
    
    Map<Double,String> ministmt=new HashMap<>();
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect the Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance !!");
            }
        }
        else {
            System.out.println("Please enter the amount in multipal of 500");
        }

    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        ministmt.entrySet().stream().forEach((m) -> {
            System.out.println(m.getKey()+""+m.getValue());
        });

    }
}


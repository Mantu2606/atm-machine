/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmmachineproject;

/**
 *
 * @author mantu
 */
public interface AtmOperationInterf {
    public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double depositAmount );
    public  void viewMiniStatement();
}
            
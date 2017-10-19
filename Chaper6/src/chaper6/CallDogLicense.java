/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaper6;

/**
 *
 * @author Alden Park
 */
public class CallDogLicense {
   public static void main (String [] args) {
      DogLicense dog1 = new DogLicense();

      dog1.setYear(2014);
      dog1.createLicenseNum(777);
      System.out.println("Dog license: " + dog1.getLicenseNum());

      return;
   }
}
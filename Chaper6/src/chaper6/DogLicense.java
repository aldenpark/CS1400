package chaper6;

public class DogLicense {
   private int licenseYear;
   private int licenseNum;

   public void setYear(int yearRegistered) {
      licenseYear = yearRegistered;
      return;
   }

   // FIXME: Write createLicenseNum()

   public void createLicenseNum(int l){
      licenseNum = Integer.valueOf(String.valueOf(l*10) + String.valueOf(licenseYear));
   }
   public int getLicenseNum() {
      return licenseNum;
   }
}
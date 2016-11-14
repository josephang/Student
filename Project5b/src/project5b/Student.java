
package project5b;
public class Student extends Person{
    public int IDN, cred;
 public Student(String Name, String nHouse, String nStreet, String nZip, int sID, int credi){
        super( Name,nHouse, nStreet , nZip);
        this.IDN = sID;
        this.cred = credi;
    }
   
    public void changeHouse(String nHouse){
        this.HouseN = nHouse;
    }
    public void changeStreet(String nStreet){
        this.StreetN = nStreet;
    }
    public void changeZip(String nZip){
        this.Zip = nZip;
    }
    public void subCred(int credp){
        this.cred = this.cred - credp;
    }
    public void addCred(int credp){
        this.cred = this.cred + credp;
    }
    public int getCred(){
        return this.cred;
    }
    public int getIDN(){
        return this.IDN;
    }
}

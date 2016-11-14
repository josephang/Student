package project5b;
public class UgradStudent extends Student{
        public String Major, Degree;
     public UgradStudent(String Name, String nHouse, String nStreet, String nZip, int sID, int ncredit, String Maj, String Deg){
        super( Name,nHouse, nStreet , nZip, sID, ncredit);
        this.Major = Maj;
        this.Degree = Deg;      
    }
     public void setMajor(String Maj){
        this.Major = Maj;  
     }
     public void setDegree(String Deg){
        this.Degree = Deg;  
     }
     public String getMajor(){
         return this.Major;
     }
     public String getDegree(){
         return this.Degree;
     }
}

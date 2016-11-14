package project5b;
public class Person {

    public String pName, FullAdd, Zip, HouseN, StreetN;
    
    public Person(String Name, String nHouse, String nStreet, String nZip){
        this.pName = Name;
        this.HouseN = nHouse;
        this.StreetN = nStreet;
        this.Zip =  nZip;
        makeFullADD();
    }
    private void makeFullADD(){
        this.FullAdd = this.pName + " " + this.HouseN + " " + this.StreetN + " " + this.Zip;
    }
    public String getAddress(){
        return this.FullAdd;
    }
    public String getName(){
        return pName;
    }
    public void changeZip(String nZip){
        this.Zip = nZip;
    }
    public void changeHouseN(String nHouse){
        this.HouseN = nHouse;
    }
    public void changeStreetN(String nStreet){
        this.StreetN = nStreet;
    }
}


/*
Joseph Ang
CompSci 182
Professor Riviera
 */
package project5b;
public class Project5b {
    public static void main(String[] args) {
        Student Joseph = new Student("Joseph", "11011","Binary Way","10110", 1, 101);
        UgradStudent SeYeon = new UgradStudent("SeYeon", "00100","Binary Way","01001", 10, 110, "CompSci", "AS");
        System.out.println(Joseph.getName());
        System.out.println(Joseph.getAddress());
        System.out.println(Joseph.getIDN());
        System.out.println(Joseph.getCred());
        Joseph.addCred(10);
        System.out.println(Joseph.getCred());
        
        System.out.println(SeYeon.getName());
        System.out.println(SeYeon.getAddress());
        System.out.println(SeYeon.getIDN());
        System.out.println(SeYeon.getCred());
        SeYeon.subCred(10);
        System.out.println(SeYeon.getCred());
        System.out.println(SeYeon.getDegree());
        SeYeon.setDegree("AA");
        System.out.println(SeYeon.getDegree());
        System.out.println(SeYeon.getMajor());
        SeYeon.setMajor("CIT");
        System.out.println(SeYeon.getMajor());
    }
    
}

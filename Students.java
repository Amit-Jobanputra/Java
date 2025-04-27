public class Students extends Person1{
    String eno;
    String div;

    public Students() {
    }

    public Students(String eno, String div, String name, String surname) {
        super(name, surname);
        this.eno = eno;
        this.div = div;
    }
    void setStudentData(String eno,String div,String name ,String Surname){
        setData(name, Surname);
        this.eno=eno;
        this.div=div;
    }
    void showStudentData(){
        display();
        System.out.println("Enrollment No. :- "+eno+"\nDivision :- "+div);
    }
    
}

public class Exam  extends Students{
    int cia1,cia2;

    public Exam() {
    }

    public Exam(int cia1, int cia2, String eno, String div, String name, String surname) {
        super(eno, div, name, surname);
        this.cia1 = cia1;
        this.cia2 = cia2;
    }
    void setExamData(int cia1, int cia2, String eno, String div, String name, String surname){
        setExamData(cia1, cia2, eno, div, name, surname);
        this.cia1=cia1;
        this.cia2=cia2;
    }
    void dislpayAll()
    {
        showStudentData();
        System.out.println("Total Marks = "+(cia1+cia2));
    }
}

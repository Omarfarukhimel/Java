public class Parametrized_Method {
    String name,id;
    Double cgpa;
    int phone;
    void set_Information(String n,String i,Double c,int p){
        name=n;
        id=i;
        cgpa=c;
        phone=p;
    }
    void display_information(){
        System.out.println("name :-"+name);
        System.out.println("Id :-"+id);
        System.out.println("CGPA:-"+cgpa);
        System.out.println("Phone number:-"+phone);

    }
    public static void main(String[] args){
        Parametrized_Method student1 =new Parametrized_Method();
        student1.set_Information("Omar Faruk","221-35-846",3.45,12345);
        student1.display_information();


        Parametrized_Method student2 = new Parametrized_Method();
        student2.set_Information("Rayhan Rafi ","221-36-888",3.50,45678);
        student2.display_information();
    }
}

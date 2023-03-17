public class Object {
    String name,id;

    int phone;
    double cgpa;
    public static void main(String[] args){

        Object student1 = new Object();
        student1.name="omar faruk";
        student1.id="221-35-846";
        student1.phone=171540;
        student1.cgpa=3.50;
        System.out.println( "name :-"+student1.name);
        System.out.println("id :-"+student1.id);
        System.out.println("phone number:- "+student1.phone);
        System.out.println("CGPA="+student1.cgpa);

        Object student2 =new Object();
        student2.name="hieml";
        student2.id="221-34-846";
        student2.phone=123456;
        student2.cgpa=3.75;
        System.out.println("name:-"+student2.name);
        System.out.println("id:-"+student2.id);
        System.out.println("phone number:-"+student2.phone);
        System.out.println("CGPA="+student2.cgpa);



    }
}

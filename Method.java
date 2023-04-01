public class Method {
        String name,id;

        int phone;
        double cgpa;
    void displayInformation(){
        System.out.println("name :-"+name);
        System.out.println("id :-"+id);
        System.out.println("phone number:-"+phone);
    }
        public static void main(String[] args){
            Method student1 = new Method();
            student1.name="omar faruk";
            student1.id="221-35-846";
            student1.phone=171540;
            student1.cgpa=3.50;
            student1.displayInformation();


            Method student2 =new Method();
            student2.name="hieml";
            student2.id="221-34-846";
            student2.phone=123456;
            student2.cgpa=3.75;
            student2.displayInformation();
    }

}

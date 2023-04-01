public class constructor {

        String name,id;
        Double cgpa;
        int phone;

        constructor(String n,String i,double c,int p){
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
            constructor student1 =new constructor("omar faruk","221-35-846",3.48,4562);

            student1.display_information();


            constructor student2 = new constructor("rayhan rafi","221-221",3.50,456);

            student2.display_information();
        }
    }



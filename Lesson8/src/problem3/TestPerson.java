package problem3;

public class TestPerson {

	 

    public static void main(String[] args) {
        
        
        Person p=new Person();
        
        Person p1 = new Person("Misgan","Dargie",30);
        Person p2 = new Person("Asmamaw","misgan",31);
        Person p3=  new Person("Haile","Berhe",40);
        
         p.add(p1);
         p.add(p2);
         p.insert(p3, 0);
         
       System.out.println(p.find("Misgan"));
        
        System.out.println(p.size());
        
        System.out.println(p);
    }

 

}
 
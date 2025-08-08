package oopsConcepts;

class AddEmployee{
    private int id;
    private long mobile;
    private String name;
    private String email;

    public int getId(){
        return id;
    }
    public void setId(int i){  
        id = i;
    }
    public long getMobile(){
        if(mobile >= 1000000000 && mobile <=9999999999l){
            return mobile;
        }else{
            throw new IllegalArgumentException("Enter a valid mobile number, its should not be less than and more than 10 digit");
        }

        
    }
    public void setMobile(long m){
        mobile = m;
    }
    public String getName(){
        return name;
       
    }
    public void setName(String n){
        name = n;
       
    }
    public String getEmail(){
        if(name.endsWith("@gmail.com")){
             return email;
        }else{
          throw new IllegalArgumentException("You entering the wrong type of email, its should be ends with @gmail.com");
        }
    }
    public void setEmail(String e){
        email = e;
    }
}



public class AddEmployeeData {
    public static void main(String[] args) {
        AddEmployee emp1 = new AddEmployee();
        emp1.setId(9);
        emp1.setName("Ujjaval saini");
        emp1.setMobile(9690020293l);
        emp1.setEmail("sainiujvl@gmail.com");
        int x = emp1.getId();
       // String y = emp1.getEmail();
        long z = emp1.getMobile();

        System.out.println(x);
       // System.out.println(y);
        System.out.println(z);

        
        
    }
}

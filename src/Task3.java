
public class Task3 {
   public static void main (String[] args){
       Cadet cadet1 = new Cadet();
       cadet1.setName("Aset");
       cadet1.setAge(23);
       cadet1.setClassGroup(10873);
       cadet1.setCountry("Kazakhstan");
       cadet1.getInfo();
       }

   }

class Cadet{
   private String name;
   private int age;
   private int classGroup;
   private String country;

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public int getClassGroup() {
       return classGroup;
   }

   public void setClassGroup(int classGroup) {
       this.classGroup = classGroup;
   }

   public String getCountry() {
       return country;
   }

   public void setCountry(String country) {
       this.country = country;
   }
   public void getInfo(){
       System.out.println(name + " " + age + " " + classGroup + " " + country);
   }
}



/**
 * Author : Zhang Zhe
 */
public class Test {
    public static void main(String[] args){
        information Information = new information();
       Information.setRecord("张哲",21,"man");
       String name = Information.getRecord("张哲");
       System.out.println(name);
    }
}
class  information{
    private  String  name;
    private  int       age;
    private  String  sex;

    public void setRecord(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public String getRecord(String name){
        if(name==this.name){
            return (name+" "+sex);
        }
        return name;
    }
}
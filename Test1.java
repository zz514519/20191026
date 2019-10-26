/**
 * Author : Zhang Zhe
 */
class Person{
    public String name ="魏璇";
    public int age = 20;

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("吃饭");
    }
    public void show(){
        System.out.println("name:"+name+" "+"age:"+age);
    }
}
public class Test1 {
    public static void main(String[] args) {
        //实例化一个对象（可以实例化多个对象）。
  Person person = new Person();
  person.show();
    }
}

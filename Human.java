




public class Human {
    private int age;
    private String name;
    private String sex;
    private Human father;
    private Human son;
    
    
    
    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public Human getSon() {
        return son;
    }
    public void setSon(Human son) {
        this.son = son;
    }
    public Human(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    



    
    
}


public class Main {
    public static void preOrder(Human tree, String space) {
        //данная функция выводит в консоль генеологическое дерево начиная с введённого объекта
        
          if (tree.getName() != null)
            System.out.println(space + tree.getName());
          else {
            System.out.println(space + "nil");
            return;
          }
          if (tree.getSon() != null ) {
            preOrder(tree.getSon(), space + "  ");
            
          }
        }
    public static void main(String[] args) {

        
        Human a = new Human(60, "Alex", "male");
        
        Human c = new Human(40, "Ivan", "male");
        
        Human f = new Human(20, "Sergey", "male");
        
        f.setFather(c);
        c.setFather(a);
        a.setSon(c);
        c.setSon(f);


        
              
        preOrder(a, " ");


        


        System.out.println(c.getSon().getName());
        
        System.out.println(a.getName() + " (age): " + a.getAge());
        
        
        
        
    }

    
}

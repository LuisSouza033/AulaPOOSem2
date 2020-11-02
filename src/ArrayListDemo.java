import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> MyNumbers = new ArrayList<Integer>();

        cars.add("Volvo");
        cars.add("Volkswagem");
        cars.add("Chevrolet");
        cars.add("Bmw");
        cars.add("Bugati");
        System.out.println(cars.get(0));
        System.out.println(cars.size());

        //cars.clear();//
        for(int i=0; i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        for(String car : cars){
            System.out.println(car);
        }
        MyNumbers.add(10);
        MyNumbers.add(15);
        MyNumbers.add(20);
        MyNumbers.add(25);
        for(int i:MyNumbers){
            System.out.println(i);
        }
    }
}

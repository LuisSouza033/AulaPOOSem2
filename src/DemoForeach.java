public class DemoForeach {
    public static void main(String[] args) {
        String[] cars = {"Volvo","BMW","Ford", "Maserati"};
        for(String car: cars){
            System.out.println(car);
        }
        System.out.println(cars.length);
        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников

        for(int i = 2; i <=100; i = i + 2) {
            if(i % 2 == 0) {
                System.out.println("Уволен айтишник с ID " + i);
            }
        }
    }
}

public class exceptions {


    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        System.out.println("-----------Push Up started---------------");
        for (int i = 1; i < 30; i++) {
            System.out.print("\rpush up" + i);
            sleep(1.0);
        }
        System.out.println("-------------push up finished--------------");

    }


}

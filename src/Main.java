public class Main {
    public static void main(String[] args) {

        //Кайтаруучу метод тузунуз, параметрине бир сан жана сандардын varargs-ын кабыл алсын.
        //Методко биринчи берген аргументинизди экинчи берген аргументтердин ичинен барбы же жокпу текшерип бар болсо
        // true жок болсо false кайтарсын.

        System.out.println(contains(1,1,2,3,4,5,6,7,8,9));

    }
    static boolean contains(int number, int ... varargs) {
        boolean test = false;
        for (int i = 0;i< varargs.length;i++) {
            if(number == varargs[i]){
                test = true;
            }
        }
        return test;
    }
}
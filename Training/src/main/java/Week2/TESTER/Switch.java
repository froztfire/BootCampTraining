package Week2.TESTER;

public class Switch {

    public static void main(String[] args) {
        int key = 2;
        String result = switch (key) {
            case 1: {
                yield "Choice 1";
            }
            default:
                yield "Invalid";
        };
        System.out.println(result);
    }
}

package Task1;

public class Methods {
    public String MethodA(String input) {
        System.out.println("j");
        if (input.equals("hello")) {
            System.out.println("a");
        } else {
            System.out.println("z");
        }
        return input;
    }


    public void MethodB(int k) {

        if (!(k < 5)) {
            System.out.println("v");
        } else {
            System.out.println("a");


        }
    }

    public void MethodC(String s) {

        if (s.length()>3) {
            System.out.println("e");
            System.out.println("r");
        }
        else{
            System.out.println("s");
            System.out.println("j");
        }

    }
    public void MethodD(String input ) {

        if (input.equals(input.toUpperCase())) {
            System.out.println("o");
        }
        else{
            System.out.println("v");
            System.out.println("t");


        }

    }
}



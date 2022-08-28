package ProblemSolvingParadigm;

public class SimpleEquations {

    public static String solutions(String input){
        String[] array = input.split(" ");
        int A = Integer.parseInt(array[0]);
        int B = Integer.parseInt(array[1]);
        int C= Integer.parseInt(array[2]);
        for (var x = 0; x <= 10000; x++) {
            for (var y = 0; y <= 10000; y++) {
                int z = A- x - y;
                if (x * y * z == B && x * x + y * y + z * z == C) {
                    return x+" "+y+" "+z;
                }
            }
        }
        return "No Solution";
    }

    public static void main(String[] args) {
        System.out.println(solutions("1 2 3"));
        System.out.println(solutions("6 6 14"));
    }
}

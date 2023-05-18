import Entity.SimpleStack;

public class Main {
    public static void main(String[] args)
    {


        SimpleStack pilhaMinima = new SimpleStack();


        int[] arraySent = new int[2];

        arraySent[0] = 3;
        arraySent[1] = 6;

        int[] stack = pilhaMinima.Push(9, arraySent);


        System.out.println(String.format("Array (%s):", stack.length));

        for(int a = 0; a < stack.length; a++){

            if(a == 0){
                System.out.print("[" + stack[a]);
            }else{
                System.out.print(", " + stack[a]);
            }

            if(a == (stack.length - 1)){
                System.out.println("]\n");
            }

        }


    }
}
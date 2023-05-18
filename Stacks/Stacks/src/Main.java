import Entity.SimpleStack;

public class Main {
    public static void main(String[] args)
    {


//---------------- Adicionando último ----------------

        SimpleStack pilhaSimples = new SimpleStack();

        int[] stack = new int[2];

        stack[0] = 3;
        stack[1] = 6;

        stack = pilhaSimples.AddLast(9, stack);


        //Mostrando o array
        System.out.println(String.format("Add last (%s):", stack.length));
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


//---------------- Removendo o último ----------------

        stack = pilhaSimples.RemoveLast(stack);

        //Mostrando o array
        System.out.println(String.format("Remove last (%s):", stack.length));
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


//---------------- Adicionando o primeiro ----------------

        stack = pilhaSimples.AddFirst(9, stack);

        //Mostrando o array
        System.out.println(String.format("Add first (%s):", stack.length));
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
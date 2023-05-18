package Entity;

public class SimpleStack {

    public SimpleStack() {}


    public int[] AddLast(int recivedNumber, int[] recivedStack)
    {

        //Cria uma nova pilha.
        int[] sentStack = new int[recivedStack.length + 1];

        //Percorre a nova pilha.
        for(int a = 0; a < sentStack.length; a++)
        {
            //Verifica se é a ultima posição da pilha.
            if(a == (sentStack.length - 1))
            {
                //Adiciona o número recebido no final da pilha.
                sentStack[a] = recivedNumber;
            }else
            {
                //Coloca os valores da pilha recebida na nova pilha.
                sentStack[a] = recivedStack[a];
            }
        }

        return sentStack;

    }


    public int[] RemoveLast(int[] recivedStack)
    {

        int[] sentStack = new int[(recivedStack.length - 1)];

        for(int a = 0; a < recivedStack.length; a++)
        {

            //Verifica se é a ultima posição da pilha.
            if(a != (recivedStack.length - 1))
            {
                //Coloca os valores da pilha recebida na nova pilha.
                sentStack[a] = recivedStack[a];
            }

        }

        return sentStack;

    }


    public int[] AddFirst(int recivedNumber, int[] recivedStack)
    {

        //Cria uma nova pilha.
        int[] sentStack = new int[recivedStack.length + 1];

        for(int a = 0; a < sentStack.length; a++)
        {

            if(a == 0)
            {
                sentStack[a] = recivedNumber;
            }else
            {
                sentStack[a] = recivedStack[a - 1];
            }

        }

        return sentStack;

    }




}

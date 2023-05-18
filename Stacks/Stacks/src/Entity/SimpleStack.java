package Entity;

public class SimpleStack {

    public SimpleStack() {}


    public int[] Push(int recivedNumber, int[] recivedStack)
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



}

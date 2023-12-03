package L_Sem.Sem4;

public class MyStack {
    //    Реализовать стэк с помощью массива. Нужно реализовать методы:
//    size(), empty(), push(), peek(), pop().
    private int[] arr = new int[10];
    private int size = 0;

    int size (){
        return size;
    }

    boolean empty(){
        return size ==0;
    }

    void push(int item){
        if(size == arr.length){
            int[] temparr =new  int[arr.length *2];
            System.arraycopy(arr,0,temparr,0,arr.length);
            arr = temparr;
        }
        arr[size++] = item;
    }
    int peek(){
        return arr[size - 1 ];
    }
    int pop(){
        return arr[--size];
    }


}

public class Stack {
    int [] stack =new int[20];
    int top=0;
    void push(int value){
        stack[top++]=value;
        System.out.println(value+" elemanı stack e eklendi");
    }
    int pop(){
        if(size()==0){
            System.out.println("Stack boş");
            return -1;
        }
        else {
            System.out.println(stack[top-1]+ " elemanı stack den çıkartıldı");
            return stack[--top];
        }
    }
    int size(){
        return top;
    }
    void print(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}

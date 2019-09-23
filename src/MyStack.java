//用顺序表实现栈

import java.util.Arrays;

public class MyStack{
    private int[] array=new int[10];
    private int top=0;

    private  void ensureCapacity(){
        //确认空间大小
        if(top<array.length) {
            return;
        }
        array=Arrays.copyOf(array,2*array.length);
    }
    public int push(int element){
        //头插

        ensureCapacity();
        array[top++]=element;
        return element;
    }
    public int pop(){
        //尾插
        return array[--top];
    }
    public int peek(){
        //返回最顶部的元素但不删除
        return array[top-1];
    }
    public boolean empty(){
        //看是否为空
        return top==0;
    }
    public int size(){
        //返回长度
        return top;
    }
    public int search(int element){
        //查找栈中是否有和element相等的元素，如果有返回该元素的下标
        for(int i=0;i<top;i++){
            if(array[i]==element){
                return i;
            }
        }
        //没有找到元素
        return  -1;
    }


}

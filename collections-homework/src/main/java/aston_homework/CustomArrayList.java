package aston_homework;

import java.util.Arrays;
import java.util.Collection;

public class CustomArrayList <T>{
    private Object[] array; // Храним данные в массиве Object, так как T неизвестен во время компиляции
    private static final int DEFAULT_CAPACITY = 16;
    private int size = 0;

    public CustomArrayList() {
        array = new Object[DEFAULT_CAPACITY]; // Начальный размер массива
    }

    public void add(int i, T element) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        System.arraycopy(array, i, array, i + 1, size - i);
        array[i] = element;
        size++;
    }

//    public CustomArrayList addAll(Collection<? extends T> c){}
//    public CustomArrayList clear(){}
//    public CustomArrayList get(int i){}
//    public CustomArrayList isEmpty(){}
//    public CustomArrayList remove(int i){}
//    public CustomArrayList remove(Object o){}
//    public CustomArrayList sort(Сomparator<? super T> c){}


    public void growArray(){
        array = new Object[array.length * 2];
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}

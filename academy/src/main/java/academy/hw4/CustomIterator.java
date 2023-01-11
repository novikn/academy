package main.java.academy.hw4;

public class CustomIterator<T> {
    private T[] array;
    private int currentIndex;


    public CustomIterator() {
        this.array = null;
        this.currentIndex = 0;
    }


    public CustomIterator(T[] array) {
        this.array = array;
        this.currentIndex = 0;
    }


    public boolean hasNext() {
        if (array == null) return Boolean.FALSE;
        else return currentIndex < array.length;
    }

    public T next() {
        if (hasNext()) {
            currentIndex++;
            return array[currentIndex - 1];
        }
        else return null;
    }


    public Boolean remove() {
        if (hasNext()) {
            System.arraycopy(array, currentIndex + 1, array, currentIndex, array.length - currentIndex - 1);
            array[array.length - 1] = null;
            currentIndex--;
            return Boolean.TRUE;
        }
        else return Boolean.FALSE;
    }

}

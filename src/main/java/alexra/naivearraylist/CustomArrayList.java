package alexra.naivearraylist;

/**
 * Динамический массив (список).
 * <br>
 * Автоматически расширяется, чтобы вместить все элементы.
 *
 * @param <T> Тип элементов списка
 */
public class CustomArrayList<T> implements CustomList<T> {
    private Object[] array = new Object[0];
    private int length = 0;
    private final int DEFAULT_LENGTH_INCREASE_AMOUNT = 1;


    /**
     * Позволяет узнать длину списка (количество элементов в нём)
     *
     * @return длину списка
     */
    public int getLength() {
        return length;
    }

    /**
     * Добавляет элемент в конец списка.
     *
     * @param element элемент, который будет добавлен (не null)
     */
    @Override
    public void add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("element was null, add(null) isn't allowed.");
        }
        if (length == array.length) {
            extendArray(DEFAULT_LENGTH_INCREASE_AMOUNT);
        }
        array[length] = element;
        length++;
    }

    /**
     * Копирует объекты в массив увеличенного размера, заменяя новым массивом предыдущий.
     *
     * @param lengthIncreaseAmount неотрицательное число, обозначающее увеличение количества ячеек массива
     */
    private void extendArray(int lengthIncreaseAmount) {
        if (lengthIncreaseAmount < 0) {
            throw new IllegalArgumentException("lengthIncreaseAmount was less than 0, that isn't allowed");
        }
        Object[] newArray = new Object[array.length + lengthIncreaseAmount];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    /**
     * Возвращает ссылку на элемент списка по заданному индексу.
     *
     * @param index индекс элемента, должен лежать на отрезке [0; length-1]
     * @return элемент списка
     */
    @Override
    public T get(int index) {
        if (index > length - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    /**
     * Удаляет из списка элемент по заданному индексу, сдвигая на одну ячейку влево все последующие элементы.
     *
     * @param index индекс элемента
     * @return элемент, который был удалён из списка
     */
    @Override
    public T remove(int index) {
        T element = (T) array[index];
        for (int i = index; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[length - 1] = null;
        --length;
        return element;
    }
}

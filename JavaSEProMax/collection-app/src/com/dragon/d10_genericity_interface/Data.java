package com.dragon.d10_genericity_interface;

public interface Data<E> {
//    public void add(E e);
//    public void delete(int id);
//    public void update(E e);
//    public E queryById(int id);

    /**public 关键字可以省略**/
    void add(E e);
    void delete(int id);
    void update(E e);
    E queryById(int id);
}

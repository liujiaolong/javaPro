package com.dragon.d10_genericity_interface;

/**
 * 由实现类来做一些功能，又实现类传类型来约束实现类做哪些数据的约束，增删改查
 */
public class StudentData implements Data<Student>{
    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student queryById(int id) {
        return null;
    }
}

package com.example.springboot.pojo;

/**
 * @author shishuaiyang
 * @date 2021/11/25-下午4:48
 */
public class Cat {
    private Integer cartId;
    private String name;
    private Integer age;

    public Cat() {
    }

    public Cat(Integer cartId, String name, Integer age) {
        this.cartId = cartId;
        this.name = name;
        this.age = age;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "cartId=" + cartId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

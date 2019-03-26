package com.alibaba.fastjson;

import org.junit.Test;

/**
 *
 * @author liujc
 * @date 2019/3/26 11:14
 **/
public class JSONTest {
    @Test
    public void testJSON(){
        System.out.println(JSON.toJSONString(new Person("jake",28,"chengdu,sichuan")));
    }
    class Person{
        private String name;
        private int age;
        private String address;

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}

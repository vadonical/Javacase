package com.vadonical;

/**
 * Created by Zhenxian on 2017/6/2.
 * 主要是利用封装的概念
 */

class Pet{
    private String name;
    private int age;
    private boolean gender;
    private Pet partner;
    public Pet(){}
    public Pet(String name,int age,boolean gender,Pet partner){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.partner = partner;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean isGender(){
        return gender;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Pet getPartner(){
        return partner;
    }
    public void setPartner(Pet partner){
        this.partner = partner;
    }
    public boolean isOverAgeForMarry(){
        if (this.gender && this.getAge() >= 5){
            return true;
        }
        if (!this.gender && this.getAge() >= 4){
            return true;
        }
        return false;
    }
    public boolean marry(Pet pet){
        if (this.gender == pet.gender){
            System.out.println("根据规定，不能同性结婚！");
            return false;
        }
        if (this.partner != null || pet.partner != null){
            System.out.println("一方已经结婚，你们不能结婚！");
            return false;
    }
    return false;
}
public static class PetsGetMarried {
    public static void main(String []args){

    }
}
}

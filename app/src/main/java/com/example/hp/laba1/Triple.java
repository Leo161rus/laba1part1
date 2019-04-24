package com.example.hp.laba1;

import android.support.annotation.Nullable;

public class Triple<String, Integer extends Number, Boolean> {
    private final String studentName;
    private final Integer age;
    private final Boolean access;


    Triple(String name,Integer age, @Nullable Boolean access){
        this.studentName = name;
        this.age = age;
        this.access = access;
    }

    @Nullable
    String getStudentName(){
        return studentName;
    }

    @Nullable
    Integer getAge(){
        return age;
    }

    @Nullable
    Boolean getAccess(){
        return access;
    }

    public java.lang.String toString(){
return getStudentName() + ", " + getAge() + ", " + getAccess();
    }


}

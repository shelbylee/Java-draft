package com.lxb.draft.tools.gson;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @SerializedName(value = "myName", alternate = {"my_name", "name"})
    public String myName;

    public int myAge;

    public String myJob;

    public User(String myName, int myAge, String myJob) {
        this.myName = myName;
        this.myAge = myAge;
        this.myJob = myJob;
    }

}

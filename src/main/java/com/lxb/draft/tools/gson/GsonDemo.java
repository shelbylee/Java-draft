package com.lxb.draft.tools.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Arrays;
import java.util.List;

public class GsonDemo {

    public static void main(String[] args) {

        Gson gson = new Gson();

        // 解析基本数据类型、对象

        int i = gson.fromJson("100", int.class);
        double d = gson.fromJson("\"99.99\"", double.class);
        double dd = gson.fromJson("99.99", double.class);
        boolean b = gson.fromJson("true", boolean.class);

        String jsonObject = "{\"my_name\":\"lxb\", \"myAge\":20, \"myJob\":coder}";
        User user = gson.fromJson(jsonObject, User.class);

        System.out.println(user);

        // 解析数组，比如 String[]

        String jsonArray = "[Java, Scala, Go]";

        // 转换成数组，可以直接用 String[].class

        //String jsonArray = "[\"Java\", \"Scala\", \"Go\"]";
        String[] res = gson.fromJson(jsonArray, String[].class);
        System.out.println(Arrays.asList(res));

        /*
        但要转换成 List，就需要注意泛型的擦除
        List<E> 是个泛型类型，而对于虚拟机来说，没有泛型类型的对象，只有普通的类
        因此 List<String> 在虚拟机中会变成 List.class

        Gson 提供了 TypeToken 来解决这个问题
        TypeToken 的构造方法是 protected
        */
        List<String> stringList = gson.fromJson(jsonArray, new TypeToken<List<String>>() {}.getType());
        System.out.println(Arrays.asList(stringList));

        //User users = new User("lxb", 20, "student");

        String userObject = "[{\n" +
                "\t\t\"myName\": \"Amanda\",\n" +
                "\t\t\"myAge\": 21,\n" +
                "\t\t\"myJob\": \"programmer\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"myName\": \"lxb\",\n" +
                "\t\t\"myAge\": 20,\n" +
                "\t\t\"myJob\": \"programmer\"\n" +
                "\t}\n" +
                "]";

        List<User> userList = gson.fromJson(userObject, new TypeToken<List<User>>() {}.getType());
        System.out.println(Arrays.asList(userList));
    }
}

package mang.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz1 {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("김프로", "축구:농구:야구", "구기종복 좋아요"));
        userList.add(new User("정프로", "개발:당구:축구", "개발하는데 뛰긴 싫어"));
        userList.add(new User("앙몬드", "피아노", "죠르디가 좋아요 좋아좋아너무좋아"));
        userList.add(new User("죠르디", "스포츠댄스:개발", "개발하는 죠르디 좋아"));
        userList.add(new User("박프로", "골프:야구", "운동이 좋아요"));
        userList.add(new User("정프로", "개발:축구:농구", "개발도 좋고 운동도 좋아"));

        userList.stream()
                .map(User::getHobby)
                .flatMap(hobbies -> Arrays.stream(hobbies.split(":")))
                .collect(Collectors.toMap(hobby -> hobby, hobby -> 1, (oldValue, newValue) -> newValue += oldValue));

    }

}

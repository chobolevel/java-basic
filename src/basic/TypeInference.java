package basic;

public class TypeInference {
    public static void main(String[] args) {
        
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);
        
        str = "test";
        // str = 3; String 변수에 int형을 넣으려고 하기 때문에 오류
        // var 자료형은 한 번 지정한 타입으로만 지정 가능
        // 하위 버전과의 호환성을 사용할 때 고려해야함
        
    }
}

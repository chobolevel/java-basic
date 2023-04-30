package modernjavainaction.chap03.aroundPattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AroundPattern {
    
    // try-with-resources 구문을 사용해서 자원을 명시적으로 닫을 필요가 없어짐
    // 함수형 인터페이스를 구현한 객체를 인수로 받아 동적 파라미터화 가능
    public String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.text"))) {
            return p.process(br);
        }
    }

    // 이제 processFile 메서드를 호출할 때 파라미터로 람다를 전달할 수 있음

    // 한 행을 처리하는 람다
    // String oneLine = processFile((BufferedReader br) -> br.readLine());

    // 두 행을 처리하는 람다
    // String twoLine = processFile((BufferedReader br) -> br.readLine + br.readLine());
    
    // 이러한 과정이 실행 어라운드 패턴을 적용하는 과정
    
}

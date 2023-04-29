package modernjavainaction.chap02;

import java.util.ArrayList;
import java.util.List;

public class AppleFilter {

    enum Color {RED, GREEN}

    // 초록색 사과만 필터링 가능한 메서드
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getColor().equals(AppleColor.GREEN)) {
                result.add(apple);
            }
        }
        return result;
    }

    // 입력한 색의 사과 필터링 가능한 메서드
    public static List<Apple> filterApplesByColor(List<Apple> inventory, AppleColor appleColor) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getColor() == appleColor) {
                result.add(apple);
            }
        }
        return result;
    }

    // 입력한 사과 무게에 따라 필터링 가능한 메서드
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }
    
    // 가능한 모든 속석으로 필터링(flag 사용)
    // flag 사용은 절대 사용하지 않는 것이 맞음!
    // flag 구분하기도 어려울 뿐더러 조건이 추가되는 경우 모호해짐
    public static List<Apple> filterApples(List<Apple> inventory, AppleColor color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if((flag && apple.getColor() == color) || (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }
        return result;
    }

    // 추상적 조건으로 필터링(동적 파라미터화)
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    // 유연한 prettyPrintApple(quiz 2 - 1)
    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter f) {
        for(Apple apple : inventory) {
            String output = f.format(apple);
            System.out.println(output);
        }
    }

    // 지금까지는 인터페이스 구현체를 넘겨주므로 인터페이스를 구현한 객체의 인스턴스를 생성해야함
    // 그런 과정이 번거로워 보일 수 있음 -> 익명 클래스로 해결 가능




}

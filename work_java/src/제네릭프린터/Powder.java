package 제네릭프린터;

// 프린터에 사용 될 재료
public class Powder {
    public void doPrinting() {
        System.out.println("Powder 재료로 출력 합니다.");
    }
    @Override
    public String toString() {
        return "재료는 Powwder 입니다.";
    }
}

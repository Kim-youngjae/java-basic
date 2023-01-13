package chapter8;

public class ExceptionTest {
    public static void main(String[] args) {
        try { // Execption과 그 자손은 반드시 예외처리를 해줘야 한다.(필수)
            throw new Exception(); // 고의로 exception 발생, try-catch문 또는 throws를 추가 해줘야함(컴파일시 에러라 필수로 처리)
        } catch (Exception e) {

        }

        //RuntimeException과 그 자손은 예외 처리를 해주지 않아도 컴파일이 된다.
        throw new RuntimeException(); // Runtime예외는 선텍적이라 컴파일 시 에러는 발생하지 x 하지만 이 문장은 일부러 발생시킨 코드라 실행 시 에러

    }
}

public class StringTest {

    public static void main(String[] args){
        // 1. String Equals와 "==" 비교하기
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        //TODO: str1 <-> str2,  str1 <-> str3를 ==으로 값을 비교 및 출력해주세요.
        System.out.println(str1==str2); // true : constant pool 의 같은 값을 가리킴 = 주소 일치
        System.out.println(str1==str3); // false : constant pool 의 값과 Heap 메모리 내 주소 = 주소 불일치
        //TODO: str1 <-> str2, str1 <-> str3를 equals으로 값을 비교 및 출력해주세요 .
        System.out.println(str1.equals(str3)); // true : 같은 값
// 2. String Builder로 개선하기
        String[] words = {"Java", "is", "a", "powerful", "programming", "language"};

        String concatenatedString = "";
        for (String word : words) {
            concatenatedString += word + " ";
        }
        System.out.println("일반 String 합치기 방식: " + concatenatedString);

        //TODO: StringBuilder를 사용하여 words배열의 요소들을 조합한 후 출력하세요.
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word+" ");
        }
        System.out.println(sb.toString()); // 매우 큰 배열을 다루기에 성능적으로 뛰어남

        System.out.println(String.join(" ",words));
        // 작은 배열에서는 충분히 뛰어난 성능 , 코드 가독성 좋음
        // 내부적으로 StringBuilder 를 사용하여 문자열 결합을 진행

    }
}
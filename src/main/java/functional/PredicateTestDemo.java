package functional;

import java.util.function.Predicate;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 2019-1-25 17:36
 */
public class PredicateTestDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> "wu".equals(s);
        int result = test("hu", predicate);
        int result1 = test("wu", predicate);
        System.out.println(result);
        System.out.println(result1);
    }
    private static int test(String str , Predicate<String> predicate){
        if(predicate.test(str)){
            return  1;
        }else {
            return 0;
        }
    }
}

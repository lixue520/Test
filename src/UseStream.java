/**
 * @Author qin
 * @Data 20:07
 * @Version 1.0
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UseStream {
    public static void main(String[] args) {
        // 提供集合数据
        List<Integer> numbers = Arrays.asList(-1, -3, 0, 7, 9, -1);

        // 程序代码
        Stream<Integer> nan = numbers.stream();
        System.out.println("集合数据转换为流对象");
        nan.forEach(x->System.out.println(x));

        //使用filter()筛选出大于零的个数
        System.out.println("集合数据过滤后的数据个数为"+numbers.stream().filter(x->x>0).count());
        System.out.println("集合数据进行绝对值运算生成新的流对象");
        numbers.stream().forEach(x->System.out.println(Math.abs(x)));
        System.out.println("集合数据转换为流对象进行限流操作");
        numbers.stream().limit(2).forEach(x->System.out.println(x));

    }
}

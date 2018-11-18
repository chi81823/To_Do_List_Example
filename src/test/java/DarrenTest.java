import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DarrenTest {

    @Test
    public void StreamTest() {
        //        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //        List<String> filtered = strings.stream()
        //                                       .filter(string -> !string.isEmpty())
        //                                       .collect(Collectors.toList());
        //        System.out.println(filtered);
        //
        //        Random random = new Random();
        //        random.ints()
        //              .limit(10)
        //              .forEach(System.out::println);
        //
        //        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //        // 获取对应的平方数
        //        List<Integer> squaresList = numbers.stream()
        //                                           .map( i -> i*i)
        //                                           .distinct()
        //                                           .collect(Collectors.toList());
        //        System.out.println(squaresList);
        //
        //        List<String> stringFilter = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        //        // 获取空字符串的数量
        //        long count = stringFilter.stream()
        //                                .filter(string -> string.isEmpty())
        //                                .count();
        //        System.out.println(count);

        //        Random randomSort = new Random();
        //        randomSort.ints()
        //                  .limit(10)
        //                  .sorted()
        //                  .forEach(System.out::println);

        //        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        //        // 获取空字符串的数量
        //        long count = strings.parallelStream()
        //                            .filter(string -> string.isEmpty())
        //                            .count();
        //        System.out.println(count);

        //        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //        List<String> filtered = strings.stream()
        //                                       .filter(string -> !string.isEmpty())
        //                                       .collect(Collectors.toList());
        //
        //        System.out.println("筛选列表: " + filtered);
        //        String mergedString = strings.stream()
        //                                     .filter(string -> !string.isEmpty())
        //                                     .collect(Collectors.joining(", ","[","]"));
        //        System.out.println("合并字符串: " + mergedString);

        //        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //
        //        IntSummaryStatistics stats = numbers.stream()
        //                                            .mapToInt((x) -> x)
        //                                            .summaryStatistics();
        //        System.out.println(stats);
        //        System.out.println("列表中最大的数 : " + stats.getMax());
        //        System.out.println("列表中最小的数 : " + stats.getMin());
        //        System.out.println("所有数之和 : " + stats.getSum());
        //        System.out.println("平均数 : " + stats.getAverage());

        //        int max = Stream.of(120, 24, 59, 63, 11, 74)
        //                        .max(Comparator.comparing(n -> n))
        //                        .get();
        //        System.out.println("max: " + max);
        //max: 120
        //        int min = Stream.of(120, 24, 59, 63, 11, 74)
        //                        .min(Comparator.comparing(n -> n))
        //                        .get();
        //        System.out.println("min: " + min);
        //min: 11

        //ASC
        List<Integer> sortedAsc = Stream.of(120, 24, 59, 63, 11, 74)
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println("sorted asc: " + sortedAsc);
        //sorted asc: [11, 24, 59, 63, 74, 120]
        //DESC
        List<Integer> sortedDesc = Stream.of(120, 24, 59, 63, 11, 74)
                                         .sorted((n1, n2) -> n2.compareTo(n1))
                                         .collect(Collectors.toList());
        System.out.println("sorted desc: " + sortedDesc);
        //sorted desc: [120, 74, 63, 59, 24, 11]

    }
}

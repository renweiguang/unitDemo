package pairOf;

import org.apache.commons.lang3.tuple.Pair;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author rwg
 * @date 2021/8/6 17:58
 */
public class PairOfTest {

    /**
     * Pair的用法是，K和V都很重要，并且没任何关系的情况,存的是毫不相关的数据
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        List<Integer> list1 = Lists.newArrayList();
        list.add("dqwdq");
        list1.add(22);

        Pair<List<String>, List<Integer>> pair = Pair.of(list, list1);
        pair.getLeft().stream().forEach(r -> System.out.println(r));
        pair.getRight().stream().forEach(r -> System.out.println(r));
    }
}

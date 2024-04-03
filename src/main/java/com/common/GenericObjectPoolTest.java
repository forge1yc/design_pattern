package com.common;

import com.google.common.base.Splitter;
import com.google.common.collect.Sets;
import org.assertj.core.util.Lists;
import org.assertj.core.util.Strings;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author hyc
 */
public class GenericObjectPoolTest {


//    final PooledObjectFactory<T> factory,

    public static void main(String[] args) {
        List<Integer> b = Lists.newArrayList(3,2,null,5,9);

        b.sort((o1, o2) -> {
//            int cr = 0;
//            if (Objects.isNull(o2.getCompliance()) || Objects.isNull(o1.getCompliance())
//                    || Objects.isNull(o2.getCompliance().getCount())
//                    || Objects.isNull(o1.getCompliance().getCount())) {
//                cr = 1;
//            }
//            return (int) (o2.getCompliance().getCount() - o1.getCompliance().getCount());
            if (o2 == null) {
                return -1;
            } else if (o1 == null) {
                return 1;
            } else {
                return o2.compareTo(o1);
            }

        });

        System.out.println(b);

        Long l1 = 9L;
        Long l2;

        l2 = l1;

        l2 = 3L;

        System.out.println(l1);
        System.out.println(l2);

        String s1 = "aaa";
        String s2 = s1;
        s2 = s2+ "ss";

        System.out.println(s1);
        System.out.println(s2);
    }


}


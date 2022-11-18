package PoolMisConvertMisperson;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        MisPerson misPerson = new MisPerson();
        if(Objects.isNull(misPerson)){
            System.out.println(2);
        }
        misPerson.setAge(1);
        misPerson.setName("rwg");
        misPerson.setPwd("123456");
        PoolMisPerson poolMisPerson = new PoolMisPerson();
        poolMisPerson.fromMisPersonObj(misPerson);
        System.out.println(poolMisPerson.getPwd());
    }
}

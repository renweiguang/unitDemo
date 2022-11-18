package enumTest;

public class Enummm {
    public static void main(String[] args) {
        System.out.println(TypeEnum.getByValue(3).getName());

        TypeEnum typeEnum = TypeEnum.IMAGE;

        for (TypeEnum typeEnum1 : TypeEnum.values()) {
            if (typeEnum.getName().equals(typeEnum1.getName())) {
                System.out.println(typeEnum1.getName());
            }
        }
    }
}

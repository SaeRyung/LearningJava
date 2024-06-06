package exercise.chapter_44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Customer customer = new Customer("민철");
        //클래스 뽑아내기 _ 방법2개
        Class clazz = customer.getClass();
//        Class clazz2 = Customer.class;

        //생성자 뽑기
//        Constructor[] constructors = clazz.getConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor);
//        }
        //메소드 가져오기
//        Method[] methods = clazz.getMethods();
//        for(Method method: methods){
//            System.out.println(method);
//        }

        //field
//        Field[] fields = clazz.getDeclaredFields(); //존재하는 필드 전체 보기
////        Field[] fields = clazz.getFields(); //public 필드만
//        for(Field field : fields) {
//            System.out.println(fields);
//        }

        ////Constructor 에서 instance까지 ,,Class<?>선택
        Customer customer2 = (Customer)clazz.getConstructor(String.class).newInstance("민철");
        System.out.println(customer2);



    }
}

package Assignment_14;

// Q.13. Write a program to generate NoSuchFieldException

import java.lang.reflect.Field;

public class q13 {

	public int num;

	public static void main(String... args) throws NoSuchFieldException {

		Class<ClassgetFieldExample2> obj = ClassgetFieldExample2.class;
		Field fields = obj.getField("num");
		System.out.println(fields);
		Class<?> tp = fields.getType();  //gets the type
		System.out.println(tp);

	// It will throw .NoSuchFieldException

	}
}

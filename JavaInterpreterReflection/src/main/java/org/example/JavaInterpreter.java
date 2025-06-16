package org.example;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.Scanner;
public class JavaInterpreter {

    public static void main(String[] args) {
        try {
            System.out.print("Введите выражение:");
            String expression = "";
            Scanner sc = new Scanner(System.in);
            expression= sc.nextLine();

            String code = "package org.example;\n\npublic class DynamicEval {\n" +
                    "public Object getResult() {\nreturn " + expression + ";\n}\n}";

            String filePath = "./target/classes/org/example/DynamicEval.java";

            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write(code.getBytes());

            com.sun.tools.javac.Main.compile(new String[]{filePath});

            Class<?> dynamicEvalClass = Class.forName("org.example.DynamicEval");
            Object dynamicEvalInstance = dynamicEvalClass.getDeclaredConstructor().newInstance();
            Method getResultMethod = dynamicEvalClass.getDeclaredMethod("getResult");
            Object result = getResultMethod.invoke(dynamicEvalInstance);

            System.out.println("Результат выражения: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

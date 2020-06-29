package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.StringEncloser;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

    // Zadanie 7.1

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String text = "Na górze róże, na dole lodówka. Ten wiersz nie ma sensu, mikrofalówka.";

        println(poemBeautifier.beautify(text, (string) -> "//" + string));
        println(poemBeautifier.beautify(text, (string) -> string.toUpperCase()));
        println(poemBeautifier.beautify(text, (string) -> string.replace(' ', '_')));
        println(poemBeautifier.beautify(text, StringEncloser::parentheses));
        println(poemBeautifier.beautify(text, StringEncloser::braces));
        println(poemBeautifier.beautify(text, new StringEncloser("<*> ", " <*>")::enclose));
        println(poemBeautifier.beautify(text, new StringEncloser(""," :)" )::enclose));
    }

    private static void println(String string) {
        System.out.println(string);
    }
}

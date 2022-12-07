package DesignPattern.behavioral.interpreter;

/***
 * Given a language, define a representation for its grammar along with an interpreter that uses the
 * representation to interpret sentences in the language.
 */
public class MainInterPreter {
    public Expression getMaleExpression() {
        Expression expression1 = new TerminalExpression("John");
        Expression expression2 = new TerminalExpression("Nick");
        return new OrExpression(expression1, expression2);
    }

    public Expression getMarriedExpression(){
        Expression expression1 = new TerminalExpression("John");
        Expression expression2 = new TerminalExpression("Married");
        return new AndExpression(expression1,expression2);
    }

    public static void main(String args[]) {
        MainInterPreter mainInterPreter = new MainInterPreter();
        Expression maleExpression = mainInterPreter.getMaleExpression();
        Expression marriedExpression = mainInterPreter.getMarriedExpression();
        System.out.println("John is male? " + maleExpression.interPreter("John"));
        System.out.println("John get Married? " + marriedExpression.interPreter("John Married"));
    }
}

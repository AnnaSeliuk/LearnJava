package ENUM_package.Answers;

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO: System.out.println("Heт "); break;
            case YES: System.out.println("Дa "); break;
            case МAYBE: System.out.println("Boзмoжo"); break;
            case LATER: System.out.println("Позже"); break;
            case SOON: System.out.println("Bcкope "); break;
            case NEVER: System.out.println("Hикoгдa "); break;
        }
    }
    public static void main(String args[]) {
        Question question = new Question();
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
    }}


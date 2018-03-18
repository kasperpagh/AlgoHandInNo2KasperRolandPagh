package cphbusiness.pagh;

public class Tree
{
    private Node root;
    private Student studentToCheck;
    private Questions readBook = new Questions("read the book?");
    private Questions attendLectures = new Questions("attended the lectures?");
    private Questions makeExercises = new Questions("did the exercises?");
    private Questions hand_in = new Questions("did the hand-ins?");

    public Tree(boolean didHandIn, boolean attendedLectures, boolean readTheBook, boolean madeExercises)
    {
        initTree();
        Questions[] questions = new Questions[4];

        questions[0] = hand_in;
        questions[0].setAnswer(didHandIn);

        questions[1] = attendLectures;
        questions[1].setAnswer(attendedLectures);

        questions[2] = readBook;
        questions[2].setAnswer(readTheBook);

        questions[3] = makeExercises;
        questions[3].setAnswer(madeExercises);


        studentToCheck = new Student(questions, root);
    }

    private void initTree()
    {


        //static nodes, since the tree is set in stone!!
        root = new Node(hand_in);
        Node node1 = new Node(attendLectures);
        Node node2 = new Node(readBook);
        Node node3 = new Node(makeExercises);
        Node node4 = new Node(makeExercises);
        Node node5 = new Node(readBook);
        Node node6 = new Node(makeExercises);
        Node node7 = new Node(makeExercises);
        Node node8 = new Node(attendLectures);
        Node node9 = new Node(readBook);
        Node node10 = new Node(makeExercises);
        Node node11 = new Node(makeExercises);
        Node node12 = new Node(readBook);
        Node node13 = new Node(makeExercises);
        Node node14 = new Node(makeExercises);


        root.setYesNode(node1);
        root.setNoNode(node8);

        node1.setYesNode(node2);
        node1.setNoNode(node5);

        node2.setYesNode(node3);
        node2.setNoNode(node4);

        node5.setNoNode(node6);
        node5.setYesNode(node7);

        node8.setYesNode(node9);
        node8.setNoNode(node12);

        node9.setYesNode(node10);
        node9.setNoNode(node11);

        node12.setYesNode(node13);
        node12.setNoNode(node14);

        Node pass = new ActionNode();
        Node warning = new ActionNode();
        pass.setDecision("Pass");
        warning.setDecision("Warning");

        node3.setYesNode(pass);
        node3.setNoNode(pass);

        node4.setYesNode(pass);
        node4.setNoNode(pass);

        node6.setYesNode(pass);
        node6.setNoNode(warning);

        node7.setYesNode(warning);
        node7.setNoNode(warning);

        node10.setYesNode(warning);
        node10.setNoNode(warning);

        node11.setYesNode(warning);
        node11.setNoNode(warning);

        node13.setYesNode(warning);
        node13.setNoNode(warning);

        node14.setYesNode(warning);
        node14.setNoNode(warning);
    }

    public void checkStudent()
    {
        for (Questions q : studentToCheck.getQuestions())
        {
            System.out.println("the questions is: " + q.getQuestion() + ". The student's answer is: " + q.getAnswer());

            if (q.getAnswer())
            {
                studentToCheck.setCurrentNode(studentToCheck.getCurrentNode().getYesNode());
                System.out.println("going to YES node");
            }
            else
            {
                studentToCheck.setCurrentNode(studentToCheck.getCurrentNode().getNoNode());
                System.out.println("going to NO node");

            }
            System.out.println("");
        }

        System.out.println("THE RESULT IS: " + studentToCheck.getCurrentNode().getDecision());
    }
}
